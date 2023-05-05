package com.example.my_clg.screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.my_clg.ui.theme.My_clgTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar(navController: NavController,text :String) {
        TopAppBar(title = { Text(text = text) },
            colors = TopAppBarDefaults.smallTopAppBarColors(MaterialTheme.colorScheme.primaryContainer),
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
            })

}

@Preview
@Composable
fun topBarPreview() {
    My_clgTheme {
        topBar(navController = NavController(LocalContext.current), text = "Home")
    }
}