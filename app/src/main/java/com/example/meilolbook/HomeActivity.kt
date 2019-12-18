package com.example.meilolbook

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.champion_home.*
import kotlinx.android.synthetic.main.champion_home.view.*



class HomeActivity(var champion_name : String?) : Fragment() {

    private lateinit var tv : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var name = champion_name
        name.toString()
        Log.i("find_me_Homeactivity",name)
        val root =inflater.inflate(R.layout.champion_home,container,false)
        var tv = root.findViewById(R.id.use_this) as TextView
        tv.text = name
        return root
    }


}