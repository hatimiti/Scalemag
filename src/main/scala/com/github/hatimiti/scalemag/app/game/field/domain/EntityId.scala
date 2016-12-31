package com.github.hatimiti.scalemag.app.game.field.domain;

import com.github.hatimiti.scalemag.base.domain.BaseType

final class EntityId(entityId: String) extends BaseType(entityId) {

  def isNone: Boolean = EntityId.NONE.equals(this)
  def isInit: Boolean = EntityId.INIT.equals(this)
}

final object EntityId {
  val NONE = new EntityId("None");
  val INIT = new EntityId("Initializing");
}