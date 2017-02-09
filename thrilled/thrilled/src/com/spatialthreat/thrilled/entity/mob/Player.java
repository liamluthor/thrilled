package com.spatialthreat.thrilled.entity.mob;

import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;
import com.spatialthreat.thrilled.input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false;
	
	public Player(Keyboard input) {
		this.input = input;
		sprite = Sprite.player_down;
		
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		if (anim < 7500) anim ++; 
			else anim = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		
		if (xa != 0 || ya != 0) {
			move(xa, 0);
			move(0, ya);
			walking = true;
		} else {
			walking = false;
		}
	}
	
	public void render(Screen screen) {
		if (dir == 0) {
			sprite = Sprite.player_up;
			if (walking && (anim % 20 > 10))
				sprite = Sprite.player_up_1;
			else {
				sprite = Sprite.player_up_2;
			}
		}
		if (dir == 1) {
			sprite = Sprite.player_right;
			if (walking && (anim % 20 > 10))
				sprite = Sprite.player_right_1;
			else {
				sprite = Sprite.player_right_2;
			}
		}
		if (dir == 2) {
			sprite = Sprite.player_down;
			if (walking && (anim % 20 > 10))
				sprite = Sprite.player_down_1;
			else {
				sprite = Sprite.player_down_2;
			}
		}
		if (dir == 3) {
			sprite = Sprite.player_left;
			if (walking && (anim % 20 > 10))
				sprite = Sprite.player_left_1;
			else {
				sprite = Sprite.player_left_2;
			}
		}
		screen.renderPlayer(x, y, sprite);
		
	}

}
