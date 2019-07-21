package com.luxiaochun.beiyinplayer.ui.activity

import android.support.v7.widget.Toolbar
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.base.BaseActivity
import com.luxiaochun.beiyinplayer.util.ToolBarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager {
    // 惰性加载
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }
}
