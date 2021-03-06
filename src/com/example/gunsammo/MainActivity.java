package com.example.gunsammo;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements SensorEventListener {

	FighterJet fighterjet;
	Projectiles projectiles;
	Enemy enemy;

	RelativeLayout main;

	SensorManager sensorManager;
	Sensor sensor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		main = (RelativeLayout) findViewById(R.id.main);
		fighterjet = new FighterJet(getApplicationContext());
		projectiles = new Projectiles(getApplicationContext(), fighterjet.getxPosition(), fighterjet.getyPosition());
		enemy = new Enemy(getApplicationContext());
		main.addView(fighterjet);
		main.addView(projectiles);
		main.addView(enemy);		

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);

		sensorManager.registerListener(this, sensor, 0);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		fighterjet.xPosition = (event.values[0] * 500)
				+ (getApplicationContext().getResources().getDisplayMetrics().widthPixels)
				/ 2;
		System.out.println(fighterjet.xPosition);
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		sensorManager.unregisterListener(this);
		super.onDestroy();
	}
}
