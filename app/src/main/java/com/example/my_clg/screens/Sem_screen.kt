package com.example.my_clg.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.my_clg.ui.theme.My_clgTheme

@Composable
fun arrange_Grid_sem_Element(navController: NavController, text :String, screen :String, b_id: Int, s_id: Int )  {
    FilledTonalButton(onClick = { navController.navigate("$screen/$b_id/$s_id") }, modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .size(140.dp, 140.dp),
        shape = RoundedCornerShape(16.dp) ) {
        Text(text = "$text")
    }

}
@Composable
fun arrange_Grid_sem(navController: NavController, screen :String, data_list :List<String>, b_id: Int){

    Surface(modifier = Modifier.padding(horizontal = 8.dp)) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
            ,content = {
                items(data_list.size) { index ->
                    arrange_Grid_sem_Element(navController = navController, text = data_list[index], screen = "$screen",b_id, s_id = index+1)
                }
            })
    }

}

@Composable
fun Semester(navController :NavController ,b_id :Int){
    val sem :List<String> = listOf("1st year","III sem","IV sem","V sem","VI sem","ECET")
    arrange_Grid_sem(navController = navController,  screen = "sub", data_list = sem, b_id )


}

@Preview(showBackground = true)
@Composable
fun SemesterPreview() {
    My_clgTheme {
        Semester(navController = NavController(LocalContext.current),1)
    }
}
