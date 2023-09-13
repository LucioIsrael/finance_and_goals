package com.br.project.financasemetas

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.br.project.core_ui.components.BottomNavigation
import com.br.project.financasemetas.ui.theme.FinancasEMetasTheme
import com.br.project.finance_presentation.spendings.SpendingsScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinancasEMetasTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = { BottomNavigation(navController = navController) }
                ) {
                    NavigationGraph(navController = navController)
                }
            }
        }
    }
}
