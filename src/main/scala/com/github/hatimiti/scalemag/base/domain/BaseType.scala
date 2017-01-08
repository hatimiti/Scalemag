package com.github.hatimiti.scalemag.base.domain;

/**
 * The base class for all of other classes in the domain.
 * 
 * @author hatimiti
 * 
 * @param <T> The standard type.
 */
abstract case class BaseType[T](val v: T) extends Type[T] {
  override def value(): T = v;
}