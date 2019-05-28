package com.example.kotlinwithdragger

import android.app.Application
import android.widget.Toast
import com.example.kotlinwithdragger.data.local.DatabaseService
import com.example.kotlinwithdragger.data.remote.NetworkService
import com.example.kotlinwithdragger.di.component.ApplicationComponent
import com.example.kotlinwithdragger.di.component.DaggerApplicationComponent
import com.example.kotlinwithdragger.di.module.ApplicationModule
import com.example.kotlinwithdragger.util.NetworkHelper
import javax.inject.Inject

class MyApplication :Application()
{
    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkHelper: NetworkHelper

    @set:Inject
    internal var networkService: NetworkService? = null

    lateinit var applicationComponent:ApplicationComponent;

    override fun onCreate() {
        super.onCreate()
        getDependencies();
       // Toast.makeText(this, databaseService?.getDummyData()+" "+networkService?.getDummyData(), Toast.LENGTH_SHORT).show()
    }
   fun getDependencies()
   {
        applicationComponent=DaggerApplicationComponent
       .builder().applicationModule(ApplicationModule(this)).build();
       applicationComponent.inject(this);

   }

}