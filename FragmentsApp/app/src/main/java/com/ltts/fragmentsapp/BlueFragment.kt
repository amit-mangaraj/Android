package com.ltts.fragmentsapp

import android.net.wifi.aware.AttachCallback
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlueFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.blue_fragment,container, false)
        var redfrag = RedFragment()
        var myName = "Amit"
        var b = Bundle()
        b.putString("key",myName)
        redfrag.arguments=b
        fragmentManager!!.beginTransaction().replace(R.id.yellow_layout,redfrag)

        return v
    }
}