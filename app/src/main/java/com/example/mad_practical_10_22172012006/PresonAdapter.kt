package com.example.mad_practical_10_22172012006

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class PresonAdapter(context:Context,val array:ArrayList<Preson>):ArrayAdapter<Preson>(context,0,array)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
      return view
    }
}