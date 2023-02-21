package edu.uksw.fti.pam.pam_activity.ui.screens

import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import edu.uksw.fti.pam.pam_activity.R
import edu.uksw.fti.pam.pam_activity.ui.BottomNavItems


@Composable
fun NavigationGraph(
    navController: NavController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Home.screen_route
    ){
        composable(BottomNavItems.Home.screen_route) {
            HomeScreen(name = "Android")
        }

        composable(BottomNavItems.Article.screen_route) {
            ArticleScreen()
        }

        composable(BottomNavItems.Article.screen_route) {
            ProfileScreen()
        }
    }
}

@Composable
fun BottomNavigation(
    navController: NavController
){
    val items = listOf(
        BottomNavItems.Home,
        BottomNavItems.Article,
        BottomNavItems.Profile
    )

    androidx.compose.material.BottomNavigation(
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route


        items.forEach{item ->
            BottomNavigationItem(
                icon = { Icon(
                    imageVector = item.icon,
                    contentDescription =  "${item.title} icon"
                )},
                label
                        selected = , onClick
            ) {

            }
        }
    }
}