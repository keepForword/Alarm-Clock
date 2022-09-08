package com.example.homepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.view_page.eventList

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val clockItemData1 = ClockItemData("07:00", "上午"
            , "工作日", "宝贝，起床啦！")
        val clockItemData2 = ClockItemData("07:00", "上午"
            , "工作日", "宝贝，起床啦！")
        val list: MutableList<ClockItemData> = mutableListOf(clockItemData1, clockItemData2)
        val clockListAdapter = ClockListAdapter(list)
        eventList.adapter = clockListAdapter


    }
}