package com.github.hatimiti.scalemag.app.game.field.domain;

import com.github.hatimiti.scalemag.base.domain.BaseIntType

class HP(hp: Int) extends BaseIntType(hp);

object HP {
  val ZERO = new HP(0);
}