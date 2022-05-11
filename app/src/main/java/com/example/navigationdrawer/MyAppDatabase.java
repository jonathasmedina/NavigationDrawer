package com.example.navigationdrawer;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Usuario.class, version = 1)
public abstract class MyAppDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
