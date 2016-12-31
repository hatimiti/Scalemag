package com.github.hatimiti.scalemag.app.support;

import com.github.hatimiti.scalemag.base.gui.twl.TWLStateBasedGame;
import java.net.URL
import org.newdawn.slick.util.ResourceLoader
import org.newdawn.slick.GameContainer

/*enum*/ object GameSceneState {
  case object LOAD extends GameSceneState(1)
  case object MENU extends GameSceneState(10)
  case object FIELD extends GameSceneState(100)
  case object SERVER extends GameSceneState(9999)
  
  val values = Array(LOAD, MENU, FIELD, SERVER)
  
}

sealed abstract class GameSceneState(val id:Int) {
  val name = toString
}