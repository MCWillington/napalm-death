package com.example.gunsammo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Enemy extends View {
	
	private int maxHealth = 100;
	private int currentHealth = 100;
	private int power = 100;
	private int speed = 1;
	private int centerX = 100;
	private int centerY = 0;
	private int radius = 10;
	Paint paint = new Paint();
	
	public Enemy(Context context) {
		super(context);
		
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		update();
		canvas.drawCircle(centerX, centerY, radius, paint);
		this.invalidate();
	}

	// Behavioral Methods
	public void update() {
		centerY += speed;
	}

	public void die() {

	}

	public void attack() {

	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public int getPower() {
		return power;
	}

	public int getSpeedX() {
		return speed;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeedX(int speedX) {
		this.speed = speed;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

}
