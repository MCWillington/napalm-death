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
	
}
