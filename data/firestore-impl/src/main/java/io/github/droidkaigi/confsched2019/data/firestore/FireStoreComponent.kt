package io.github.droidkaigi.confsched2019.data.repository

import dagger.BindsInstance
import dagger.Component
import io.github.droidkaigi.confsched2019.data.firestore.FireStore
import io.github.droidkaigi.confsched2019.data.firestore.FirestoreModule
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

@Singleton
@Component(
    modules = [
        FirestoreModule::class
    ]
)
interface FireStoreComponent {
    fun fireStore(): FireStore

    @Component.Builder
    interface Builder {

        @BindsInstance fun coroutineContext(coroutineContext: CoroutineContext): Builder

        fun build(): FireStoreComponent
    }

    companion object {
        fun builder(): Builder = DaggerFireStoreComponent.builder()
    }
}
