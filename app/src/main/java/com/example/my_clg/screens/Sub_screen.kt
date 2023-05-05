package com.example.my_clg.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.my_clg.AllData
import com.example.my_clg.ui.theme.My_clgTheme


@Composable
fun arrange_Grid_sem_Element(navController: NavController,b_id: Int,s_id: Int,sub_id :Int) {
    FilledTonalButton(onClick = { navController.navigate("dec/$b_id/$s_id/$sub_id") }, modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .size(140.dp, 140.dp),
        shape = RoundedCornerShape(16.dp) ) {
        Text(text = AllData[b_id]!![s_id]!![sub_id]!!.SubName)
    }
}

@Composable
fun arrange_Grid_sub(navController: NavController,b_id: Int,s_id: Int) {
    val sub_list = AllData[b_id]!![s_id]
    Surface(modifier = Modifier.padding(horizontal = 8.dp)) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            content = {
                sub_list?.let {
                    items(it.size) { index ->
                        arrange_Grid_sem_Element(
                            navController = navController,
                            b_id,
                            s_id,
                            sub_id = index)
                    }
                }
            })
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Subjects(navController : NavController, b_id :Int, s_id :Int ){
    Scaffold(
        topBar = { topBar(navController = navController, text = "Subjects")}
    ) {
        arrange_Grid_sub(navController = navController, b_id,s_id)
    }
}

@Preview(showBackground = true)
@Composable
fun SubjectsPreview() {
    My_clgTheme {
        Subjects(navController = NavController(LocalContext.current),1,1)
    }
}