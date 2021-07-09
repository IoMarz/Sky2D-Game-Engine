package com.iomarz.sky2d.graphics.animation;

import java.awt.image.BufferedImage;

import com.iomarz.sky2d.graphics.ImageLoader;
import com.iomarz.sky2d.graphics.SpriteSheet;

public class AnimationContainer {
	
	private SpriteSheet animSpriteSheet;
	private BufferedImage animImage;
	
	public BufferedImage[] testAnim;
	
	public AnimationContainer() {
		initAssets();
	}
	
	private void initAssets() {
		animImage = ImageLoader.loadImage("/tex/animSheet.png");
		
		animSpriteSheet = new SpriteSheet(animImage);
		
		testAnim = new BufferedImage[2];
		
		testAnim[0] = animSpriteSheet.crop(0, 0, 64, 64);
		testAnim[1] = animSpriteSheet.crop(64, 0, 64, 64);
	}

}
