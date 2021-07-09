package com.iomarz.sky2d.graphics.animation;

import java.awt.image.BufferedImage;

public class AnimationPlayer {
	
	private int speed, index;
	private long lastTime, timer;
	private BufferedImage[] frames;
	
	public AnimationPlayer(int speed, BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public void tick() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if (timer > speed) {
			index++;
			timer = 0;
			if (index >= frames.length) {
				index = 0;
			}
		}
	}
	
	public BufferedImage getAnimationFrame() {
		return frames[index];
	}

}
