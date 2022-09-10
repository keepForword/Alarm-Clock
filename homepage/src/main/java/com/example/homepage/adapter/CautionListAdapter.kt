package com.example.homepage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homepage.R
import com.example.homepage.dataClass.CautionItemData
import kotlinx.android.synthetic.main.caution_view_item.view.number
import kotlinx.android.synthetic.main.caution_view_item.view.time
import kotlinx.android.synthetic.main.recycler_view_item.view.voiceBroadcastContent

/**
 * @Description: 提醒页recyclerView的适配器
 * @author: shelvehuang
 * @date: 2022/9/11
 */
class CautionListAdapter(private val list: MutableList<CautionItemData>)  : RecyclerView.Adapter<CautionListAdapter.ViewHolder>() {

    fun addItem(cautionItemData: CautionItemData) {
        list.add(0,cautionItemData)
    }

    fun removeItem(index: Int) {
        list.removeAt(index)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val time = itemView.time
        private val number = itemView.number
        private val voiceBroadcastContent = itemView.voiceBroadcastContent

        fun bindData(cautionItemData: CautionItemData) {
            time.text = cautionItemData.time
            number.text = cautionItemData.number.toString()
            voiceBroadcastContent.text = cautionItemData.voiceBroadcastContent
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.caution_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    override fun getItemCount() = list.size
}