@file:Suppress("DEPRECATION")

package ru.intechros.test_stm2

import android.os.Bundle
import androidx.preference.PreferenceFragment

class PrefsFragment : PreferenceFragment() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.pref);
    }
}