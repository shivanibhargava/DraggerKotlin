package com.example.kotlinwithdragger.data.remote

import android.content.Context
import com.example.kotlinwithdragger.di.qualifier.ApplicationContext
import com.example.kotlinwithdragger.di.qualifier.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
 class NetworkService @Inject constructor (@ApplicationContext context: Context, @NetworkInfo val apikey:String)
{
    fun getDummyData(): String {
        return apikey
    }
}