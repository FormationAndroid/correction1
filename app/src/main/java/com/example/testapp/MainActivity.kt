package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.testapp.fragments.AboutFragment
import com.example.testapp.fragments.QuestionsFragment
import com.example.testapp.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menuClick(view: View) {
        findNavController(R.id.fragNav).navigate(
                when (view.id){
                    R.id.btnQuestions -> R.id.questionsFragment
                    R.id.btnSettings -> R.id.settingsFragment
                   else -> R.id.aboutFragment
                }
        )
    }

}