package com.example.homepage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homepage.R
import com.example.homepage.dataClass.PageItemData
import kotlinx.android.synthetic.main.view_page.view.clock
import kotlinx.android.synthetic.main.view_page.view.eventList

/**
 * @Description: viewPager对应的适配器
 * @author: shelvehuang
 * @date: 2022/9/5
 */
class HomePageAdapter(private val list: List<PageItemData>, private val context: Context) : RecyclerView.Adapter<HomePageAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View, private val context: Context) : RecyclerView.ViewHolder(itemView) {
        private val nowTime = itemView.clock
        private val eventList = itemView.eventList

        fun bindData(pageItemData: PageItemData) {
            nowTime.text = pageItemData.time
            eventList.adapter = ClockListAdapter(pageItemData.clockItemDataList)
            eventList.layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_page, parent, false)
        return ViewHolder(itemView, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    override fun getItemCount() = list.size
}