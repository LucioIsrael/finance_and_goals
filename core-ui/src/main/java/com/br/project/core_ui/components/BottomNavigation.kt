package com.br.project.core_ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.br.project.core.util.itemsBottomNav

@Composable
fun BottomNavigation(navController: NavController) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    val itens = itemsBottomNav
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        itens.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        tint = if (selected) Color.Black else Color.White
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                },
                alwaysShowLabel = true,
            )
        }
    }
}
