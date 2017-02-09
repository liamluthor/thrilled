package com.spatialthreat.thrilled.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.spatialthreat.thrilled.entity.mob.Cyclops;
import com.spatialthreat.thrilled.level.tile.Tile;

public class SpawnLevel extends Level {
	
	
	public SpawnLevel(String path) {
		super(path);
	}
		
	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width  = image.getWidth();
			int h = height = image.getHeight();
			System.out.println("SpawnLevel: w =" + w + " h = " + h );
			tiles = new int[ w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception:  Could not load level file");
		}
		
		add(new Cyclops(width / 2, 20));
		

	
	}
	
	
	protected void generateLevel() {
}
}
