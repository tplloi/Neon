package com.roy93group.neon.ui.game.mineral.model

import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class Mineral(
    val xOffset: Float,
    var yOffset: Float,
    val width: Float,
) : Serializable {

    var alpha: Float = 1f
    private val alphaAnimationSpeed: Float = 0.009f

    private val maxYOffset: Float = yOffset - 80f
    private val animationYOffset: Float = yOffset - 60f
    private val yOffsetMovementSpeed: Float = 1f
    var removed: Boolean = false
        private set

    fun process() {
        yOffset -= yOffsetMovementSpeed
        if (yOffset <= maxYOffset) {
            removed = true
        }
        if (yOffset <= animationYOffset) {
            alpha -= alphaAnimationSpeed
        }
    }
}
