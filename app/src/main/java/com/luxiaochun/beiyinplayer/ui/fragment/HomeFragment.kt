package com.luxiaochun.beiyinplayer.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment:BaseFragment() {

    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home,null)
    }

    override fun initListener() {
        recycleView.layoutManager = LinearLayoutManager(context)

    }
}