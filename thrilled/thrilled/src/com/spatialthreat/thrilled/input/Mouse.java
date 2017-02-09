package com.spatialthreat.thrilled.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse implements MouseListener, MouseMotionListener {
	
	private static int mouseY = -1;
	private static int mouseX = -1;
	private static int mouseB = -1;
	private static int LEFT_BUTTON = 1;
	private static int RIGHT_BUTTON = 3;
	
	public static final byte CODE = 0x2;
	
	private static double scale = 1.0;
	
	public Mouse() {
	}
	
	public Mouse(double scale) {
		Mouse.scale = scale;
	}

	public static int getX() {
		return mouseX;
	}
	
	public static int getY() {
		return mouseY;
	}
	
	public static int getButton() {
		return mouseB;
	}
	
	
	public void mouseDragged(MouseEvent e) {
		mouseX = (int) (e.getX() / scale / scale);
		mouseY = (int) (e.getY() / scale / scale);
	}

	
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
	}

	
	public void mouseClicked(MouseEvent e) {
		mouseB = e.getButton();
	}

	
	public void mouseEntered(MouseEvent e) {	
	}

	
	public void mouseExited(MouseEvent e) {	
	}

	public void mousePressed(MouseEvent e) {
		mouseB = e.getButton();
		
	}

	public void mouseReleased(MouseEvent e) {
		mouseB = -1;
	}

}
