package ru.intechros.test_stm2

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SetPreferenceActivity : AppCompatActivity() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fragmentManager.beginTransaction().replace(
            R.id.content,
            PrefsFragment()
        ).commit()
    }
}