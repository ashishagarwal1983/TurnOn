package com.turnon.web.model;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.joda.time.Hours;
import org.joda.time.Minutes;

import com.couchbase.client.java.repository.annotation.Field;

public class TimeSlot {
	@Field
    private DayOfWeek day;
	@Field
    private List<Session> sessions;
    
    public DayOfWeek getDay() {
        return day;
    }
    public void setDay(DayOfWeek day) {
        this.day = day;
    }
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
    
    
    
}
