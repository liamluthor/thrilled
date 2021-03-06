package com.spatialthreat.thrilled.level.tile;

import com.spatialthreat.thrilled.graphics.Screen;
import com.spatialthreat.thrilled.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile wall = new WallTile(Sprite.wall);
	public static Tile grave = new GraveTile(Sprite.grave);
	public static Tile voidTile = new voidTile(Sprite.voidTile);
	public static Tile woodfloor = new woodFloorTile(Sprite.woodfloor);
	public static Tile water = new water(Sprite.water);
	public static Tile curbRight = new curbRightTile(Sprite.curbRight);
	public static Tile curbLeft = new curbLeftTile(Sprite.curbLeft);
	public static Tile curbUp = new curbUpTile(Sprite.curbUp);
	public static Tile curbDown = new curbDownTile(Sprite.curbDown);
	public static Tile curbCornerTL = new curbCornerTLTile(Sprite.curbCornerTL);
	public static Tile curbCornerTR = new curbCornerTRTile(Sprite.curbCornerTR);
	public static Tile curbCornerBL = new curbCornerBLTile(Sprite.curbCornerBL);
	public static Tile curbCornerBR = new curbCornerBRTile(Sprite.curbCornerBR);
	public static Tile hwall = new hwall(Sprite.hwall);
	public static Tile vwall = new vwall(Sprite.vwall);
	public static Tile walltl = new walltl(Sprite.walltl);
	public static Tile walltr = new walltr(Sprite.walltr);
	public static Tile wallbl = new wallbl(Sprite.wallbl);
	public static Tile wallbr = new wallbr(Sprite.wallbr);
	public static Tile concrete = new concrete(Sprite.concrete);
	public static Tile fountain = new fountain(Sprite.fountain);
	

	
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}

}
