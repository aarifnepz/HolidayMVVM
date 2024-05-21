package com.example.holidaymvvm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HolidayViewModel holidayViewModel;
    private HolidayAdapter holidayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        holidayAdapter = new HolidayAdapter();
        recyclerView.setAdapter(holidayAdapter);

        holidayViewModel = new ViewModelProvider(this).get(HolidayViewModel.class);
        holidayViewModel.getHolidays().observe(this, new Observer<List<HolidayModel>>() {
            @Override
            public void onChanged(List<HolidayModel> holidays) {
                holidayAdapter.setHolidays(holidays);
            }
        });
    }
}
