package com.github.hatimiti.scalemag.app.game.field.entity.support.direction;

import com.github.hatimiti.scalemag.base.gui.twl.TWLStateBasedGame;
import java.net.URL
import org.newdawn.slick.util.ResourceLoader
import org.newdawn.slick.GameContainer

/*enum*/ object FacingDirection {
  case object NONE extends FacingDirection(0)
  
  case object UP extends FacingDirection(8)
  case object RIGHT extends FacingDirection(4)
  case object DOWN extends FacingDirection(2)
  case object LEFT extends FacingDirection(1)

  case object UP_RIGHT extends FacingDirection(12)
  case object UP_LEFT extends FacingDirection(9)
  case object DOWN_RIGHT extends FacingDirection(6)
  case object DOWN_LEFT extends FacingDirection(3)

  val values = Array(NONE, UP, RIGHT, DOWN, LEFT,
      UP_RIGHT, UP_LEFT, DOWN_RIGHT, DOWN_LEFT)
  
  def of(v: Int): FacingDirection = {
    for (direction <- values) {
      if (getImpossibleValueX() == v) DOWN
      else if (getImpossibleValueY() == v) LEFT
      else if (direction.value == v) direction
    }
    return NONE;
  }
  
  private def getImpossibleValueX(): Int = {
    UP.value | DOWN.value
  }
  
  private def getImpossibleValueY(): Int = {
    RIGHT.value | LEFT.value
  }
}

sealed abstract class FacingDirection(val value:Int) {
  val name = toString
}