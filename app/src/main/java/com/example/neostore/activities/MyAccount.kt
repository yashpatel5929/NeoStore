package com.example.neostore.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.neostore.R
import com.example.neostore.fragment.EditProfileFragment
import com.example.neostore.fragment.MyAccountFragment
import kotlinx.android.synthetic.main.activity_my_account.*
import kotlinx.android.synthetic.main.fragment_my_account.*

class MyAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_account)


        val fragment : Fragment = MyAccountFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
            .commit()




    }
}