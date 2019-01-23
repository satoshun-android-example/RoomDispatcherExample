package com.github.satoshun.example.sample

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
  @Singleton
  @Provides
  fun provideMyDatabase(context: Context): MyDatabase {
    return Room
      .inMemoryDatabaseBuilder(context, MyDatabase::class.java)
      .build()
  }

  @Provides
  fun provideAuthorDao(database: MyDatabase): AuthorDao {
    return database.authorDao()
  }
}

@Database(
  entities = [
    Author::class
  ],
  version = 1
)
abstract class MyDatabase : RoomDatabase() {
  abstract fun authorDao(): AuthorDao
}

@Entity(tableName = "author")
data class Author(
  @PrimaryKey val id: Long = 0, // always 0
  val name: String,
  val age: Int
)

@Dao
interface AuthorDao {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun update(author: Author)

  @Query("select * FROM author WHERE id = 0") // always 0
  fun author(): LiveData<Author?>
}
