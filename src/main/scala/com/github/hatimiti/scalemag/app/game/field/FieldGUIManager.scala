package com.github.hatimiti.scalemag.app.game.field;

import com.github.hatimiti.scalemag.base.gui.twl.TWLStateBasedGame;
import java.net.URL
import org.newdawn.slick.util.ResourceLoader
import org.newdawn.slick.GameContainer
import com.github.hatimiti.scalemag.base.BaseGameState
import org.newdawn.slick.state.StateBasedGame
import org.newdawn.slick.Graphics
import com.github.hatimiti.scalemag.app.support.GameSceneState
import com.github.hatimiti.scalemag.app.game.field.domain.HP
import com.github.hatimiti.scalemag.base.gui.twl.RootPane

private[field] class FieldGUIManager private[field](
    private val state: FieldState) {
  
  private[field] def init(
      gc: GameContainer, game: StateBasedGame) {
    //TODO should implement this.
  }
  
  private[field] def enter(
      gc: GameContainer, game: StateBasedGame) {
    //TODO should implement this.
  }
  
  private[field] def render(
      gc: GameContainer,
      game: StateBasedGame,
      g: Graphics) {
    //TODO should implement this.
  }
  
  private[field] def update(
      gc: GameContainer,
      game: StateBasedGame,
      delta: Int) {
    //TODO should implement this.
  }
  
  private[field] def createRootPane(rp: RootPane): RootPane = {
    rp.setTheme("gameui");
//    rp.add(this.textFrame);
//    rp.add(this.playerHPBar);
//    rp.add(this.targetHPBar);
//    rp.add(this.statusButton);
//    rp.add(this.abilityDialog);
    return rp
  }
  
  private[field] def layoutRootPane() {
    //TODO should implement this.
  }

}