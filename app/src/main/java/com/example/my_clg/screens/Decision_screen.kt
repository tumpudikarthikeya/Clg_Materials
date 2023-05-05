package com.example.my_clg.screens

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.my_clg.AllData

@Composable
fun Decision_disp(context :Context,name :String, link :String) {
    FilledTonalButton(onClick = {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        context.startActivity(intent)
    }, modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .height(70.dp)
    ) {
        Text(text = "$name")
    }

}

@Composable
fun Decision(navController: NavController, b_id :Int ,s_id :Int , sub_id :Int) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = AllData[b_id]!![s_id]!![sub_id]!!.SubName, fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center)
        Decision_disp(context = context, name = "Materials", link ="https://drive.google.com/drive/folders/${AllData[b_id]!![s_id]!![sub_id]!!.mat_link}" )
        Decision_disp(context = context, name = "Previous Papers", link ="https://drive.google.com/drive/folders/${AllData[b_id]!![s_id]!![sub_id]!!.pqp_link}" )

    }

}