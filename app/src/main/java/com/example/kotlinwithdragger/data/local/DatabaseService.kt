package com.example.kotlinwithdragger.data.local

import android.content.Context
import com.example.kotlinwithdragger.di.qualifier.ApplicationContext
import com.example.kotlinwithdragger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
 class  DatabaseService @Inject constructor(@ApplicationContext val context: Context, @DatabaseInfo val databaseName:String, @DatabaseInfo var  databaseVersion:String) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}