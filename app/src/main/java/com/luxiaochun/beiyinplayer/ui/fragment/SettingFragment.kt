package com.luxiaochun.beiyinplayer.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.ui.activity.AboutActivity

class SettingFragment : PreferenceFragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        when (preference?.key){
            "about"->{activity.startActivity(Intent(activity,AboutActivity::class.java))}

        }
        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}