package com.example.mad_practical_10_22172012006

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var personListView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun setpersondatatolistview()
    {
        personListView.adapter = PresonAdapter(this, arrayListOf(
            Preson("101","Nilima","nilima@ac.in","2345765423","valsad",201.202,323.767876),
            Preson("102","Ashu","ashu@ac.in","7575246392","valsad",201.202,323.767876),
            Preson("103","Jiya","jiya@ac.in","8989253592","valsad",201.202,323.767876),
            Preson("104","Shivu","shivu@ac.in","9099248265","valsad",201.202,323.767876),
            Preson("105","Risky","risky@ac.in","7575802661","valsad",201.202,323.767876)

        )
        )
    }
}