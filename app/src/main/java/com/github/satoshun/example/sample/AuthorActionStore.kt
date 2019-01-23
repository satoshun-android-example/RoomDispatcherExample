package com.github.satoshun.example.sample

import androidx.lifecycle.LiveData
import javax.inject.Inject

class AuthorActionCreator @Inject constructor(
  private val dispatcher: AuthorDispatcher
) {
  fun updateAuthor(name: String, age: Int) {
    dispatcher.dispatch(Author1(name = name, age = age))
    dispatcher.dispatch(Author2(name = name + name, age = age + age))
  }
}

interface AuthorStore {
  fun author(): LiveData<Author1?>
  fun mappedAuthor(): LiveData<MappedAuthor?>
}
