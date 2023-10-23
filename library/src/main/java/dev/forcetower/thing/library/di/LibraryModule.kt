package dev.forcetower.thing.library.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.forcetower.thing.library.data.MainService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LibraryModule {
    @Provides
    @Singleton
    fun provideService(): MainService {
        return Retrofit.Builder()
            .baseUrl("https://google.com/")
            .build()
            .create(MainService::class.java)
    }
}