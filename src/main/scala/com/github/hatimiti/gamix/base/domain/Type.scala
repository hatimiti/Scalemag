package com.github.hatimiti.gamix.base.domain;

import org.newdawn.slick.AppGameContainer
import com.github.hatimiti.gamix.app.GamePanel

trait Type[T] {
  
  def value(): T;

}