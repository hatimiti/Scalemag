package com.github.hatimiti.scalemag.base.util

import org.newdawn.slick.geom.Shape

/**
 * The object that points at x and y coordinate.
 */
final class Point private[Point](
    private[this] val _x: Int,
    private[this] val _y: Int) extends Serializable {
  
  def x(): Int = _x
  def y(): Int = _y

  def +(p: Point): Point
    = if (p == null) getCopy() else Point.at(x() + p.x(), y() + p.y())
  def -(p: Point): Point
    = if (p == null) getCopy() else this + Point.at(-p.x(), -p.y())

  private def getCopy(): Point = Point.at(x(), y())
}

final object Point {
  def at(x: Int, y: Int): Point = new Point(x, y)
  def at(x: Float, y: Float): Point
    = new Point(x.asInstanceOf[Int], y.asInstanceOf[Int])
  def of(s: Shape): Point = at(s.getX(), s.getY())
  def ofCenter(s: Shape): Point = at(s.getCenterX(), s.getCenterY())
}