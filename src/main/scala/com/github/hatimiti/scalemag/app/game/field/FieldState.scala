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

class FieldState extends BaseGameState(GameSceneState.FIELD) {
  
  private[field] var guiManager: FieldGUIManager = null;
  
  override def init(container: GameContainer, game: StateBasedGame) {
    this.guiManager = new FieldGUIManager(this)
  }
  
  override def enter(container: GameContainer, game: StateBasedGame) {
  }
  
  override def render(container: GameContainer, game: StateBasedGame, g: Graphics) {
  }
  
  override def update(container: GameContainer, game: StateBasedGame, delta: Int) {
  }
  
  protected override def createRootPane(): RootPane = {
    guiManager.createRootPane(super.createRootPane())
  }
  
  protected override def layoutRootPane() {
    guiManager.layoutRootPane()
  }
  
}