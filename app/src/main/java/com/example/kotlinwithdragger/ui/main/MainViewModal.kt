package com.example.kotlinwithdragger.ui.main

import com.example.kotlinwithdragger.data.local.DatabaseService
import com.example.kotlinwithdragger.data.remote.NetworkService
import com.example.kotlinwithdragger.di.scope.ActivityScope
import javax.inject.Inject
@ActivityScope
class MainViewModal @Inject constructor (val databaseService: DatabaseService,val networkService: NetworkService)
{
  fun  getSomeData():String
  {
      return databaseService.getDummyData()+" "+networkService.getDummyData()

  }
}