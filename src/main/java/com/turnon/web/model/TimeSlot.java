package com.turnon.web.model;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Date;

import org.joda.time.Hours;
import org.joda.time.Minutes;

public class TimeSlot {
    private DayOfWeek day;
    private Session[] sessions;
    public DayOfWeek getDay() {
        return day;
    }
    public void setDay(DayOfWeek day) {
        this.day = day;
    }
    public Session[] getSessions() {
        return sessions;
    }
    public void setSessions(Session[] sessions) {
        this.sessions = sessions;
    }
    @Override
    public String toString() {
        return "TimeSlot [day=" + day + ", sessions=" + Arrays.toString(sessions) + "]";
    }
    
    
    
}
