package com.example.meilolbook

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import com.example.meilolbook.ui.main.SectionsPagerAdapter

class champion_intro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val name = intent.getStringExtra("champion_name")
        name.toString()
        Log.i("find_me_champion_intro",name)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_intro2)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager,name)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

//        val intent = Intent(this,HomeActivity::class.java)
//        intent.putExtra("champion_name", champion_name)
//        startActivity(intent)


    }
}