
package com.jdots.music.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.core.text.HtmlCompat
import code.name.monkey.appthemehelper.util.VersionUtils
import com.jdots.music.R
import com.jdots.music.activities.base.AbsMusicServiceActivity
import com.jdots.music.extensions.accentBackgroundColor
import com.jdots.music.extensions.show
import com.jdots.music.util.RingtoneManager
import kotlinx.android.synthetic.main.activity_permission.*

class PermissionActivity : AbsMusicServiceActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_permission))
        setStatusbarColorAuto()
        setNavigationbarColorAuto()
        setLightNavigationBar(true)
        setTaskDescriptionColorAuto()
        setupTitle()

        storagePermission.setButtonClick {
            requestPermissions()
        }
        if (VersionUtils.hasMarshmallow()) audioPermission.show()
        audioPermission.setButtonClick {
            if (RingtoneManager.requiresDialog(this@PermissionActivity)) {
                val intent = Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS)
                intent.data = Uri.parse("package:" + applicationContext.packageName)
                startActivity(intent)
            }
        }
        finish.accentBackgroundColor()
        finish.setOnClickListener {
            if (hasPermissions()) {
                startActivity(
                    Intent(this, MainActivity::class.java).addFlags(
                        Intent.FLAG_ACTIVITY_NEW_TASK or
                                Intent.FLAG_ACTIVITY_CLEAR_TASK
                    )
                )
                finish()
            }
        }
    }

    private fun setupTitle() {
        val appName = HtmlCompat.fromHtml(
            "Hello there! <br>Welcome to <b>Jazz Music Player</b>",
            HtmlCompat.FROM_HTML_MODE_COMPACT
        )
        appNameText.text = appName
    }
}
