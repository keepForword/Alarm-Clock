package com.example.homepage.dataClass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @Description: 提醒页的数据类
 * @author: shelvehuang
 * @date: 2022/9/11
 * @param: time 提醒时间
 * @param: number 提醒次数
 * @param: voiceBroadcastContent 提醒语音
 */
@Parcelize
data class CautionItemData(val time: String, val number: Int, val voiceBroadcastContent : String) : Parcelable
