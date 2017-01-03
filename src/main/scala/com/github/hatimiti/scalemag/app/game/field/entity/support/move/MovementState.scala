package com.github.hatimiti.scalemag.app.game.field.entity.support.move;

/*enum*/ object MovementState {
  
  case object STOP extends MovementState
  case object MOVE extends MovementState
  case object REBOUND extends MovementState

  val values = Array(STOP, MOVE, REBOUND)
}

sealed abstract class MovementState