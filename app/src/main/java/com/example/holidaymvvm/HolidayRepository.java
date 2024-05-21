package com.example.holidaymvvm;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class HolidayRepository {


    //Repository populated from https://calendarific.com/holidays/2024/TR
    public List<HolidayModel> getHolidays() {
        String jsonResponse = "[" +
                "{\"name\":\"New Year's Day\",\"date\":\"2024-01-01\",\"description\":\"New Year’s Day in Turkey falls on January 1 in the Gregorian calendar and marks the beginning of a new calendar year.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Ramadan Start\",\"date\":\"2024-03-11\",\"description\":\"Ramadan is a period of prayer, reflection and fasting for many Muslims worldwide. It is the ninth month in the Islamic calendar.\",\"isPublicHoliday\":false}," +
                "{\"name\":\"March Equinox\",\"date\":\"2024-03-20\",\"description\":\"March Equinox in Turkey (Istanbul)\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Ramadan Feast Holiday\",\"date\":\"2024-04-08\",\"description\":\"Ramadan Feast Holiday is a holiday for public servants in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Ramadan Feast Eve (Private Sector)\",\"date\":\"2024-04-09\",\"description\":\"The Ramadan Feast Eve in Turkey is the last day of fasting during the Islamic month of Ramadan. It is a time when people prepare for the Ramadan Feast.\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Ramadan Feast Eve (Public Sector)\",\"date\":\"2024-04-09\",\"description\":\"The Ramadan Feast Eve in Turkey is the last day of fasting during the Islamic month of Ramadan. It is a time when people prepare for the Ramadan Feast.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Ramadan Feast\",\"date\":\"2024-04-10\",\"description\":\"The Ramadan Feast is a three-day festival and one of the most important religious holidays in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Ramadan Feast Holiday\",\"date\":\"2024-04-11\",\"description\":\"Ramadan Feast Holiday is a national holiday in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"National Sovereignty and Children's Day\",\"date\":\"2024-04-23\",\"description\":\"National Sovereignty and Children’s Day in Turkey, observed every April 23, commemorates the Turkish Parliament’s creation and celebrates children’s role in the country’s development.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Labor and Solidarity Day\",\"date\":\"2024-05-01\",\"description\":\"Labor and Solidarity Day, which falls on May 1 each year, is one of the most controversial holidays in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Commemoration of Atatürk, Youth and Sports Day\",\"date\":\"2024-05-19\",\"description\":\"Many people in Turkey annually observe the Commemoration of Atatürk, Youth and Sports Day on May 19 by attending sports events and remembering Turkey’s War of Independence, which started on this day in 1919.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Sacrifice Feast Eve\",\"date\":\"2024-06-15\",\"description\":\"The Sacrifice Feast Eve, in which the date changes every year in the Gregorian calendar, is a time to prepare for the four-day Sacrifice Feast in Turkey.\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Sacrifice Feast\",\"date\":\"2024-06-16\",\"description\":\"The Sacrifice Feast in Turkey is a time of thanksgiving and remembrance of the poor.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Sacrifice Feast Holiday\",\"date\":\"2024-06-17\",\"description\":\"Sacrifice Feast Holiday is a national holiday in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"June Solstice\",\"date\":\"2024-06-20\",\"description\":\"June Solstice in Turkey (Istanbul)\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Democracy and National Unity Day\",\"date\":\"2024-07-15\",\"description\":\"Democracy and National Unity Day is a national holiday in Turkey.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Victory Day\",\"date\":\"2024-08-30\",\"description\":\"Turkey annually celebrates Victory Day on August 30, commemorating the Turkish victory over Greek invaders in 1922.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"September Equinox\",\"date\":\"2024-09-22\",\"description\":\"September Equinox in Turkey (Istanbul)\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Republic Day Eve\",\"date\":\"2024-10-28\",\"description\":\"Republic Day Eve is a half day in Turkey.\",\"isPublicHoliday\":false}," +
                "{\"name\":\"Republic Day\",\"date\":\"2024-10-29\",\"description\":\"Republic Day in Turkey, which is on October 29 each year, commemorates the creation of the Turkish Republic in 1923.\",\"isPublicHoliday\":true}," +
                "{\"name\":\"Ataturk Commemoration Day\",\"date\":\"2024-11-10\",\"description\":\"Ataturk Commemoration Day is an observance in Turkey.\",\"isPublicHoliday\":false}," +
                "{\"name\":\"December Solstice\",\"date\":\"2024-12-21\",\"description\":\"December Solstice in Turkey (Istanbul)\",\"isPublicHoliday\":false}," +
                "{\"name\":\"New Year's Eve\",\"date\":\"2024-12-31\",\"description\":\"New Year’s Eve in Turkey, which is December 31 in the Gregorian calendar, marks the end of a calendar year.\",\"isPublicHoliday\":false}" +
                "]";

        Type listType = new TypeToken<List<HolidayModel>>() {}.getType();
        return new Gson().fromJson(jsonResponse, listType);
    }
}
