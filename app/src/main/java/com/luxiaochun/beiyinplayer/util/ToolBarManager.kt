package com.luxiaochun.beiyinplayer.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.ui.activity.SetttingActivity

/**
 * 所有界面toolbar的管理类
 */
interface ToolBarManager {
    val toolbar: Toolbar
    /**
     * 初始化主界面中的toolbar
     */
    fun initMainToolBar() {
        toolbar.setTitle("北音")
        toolbar.inflateMenu(R.menu.main)
        //kotlin 和 Java 调用特性
        //如果Java接口中只有一个未实现的方法，可以省略接口兑现个，直接大括号来辨识这个方法
        toolbar.setOnMenuItemClickListener {
            when (it?.itemId){
                R.id.settting->{
                    //跳转到设置界面
                    toolbar.context.startActivity(Intent(toolbar.context,SetttingActivity::class.java))
                }
            }
            true
        }
//        toolbar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener{
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                when (item?.itemId){
//                    R.id.settting->{
//                        //跳转到设置界面
//                        toolbar.context.startActivity(Intent(toolbar.context,SetttingActivity::class.java))
//                    }
//                }
//                return true
//            }
//
//        })
    }

    // 处理设置界面的toolba
    fun initSettingToolbar(){
        toolbar.setTitle("设置")

    }
}