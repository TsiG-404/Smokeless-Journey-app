package com.example.SmokelessJourneyApp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "SmokelessJourneyDB.db";

    // Table name and column names
    private static final String TABLE_DAYS = "days";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_CHECK_IN_DATE = "check_in_date";
    private static final String COLUMN_NOTE = "note";
    private static final String COLUMN_HAPPINESS_PERCENTAGE = "happiness_percentage";

    public MyDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DAYS_TABLE = "CREATE TABLE " + TABLE_DAYS +
                "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_CHECK_IN_DATE + " TEXT," +
                COLUMN_NOTE + " TEXT," +
                COLUMN_HAPPINESS_PERCENTAGE + " INTEGER" +
                ")";
        db.execSQL(CREATE_DAYS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DAYS);
        onCreate(db);
    }

    // Method to add a new day entry
    public void addDay(Day day) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_CHECK_IN_DATE, day.getCheckInDate().toString());
        values.put(COLUMN_NOTE, day.getNote());
        values.put(COLUMN_HAPPINESS_PERCENTAGE, day.getHappinessPercentage());
        db.insert(TABLE_DAYS, null, values);
        db.close();
    }



    // Method to delete a day entry by ID
    public void deleteDay(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_DAYS, COLUMN_ID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }
}
