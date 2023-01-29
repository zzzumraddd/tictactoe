package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var k = 0
    var k2 = 0
    var k3 = 0
    var k4 = 0
    var k5 = 0
    var k6 = 0
    var k7 = 0
    var k8 = 0
    var k9 = 0
    var status = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstb.setOnClickListener{
            tic(imageView2, imageView3, k )
            k++
        }
        b2.setOnClickListener{
            tic(imageView4, imageView5, k2)
            k2++
        }
        b3.setOnClickListener {
            tic(imageView6, imageView7, k3 )
            k3++
        }
        b4.setOnClickListener {
            tic(imageView8, imageView9, k4)
            k4++
        }
        b5.setOnClickListener {
            tic(imageView10, imageView11, k5)
            k5++
        }
        b6.setOnClickListener {
            tic(imageView12, imageView13, k6)
            k6++
        }
        b7.setOnClickListener {
            tic(imageView14, imageView15, k7)
            k7++
        }
        b8.setOnClickListener {
            tic(imageView16, imageView17, k8)
            k8++
        }
        b9.setOnClickListener {
            tic(imageView18, imageView19, k9)
            k9++
        }

    }
    fun tic(imageView2: ImageView, imageView3: ImageView, son: Int){
        if(son==0) {
            if (status) {
                imageView2.visibility = View.VISIBLE;
                status = false
            } else {
                imageView3.visibility = View.VISIBLE;
                status = true
            }

        }
    }
    }