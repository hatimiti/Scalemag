package com.github.hatimiti.scalemag.app.game.field.move;

import org.newdawn.slick.util.pathfinding.Mover
import com.github.hatimiti.scalemag.app.game.field.entity.Entity
import com.github.hatimiti.scalemag.app.game.field.entity.support.move.MovementState
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection._
import com.github.hatimiti.scalemag.base.util.Point

/**
 * Classes implemented this trait will be appended implementations
 * for moving on the field.
 * 
 * @author hatimiti
 */
trait Movable extends Mover {

  protected def origin(): Entity;

  protected var dx = 0
  protected var dy = 0
  protected var _speed = 2;
  protected var movementState:MovementState = MovementState.STOP
  
  private[this] var reboundDelay = 0
  
  /** Returns true if the entity is moving. */
  def isMoving(): Boolean = MovementState.MOVE == this.movementState
  /** Returns true if the entity is stopped. */
  def isStopped(): Boolean = MovementState.STOP == this.movementState
  /** Returns true if the entity is rebounding. */
  def isRebounding(): Boolean = MovementState.REBOUND == this.movementState

  /** Gets current speed of the entity. */
  def speed(): Int = if (isStopped()) 0 else this.speed

  def moves() {
    if (isRebounding()) {
      reboundDelay -= 1
      if (reboundDelay < 0) {
        return
      }
    }
    movementState = MovementState.MOVE
    updates()
  }

  def rebounds() {
    reboundDelay = 30
    movementState = MovementState.REBOUND
    val ts = speed()
    _speed = ts * 2
    updates()
    _speed = ts
  }
  
  def stops() {
    dx = 0
    dy = 0
    movementState = MovementState.STOP
  }
  
  protected def updates() {
    val rs = Math.sqrt(speed()).asInstanceOf[Int]
    val p = origin().point()
    
    origin().direction() match {
      case UP =>
        dx = 0
        dy = speed()
        origin().positions(p + Point.at(0, -dy))
      case UP_RIGHT =>
        dx = rs
        dy = rs
        origin().positions(p + Point.at(dx, -dy))
      case UP_LEFT =>
        dx = rs
        dy = rs
        origin().positions(p + Point.at(-dx, -dy))
      case DOWN =>
        dx = 0
        dy = speed()
        origin().positions(p + Point.at(0, +dy))
      case DOWN_RIGHT =>
        dx = rs
        dy = rs
        origin().positions(p + Point.at(+dx, -dy))
      case DOWN_LEFT =>
        dx = speed()
        dy = 0
        origin().positions(p + Point.at(+dx, 0))
      case RIGHT =>
        dx = speed()
        dy = 0
        origin().positions(p + Point.at(+dx, 0))
      case LEFT =>
        dx = speed()
        dy = 0
        origin().positions(p + Point.at(-dx, 0))
      case NONE => ;
    }
  }
  
}
