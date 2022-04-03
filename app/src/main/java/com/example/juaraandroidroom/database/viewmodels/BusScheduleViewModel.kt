package com.example.juaraandroidroom.database.viewmodels

import androidx.lifecycle.ViewModel
import com.example.juaraandroidroom.database.Schedule
import com.example.juaraandroidroom.database.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {
    fun fullSchedule(): List<Schedule> = scheduleDao.getAll()
    fun scheduleForStopName(name: String): List<Schedule> = scheduleDao.getByStopName(name)
}