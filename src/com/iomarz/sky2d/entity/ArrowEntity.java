package com.iomarz.sky2d.entity;

import java.awt.Graphics;

import com.iomarz.sky2d.game.Game;
import com.iomarz.sky2d.graphics.animation.AnimationPlayer;

public class ArrowEntity extends Entity {

	private AnimationPlayer animTest;
	
	public ArrowEntity(float x, float y, int width, int height, Game game) {
		super(x, y, width, height, game);
		
		animTest = new AnimationPlayer(100, game.getAnim().testAnim);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(animTest.getAnimationFrame(), (int) x, (int) y, width, height, null);
	}

	@Override
	public void tick() {
		animTest.tick();
	}

}
