package com.example.homepage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.amOrPm
import kotlinx.android.synthetic.main.recycler_view_item.view.appointedTime
import kotlinx.android.synthetic.main.recycler_view_item.view.isWorkDay
import kotlinx.android.synthetic.main.recycler_view_item.view.voiceBroadcastContent
import kotlinx.android.synthetic.main.recycler_view_item.view.workDay

/**
 * @Description: 闹钟recyclerView对应的适配器
 * @author: shelvehuang
 * @date: 2022/9/4
 */
class ClockListAdapter(private val list: MutableList<ClockItemData>) : RecyclerView.Adapter<ClockListAdapter.ViewHolder>() {

    fun addItem(clockItemData: ClockItemData) {
        list.add(clockItemData)
    }

    fun removeItem(index: Int) {
        list.removeAt(index)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val appointedTime = itemView.appointedTime
        private val workDay = itemView.workDay
        private val amOrPm = itemView.amOrPm
        private val isWorkDay = itemView.isWorkDay
        private val voiceBroadcastContent = itemView.voiceBroadcastContent

        fun bindData(clockItemData: ClockItemData) {
            appointedTime.text = clockItemData.time
            workDay.text = clockItemData.work
            amOrPm.text = clockItemData.amOrPm
            ("法定" + clockItemData.work).also { isWorkDay.text = it }
            voiceBroadcastContent.text = clockItemData.voiceBroadcastContent
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    override fun getItemCount() = list.size
}