package com.github.hatimiti.gamix.app.game.load;

import com.github.hatimiti.gamix.base.gui.twl.TWLStateBasedGame;
import java.net.URL
import org.newdawn.slick.util.ResourceLoader
import org.newdawn.slick.GameContainer
import com.github.hatimiti.gamix.base.BaseGameState
import org.newdawn.slick.state.StateBasedGame
import org.newdawn.slick.Graphics
import com.github.hatimiti.gamix.app.support.GameSceneState

class LoadState extends BaseGameState(GameSceneState.LOAD) {

  override def init(container: GameContainer, game: StateBasedGame) {
  }
  
  override def enter(container: GameContainer, game: StateBasedGame) {
    super.enter(container, game)
    game.enterState(GameSceneState.MENU.id)
  }
  
  override def render(container: GameContainer, game: StateBasedGame, g: Graphics) {
  }
  
  override def update(container: GameContainer, game: StateBasedGame, delta: Int) {
  }
}