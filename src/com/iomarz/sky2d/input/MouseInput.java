package com.iomarz.sky2d.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInput implements MouseListener, MouseMotionListener {

	private boolean[] clicks;
	public boolean clickToMove;
	
	private int mouseX, mouseY;
	
	public MouseInput() {
		clicks = new boolean[16];
	}
	
	// Update
	public void tick() {
		clickToMove = clicks[MouseEvent.BUTTON1];
	}
	
	// Mouse Listener
	@Override
	public void mouseClicked(MouseEvent m) {
		
	}

	@Override
	public void mouseEntered(MouseEvent m) {
		
	}

	@Override
	public void mouseExited(MouseEvent m) {
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		clicks[m.getButton()] = true;
	}

	@Override
	public void mouseReleased(MouseEvent m) {
		clicks[m.getButton()] = false;
	}
	
	// Mouse Motion
	public void mouseDragged(MouseEvent mv) {
		mouseX = mv.getX();
		mouseY = mv.getY();
	}

	@Override
	public void mouseMoved(MouseEvent mv) {
		mouseX = mv.getX();
		mouseY = mv.getY();
		// System.out.println("MouseX: " + mouseX + " MouseY: " + mouseY);
	}
	
	// Getters
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}

}
