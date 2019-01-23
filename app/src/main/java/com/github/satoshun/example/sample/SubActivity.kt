package com.github.satoshun.example.sample

import android.os.Bundle
import javax.inject.Inject
import kotlin.concurrent.thread

class SubActivity : BaseActivity() {
  @Inject lateinit var actionCreator: AuthorActionCreator

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    (application as App).appComponent.inject(this)

    thread {
      Thread.sleep(3000)
      actionCreator.updateAuthor(name = "hoge", age = 10)

      runOnUiThread {
        finish()
      }
    }
  }
}
