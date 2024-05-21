package com.example.holidaymvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.HolidayViewHolder> {
    private List<HolidayModel> holidays = new ArrayList<>();

    public void setHolidays(List<HolidayModel> holidays) {
        this.holidays = holidays;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HolidayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holiday, parent, false);
        return new HolidayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayViewHolder holder, int position) {
        HolidayModel holiday = holidays.get(position);
        holder.nameTextView.setText(holiday.getName());
        holder.dateTextView.setText(holiday.getDate());
        holder.descriptionTextView.setText(holiday.getDescription());
        holder.isPublicHolidayTextView.setText(holiday.isPublicHoliday() ? "Public Holiday" : "Private Holiday");
    }

    @Override
    public int getItemCount() {
        return holidays.size();
    }

    static class HolidayViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView dateTextView;
        TextView descriptionTextView;
        TextView isPublicHolidayTextView;

        public HolidayViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            isPublicHolidayTextView = itemView.findViewById(R.id.isPublicHolidayTextView);
        }
    }
}
