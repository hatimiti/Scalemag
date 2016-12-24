package com.github.hatimiti.scalemag.base

import com.github.hatimiti.scalemag.app.support.GameSceneState
import com.github.hatimiti.scalemag.base.gui.twl.BasicTWLGameState
import com.github.hatimiti.scalemag.base.util.MIDIPlayer

abstract class BaseGameState(
  protected val gameSceneState: GameSceneState
) extends BasicTWLGameState {
  
  protected val midiPlayer = new MIDIPlayer
//  protected static FontFactory fontFactory;
//  protected static ImageFactory imageFactory;
  
  override def getID() = {
    this.gameSceneState.id
  }
  
}