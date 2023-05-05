package com.example.my_clg.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.my_clg.R
import com.example.my_clg.branches
import com.example.my_clg.ui.theme.My_clgTheme

@Composable
fun arrange_list(navController: NavController,text :String , branch_id :Int){
    FilledTonalButton(onClick = { navController.navigate("sem/$branch_id") }, modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .height(70.dp)) {
        Text(text = "$text")
    }

}

@Composable
fun Home(navController : NavController){

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top=50.dp,start = 16.dp, end = 16.dp)) {
            Image(painter = painterResource(id = R.drawable.clg_logo), contentDescription = null, modifier = Modifier.size(230.dp))
            LazyColumn(
                content = {
                    items(branches.size) { item ->
                        arrange_list(
                            navController = navController,
                            text = branches[item + 1]!!,
                            branch_id = item + 1
                        )
                    }
                })
        }
    }

}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    My_clgTheme {
        Home(navController = NavController(LocalContext.current))
    }
}