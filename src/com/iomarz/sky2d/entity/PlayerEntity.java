package com.iomarz.sky2d.entity;

import java.awt.Graphics;

import com.iomarz.sky2d.game.Game;

public class PlayerEntity extends Entity {

	public PlayerEntity(float x, float y, int width, int height, Game game) {
		super(x, y, width, height, game);
		health = 20;
		alive = true;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(game.getAssets().getPlayer(), (int) x, (int) y, width, height, null);
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
	}
	
	// Mouse Input Example
	private void clickToMove() {
		if (game.getMouse().clickToMove) {
			x = game.getMouse().getMouseEvent().getX();
			y = game.getMouse().getMouseEvent().getY();
		}
	}

}
