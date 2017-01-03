package com.github.hatimiti.scalemag.app.game.field;

import org.newdawn.slick.GameContainer
import org.newdawn.slick.Graphics
import org.newdawn.slick.state.StateBasedGame

import com.github.hatimiti.scalemag.app.game.field.entity.character.Player
import com.github.hatimiti.scalemag.app.support.GameSceneState
import com.github.hatimiti.scalemag.base.BaseGameState
import com.github.hatimiti.scalemag.base.gui.twl.RootPane
import com.github.hatimiti.scalemag.base.util.Point

class FieldState extends BaseGameState(GameSceneState.FIELD) {
  
  private[field] val guiManager = new FieldGUIManager(this)
  private[field] var player: Player = null;
  
  override def init(container: GameContainer, game: StateBasedGame) {
    player = new Player(101, Point.at(300, 500))
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