package com.example.kotlinwithdragger.di.component

import android.content.Context
import com.example.kotlinwithdragger.MyApplication
import com.example.kotlinwithdragger.data.local.DatabaseService
import com.example.kotlinwithdragger.data.remote.NetworkService
import com.example.kotlinwithdragger.di.module.ApplicationModule
import com.example.kotlinwithdragger.di.qualifier.ApplicationContext
import com.example.kotlinwithdragger.util.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent
{
    fun inject(application: MyApplication)
    fun getDatabaseService():DatabaseService
    fun getNetworkService():NetworkService
   fun getNetworkHelper():NetworkHelper

}