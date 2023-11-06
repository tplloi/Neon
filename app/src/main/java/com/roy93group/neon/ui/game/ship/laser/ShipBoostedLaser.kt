package com.roy93group.neon.ui.game.ship.laser

import androidx.annotation.Keep
import com.roy93group.neon.R
import com.roy93group.neon.ui.game.laser.Laser

@Keep
data class ShipBoostedLaser(
    override val id: String,
    override var xOffset: Float,
    override var yOffset: Float,
    private val yRange: Float,
    override var width: Float = SHIP_BOOSTED_LASER_WIDTH,
) : Laser {

    override val xOffsetMovementSpeed: Float = 0f
    override val yOffsetMovementSpeed: Float = 5f
    override var height: Float = 25f
    override var rotation: Float = 0f
    override var impactPower: Float = 100f
    override val drawableId: Int = R.drawable.ic_laser_red_16
    override var destroyed: Boolean = false

    override fun moveLaser() {
        yOffset -= yOffsetMovementSpeed
    }

    companion object {
        const val SHIP_BOOSTED_LASER_WIDTH: Float = 8f
    }
}
