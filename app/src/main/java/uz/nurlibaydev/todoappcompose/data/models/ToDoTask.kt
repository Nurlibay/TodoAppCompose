package uz.nurlibaydev.todoappcompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.nurlibaydev.todoappcompose.util.Constants.DATABASE_TABLE

/**
 *  Created by Nurlibay Koshkinbaev on 01/02/2023 13:55
 */

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority,
)