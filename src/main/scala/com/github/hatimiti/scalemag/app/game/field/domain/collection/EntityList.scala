package com.github.hatimiti.scalemag.app.game.field.domain.collection;

import com.github.hatimiti.scalemag.base.domain.BaseSeqType
import org.newdawn.slick.Graphics
import com.github.hatimiti.scalemag.app.game.field.entity.Entity

/**
 * 
 * @author hatimiti
 */
final class EntityList private(entities: List[Entity])
    extends BaseSeqType[Entity](entities) {

  override def apply(index: Int): Entity = value().apply(index)
  override def iterator: Iterator[Entity] = value().iterator
  override def length: Int = value().length
  
  def draw(g: Graphics) = foreach(_.draw(g))
  
  def update() {
    removesNonExistsEntities()
    par foreach(_.update())
  }
  
  private[this] def removesNonExistsEntities() = filter(!_.alreadyMarkedForDeletion())
}

final object EntityList {
  def apply[A <: Entity](xs: A*): EntityList = new EntityList(xs.toList)
}