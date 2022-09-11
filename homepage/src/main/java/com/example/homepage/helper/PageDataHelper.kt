package com.example.homepage.helper

/**
 * @Description: page页面的帮助类
 * @author: shelvehuang
 * @date: 2022/9/11
 */
interface PageDataHelper {

    val fileName: String

    // 获取本地缓存
    fun getLocalCache()

    // 更新本地缓存
    fun updateLocalCache()

    // 删除本地缓存
    fun deleteLocalCache()
}