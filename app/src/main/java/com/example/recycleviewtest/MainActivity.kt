package com.example.recycleviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewtest.model.Images
import com.example.recycleviewtest.model.MyAdapter


class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)


        var images = arrayListOf<Images>(
                Images("Vegetables", R.drawable.vegetables),
                Images("Dairy", R.drawable.dairy),
                Images("Foodgrains", R.drawable.foodgrain),
                Images("Masala", R.drawable.masala),
                Images("Snacks", R.drawable.snacks),
                Images("Sprouts", R.drawable.sprouts),
                Images("Cleaning", R.drawable.cleaning)

        )


//        var mylayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        recyclerView?.layoutManager = mylayoutManager

        recyclerView?.layoutManager=GridLayoutManager(this,2  )
        var new_adapter = MyAdapter(this, images)
        recyclerView?.adapter = new_adapter


    }
}