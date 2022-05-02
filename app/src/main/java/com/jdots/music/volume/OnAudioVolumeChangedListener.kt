 
package com.jdots.music.volume

interface OnAudioVolumeChangedListener {
    fun onAudioVolumeChanged(currentVolume: Int, maxVolume: Int)
}