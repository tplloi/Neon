package com.roy93group.neon.ui.game.ship.ship

import androidx.annotation.DrawableRes
import androidx.annotation.Keep
import androidx.compose.runtime.Immutable
import com.roy93group.neon.R
import java.io.Serializable

@Keep
@Immutable
data class Ship(
    val width: Float = 85f,
    val height: Float = 90f,
    val shieldSize: Float = height * 2,
    val shieldEnabled: Boolean = false,
    val laserBoosterEnabled: Boolean = false,
    val tripleLaserBoosterEnabled: Boolean = false,
    val xOffset: Float,
    val yOffset: Float,
    val hp: Int = 1000,
    @DrawableRes val drawableId: Int = R.drawable.ship_regular_laser,
) : Serializable
