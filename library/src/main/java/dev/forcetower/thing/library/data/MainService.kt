package dev.forcetower.thing.library.data

import dev.forcetower.thing.library.model.Something
import retrofit2.http.GET

interface MainService {
    @GET("endpoint")
    suspend fun network(): Something
}