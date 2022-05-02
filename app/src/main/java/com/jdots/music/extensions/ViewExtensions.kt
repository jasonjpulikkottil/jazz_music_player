
package com.jdots.music.extensions

import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.annotation.LayoutRes
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.TintHelper
import com.google.android.material.bottomsheet.BottomSheetBehavior

@Suppress("UNCHECKED_CAST")
fun <T : View> ViewGroup.inflate(@LayoutRes layout: Int): T {
    return LayoutInflater.from(context).inflate(layout, this, false) as T
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.hidden() {
    visibility = View.INVISIBLE
}

fun View.showOrHide(show: Boolean) = if (show) show() else hide()

fun EditText.appHandleColor(): EditText {
    TintHelper.colorHandles(this, ThemeStore.accentColor(context))
    return this
}

fun View.translateYAnimate(value: Float) {
    ObjectAnimator.ofFloat(this, "translationY", value)
        .apply {
            duration = 300
            doOnStart {
                if (value == 0f) {
                    show()
                }
            }
            doOnEnd {
                if (value != 0f) {
                    hide()
                }
            }
            start()
        }
}

fun BottomSheetBehavior<*>.peekHeightAnimate(value: Int) {
    ObjectAnimator.ofInt(this, "peekHeight", value)
        .apply {
            duration = 300
            start()
        }
}
