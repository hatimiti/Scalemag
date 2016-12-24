package com.github.hatimiti.scalemag.base.domain;

/**
 * The base class for all of other classes in the domain.
 * 
 * @author hatimiti
 * 
 * @param <T> The standard type.
 */
abstract class BaseType[T](val v: T) extends Type[T] {

  override def toString(): String = {
    this.value.toString()
  }
  
  override def equals(obj: Any): Boolean = {
    obj match {
      case v: Type[T] => value().equals(v.value())
      case _ => false
    }
  }
  
  override def hashCode(): Int = {
    this.value.hashCode()
  }
  
  override def value(): T = v;
  
//  /**
//   * The implementation instead of instanceof.
//   */
//  protected def isIncetainceOf(obj: AnyRef): Boolean = {
//    if (obj == null) {
//      return false;
//    }
//    try {
//      return this.getClass().equals(obj.getClass())
//    } catch {
//      case _: Throwable => return false;
//    }
//  }

}