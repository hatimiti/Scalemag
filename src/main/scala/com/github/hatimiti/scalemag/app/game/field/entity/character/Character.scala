package com.github.hatimiti.scalemag.app.game.field.entity.character;

import org.newdawn.slick.Color
import org.newdawn.slick.Graphics
import org.newdawn.slick.geom.Rectangle

import com.github.hatimiti.scalemag.app.game.field.entity.Entity
import com.github.hatimiti.scalemag.app.game.field.entity.support.direction.FacingDirection
import com.github.hatimiti.scalemag.app.game.field.entity.support.move.Movable
import com.github.hatimiti.scalemag.base.util.Point

/**
 */
abstract class Character(
    protected[this] val characterNumber: Int, defaultPoint: Point)
  extends Entity (new Rectangle(defaultPoint.x, defaultPoint.y, 20, 32))
  with Movable {
  
//		this.characterNumber = characterNumber;
//		this.liveStatus = new LiveStatus(
//				characterNumber, new HP(100), new HP(100), 10, 10, 30, 30);
//		this.abilityStatus = new AbilityStatus(10, 1, 1, 1, 1, 1);
//
//		this.moveImage = new MoveDirectionAnimation(characterNumber, 32, 32);

//		this.weapon = new EmptyWeapon(this);
		facesTo(FacingDirection.DOWN)
//		this.attackState = AttackState.STOP;

		protected[this] var existsInGame = true;
		
//		this.stop();
  
  override def draw(g: Graphics) {
    g.setColor(Color.blue)
    g.draw(this.shape)
  }
  
  override def alreadyMarkedForDeletion(): Boolean = existsInGame
  protected[this] override def origin(): Entity = this
}
