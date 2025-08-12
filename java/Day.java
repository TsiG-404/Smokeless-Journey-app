package com.example.SmokelessJourneyApp;

import java.util.Date;

public class Day {
    private Date checkInDate;
    private String note;
    private int happinessPercentage; // Assuming happiness is represented as an integer percentage

    // Constructor
    public Day(Date checkInDate, String note, int happinessPercentage) {
        this.checkInDate = checkInDate;
        this.note = note;
        this.happinessPercentage = happinessPercentage;
    }

    // Getters and setters
    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getHappinessPercentage() {
        return happinessPercentage;
    }

    public void setHappinessPercentage(int happinessPercentage) {
        this.happinessPercentage = happinessPercentage;
    }
}
