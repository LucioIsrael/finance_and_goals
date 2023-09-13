package com.br.project.core.util

import com.br.project.core.R
import com.br.project.core.navigation.Route.GOALS
import com.br.project.core.navigation.Route.SPENDINGS
import com.br.project.core.navigation.Titles.GOALS_TITLE
import com.br.project.core.navigation.Titles.SPENDINGS_TITLE

sealed class BottomNav(
    var title: String,
    var icon: Int,
    var route: String,
) {
    object Spendings : BottomNav(SPENDINGS_TITLE, R.drawable.spending_icon, SPENDINGS)
    object Goals : BottomNav(GOALS_TITLE, R.drawable.goals_icon, GOALS)
}

val itemsBottomNav = listOf(
    BottomNav.Spendings,
    BottomNav.Goals,
)
