package com.luxiaochun.beiyinplayer.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.luxiaochun.beiyinplayer.R
import com.luxiaochun.beiyinplayer.adapter.HomeAdapter
import com.luxiaochun.beiyinplayer.base.BaseFragment
import com.luxiaochun.beiyinplayer.util.URLProviderUtils
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import java.io.IOException

class HomeFragment : BaseFragment() {

    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }

    override fun initListener() {
        // 初始化recyclerView
        recycleView.layoutManager = LinearLayoutManager(context)
        // 适配
        val adapter = HomeAdapter()
        recycleView.adapter = adapter
    }

    override fun initData() {
        // 初始化数据
        loadDatas()
    }

    private fun loadDatas() {
        val path = URLProviderUtils.getYueDanUrl(0, 20)
        val client = OkHttpClient()
        val request = Request.Builder().url(path).get().build()
        client.newCall(request).enqueue(object : Callback {
            /**
             * 在子线程中进行调用
             */
            override fun onFailure(call: Call, e: IOException) {
                println("获取数据失败:" + Thread.currentThread().name)
            }

            override fun onResponse(call: Call, response: Response) {
                println("获取数据成功:" + Thread.currentThread().name)
            }

        })
    }
}