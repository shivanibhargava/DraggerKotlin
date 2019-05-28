package com.example.kotlinwithdragger.ui.home

import com.example.kotlinwithdragger.data.local.DatabaseService
import com.example.kotlinwithdragger.data.remote.NetworkService
import com.example.kotlinwithdragger.di.scope.FragmentScope
import com.example.kotlinwithdragger.util.NetworkHelper
import javax.inject.Inject
class HomeViewModel @Inject  constructor(val databaseService: DatabaseService,val networkService: NetworkService,val networkHelper: NetworkHelper)
{
    fun getSomeData() :String
    {
        return  databaseService.getDummyData() +" "+networkService.getDummyData()+" "+networkHelper.isNetworkConnected()
    }
}