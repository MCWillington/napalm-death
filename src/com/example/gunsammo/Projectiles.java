package com.example.gunsammo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Projectiles extends View {

	private int x, y, speedX;
	private boolean visible;
	Paint paint = new Paint();

	public Projectiles(Context context, int startX, int startY) {
		super(context);
		
		x = startX;
		y = startY;
		speedX = 7;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawCircle(x, y, 10, paint);
		this.invalidate();
		update();
	}

	public void update() {
		x += speedX;
		if (x > 800) {
			visible = false;
		}
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
