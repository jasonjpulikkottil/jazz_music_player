
package com.jdots.music.fragments.settings

import android.os.Bundle
import android.view.View
import androidx.preference.Preference
import code.name.monkey.appthemehelper.common.prefs.supportv7.ATEListPreference
import com.jdots.music.LANGUAGE_NAME
import com.jdots.music.LAST_ADDED_CUTOFF
import com.jdots.music.R
import com.jdots.music.fragments.LibraryViewModel
import com.jdots.music.fragments.ReloadType.HomeSections
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

 

class OtherSettingsFragment : AbsSettingsFragment() {
    private val libraryViewModel by sharedViewModel<LibraryViewModel>()

    override fun invalidateSettings() {
        val languagePreference: ATEListPreference? = findPreference(LANGUAGE_NAME)
        languagePreference?.setOnPreferenceChangeListener { _, _ ->
            requireActivity().recreate()
            return@setOnPreferenceChangeListener true
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.pref_advanced)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val preference: Preference? = findPreference(LAST_ADDED_CUTOFF)
        preference?.setOnPreferenceChangeListener { lastAdded, newValue ->
            setSummary(lastAdded, newValue)
            libraryViewModel.forceReload(HomeSections)
            true
        }
        val languagePreference: Preference? = findPreference(LANGUAGE_NAME)
        languagePreference?.setOnPreferenceChangeListener { prefs, newValue ->
            setSummary(prefs, newValue)
            true
        }
    }
}
