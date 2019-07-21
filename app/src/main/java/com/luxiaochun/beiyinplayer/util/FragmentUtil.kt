package com.luxiaochun.beiyinplayer.util

import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.base.BaseFragment
import com.luxiaochun.beiyinplayer.ui.fragment.HomeFragment
import com.luxiaochun.beiyinplayer.ui.fragment.MVFragment
import com.luxiaochun.beiyinplayer.ui.fragment.VBangFragment
import com.luxiaochun.beiyinplayer.ui.fragment.YueDanFragment

/**
 * 管理Fragment的类 单例
 */
class FragmentUtil private constructor() { //私有化构造方法
    val homeFragment by lazy { HomeFragment() }
    val mVFragment by lazy { MVFragment() }
    val vBangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }

    companion object {
        // 线程安全
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /**
     * 根据tabId获取对应的Fragment
     */
    fun getFragment(tabdId: Int): BaseFragment? {
        when (tabdId) {
            R.id.tab_home -> homeFragment
            R.id.tab_mv -> mVFragment
            R.id.tab_vbang -> vBangFragment
            R.id.tab_yuedan -> yueDanFragment
        }
        return null
    }
}