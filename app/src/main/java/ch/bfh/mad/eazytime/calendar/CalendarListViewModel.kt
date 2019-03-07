package ch.bfh.mad.eazytime.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ch.bfh.mad.eazytime.data.entity.WorkDay
import ch.bfh.mad.eazytime.util.CalendarProviderService
import javax.inject.Inject

class CalendarListViewModel: ViewModel() {

    @Inject
    lateinit var calendarProviderService: CalendarProviderService

    fun getCalendarItems(): LiveData<List<WorkDay>> {
        return calendarProviderService.getCalendarListitems()
    }
}