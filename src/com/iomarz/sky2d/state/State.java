package com.iomarz.sky2d.state;

import java.awt.Graphics;

import com.iomarz.sky2d.display.Window;
import com.iomarz.sky2d.game.Game;

public abstract class State {
	
	protected Game game;
	protected Window window;
	protected int id;
	
	public State(Game game, Window window) {
		this.game = game;
		this.window = window;
	}
	
	public abstract void render(Graphics g);
	
	public abstract void tick();
	
	// Getters
	public Game getGame() {
		return game;
	}
	
	public int getId() {
		return id;
	}

}
