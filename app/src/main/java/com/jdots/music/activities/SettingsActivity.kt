 
package com.jdots.music.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.VersionUtils
import com.afollestad.materialdialogs.color.ColorChooserDialog
import com.jdots.music.R
import com.jdots.music.activities.base.AbsBaseActivity
import com.jdots.music.appshortcuts.DynamicShortcutManager
import com.jdots.music.extensions.applyToolbar
import com.jdots.music.extensions.findNavController
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AbsBaseActivity(), ColorChooserDialog.ColorCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        setDrawUnderStatusBar()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setStatusbarColorAuto()
        setNavigationbarColorAuto()
        setLightNavigationBar(true)
        setupToolbar()
    }

    private fun setupToolbar() {
        setTitle(R.string.action_settings)
        applyToolbar(toolbar)
        val navController: NavController = findNavController(R.id.contentFrame)
        navController.addOnDestinationChangedListener { _, _, _ ->
            toolbar.title = navController.currentDestination?.let { getStringFromDestination(it) }
        }
    }

    private fun getStringFromDestination(currentDestination: NavDestination): String {
        val idRes = when (currentDestination.id) {
            R.id.mainSettingsFragment -> R.string.action_settings
            R.id.audioSettings -> R.string.pref_header_audio
            R.id.imageSettingFragment -> R.string.pref_header_images
            R.id.notificationSettingsFragment -> R.string.notification
            R.id.nowPlayingSettingsFragment -> R.string.now_playing
            R.id.otherSettingsFragment -> R.string.others
            R.id.personalizeSettingsFragment -> R.string.personalize
            R.id.themeSettingsFragment -> R.string.general_settings_title
            //R.id.aboutActivity -> R.string.action_about
            else -> R.id.action_settings
        }
        return getString(idRes)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.contentFrame).navigateUp() || super.onSupportNavigateUp()
    }

    override fun onColorSelection(dialog: ColorChooserDialog, selectedColor: Int) {
        when (dialog.title) {
            R.string.accent_color -> {
                ThemeStore.editTheme(this).accentColor(selectedColor).commit()
                if (VersionUtils.hasNougatMR())
                    DynamicShortcutManager(this).updateDynamicShortcuts()
            }
        }
        recreate()
    }

    override fun onColorChooserDismissed(dialog: ColorChooserDialog) {
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
