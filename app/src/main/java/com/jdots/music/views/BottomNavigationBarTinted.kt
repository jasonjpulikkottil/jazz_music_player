

package com.jdots.music.views

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.RippleDrawable
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.NavigationViewUtil
import com.jdots.music.R
import com.jdots.music.util.PreferenceUtil
import com.jdots.music.util.RippleUtils
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationBarTinted @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : BottomNavigationView(context, attrs, defStyleAttr) {

    init {
        labelVisibilityMode = PreferenceUtil.tabTitleMode

        val iconColor = ATHUtil.resolveColor(context, android.R.attr.colorControlNormal)
        val accentColor = ThemeStore.accentColor(context)
        NavigationViewUtil.setItemIconColors(
            this,
            ColorUtil.withAlpha(iconColor, 0.5f),
            accentColor
        )
        NavigationViewUtil.setItemTextColors(
            this,
            ColorUtil.withAlpha(iconColor, 0.5f),
            accentColor
        )
        itemBackground = RippleDrawable(
            RippleUtils.convertToRippleDrawableColor(
                ColorStateList.valueOf(
                    ThemeStore.accentColor(context).addAlpha()
                )
            ),
            ContextCompat.getDrawable(context, R.drawable.bottom_navigation_item_background),
            ContextCompat.getDrawable(context, R.drawable.bottom_navigation_item_background_mask)
        )
        setOnApplyWindowInsetsListener(null)
        //itemRippleColor = ColorStateList.valueOf(accentColor)
        background = ColorDrawable(ATHUtil.resolveColor(context, R.attr.colorSurface))
    }
}

fun Int.addAlpha(): Int {
    return ColorUtil.withAlpha(this, 0.12f)
}
