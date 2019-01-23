package com.github.satoshun.example.sample

import android.os.Bundle
import javax.inject.Inject
import kotlin.concurrent.thread

class SubActivity : BaseActivity() {
  @Inject lateinit var authorDao: AuthorDao

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    (application as App).appComponent.inject(this)

    thread {
      Thread.sleep(3000)
      authorDao.update(Author(name = "hoge", age = 10))
      runOnUiThread {
        finish()
      }
    }
  }
}
