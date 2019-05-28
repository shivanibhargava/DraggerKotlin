package com.example.kotlinwithdragger.di.component

import com.example.kotlinwithdragger.di.module.FragmentModule
import com.example.kotlinwithdragger.di.scope.FragmentScope
import com.example.kotlinwithdragger.ui.home.HomeFragment
import dagger.Component
@FragmentScope
@Component(modules = arrayOf(FragmentModule::class) ,dependencies = arrayOf( ApplicationComponent::class))
interface FragmentComponent {
    fun inject(homeFragment: HomeFragment)
}