package com.spatialthreat.thrilled.level.tile;

import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;

public class curbCornerBRTile extends Tile {
	
	public curbCornerBRTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	

}
