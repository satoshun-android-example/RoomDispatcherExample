package com.github.satoshun.example.sample

import androidx.lifecycle.LiveData
import javax.inject.Inject

class AuthorActionCreator @Inject constructor(
  private val authorDao: AuthorDao
) {
  fun updateAuthor(name: String, age: Int) {
    authorDao.update(Author1(name = name, age = age))
    authorDao.update(Author2(name = name, age = age))
  }
}

interface AuthorStore {
  fun author(): LiveData<Author1?>
}
