 package com.example.gunsammo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class FighterJet extends View {
	
	float xPosition = 290;
	float yPosition = 900;
	int velocity = 0;
	int life = 0;
	int bullets = 0;
	int bombs = 0;
	int level = 0;
	
	Color color = new Color();
	Paint paint = new Paint();
	Bitmap bitmap;
	Bitmap resizeBitmap;
	
	public FighterJet(Context context) {
		super(context);
		bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.fighterjet);
		resizeBitmap = Bitmap.createScaledBitmap(bitmap, 80, 90, false);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(resizeBitmap, xPosition, yPosition, paint);
		this.invalidate();
	}

	public float getxPosition() {
		return xPosition;
	}

	public float getyPosition() {
		return yPosition;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getLife() {
		return life;
	}

	public int getBullets() {
		return bullets;
	}

	public int getBombs() {
		return bombs;
	}

	public int getLevel() {
		return level;
	}

	public Color getColor() {
		return color;
	}

	public Paint getPaint() {
		return paint;
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public Bitmap getResizeBitmap() {
		return resizeBitmap;
	}

	public void setxPosition(float xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(float yPosition) {
		this.yPosition = yPosition;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

	public void setBombs(int bombs) {
		this.bombs = bombs;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setPaint(Paint paint) {
		this.paint = paint;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public void setResizeBitmap(Bitmap resizeBitmap) {
		this.resizeBitmap = resizeBitmap;
	}
	
}
