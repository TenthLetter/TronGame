package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TronGame extends Game {

	//Game Manager that starts the game and handles the current round as well as the win conditions of the game
	
	public SpriteBatch batch;
	public BitmapFont font;
	
	//Initialize SpriteBatch for efficient drawing
	//Uses Arial font if none specified in font constructor
	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		//Start the main menu screen
		this.setScreen(new MainMenuScreen(this));
	}
	
	public void render() {
		super.render(); //libgdx convention for rendering extensions of Game class
	}
	
	//OS-friendly cleanup of garbage if the game is closed spontaneously
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
