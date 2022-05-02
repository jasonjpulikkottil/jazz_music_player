 
package com.jdots.music.util

import android.view.ViewGroup
import code.name.monkey.appthemehelper.ThemeStore.Companion.accentColor
import code.name.monkey.appthemehelper.util.ColorUtil.isColorLight
import code.name.monkey.appthemehelper.util.MaterialValueHelper.getPrimaryTextColor
import code.name.monkey.appthemehelper.util.TintHelper
import com.jdots.music.views.PopupBackground
import me.zhanghai.android.fastscroll.FastScroller
import me.zhanghai.android.fastscroll.FastScrollerBuilder
import me.zhanghai.android.fastscroll.PopupStyles
import me.zhanghai.android.fastscroll.R

object ThemedFastScroller {
    fun create(view: ViewGroup): FastScroller {
        val context = view.context
        val color = accentColor(context)
        val textColor = getPrimaryTextColor(context, isColorLight(color))
        val fastScrollerBuilder = FastScrollerBuilder(view)
        fastScrollerBuilder.useMd2Style()
        fastScrollerBuilder.setPopupStyle { popupText ->
            PopupStyles.MD2.accept(popupText)
            popupText.background = PopupBackground(context)
            popupText.setTextColor(textColor)
        }

        fastScrollerBuilder.setThumbDrawable(
            TintHelper.createTintedDrawable(
                context,
                R.drawable.afs_md2_thumb,
                color
            )
        )
        return fastScrollerBuilder.build()
    }
}