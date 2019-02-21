package com.devmasterteam.tasks.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.devmasterteam.tasks.constants.DataBaseConstants;

class TaskDataBaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "UltraTask.db";

    // Criação da tabela de categoria
    private static final String SQL_CREATE_TABLE_PRIORITY =
            "create table " + DataBaseConstants.PRIORITY.TABLE_NAME + " ("
                    + DataBaseConstants.PRIORITY.COLUMNS.ID + " integer primary key, "
                    + DataBaseConstants.PRIORITY.COLUMNS.DESCRIPTION + " text null);";

    // Remoção de tabelas
    private static final String DROP_TABLE_PRIORITY = "DROP TABLE IF EXISTS " + DataBaseConstants.PRIORITY.TABLE_NAME;

    public TaskDataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE_PRIORITY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // sqLiteDatabase.execSQL(DROP_TABLE_GUEST);
        // sqLiteDatabase.execSQL(SQL_CREATE_TABLE_GUEST);
    }

}