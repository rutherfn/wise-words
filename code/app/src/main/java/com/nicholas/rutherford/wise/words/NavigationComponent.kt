package com.nicholas.rutherford.wise.words

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.Navigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nicholas.rutherford.wise.words.navigation.NavigationDestinations
import com.nicholas.rutherford.wise.words.quoteslist.QuotesListScreen

@Composable
fun NavigationComponent(
    navHostController: NavHostController,
    viewModels: ViewModels
) {
    val quotesListViewModel = viewModels.quotesListViewModel

    NavHost(
        navController = navHostController,
        startDestination = NavigationDestinations.QUOTES_LIST_SCREEN
    ) {
        composable(route = NavigationDestinations.QUOTES_LIST_SCREEN) {
            QuotesListScreen(
                quotes = quotesListViewModel.fetchTestList()
            )
        }
    }
}