package com.example.kotlinwithdragger.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinwithdragger.MyApplication
import com.example.kotlinwithdragger.R
import com.example.kotlinwithdragger.di.component.DaggerActivityComponent
import com.example.kotlinwithdragger.di.module.ActivityModule
import com.example.kotlinwithdragger.ui.home.HomeFragment

import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModal


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,mainViewModel.getSomeData(),Toast.LENGTH_SHORT).show()
        val tvData:TextView = findViewById(R.id.tv_message)
        tvData.setText(mainViewModel.getSomeData())

        addHomeFragment()

    }

    fun getDependencies() {
        DaggerActivityComponent.builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
   fun  addHomeFragment()
   {
       if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
           supportFragmentManager
               .beginTransaction()
               .add(R.id.container_fragment, HomeFragment(), HomeFragment.TAG)
               .commit()
       }   }
}
