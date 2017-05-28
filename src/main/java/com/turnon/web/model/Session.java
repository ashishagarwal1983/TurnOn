package com.turnon.web.model;

import org.joda.time.Hours;
import org.joda.time.Minutes;

public class Session {
    private HourMinute startTime;
    private HourMinute endMinute;
	public HourMinute getStartTime() {
		return startTime;
	}
	public void setStartTime(HourMinute startTime) {
		this.startTime = startTime;
	}
	public HourMinute getEndMinute() {
		return endMinute;
	}
	public void setEndMinute(HourMinute endMinute) {
		this.endMinute = endMinute;
	}
}
