package com.example.juaraandroidroom

import android.app.Application
import com.example.juaraandroidroom.database.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}