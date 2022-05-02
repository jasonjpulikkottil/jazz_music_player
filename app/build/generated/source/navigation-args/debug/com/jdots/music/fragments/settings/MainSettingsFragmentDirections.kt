package com.jdots.music.fragments.settings

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.jdots.music.R

class MainSettingsFragmentDirections private constructor() {
  companion object {
    fun actionMainSettingsFragmentToThemeSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_themeSettingsFragment)

    fun actionMainSettingsFragmentToImageSettingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_imageSettingFragment)

    fun actionMainSettingsFragmentToNowPlayingSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_nowPlayingSettingsFragment)

    fun actionMainSettingsFragmentToAudioSettings(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_audioSettings)

    fun actionMainSettingsFragmentToOtherSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_otherSettingsFragment)

    fun actionMainSettingsFragmentToPersonalizeSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_personalizeSettingsFragment)

    fun actionMainSettingsFragmentToNotificationSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_notificationSettingsFragment)

    fun actionMainSettingsFragmentToAboutActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_aboutActivity)
  }
}
