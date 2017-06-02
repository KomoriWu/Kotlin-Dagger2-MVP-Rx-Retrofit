package com.example.komoriwu.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.example.komoriwu.kotlintest.base.BaseActivity
import org.jetbrains.anko.find
import org.jetbrains.anko.toast
import java.lang.Integer.parseInt

class MainActivity : BaseActivity(R.layout.activity_main) {

    var etText: String? = null
    var et: EditText? = null
    var btn: Button? = null

    override fun initView() {
        super.initView()
        et = find(R.id.et)
        btn = find(R.id.button)
        btn?.setOnClickListener() { toast(str(parseInt(et!!.text.toString()))) }
    }

    override fun initData() {
        initToolbar()


    }

    var sum = { x: Int, y: Int -> x + y }

    var str = { x: Int ->
        when (x) {
            0 -> "输入0"
            in 1..3 -> "输入1-3"
            else -> {
                "输入 $x"
            }
        }
    }
}
