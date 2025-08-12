package com.example.SmokelessJourneyApp;

public class User {
    private double eurosForTobacco;

    // Constructor
    public User(double eurosForTobacco) {
        this.eurosForTobacco = eurosForTobacco;
    }

    // Getter and setter for eurosForTobacco
    public double getEurosForTobacco() {
        return eurosForTobacco;
    }

    public void setEurosForTobacco(double eurosForTobacco) {
        this.eurosForTobacco = eurosForTobacco;
    }
}
