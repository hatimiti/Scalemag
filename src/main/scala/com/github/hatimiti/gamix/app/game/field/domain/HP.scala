package com.github.hatimiti.gamix.app.game.field.domain;

import com.github.hatimiti.gamix.base.domain.BaseIntType

class HP(hp: Int) extends BaseIntType(hp);

object HP {
  val ZERO = new HP(0);
}