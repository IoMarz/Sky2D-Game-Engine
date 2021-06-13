package com.iomarz.sky2d.graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

public class Assets {
	
	// private BufferedImage test;
	private BufferedImage sheetImg;
	private BufferedImage player, rock;

	private SpriteSheet sheet;
	
	private Font minecraftia24;
	
	public Assets() {
		// Initialize images
		// test = ImageLoader.loadImage("/tex/test.png");
		sheetImg = ImageLoader.loadImage("/tex/sheet.png");
		
		// Initialize sprite sheets
		sheet = new SpriteSheet(sheetImg);
		
		// Initialize game assets
		rock = sheet.crop(0, 0, 64, 64);
		player = sheet.crop(64, 0, 64, 64);
		
		// Initialize fonts
		minecraftia24 = FontLoader.loadFont("/font/Minecraftia-Regular.ttf", 24f);
	}
	
	// Getters
	/*
	public BufferedImage getTestImg() {
		return test;
	}
	*/
	
	public BufferedImage getPlayer() {
		return player;
	}
	
	public BufferedImage getRock() {
		return rock;
	}
	
	public SpriteSheet getSheet() {
		return sheet;
	}
	
	public Font getMinecraftiaFont() {
		return minecraftia24;
	}

}
