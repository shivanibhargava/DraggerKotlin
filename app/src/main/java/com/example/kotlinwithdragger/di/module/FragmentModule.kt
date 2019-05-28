package com.example.kotlinwithdragger.di.module

import android.content.Context
import com.example.kotlinwithdragger.di.qualifier.ActivityContext
import com.example.kotlinwithdragger.di.scope.ActivityScope
import com.example.kotlinwithdragger.ui.home.HomeFragment
import dagger.Module
import dagger.Provides

@Module
class  FragmentModule(private val fragment: HomeFragment)
{
    @ActivityContext
    @Provides
    fun provideContext():Context?
    {
        return fragment.context
    }
}