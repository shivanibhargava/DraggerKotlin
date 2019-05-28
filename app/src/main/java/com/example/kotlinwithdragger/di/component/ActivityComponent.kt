package com.example.kotlinwithdragger.di.component

import com.example.kotlinwithdragger.di.module.ActivityModule
import com.example.kotlinwithdragger.di.scope.ActivityScope
import com.example.kotlinwithdragger.ui.main.MainActivity
import dagger.Component
@ActivityScope
@Component(modules = arrayOf(ActivityModule::class),dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent {
    fun inject(activity: MainActivity)
}