package com.example.holidaymvvm;

public class HolidayModel {
    private String name;
    private String date;
    private String description;
    private boolean isPublicHoliday;

    public HolidayModel(String name, String date, String description, boolean isPublicHoliday) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.isPublicHoliday = isPublicHoliday;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublicHoliday() {
        return isPublicHoliday;
    }
}

