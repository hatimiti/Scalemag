package com.github.hatimiti.scalemag.base.util

import javax.sound.midi.MidiSystem
import javax.sound.midi.Sequence
import javax.sound.midi.Sequencer
import java.io.File

/**
 * The music player for MIDI format.
 */
class MIDIPlayer {
  
  /** The sequencer that plays the music by using sequence. */
  private[this] val sequencer = MidiSystem.getSequencer
  /** The sequence that stores the music information. */
  private[this] var sequence: Sequence = null
  
  sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY)
  sequencer.open()
  
  def play(file: File) {
    stop();
    sequence = MidiSystem.getSequence(file);
    sequencer.setSequence(sequence)
    sequencer.start()
  }
  
  def stop() {
    if (sequencer.isRunning()) {
      sequencer.stop()
    }
  }
  
}