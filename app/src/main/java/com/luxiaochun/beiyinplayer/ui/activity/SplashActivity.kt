package com.luxiaochun.beiyinplayer.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splsh.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {

    override fun getLayoutId(): Int {
        return R.layout.activity_splsh
    }

    override fun initData() {
        ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }

    override fun onAnimationEnd(view: View?) {
        //进入主界面
        startActivity<MainActivity>()
        finish()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }

}