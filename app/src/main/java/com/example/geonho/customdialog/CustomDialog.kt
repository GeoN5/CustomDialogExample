package com.example.geonho.customdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_custom_dialog.*


class CustomDialog(context: Context,var title: String, var content: String): Dialog(context){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_custom_dialog)

        setData()
        setListeners()
    }

    fun setData(){
        titleText.text = title
        contentText.text=content
    }

    fun setListeners(){
        positiveButton.setOnClickListener {
            Toast.makeText(context,"확인했습니다.",Toast.LENGTH_LONG).show()
            dismiss()
        }

        negativeButton.setOnClickListener {
            Toast.makeText(context,"취소됬습니다.",Toast.LENGTH_LONG).show()
            dismiss()
        }
    }
}