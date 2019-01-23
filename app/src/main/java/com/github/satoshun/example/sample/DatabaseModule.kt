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

  // todo use Binds
  @Provides
  fun provideAuthorStore(database: MyDatabase): AuthorStore {
    return database.authorDao()
  }
}

@Database(
  entities = [
    Author1::class,
    Author2::class
  ],
  version = 1
)
abstract class MyDatabase : RoomDatabase() {
  abstract fun authorDao(): AuthorDao
}

sealed class AuthorEvent

@Entity(tableName = "author1")
data class Author1(
  @PrimaryKey val _id: Long = 0, // always 0
  val name: String,
  val age: Int
) : AuthorEvent()

@Entity(tableName = "author2")
data class Author2(
  @PrimaryKey val _id: Long = 0, // always 0
  val name: String,
  val age: Int
) : AuthorEvent()

data class MappedAuthor(
  val name1: String,
  val name2: String
)

@Dao
interface AuthorDao : AuthorStore {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun update(author: Author1)

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun update(author: Author2)

  @Query("select * FROM author1 WHERE _id = 0")
  override fun author(): LiveData<Author1?>

  @Query("""
    select author1.name as name1, author2.name as name2
    FROM author1
     INNER JOIN author2
    WHERE author1._id = 0 AND author2._id = 0
    """)
  fun mappedAuthor(): LiveData<MappedAuthor?>
}
