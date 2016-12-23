package com.github.hatimiti.gamix.app.game.menu;

import com.github.hatimiti.gamix.base.gui.twl.TWLStateBasedGame;
import java.net.URL
import org.newdawn.slick.util.ResourceLoader
import org.newdawn.slick.GameContainer
import com.github.hatimiti.gamix.base.BaseGameState
import org.newdawn.slick.state.StateBasedGame
import org.newdawn.slick.Graphics
import java.io.File
import org.newdawn.slick.Input
import com.github.hatimiti.gamix.app.support.GameSceneState

class MenuState extends BaseGameState(GameSceneState.MENU) {

  override def init(container: GameContainer, game: StateBasedGame) {
  }
  
  override def enter(container: GameContainer, game: StateBasedGame) {
    super.enter(container, game)
//    midiPlayer.play(new File(
//        ResourceLoader.getResource("musicFiles/music01.mid").getPath()))
  }
  
  override def render(container: GameContainer, game: StateBasedGame, g: Graphics) {
    g.drawString("Menu", 100, 100)
  }
  
  override def update(container: GameContainer, game: StateBasedGame, delta: Int) {
    val input = container.getInput()
    if (input.isKeyDown(Input.KEY_ENTER)
        || input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {

      game.enterState(GameSceneState.FIELD.id)

    } else if (input.isKeyDown(Input.KEY_S)
        || input.isMousePressed(Input.MOUSE_RIGHT_BUTTON)) {

      game.enterState(GameSceneState.SERVER.id)
    }
  }
}