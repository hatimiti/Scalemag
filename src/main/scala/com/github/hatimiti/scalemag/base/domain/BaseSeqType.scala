package com.github.hatimiti.scalemag.base.domain;

abstract class BaseSeqType[T](v: Seq[T])
    extends BaseType(v) with Seq[T] {
  

}