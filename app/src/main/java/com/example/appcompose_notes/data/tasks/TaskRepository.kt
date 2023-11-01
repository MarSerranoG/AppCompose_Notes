package com.example.appcompose_notes.data.tasks

import com.example.appcompose_notes.data.tasks.local.TaskDao
import com.example.appcompose_notes.data.tasks.model.TaskEntity
import javax.inject.Inject

class TaskRepository @Inject constructor( private val taskDao: TaskDao
) {

    fun getAllTask():List<TaskEntity> {
        return taskDao.getAll()
    }


    fun insertTask(taskEntity: TaskEntity){
        taskDao.insert(taskEntity=taskEntity)
    }

    fun updateTask(taskEntity: TaskEntity){
        taskDao.update(taskEntity=taskEntity)
    }

    fun deleteTask(taskEntity: TaskEntity){
        taskDao.delete(taskEntity=taskEntity)
    }

}