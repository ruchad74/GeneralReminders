package com.ruchad.genreminders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ruchad.genreminders.databinding.GeneralBinding
import com.ruchad.genreminders.databinding.GeneralTabViewBinding

class General : Fragment() {

   private lateinit var binding : GeneralBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = GeneralBinding.inflate(inflater, container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpOnClickListener()
    }

    private fun setUpOnClickListener() {

        binding.buttonNewGeneral.setOnClickListener{
           val variable = GeneralTabViewBinding.inflate(layoutInflater)
            binding.relativeLayoutGeneral.addView(variable.root, 0)
        }


    }


}