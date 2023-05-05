package com.example.my_clg


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.my_clg.screens.Decision
import com.example.my_clg.screens.Home
import com.example.my_clg.screens.Semester
import com.example.my_clg.screens.Subjects

@Composable
fun myApp() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination ="home"){
        composable("home") { Home(navController = navController) }
        composable(route="sem/{branch}",
            arguments = listOf(
                navArgument("branch") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val branch = backStackEntry.arguments?.getInt("branch")
            branch?.let { Semester(navController = navController, b_id = it) }
        }
        composable(route="sub/{b_id}/{s_id}",
                arguments = listOf(
                navArgument("b_id") { type = NavType.IntType } ,
                navArgument("s_id") { type = NavType.IntType }
                )
        ) { backStackEntry ->
            val b_id = backStackEntry.arguments?.getInt("b_id")
            val s_id = backStackEntry.arguments?.getInt("s_id")
            b_id?.let { s_id?.let { it1 -> Subjects(navController = navController, b_id = it, s_id= it1
            ) } }
        }
        composable(route = "dec/{b_id}/{s_id}/{sub_id}",
        arguments = listOf(
            navArgument("sub_id") {type = NavType.IntType},
            navArgument("b_id") { type = NavType.IntType } ,
            navArgument("s_id") { type = NavType.IntType }
        ))  { backStackEntry ->
            val sub_id = backStackEntry.arguments?.getInt("sub_id")
            val b_id = backStackEntry.arguments?.getInt("b_id")
            val s_id = backStackEntry.arguments?.getInt("s_id")
            sub_id?.let { b_id?.let { it1 -> s_id?.let { it2 -> Decision(navController = navController, sub_id = it,b_id= it1,s_id= it2) } } }
        }

    }
}

