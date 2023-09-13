package com.br.project.core.util

sealed class UiEvent {
    data class Navigate(val rout: String): UiEvent()
    object NavigateUp: UiEvent()
}
