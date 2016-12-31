package com.github.hatimiti.scalemag.app

import java.net.URL

import org.newdawn.slick.GameContainer
import org.newdawn.slick.util.ResourceLoader

import com.github.hatimiti.scalemag.app.game.field.FieldState
import com.github.hatimiti.scalemag.app.game.load.LoadState
import com.github.hatimiti.scalemag.app.game.menu.MenuState
import com.github.hatimiti.scalemag.app.support.GameSceneState
import com.github.hatimiti.scalemag.base.gui.twl.TWLStateBasedGame

class GamePanel extends TWLStateBasedGame(GamePanel.TITLE) {

  addStates()
  this.enterState(GameSceneState.LOAD.id);

  private def addStates() {
		this.addState(new LoadState());
		this.addState(new MenuState());
		this.addState(new FieldState());
//		this.addState(new ServerState());
  }

  override def initStatesList(gc: GameContainer) {}

  protected override def getThemeURL(): URL =
    ResourceLoader.getResource("twl/gameui.xml")
}

private object GamePanel {
  val TITLE = "My Game";
}