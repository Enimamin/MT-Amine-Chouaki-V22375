package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class creationprofile : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vue = inflater.inflate(R.layout.fragment_creationprofile, container, false)

        val bttcr = vue.findViewById<Button>(R.id.buttoncreate)
        val bttconect = vue.findViewById<Button>(R.id.buttonconnection)

        bttconect.setOnClickListener {

                vue ->
            vue.findNavController().navigate(R.id.action_creationprofile_to_listetaxi)

        }
        bttcr.setOnClickListener {

              vue ->
            vue.findNavController().navigate(R.id.action_creationprofile_to_blankFragment2)

        }
        return vue
    }


}