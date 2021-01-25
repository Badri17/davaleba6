package com.example.davalben6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        val product=ArrayList<jj>()
        product.add(jj(1,"C Programing","programing language",R.drawable.ic_channel_background,isImportant = true))
        product.add(jj(2,"C Programing","programing language",R.drawable.ic_klk_background,isImportant = true))
        product.add(jj(3,"C Programing","programing language",R.drawable.ic_java_background,isImportant = true))
        product.add(jj(4,"C Programing","programing language",R.drawable.ic_python_background,isImportant = true))
        product.add(jj(5,"C Programing","programing language",R.drawable.ic_boot_background,isImportant = true))
        product.add(jj(6,"C Programing","programing language",R.drawable.ic_asp_background,isImportant = true))
        product.add(jj(7,"C Programing","programing language",R.drawable.ic_php_background,isImportant = true))
        product.add(jj(8,"C Programing","programing language",R.drawable.ic_unix_background,isImportant = true))

        val adapter=jj(product)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter







    }
}