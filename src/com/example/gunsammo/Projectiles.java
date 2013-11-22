package com.example.gunsammo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Projectiles extends View {

	private float x, y;
	private int speedY;
	private boolean visible;
	Paint paint = new Paint();

	public Projectiles(Context context, float startX, float startY) {
		super(context);
		
		x = startX;
		y = startY;
		speedY = 7;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawCircle(x, y, 10, paint);
		this.invalidate();
		update();
	}

	public void update() {
		y += speedY;
		if (y > 800) {
			visible = false;
		}
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getSpeedY() {
		return speedY;
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

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
