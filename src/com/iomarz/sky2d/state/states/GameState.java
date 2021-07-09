package com.iomarz.sky2d.state.states;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.iomarz.sky2d.display.Window;
import com.iomarz.sky2d.entity.ArrowEntity;
import com.iomarz.sky2d.entity.PlayerEntity;
import com.iomarz.sky2d.entity.RockEntity;
import com.iomarz.sky2d.game.Game;
import com.iomarz.sky2d.state.State;
import com.iomarz.sky2d.state.states.fx.transitions.Wipe;

public class GameState extends State {
	
	// Example game state
	/*
	 * This is mainly to show that a game can be made out of this engine
	 */
	
	private Random rand;
	
	private PlayerEntity player;
	private RockEntity rock;
	
	// Animation Test Object
	private ArrowEntity arrow;

	private int randX, randY;
	private int score = 0;
	
	public GameState(Game game, Window window) {
		super(game, window);
		id = 1;
		init();
	}
	
	private void init() {
		rand = new Random();
		player = new PlayerEntity(200, 100, 64, 64, game);
		rock = new RockEntity(1 + rand.nextInt(1200), 1 + rand.nextInt(600), 64, 64, game);
		arrow = new ArrowEntity(100, 100, 64, 64, game);
	}
	
	@Override
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, game.getWin().getWidth(), game.getWin().getHeight());
		player.render(g);
		rock.render(g);
		arrow.render(g);
		g.setColor(Color.black);
		g.setFont(game.getAssets().getMinecraftiaFont()); 
		g.drawString("Score: " + score, 4, 40);
		// Transition effects must be drawn last to cover everything currently on screen to transition smoothly
		transitionEffects(g);
	}
	
	public void transitionEffects(Graphics g) {
		// Check of the transitions!!
		//Wipe.in(g, window, Color.black, 20);
		Wipe.out(g, window, Color.black, 20);
	}

	@Override
	public void tick() {
		player.tick();
		rock.tick();
		arrow.tick();
		checkForCollisions();
	}
	
	private void rollDice() {
		randX = 1 + rand.nextInt(game.getWin().getWidth() - rock.getWidth());
		randY = 1 + rand.nextInt(game.getWin().getHeight() - rock.getHeight());
		rock.setX(randX);
		rock.setY(randY);
	}
	
	private void checkForCollisions() {
		if (player.getBounds().intersects(rock.getBounds())) {
			rollDice();
			score++;
		}
	}

}
