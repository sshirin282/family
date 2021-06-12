package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var customAdapter: CustomAdapter
    val name= arrayOf<String>("Salahuddin", "Azhar", "Nilofar", "Noorish",
    "Shirin", "Uzair","Arham", "Zaina")
    val relation= arrayOf<String>("He Is My Father", "He Is My Brother",
    "She Is My Sister In Low", "She Is My Sister", "That's Me","He Is My Nephew",
    "He Is My Nephew", "She Is My Niece")
    val image1= arrayOf<Int>(R.drawable.salahuddin12, R.drawable.azhar12,
            R.drawable.nilofar12, R.drawable.noorish12, R.drawable.shirin12,
            R.drawable.uzair12, R.drawable.arham12, R.drawable.zaina12)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView=findViewById(R.id.list)
        customAdapter=CustomAdapter(this,name,relation,image1)
        listView.adapter=customAdapter

    }
}