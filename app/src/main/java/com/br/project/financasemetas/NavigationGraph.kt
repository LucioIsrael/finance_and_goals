package com.br.project.financasemetas

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.br.project.core.util.BottomNav
import com.br.project.finance_presentation.spendings.SpendingsScreen
import com.br.project.goals_presentation.GoalsScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNav.Spendings.route) {
        composable(BottomNav.Spendings.route) {
            SpendingsScreen()
        }

        composable(BottomNav.Goals.route) {
            GoalsScreen()
        }
    }
}
