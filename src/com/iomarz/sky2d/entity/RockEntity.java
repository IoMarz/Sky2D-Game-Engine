package com.iomarz.sky2d.entity;

import java.awt.Graphics;

import com.iomarz.sky2d.game.Game;

public class RockEntity extends Entity {

	public RockEntity(float x, float y, int width, int height, Game game) {
		super(x, y, width, height, game);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(game.getAssets().getRock(), (int) x, (int) y, width, height, null);
	}

	@Override
	public void tick() {
		
	}

}
