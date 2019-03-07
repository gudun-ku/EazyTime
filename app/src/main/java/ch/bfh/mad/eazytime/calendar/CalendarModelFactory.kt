package ch.bfh.mad.eazytime.calendar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception

class CalendarModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when(modelClass) {
            CalendarListViewModel::class.java -> CalendarListViewModel()
            else -> throw Exception("Unknown Calendar ViewModel")
        } as T
    }
}