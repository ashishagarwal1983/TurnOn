package com.turnon.web.model;

import org.joda.time.Hours;
import org.joda.time.Minutes;

public class Session {
    private Hours startHour;
    private Minutes startMinute;
    private Hours endHour;
    private Minutes endMinute;
    public Hours getStartHour() {
        return startHour;
    }
    public void setStartHour(Hours startHour) {
        this.startHour = startHour;
    }
    public Minutes getStartMinute() {
        return startMinute;
    }
    public void setStartMinute(Minutes startMinute) {
        this.startMinute = startMinute;
    }
    public Hours getEndHour() {
        return endHour;
    }
    public void setEndHour(Hours endHour) {
        this.endHour = endHour;
    }
    public Minutes getEndMinute() {
        return endMinute;
    }
    public void setEndMinute(Minutes endMinute) {
        this.endMinute = endMinute;
    }
    @Override
    public String toString() {
        return "Session [startHour=" + startHour + ", startMinute=" + startMinute + ", endHour=" + endHour
                + ", endMinute=" + endMinute + "]";
    }
    
    
}
