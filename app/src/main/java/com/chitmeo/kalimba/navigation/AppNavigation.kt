package com.chitmeo.kalimba.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chitmeo.kalimba.feature.home.HomeScreen
import com.chitmeo.kalimba.feature.lessons.LessonsScreen
import com.chitmeo.kalimba.feature.practice.PracticeScreen
import com.chitmeo.kalimba.feature.kalimba.KalimbaScreen
private object Routes {
    const val HOME = "home"
    const val KALIMBA = "kalimba"
    const val LESSONS = "lessons"
    const val PRACTICE = "practice"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen(
                onPlayClick = {
                    navController.navigate(Routes.KALIMBA)
                },
                onLessonsClick = {
                    navController.navigate(Routes.LESSONS)
                }
            )
        }

        composable(Routes.LESSONS) {
            LessonsScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.PRACTICE) {
            PracticeScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.KALIMBA) {
            KalimbaScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}