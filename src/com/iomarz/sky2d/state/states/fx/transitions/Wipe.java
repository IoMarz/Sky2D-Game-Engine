package com.iomarz.sky2d.state.states.fx.transitions;

import java.awt.Color;
import java.awt.Graphics;

import com.iomarz.sky2d.display.Window;

public class Wipe {
	
	static int i = 1280, j = 0;
	
	public static void in(Graphics g, Window display, Color c, int speed) {
		g.fillRect(i, 0, display.getWidth(), display.getHeight());
		i -= speed;
		if (i < 0) {
			i = 0;
		}
	}
	
	public static void out(Graphics g, Window display, Color c, int speed) {
		g.fillRect(j, 0, display.getWidth(), display.getHeight());
		j -= speed;
		if (j >= display.getWidth()) {
			j = 0;
		}
	}

}
