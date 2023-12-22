package com.javr.todoappp.addtask.ui

import com.javr.todoappp.addtask.ui.model.TaskModel

sealed interface TasksUiState {
    object Loading : TasksUiState
    data class Error(val throwable: Throwable) : TasksUiState
    data class Success(val tasks: List<TaskModel>) : TasksUiState
}