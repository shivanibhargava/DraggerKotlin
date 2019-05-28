package com.example.kotlinwithdragger.di.module

import android.app.Activity
import android.content.Context
import com.example.kotlinwithdragger.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private  val activity: Activity)
{
    @Provides
    @ActivityContext
    fun provideContext():Context
    {
        return activity
    }
}
