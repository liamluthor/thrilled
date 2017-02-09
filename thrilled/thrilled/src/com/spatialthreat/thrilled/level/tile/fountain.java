package com.spatialthreat.thrilled.level.tile;

import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;

public class fountain extends Tile {
	
	public fountain (Sprite sprite) {
		super(sprite);
	}
	
public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
}
