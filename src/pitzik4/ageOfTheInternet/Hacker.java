package pitzik4.ageOfTheInternet;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;

import pitzik4.ageOfTheInternet.graphics.Sprite;

public class Hacker implements RenderableTickable {
	private Sprite sprite;
	private Point[] path;
	private int x=0;//fixed multiple declarations per line here -chase
	private int y=0;
	private int progress = 0;
	public boolean going=false;
	public static final int STEP_SIZE = 3;
	
	public Hacker(int x, int y, Point[] path) {
		this.x = x;
		this.y = y;
		this.path = path;
		sprite = new Sprite(81, x, y, false);
	}

	@Override
	public BufferedImage draw() {
		return sprite.draw();
	}

	@Override
	public void drawOn(Graphics2D g, int scrollx, int scrolly) {
		sprite.drawOn(g, scrollx, scrolly);
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getXOffset() {
		return 0;
	}

	@Override
	public int getYOffset() {
		return 0;
	}

	@Override
	public void goTo(int x, int y) {
		this.x = x;
		this.y = y;
		sprite.goTo(x, y);
	}

	@Override
	public void tick() {
		if(going) {
			int nextX = path[progress].x;
			int nextY = path[progress].y;
			if(nextX > x) {
				goTo(x+STEP_SIZE, y);
				if(nextX < x) {
					goTo(nextX, y);
				}
			} else if(nextX < x) {
				goTo(x-STEP_SIZE, y);
				if(nextX > x) {
					goTo(nextX, y);
				}
			}
			if(nextY > y) {
				goTo(x, y+STEP_SIZE);
				if(nextY < y) {
					goTo(x, nextY);
				}
			} else if(nextY < y) {
				goTo(x, y-STEP_SIZE);
				if(nextY > y) {
					goTo(x, nextY);
				}
			}
			if(nextX == x && nextY == y) {
				progress++;
				if(progress >= path.length) {
					going = false;
				}
			}
		}
	}
	public void go() {
		going = true;
	}
	public void stop() {
		going = false;
	}

}
