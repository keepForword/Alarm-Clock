package com.example.homepage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_page.view.clock
import kotlinx.android.synthetic.main.view_page.view.eventList

/**
 * @Description: viewPager对应的适配器
 * @author: shelvehuang
 * @date: 2022/9/5
 */
class HomePageAdapter(private val list: List<PageItemData>) : RecyclerView.Adapter<HomePageAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nowTime = itemView.clock

        fun bindData(pageItemData: PageItemData) {
            nowTime.text = pageItemData.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_page, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount() = list.size
}