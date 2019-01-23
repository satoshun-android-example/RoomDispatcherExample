package com.github.satoshun.example.sample

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
  modules = [DatabaseModule::class]
)
interface AppComponent {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun applicationContext(context: Context): AppComponent.Builder

    fun build(): AppComponent
  }

  fun inject(activity: MainActivity)
  fun inject(activity: SubActivity)
}

