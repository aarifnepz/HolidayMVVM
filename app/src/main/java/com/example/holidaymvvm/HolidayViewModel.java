package com.example.holidaymvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;

public class HolidayViewModel extends ViewModel {
    private HolidayRepository repository = new HolidayRepository();
    private MutableLiveData<List<HolidayModel>> holidaysLiveData = new MutableLiveData<>();

    public LiveData<List<HolidayModel>> getHolidays() {
        List<HolidayModel> holidays = repository.getHolidays();
        holidaysLiveData.setValue(holidays);
        return holidaysLiveData;
    }
}

