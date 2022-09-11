package com.example.homepage.dataClass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @Description: 设置闹钟对应的数据项
 * @author: hxf
 * @date: 2022/9/4
 */
@Parcelize
data class ClockItemData(val time: String, val amOrPm: String, val work: String
                         , val voiceBroadcastContent : String) : Parcelable
