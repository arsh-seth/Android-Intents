package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


const val Key1 ="Name"
const val Key2 ="Age"
const val Key3 ="isStudent"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val i= Intent(this,MainActivity2::class.java)
            i.putExtra(Key1,"Arsh1")
            i.putExtra(Key2,23)
            i.putExtra(Key3,false)

            startActivity(i)
        }
        /*browsebutton.setOnClickListener {
            val address = editText.text.toString()
            val i = Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$address")

             */
        /*dialbutton.setOnClickListener {
            val mobile = editText.text.toString()
            val i = Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$mobile")
            */
        mailbutton.setOnClickListener {
            val email = editText.text.toString()
            val i = Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto$email")


            startActivity(i)
        }

    }
}