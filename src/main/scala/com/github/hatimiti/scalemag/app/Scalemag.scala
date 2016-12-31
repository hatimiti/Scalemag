package com.github.hatimiti.scalemag.app;

import org.newdawn.slick.AppGameContainer

object Scalemag {
  
  val SCALE = 2;
  val WIDTH = 800 / SCALE;
  val HEIGHT = 600 / SCALE;

  private[this] val gameContainer = new AppGameContainer(new GamePanel())

  gameContainer.setDisplayMode(WIDTH * SCALE, HEIGHT * SCALE, false)
  gameContainer.setTargetFrameRate(30)
  gameContainer.setAlwaysRender(true)
  gameContainer.setUpdateOnlyWhenVisible(false)
  
  def start() = gameContainer.start()
}