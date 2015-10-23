package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public class Player {
	
	/* Player class for handling the update of each player each frame - use update() method
	 * Should have a draw() method for drawing the player with a specific color set in the constructor -- Maybe?
	 */
	
	private Color trailColor;
	
	public int x;
	public int y;
	public Vector2 lastVisited;
	
	//Constructor takes an initial X and Y value for where the player starts in the game
	public Player(int initX, int initY, Color trailColor) {
		this.x = initX;
		this.y = initY;
		this.trailColor = trailColor;
	}
	
	//Returns the color of the player for drawing outside of the class
	public Color getColor() {
		return this.trailColor;
	}
}
