package uz.nurlibaydev.todoappcompose.data.models

import androidx.compose.ui.graphics.Color
import uz.nurlibaydev.todoappcompose.ui.theme.HighPriorityColor
import uz.nurlibaydev.todoappcompose.ui.theme.LowPriorityColor
import uz.nurlibaydev.todoappcompose.ui.theme.MediumPriorityColor
import uz.nurlibaydev.todoappcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(color = HighPriorityColor),
    MEDIUM(color = MediumPriorityColor),
    LOW(color = LowPriorityColor),
    NONE(color = NonePriorityColor)
}