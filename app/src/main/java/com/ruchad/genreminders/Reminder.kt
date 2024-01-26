package com.ruchad.genreminders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ruchad.genreminders.R.layout
import com.ruchad.genreminders.databinding.ReminderBinding
import com.ruchad.genreminders.databinding.ReminderTabViewBinding

class Reminder : Fragment() {

    private lateinit var binding: ReminderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ReminderBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpOnClickListener()
    }

    private fun setUpOnClickListener() {

        binding.buttonNew.setOnClickListener {
            val reminderViewBinding = ReminderTabViewBinding.inflate(layoutInflater)
            binding.relativeLayoutReminder.addView(reminderViewBinding.root, 0)
        }
    }


}