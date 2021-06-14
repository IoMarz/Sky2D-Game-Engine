package com.iomarz.sky2d.graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageRotation {
	
	public static BufferedImage rotateImage(BufferedImage img, double ang) {
	    int w = img.getWidth();    
	    int h = img.getHeight();

	    BufferedImage rotated = new BufferedImage(w, h, img.getType());  
	    Graphics2D graphic = rotated.createGraphics();
	    graphic.rotate(Math.toRadians(ang), w/2, h/2);
	    graphic.drawImage(img, null, 0, 0);
	    graphic.dispose();
	    return rotated;
	}

}
