package com.spatialthreat.thrilled.entity.mob;

import java.util.Random;

import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;


public class Cyclops extends Mob {
	
	
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false;
	private Random random = new Random();
	public Cyclops(int x, int y) {
		sprite = Sprite.cyclops;
		this.x = x << 4;
		this.y = y << 4;
	}
	
	
	
	
	public void update() {
		cyclopsMove();
    
	}
	
	public void render(Screen screen) {
	screen.renderPlayer(x, y, sprite);
		
	}
	
	private void cyclopsMove() {
		
		
		if (player.x + player.y * 16 )
		
		
		int mobMove = random.nextInt(100);
		if (mobMove % 13 == 1) {
			this.move(1, 0);
		}
		mobMove = random.nextInt(100);
		if (mobMove % 9 == 1) {
			this.move(0,  1);
		}
		mobMove = random.nextInt(100);
		if (mobMove % 8 == 1) {
			this.move(-1,  0);
		}
		mobMove = random.nextInt(100);
		if (mobMove % 16 == 1) {
			this.move(0,  -1);
		}
		mobMove = random.nextInt(100);
		if (mobMove % 5 == 1) {
			this.move(0,  0);
		}
	}

}
