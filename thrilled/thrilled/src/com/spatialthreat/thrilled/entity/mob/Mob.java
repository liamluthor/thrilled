package com.spatialthreat.thrilled.entity.mob;

import com.spatialthreat.thrilled.entity.Entity;
import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;

public abstract class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 2;  
	//0 North | up, 1 East | right, 2 South | down, 3 West | left
	protected boolean moving = false;
	protected boolean walking = false;
	
	public void move(int xa, int ya) {
		
		if (xa != 0 && ya != 0) {
			if (xa < 0 && ya < 0) dir = 6;  //down, left
			if (xa < 0 && ya > 0) dir = 7;  //up, left
			if (xa > 0 && ya < 0) dir = 5;  //down, right
			if (xa > 0 && ya > 0) dir = 4;  //up, right
		}
		
		if (xa > 0) dir = 1; //right
		if (xa < 0) dir = 3; //left
		if (ya > 0) dir = 2; //up
		if (ya < 0) dir = 0; //down
		
		if (!collision(xa, ya)) {
			x += xa;
			y += ya;
		}
	}
	
	public void update() {
	}
	
	public void render(Screen screen) {
		
	}
	
	private boolean collision(int xa, int ya) {
		boolean solid = false;
		for (int c = 0; c < 4; c++) {
			int xt = ((x + xa) + c % 2 * 10 + 2) / 16 ;
			int yt = ((y + ya) + c / 2 * 2 + 14)  / 16;
			//System.out.println(xt + " xt and yt " + yt + " " + (level.getTile(xt, yt)));
			if (level.getTile(xt, yt).solid()) solid = true;
		}
		

		//System.out.println(solid);
		return solid;
	}
	
	

}
