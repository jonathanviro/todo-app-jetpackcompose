package com.javr.todoappp.addtask.domain

import com.javr.todoappp.addtask.data.TaskRepository
import com.javr.todoappp.addtask.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }
}