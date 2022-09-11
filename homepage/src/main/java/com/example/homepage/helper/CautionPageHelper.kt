package com.example.homepage.helper

import com.example.homepage.adapter.CautionListAdapter
import com.example.homepage.adapter.ClockListAdapter
import com.example.homepage.dataClass.CautionItemData
import com.example.homepage.dataClass.ClockItemData
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

/**
 * @Description: Caution的本地缓存辅助类
 * @author: shelvehuang
 * @date: 2022/9/11
 */
class CautionPageHelper(private val cautionListAdapter: CautionListAdapter) : PageDataHelper {

    override val fileName = "cautionCache.hxf"

    @SuppressWarnings("all")
    override fun getLocalCache(){
        val input = ObjectInputStream(FileInputStream(fileName))
        cautionListAdapter.setList(input.readObject() as MutableList<CautionItemData>)
        input.close()
    }

    override fun updateLocalCache() {
        deleteLocalCache()
        val out = ObjectOutputStream(FileOutputStream(fileName))
        for (data in cautionListAdapter.getList()) {
            out.writeObject(data)
        }
        out.close()
    }

    override fun deleteLocalCache() {
        val file = File(fileName)
        file.deleteOnExit()
        file.createNewFile()
    }
}