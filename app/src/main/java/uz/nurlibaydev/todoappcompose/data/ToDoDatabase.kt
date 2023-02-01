package uz.nurlibaydev.todoappcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.nurlibaydev.todoappcompose.data.models.ToDoTask

/**
 *  Created by Nurlibay Koshkinbaev on 01/02/2023 16:12
 */

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun todoDao(): ToDoDao
}