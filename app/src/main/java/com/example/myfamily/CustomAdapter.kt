package com.example.myfamily

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, val name:Array<String>, val relation:Array<String>, val image1:Array<Int>): BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.family, parent, false)
        val textView: TextView
        val textView1: TextView
        val image: ImageView
        textView = rowView.findViewById(R.id.text3)
        textView1 = rowView.findViewById(R.id.text4)
        image = rowView.findViewById(R.id.image2)

        textView.text = name[position]
        textView1.text = relation[position]
        image.setImageResource(image1[position])
        return rowView

    }


    override fun getItem(position: Int): Any {
        return name[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return name.size
    }
}