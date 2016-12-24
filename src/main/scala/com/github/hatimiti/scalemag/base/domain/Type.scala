package com.github.hatimiti.scalemag.base.domain;

import org.newdawn.slick.AppGameContainer
import com.github.hatimiti.scalemag.app.GamePanel

trait Type[T] {
  
  def value(): T;

}