package uz.nurlibaydev.todoappcompose.data.repositories

import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import uz.nurlibaydev.todoappcompose.data.ToDoDao
import uz.nurlibaydev.todoappcompose.data.models.ToDoTask
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(
    private val toDoDao: ToDoDao,
) {
    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId)
    }

    suspend fun addTask(todoTask: ToDoTask) {
        toDoDao.addTask(toDoTask = todoTask)
    }

    suspend fun updateTask(todoTask: ToDoTask) {
        toDoDao.updateTask(todoTask = todoTask)
    }

    suspend fun deleteTask(todoTask: ToDoTask) {
        toDoDao.deleteTask(toDoTask = todoTask)
    }

    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery)
    }
}