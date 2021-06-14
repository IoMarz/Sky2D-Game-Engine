package com.iomarz.sky2d.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.iomarz.sky2d.game.Game;
import com.iomarz.sky2d.graphics.ImageRotation;

public class PlayerEntity extends Entity {

	private BufferedImage rotated;
	
	public PlayerEntity(float x, float y, int width, int height, Game game) {
		super(x, y, width, height, game);
		health = 20;
		alive = true;
		speed = 5.0f;
		rotated = game.getAssets().getPlayer();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(rotated, (int) x, (int) y, width, height, null);
	}

	@Override
	public void tick() {
		checkInputs();
		clickToMove();
	}
	
	private void checkInputs() {
		if (game.getKeys().up) {
			y -= speed;
		}
		if (game.getKeys().down) {
			y += speed;
		}
		
		if (game.getKeys().left) {
			x -= speed;
		}
		if (game.getKeys().right) {
			x += speed;
		}
		
		if (game.getKeys().rotate) {
			rotate();
		}
	}
	
	// Mouse Input Example
	private void clickToMove() {
		if (game.getMouse().clickToMove) {
			x = game.getMouse().getMouseX();
			y = game.getMouse().getMouseY();
		}
	}
	
	double r = 0;
	
	private void rotate() {
		r+=10;
		/*
		if (r >= 359) {
			r = 0;
		}
		*/
		rotated = ImageRotation.rotateImage(game.getAssets().getPlayer(), r);
	}

}
