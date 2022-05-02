
package com.jdots.music.fragments

import androidx.lifecycle.ViewModel
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.*

open class CoroutineViewModel(
    private val mainDispatcher: CoroutineDispatcher
) : ViewModel() {
    private val job = Job()
    protected val scope = CoroutineScope(job + mainDispatcher)

    protected fun launch(
        context: CoroutineContext = mainDispatcher,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ) = scope.launch(context, start, block)

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}
