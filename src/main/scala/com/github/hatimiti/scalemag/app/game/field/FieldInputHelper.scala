package com.github.hatimiti.scalemag.app.game.field;

import org.newdawn.slick.GameContainer
import org.newdawn.slick.Input
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection._

private[field] class FieldInputHelper private[field] (
    private[this] val state: FieldState) {
  
  def input(gc: GameContainer) {
    inputs4Move(gc)
    inputs4Others(gc)
  }
  
  private[this] def inputs4Move(gc: GameContainer) {
//    if (this.state.player.isNotNormalStatus()
//        || this.state.player.isAttacking()) {
//      return;
//    }
    val in = gc.getInput()
    var keys = 0
    
    if (in.isKeyDown(Input.KEY_W)) keys |= UP.value
    if (in.isKeyDown(Input.KEY_D)) keys |= RIGHT.value
    if (in.isKeyDown(Input.KEY_S)) keys |= DOWN.value
    if (in.isKeyDown(Input.KEY_A)) keys |= LEFT.value
    
    if (keys == 0 || !gc.hasFocus()) {
      state.player.stops()
    } else {
      state.player.facesTo(FacingDirection.of(keys))
      state.player.moves()
    }
    
  }
  
  private[this] def inputs4Others(gc: GameContainer) {
    //TODO shoud implement 
  }
}