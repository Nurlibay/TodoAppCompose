package uz.nurlibaydev.todoappcompose.ui.screen.list

import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import uz.nurlibaydev.todoappcompose.R
import uz.nurlibaydev.todoappcompose.ui.theme.topAppBarBackgroundColor
import uz.nurlibaydev.todoappcompose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar() {
    TopAppBar(
        modifier = Modifier.background(MaterialTheme.colorScheme.topAppBarBackgroundColor),
        title = {
            Text(
                text = stringResource(R.string.tasks),
                color = MaterialTheme.colorScheme.topAppBarContentColor
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.topAppBarBackgroundColor)
    )
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}