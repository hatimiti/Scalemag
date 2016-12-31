package com.github.hatimiti.scalemag.app.game.field.entity;

import org.apache.commons.lang3.RandomStringUtils
import org.newdawn.slick.Graphics
import org.newdawn.slick.geom.Shape

import com.github.hatimiti.scalemag.app.game.field.domain.EntityId
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection.DOWN
import com.github.hatimiti.scalemag.base.util.Point

/**
 * The object is base class all of entities in field state.
 * The entities of field should be extend this class.
 */
abstract class Entity(
    protected[this] val shape: Shape) extends Serializable {
  
  protected[this] val entityId
    = new EntityId(RandomStringUtils.randomAlphanumeric(10))
  protected[this] var direction: FacingDirection = DOWN
  
  /**
   * Sets the coordinate to the point designated by the argument.
   * @param p the object that points a coordinate.
   */
  def positions(p: Point) {
    shape.setX(p.x())
    shape.setY(p.y())
  }
  
  /**
   * Returns the object that points a coordinate of upper left.
   * @return the coordinate of upper left.
   */
  def point(): Point = Point.of(shape)

  /**
   * Returns the object that points a coordinate of center.
   * @return the coordinate of center of this object.
   */
  def center(): Point = Point.ofCenter(shape)
  
//  def setsEntityId(entityId: EntityId) = synchronized {
//    if (this.entityId != null) { return }
//    this.entityId = entityId
//  }
  
  /**
   * Faces to the direction disignated by the argument.
   * @param direction the direction facing.
   */
  def facesTo(direction: FacingDirection) = this.direction = direction
  
  /*
   * The followings are abstract methods.
   */

  def draw(g: Graphics): Unit
//  def update(ec: EntityContainer): Unit

  /**
   * If it returns the false, this entity object will be removed from the game.
   */
  def alreadyMarkedForDeletion(): Boolean
  
}
