package com.example.kotlinwithdragger.di.module

import android.content.Context
import com.example.kotlinwithdragger.MyApplication
import com.example.kotlinwithdragger.di.qualifier.ApplicationContext
import com.example.kotlinwithdragger.di.qualifier.DatabaseInfo
import com.example.kotlinwithdragger.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ApplicationModule(private var application: MyApplication){
    @ApplicationContext
    @Provides
    fun provideContext():Context{
      return  application.applicationContext;
    }
    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return "dummy_db"
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int {
        return 1
    }
    @Provides
    @NetworkInfo
    fun provideApiKey(): String {
        return  "SOME_API_KEY"
    }




}