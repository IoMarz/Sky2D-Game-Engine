package com.iomarz.sky2d.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.iomarz.sky2d.game.Game;

public class RockEntity extends Entity {

	private BufferedImage rotated;
	
	public RockEntity(float x, float y, int width, int height, Game game) {
		super(x, y, width, height, game);
		rotated = game.getAssets().getRock();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(rotated, (int) x, (int) y, width, height, null);
	}

	@Override
	public void tick() {
		
	}

}
