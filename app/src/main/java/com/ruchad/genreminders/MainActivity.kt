package com.ruchad.genreminders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.MenuItem
import com.google.android.material.navigation.NavigationBarView
import com.ruchad.genreminders.R.layout
import com.ruchad.genreminders.databinding.ActivityMainBinding
import androidx.fragment.app.commit



class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavMain.setOnItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
      if (item . itemId == R.id.general_bottom_navigation){
          onGeneralClicked()
      }
        if(item.itemId == R.id.reminder_bottom_navigation){
            onRemindersClicked()
        }
        return true
    }

    private fun onRemindersClicked() {
        supportFragmentManager.commit{
            replace(R.id.frame_content, Reminder())
        }
    }

    private fun onGeneralClicked() : Boolean {
        supportFragmentManager.commit{
            replace(R.id.frame_content, General())
        }
        return true
    }




}