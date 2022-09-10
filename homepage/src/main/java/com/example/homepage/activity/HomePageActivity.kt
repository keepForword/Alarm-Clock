package com.example.homepage.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homepage.R
import com.example.homepage.adapter.HomePageAdapter
import com.example.homepage.dataClass.ClockItemData
import com.example.homepage.dataClass.PageItemData
import kotlinx.android.synthetic.main.activity_home_page.homeViewPager

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val clockItemData1 = ClockItemData("07:00", "上午"
            , "工作日", "宝贝，起床啦！")
        val clockItemData2 = ClockItemData("08:00", "上午"
            , "工作日", "宝贝，起床啦！")
        val list: MutableList<ClockItemData> = mutableListOf(clockItemData1, clockItemData2)

        val listForHomePage: MutableList<PageItemData> = mutableListOf(PageItemData("07:00", list))

        homeViewPager.adapter = HomePageAdapter(listForHomePage, applicationContext)


    }
}