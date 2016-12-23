package com.github.hatimiti.gamix.base

import com.github.hatimiti.gamix.app.support.GameSceneState
import com.github.hatimiti.gamix.base.gui.twl.BasicTWLGameState
import com.github.hatimiti.gamix.base.util.MIDIPlayer

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