package com.example.kotlinwithdragger.util

import android.content.Context
import com.example.kotlinwithdragger.di.qualifier.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor (@ApplicationContext val context: Context){
    fun isNetworkConnected():Boolean{
        return  false;
    }

}