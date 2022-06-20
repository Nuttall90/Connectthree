package com.example.connectthree;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

// Code take from thenewboston to create SQLite Database
public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Players.db";
    public static final String TABLE_PLAYERS = "Players";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_PLAYERNAME = "playername";


    public MyDBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);

    }

    public MyDBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = " CREATE TABLE " + TABLE_PLAYERS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_PLAYERNAME + " TEXT " +
                ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLAYERS);
        onCreate(db);
    }

    //Add a new row to the database
    public  void  addPlayer (Players player){
        ContentValues values = new ContentValues();
        values.put(COLUMN_PLAYERNAME, player.get_playername());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PLAYERS, null, values);
        db.close();
    }

    //Delete a product from the database
    public void deletePlayer (String playerName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PLAYERS + " WHERE " + COLUMN_PLAYERNAME + " =\"" + playerName + "\";" );

    }

    //print out the database as a string
    public String databaseToString() {
        String dbString ="";
        SQLiteDatabase db = getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_PLAYERS + " WHERE 1";

        //Cursor point to a location in the results
        Cursor c =db.rawQuery(query, null);
        // Move to the first row in the results
        c.moveToFirst();

        while (!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("playername")) !=null){
                dbString += c.getString(c.getColumnIndex("playername"));
                dbString += "\n";
                c.moveToNext();
            }
        }
        db.close();
        return dbString;

    }
}
