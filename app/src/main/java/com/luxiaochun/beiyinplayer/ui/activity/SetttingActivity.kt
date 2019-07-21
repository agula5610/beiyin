package com.luxiaochun.beiyinplayer.ui.activity

import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.base.BaseActivity
import com.luxiaochun.beiyinplayer.util.ToolBarManager
import org.jetbrains.anko.find

class SetttingActivity : BaseActivity(), ToolBarManager {
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
        //获取推送通知有没有被选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        sp.getBoolean("push", false)
    }

}