package dev.forcetower.thing.library.repository

import dev.forcetower.thing.library.data.MainService
import dev.forcetower.thing.library.model.Something
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

@Singleton
class MainRepository @Inject constructor(
    private val service: MainService
) {
    suspend fun callService(): Something {
        return service.network()
    }

    suspend fun otherLocal(): Something = suspendCoroutine {
        it.resume(Something("something"))
    }
}