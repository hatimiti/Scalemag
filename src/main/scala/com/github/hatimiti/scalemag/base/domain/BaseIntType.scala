package com.github.hatimiti.scalemag.base.domain;

abstract class BaseIntType(v: Int)
    extends BaseType(v) with Comparable[BaseIntType] {
  
  def isMinus(): Boolean = v < 0;
  override def compareTo(target: BaseIntType): Int
    = value().compareTo(target.value());

}