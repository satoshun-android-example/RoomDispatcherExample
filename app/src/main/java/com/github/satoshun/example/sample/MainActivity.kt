package com.github.satoshun.example.sample

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.github.satoshun.example.sample.databinding.MainActBinding
import javax.inject.Inject

class MainActivity : BaseActivity() {
  @Inject lateinit var store: AuthorStore

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActBinding>(this, R.layout.main_act)

    (application as App).appComponent.inject(this)

    store.author().observe(this, Observer {
      binding.title.text = it?.name.toString()
      binding.age.text = it?.age.toString()
    })

    store.mappedAuthor().observe(this, Observer {
      binding.name1.text = it?.name1.toString()
      binding.name2.text = it?.name2.toString()
    })

    binding.move.setOnClickListener {
      val intent = Intent(this@MainActivity, SubActivity::class.java)
      startActivity(intent)
    }
  }
}
