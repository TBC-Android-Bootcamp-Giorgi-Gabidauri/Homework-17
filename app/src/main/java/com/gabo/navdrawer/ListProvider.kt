package com.gabo.navdrawer

object ListProvider {
    val menuList = listOf(
        MenuModel(R.drawable.ic_dashboard, "Dashboard", "", null),
        MenuModel(R.drawable.ic_mail, "Pesan", " 15 ", R.drawable.bg_number_orange),
        MenuModel(R.drawable.ic_notifications, "Notifikasi", " 20 ", R.drawable.bg_number_green),
        MenuModel(R.drawable.ic_calendar, "Kalendar", "", null),
        MenuModel(R.drawable.ic_statistics, "Statistik", "", null),
        MenuModel(R.drawable.ic_settings, "Pergaturan", "", null),
    )
}