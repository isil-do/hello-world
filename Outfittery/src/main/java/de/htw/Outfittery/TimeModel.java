package de.htw.Outfittery;

import java.util.Calendar;
import java.util.Date;

public class TimeModel {

    private Calendar calendar;

    public TimeModel(){
        this.calendar = Calendar.getInstance();
    }

    public Date getTime(){
        return this.calendar.getTime();
    }
}
