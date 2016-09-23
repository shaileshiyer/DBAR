package com.iyer.shailesh.dbar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sweth on 8/7/2016.
 */
public class sqlitehelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "dbar";
    private static final String TABLE_NAME1 = "set1";
    private static final String TABLE_NAME2 = "details";
    private static final String TABLE_NAME3 = "set2";
    private static final String TABLE_NAME4 = "set3";
    private static final String TABLE_NAME5 = "set4";
    private static final String TABLE_NAME6 = "set5";
    private static final String TABLE_NAME7 = "set6";
    private static final String TABLE_NAME8 = "set7";


    //fields in riddles table
    private static final String RID = "rid";
    private static final String QUESTION = "question";
    private static final String ANSWER = "answer";
    private static final String DBID = "dbid";
    //fields in details table
    private static final String ID = "id";
    private static final String STARTTIME = "start";
    private static final String ENDTIME = "end";
    private static final String R1 = "r1";
    private static final String R2 = "r2";
    private static final String R3 = "r3";
    private static final String R4 = "r4";
    private static final String R5 = "r5";
    private static final String R6 = "r6";
    private static final String R7 = "r7";
    private static final String SET = "setno";

    //different methods in the database

    private SQLiteDatabase dbase;

    public sqlitehelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        String query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME1 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        String query2 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME2 + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + STARTTIME + " TEXT," + ENDTIME + " TEXT," + R1 + " INTEGER," + R2 + " INTEGER," + R3 + " INTEGER," + R4 + " INTEGER," + R5 + " INTEGER," + R6 + " INTEGER," + R7 + " INTEGER," + SET + " INTEGER);";
        db.execSQL(query1);
        db.execSQL(query2);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME3 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME4 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME5 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME6 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME7 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);
        query1 = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME8 + "(" + RID + " INTEGER PRIMARY KEY ," + QUESTION + " TEXT," + ANSWER + " TEXT," + DBID + " TEXT);";
        db.execSQL(query1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertquestions(int set) {
        dbase = this.getWritableDatabase();
        Log.e("set no", String.valueOf(set));
        String tablename = "set" + String.valueOf(set);
        if (set == 1) {
            String selectQuery = "SELECT  * FROM " + tablename;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, "The place you need to look where you can find a book.");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "Finding the second clue will be a treat! Look for it where you get something to eat.");
                values.put(ANSWER, "Canteen");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "A thousand wheels but move I do not. Call me what I am. Call me a lot. Who I am?");
                values.put(ANSWER, "Parking Lot");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Energy of the universe can be explained here, theories you read on vacuum and air. I am a place in your college with some practical. You will get better knowledge.");
                values.put(ANSWER, "Physics Lab");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "You will get to dress up to play your part. Remember to act with all of your heart.");
                values.put(ANSWER, "Auditorium");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "You pay me, I pay you. If you think about the money. You will get the clue!");
                values.put(ANSWER, "Bank");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "A place where you come to do all the tasks that require Bunsen burner and conical flasks.");
                values.put(ANSWER, "Chemistry Lab");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        } else if (set == 2) {
            String selectQuery = "SELECT  * FROM " + TABLE_NAME3;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, "I am full of interesting stuff. People stare and can't get enough!");
                values.put(ANSWER, "Notice Board");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "The purpose of this lab is to gain experience in working with vector quantity.");
                values.put(ANSWER, "Physics Lab");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "Many faces I have seen. Favorite pass time I have been. Place in your college again, if you will visit me daily, weight is what you will gain.");
                values.put(ANSWER, "Canteen");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Up and Down, High and Low. If I want to read here I go");
                values.put(ANSWER, "Library");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "You can walk on me all day but never get anywhere! Where am I found?");
                values.put(ANSWER, "Gym");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "Caution is needed going this way. A tarmac place of bay bay bay. Now is the time to leave the car. If you leave from here you will go far");
                values.put(ANSWER, "Parking Lot");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "Some like me hot, some like me cold, some like me mild, some like me strong. Where am I found?");
                values.put(ANSWER, "Cafeteria");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        }
        else if (set == 3) {
            String selectQuery = "SELECT  * FROM " + TABLE_NAME4;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, "I have a million stories but cannot tell you them.");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "You will get to dress up to play your part, remember to act with all of your heart.");
                values.put(ANSWER, "Auditorium");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "Relate this to a location in your college - Every action has an equal and opposite reaction!");
                values.put(ANSWER, "Physics Lab");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Paper and invites having around up on the height it can be found.");
                values.put(ANSWER, "Notice Board");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "It's pretty basic. Get here soon. I have bond.");
                values.put(ANSWER, "Chemistry Lab");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "I dont earn neither I spend still I'm richest on earth.");
                values.put(ANSWER, "Bank");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "Trace your way to the mill that kills.");
                values.put(ANSWER, "Gym");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        } else if (set == 4) {
            dbase = this.getWritableDatabase();
            String selectQuery = "SELECT  * FROM " + tablename;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, " A pile of words jackets of hordes. Take a quick look in the place of the book.");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "Solve the pictogram which you will get in the room no .For room solve the riddle:- \n " +
                        "0000 = 00, 1111 = 01, 2222 = 22, 3333 = 63, 4444 = 124, 5555 = ???");
                values.put(ANSWER, "Gopuram");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "It's pretty basic.Get here soon. I have bond");
                values.put(ANSWER, "Chemistry lab");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Previously banned, Now back with a bang. A childs treat served as a hot meal. Where do you find me?");
                values.put(ANSWER, "Cafeteria");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "This is a board where teacher never teaches");
                values.put(ANSWER, "Notice board");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "If water is xzuds then bbmudfm is?");
                values.put(ANSWER, "Canteen");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "A site of work and getting things done of piles of paper and not much fun.");
                values.put(ANSWER, "Office");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        } else if (set == 5) {
            dbase = this.getWritableDatabase();
            String selectQuery = "SELECT  * FROM " + tablename;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, ". All the world's wisdom can be found inside but in which book will the next clue hide.");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "Here's the place to be in those locations, when you want to do experiments and learn formulae and equation");
                values.put(ANSWER, "Physics lab");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "In the clash of desk and chair. You will find the secret here");
                values.put(ANSWER, "Office");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Anagram :Aurum idiot");
                values.put(ANSWER, "Auditorium");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "There's a place nearby you'll want to meet. A portal place where people greet.");
                values.put(ANSWER, "Reception");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "I will warm you up after playing in the cold..... cream and sweet in a mug that you hold. Where can you find me?");
                values.put(ANSWER, "Cafeteria");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "Many resolve to visit here everyday but barely a few make it If you want the next clue look where you find bell that never rings");
                        values.put(ANSWER, "Gym");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        } else if (set == 6) {
            dbase = this.getWritableDatabase();
            String selectQuery = "SELECT  * FROM " + tablename;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, "One scream can throw you out");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, " Anagram: My amusing");
                values.put(ANSWER, "Gymnasium");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "Something different to show every week, but I am still the same place.");
                values.put(ANSWER, " Amphitheatre");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "An artificial underground passage, especially one built through a hill or under a building.");
                values.put(ANSWER, "Tunnel");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "Solve the pictogram which you will get in room no .For room no solve the riddle:- \n O * O * O = 64 \n ($ + $) * O = 24 \n (O * $) /#=6 \n (O * $ *#)/&=3 \n (O +#)*$ * &=??? \n");
                values.put(ANSWER, "Parking Lot");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, " Here is a place where you cannot mess with your sign. Credit In Debit out is the only rule applied.");
                        values.put(ANSWER, "Bank");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "You enter a small room. Doors close. when the door is open , you are in a different place.");
                values.put(ANSWER, "Lift");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        } else if (set == 7) {
            dbase = this.getWritableDatabase();
            String selectQuery = "SELECT  * FROM " + tablename;
            Cursor cursor = dbase.rawQuery(selectQuery, null);
            int flag = cursor.getCount();
            if (flag == 0) {
                ContentValues values = new ContentValues();
                //r1
                values.put(RID, "1");
                values.put(QUESTION, "Come over here and learn how to spell ,Read books, prose and poetry, written so well");
                values.put(ANSWER, "Library");
                values.put(DBID, "db1");
                dbase.insert(tablename, null, values);
                //r2
                values.put(RID, "2");
                values.put(QUESTION, "Solve the pictogram which you will get in room no For room no solve the Riddle:-\n O * O * O = 8\n ($ * $) * O = 50\n ($ * O) * &= 10\n $ - O + &=#\n ($ * $ *# * O)+O =???\n");
                values.put(ANSWER, "Bank");
                values.put(DBID, "db2");
                dbase.insert(tablename, null, values);
                //r3
                values.put(RID, "3");
                values.put(QUESTION, "Previously ban, Now back with a bang. A childs treat served as a hot meal. Where do you find me?");
                values.put(ANSWER, "Cafeteria");
                values.put(DBID, "db3");
                dbase.insert(tablename, null, values);
                //r4
                values.put(RID, "4");
                values.put(QUESTION, "Anagram: Anne etc");
                values.put(ANSWER, "Canteen");
                values.put(DBID, "db4");
                dbase.insert(tablename, null, values);
                //r5
                values.put(RID, "5");
                values.put(QUESTION, "Many resolve to visit here everyday but barely a few make it If you want the next clue look where you find bell that never rings");
                        values.put(ANSWER, "Gym");
                values.put(DBID, "db5");
                dbase.insert(tablename, null, values);
                //r6
                values.put(RID, "6");
                values.put(QUESTION, "People knock on me to say Hello!! But lock me up after visitors go");
                values.put(ANSWER, "Gate");
                values.put(DBID, "db6");
                dbase.insert(tablename, null, values);
                //r7
                values.put(RID, "7");
                values.put(QUESTION, "Life is like a play. It does not matter how long it lasts,but how well it was played.");
                values.put(ANSWER, "Auditorium");
                values.put(DBID, "db7");
                dbase.insert(tablename, null, values);
            }
            cursor.close();
        }


    }

    public void createnewuser(int set) {
        dbase = this.getWritableDatabase();
        String query = "SELECT " + ENDTIME + " FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "=''";
        Cursor cursor = dbase.rawQuery(query, null);
        if (cursor.getCount() == 0) {
            Log.e("user", "new user inserting details");
            ContentValues values = new ContentValues();

            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy kk:mm:ss");
            Date now = new Date();
            String datetime = dateformat.format(now);
            values.put(STARTTIME, datetime);
            values.put(ENDTIME, "");
            values.put(R1, 0);
            values.put(R2, 0);
            values.put(R3, 0);
            values.put(R4, 0);
            values.put(R5, 0);
            values.put(R6, 0);
            values.put(R7, 0);
            values.put(SET, set);
            dbase.insert(TABLE_NAME2, null, values);

        } else {
            cursor.moveToFirst();
            Log.e("user", "old user continue '" + cursor.getString(0) + "' ok");
        }

        cursor.close();
    }

    //returning the table as an array list object
    public ArrayList<Riddles> initialiseRiddles(int setno) {
        ArrayList<Riddles> ridList = new ArrayList<Riddles>();
        // Select All Query
        String tablename = "set" + String.valueOf(setno);
        String selectQuery = "SELECT  * FROM " + tablename;
        Log.e("query", selectQuery);
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Riddles ridd = new Riddles();
                ridd.setRID(cursor.getInt(0));
                ridd.setQUESTION(cursor.getString(1));
                ridd.setANSWER(cursor.getString(2));
                ridd.setDBID(cursor.getString(3));

                ridList.add(ridd);
                Log.e("riddlist", "creating list");
            } while (cursor.moveToNext());
        }
        cursor.close();
        return ridList;
    }

    public ArrayList<Riddles> initialiseDetails(ArrayList<Riddles> list) {
        // Select All Query

        String selectQuery = "SELECT " + R1 + "," + R2 + "," + R3 + "," + R4 + "," + R5 + "," + R6 + "," + R7 + " FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "=''";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // putting status in Riddle object
        if (cursor.moveToFirst()) {
            for (int i = 0; i < 7; i++) {
                list.get(i).setStatus(cursor.getInt(i));
            }
        }
        cursor.close();
        return list;
    }

    public void update_Status(int position) {
        dbase = this.getWritableDatabase();
        String query = "SELECT " + R1 + "," + R2 + "," + R3 + "," + R4 + "," + R5 + "," + R6 + "," + R7 + " FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "=''";
        Cursor cursor = dbase.rawQuery(query, null);

        String riddle = cursor.getColumnName(position);
        cursor.moveToLast();
        int status = cursor.getInt(position);
        if (status < 2) {
            status = status + 1;
            ContentValues values = new ContentValues();
            values.put(riddle, status);
            Log.e("QUERY", query + " " + riddle + " " + status);
            dbase.update(TABLE_NAME2, values, ENDTIME + "= ?", new String[]{""});
        } else {
            Log.e("NOQUERY", "Dragon Ball already caught");
        }
        cursor.close();
    }


    public void finishGame() {
        dbase = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "='' AND " + R1 + "='2' AND " + R2 + "='2' AND " + R3 + "='2' AND " + R4 + "='2' AND " + R5 + "='2'  AND " + R6 + "='2'  AND " + R7 + "='2' ;";
        Cursor cursor = dbase.rawQuery(query, null);
        int flag = cursor.getCount();
        if (flag == 1) {
            Log.e("finishGame", "Game won");
            ContentValues values = new ContentValues();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy kk:mm:ss");
            Date now = new Date();
            String datetime = dateformat.format(now);
            values.put(ENDTIME, datetime);
            dbase.update(TABLE_NAME2, values, ENDTIME + "= ?", new String[]{""});
            Log.e("Database upadate", "game finish");
        }
        cursor.close();
    }

    public boolean canfinishgame() {
        dbase = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "='' AND " + R1 + "='2' AND " + R2 + "='2' AND " + R3 + "='2' AND " + R4 + "='2' AND " + R5 + "='2'  AND " + R6 + "='2'  AND " + R7 + "='2' ;";
        Cursor cursor = dbase.rawQuery(query, null);
        int flag = cursor.getCount();
        if (flag == 1) {
            return true;
        }
        return false;

    }

    public boolean isGameInProgress() {
        String selectQuery = "SELECT * FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "=''";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        int flag = cursor.getCount();
        if (flag != 0) {
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }

    public String[] get_times() {
        int hours, minutes, seconds, size, i = 0;
        String[] strings;
        String set;
        String selectQuery = "SELECT * FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "!=''";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy kk:mm:ss");
        size = cursor.getCount();
        if (size != 0) {
            strings = new String[size];

            hours = 0;
            minutes = 0;
            seconds = 0;
            cursor.moveToFirst();
            do {
                try {
                    Date time1 = dateformat.parse(cursor.getString(1));
                    Date time2 = dateformat.parse(cursor.getString(2));
                    long difference = time2.getTime() - time1.getTime();
                    hours = (int) (difference / (1000 * 60 * 60));
                    minutes = (int) (difference / (1000 * 60)) % 60;
                    seconds = (int) (difference / 1000) % 60;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                set=String.valueOf(cursor.getInt(10));
                String str = "Player " + cursor.getInt(0) + " completed in " + String.valueOf(hours) + " hours " + String.valueOf(minutes) + " mins " + String.valueOf(seconds) + " seconds set:"+set;
                strings[i] = str;
                i++;
            } while (cursor.moveToNext());
            cursor.close();
            return strings;
        }
        strings = new String[1];
        strings[0] = "The game is still in progress please come back here when you finish the game";
        cursor.close();
        return strings;
    }

    //return current playing user set no.
    public int getUserSet() {
        int set = 1;
        String selectQuery = "SELECT " + SET + " FROM " + TABLE_NAME2 + " WHERE " + ENDTIME + "=''";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            set = cursor.getInt(0);
        }
        return set;
    }
}
