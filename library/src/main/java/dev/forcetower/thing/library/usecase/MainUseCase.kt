package dev.forcetower.thing.library.usecase

import dagger.Reusable
import dev.forcetower.thing.library.repository.MainRepository
import javax.inject.Inject

@Reusable
class MainUseCase @Inject constructor(
    private val repository: MainRepository
) {
    suspend operator fun invoke() = repository.otherLocal()
}