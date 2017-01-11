package com.github.hatimiti.scalemag.app.game.field;

import org.newdawn.slick.GameContainer
import org.newdawn.slick.Graphics
import org.newdawn.slick.state.StateBasedGame

import com.github.hatimiti.scalemag.app.game.field.entity.character.Player
import com.github.hatimiti.scalemag.app.support.GameSceneState
import com.github.hatimiti.scalemag.base.BaseGameState
import com.github.hatimiti.scalemag.base.gui.twl.RootPane
import com.github.hatimiti.scalemag.base.util.Point
import com.github.hatimiti.scalemag.app.game.field.domain.collection.EntityList

class FieldState extends BaseGameState(GameSceneState.FIELD) {
  
  private[field] val guiManager = new FieldGUIManager(this)
  private[field] val inputHelper = new FieldInputHelper(this)
  private[field] var player: Player = null;
  
  private[this] val entities = EntityList()
  
  override def init(container: GameContainer, game: StateBasedGame) {
    player = new Player(101, Point.at(300, 500))
    // FIXME Seq is immutable. So I need change Seq to ArrayBuffer.
    entities:+ player
  }
  
  override def enter(container: GameContainer, game: StateBasedGame) {
    super.enter(container, game)
    guiManager.enter(container, game)
  }
  
  override def render(container: GameContainer, game: StateBasedGame, g: Graphics) {
    entities.draw(g)
    guiManager.render(container, game, g)
  }
  
  override def update(container: GameContainer, game: StateBasedGame, delta: Int) {
    guiManager.update(container, game, delta)
    inputHelper.input(container)
    
    entities.update()
  }
  
  protected override def createRootPane(): RootPane = {
    guiManager.createRootPane(super.createRootPane())
  }
  
  protected override def layoutRootPane() {
    guiManager.layoutRootPane()
  }
  
}