package com.example.kotlinwithdragger.ui.home


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlinwithdragger.MyApplication

import com.example.kotlinwithdragger.R
import com.example.kotlinwithdragger.di.component.ApplicationComponent
import com.example.kotlinwithdragger.di.component.DaggerFragmentComponent
import com.example.kotlinwithdragger.di.module.FragmentModule
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {
  lateinit @Inject var homeViewModel: HomeViewModel
   lateinit var  tv_message: TextView
    companion object {
      val TAG="HomeFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_message=view.findViewById(R.id.tv_message)
        tv_message.setText(homeViewModel.getSomeData())

    }
    fun getDependencies()
    {
        DaggerFragmentComponent.builder().applicationComponent((context!!.applicationContext as MyApplication).applicationComponent)
            .fragmentModule(FragmentModule(this))
            .build().inject(this)

    }

}
