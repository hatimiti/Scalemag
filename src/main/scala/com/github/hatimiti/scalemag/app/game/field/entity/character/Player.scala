package com.github.hatimiti.scalemag.app.game.field.entity.character;

import com.github.hatimiti.scalemag.app.game.field.entity.Entity
import com.github.hatimiti.scalemag.base.util.Point

/**
 * @author hatimiti
 */
class Player(characterNumber: Int, defaultPoint: Point)
    extends Character(characterNumber, defaultPoint) {

  override def update() {
    if (isStopped()) {
      return
    }
    moves()
  }
  
  override def toString: String = {
    s"""{
  "com.github.hatimiti.scalemag.app.game.field.entity.character.Player": {
    "characterNumber": ${characterNumber},
    "shape": "${shape}"
  }
}"""
  }
}