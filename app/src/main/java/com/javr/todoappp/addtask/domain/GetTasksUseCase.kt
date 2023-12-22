package com.javr.todoappp.addtask.domain

import com.javr.todoappp.addtask.data.TaskRepository
import com.javr.todoappp.addtask.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> {
        return taskRepository.tasks
    }
}