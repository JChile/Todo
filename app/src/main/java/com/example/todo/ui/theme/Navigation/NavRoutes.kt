package com.example.todo.ui.theme.Navigation

sealed class NavRoutes(val route: String) {
    object List: NavRoutes("register_screen")
    object Register: NavRoutes("list_screen")
}