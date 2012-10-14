package com.example.LoLHelper;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class AndroidActivity extends Activity {
	protected static final String TAG = "AndroidActivity";
	private static final int Android_Activity = 102;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.android);
		timer();
	}
	
	public void timer() {
		Timer time = new Timer();
		time.cancel();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}
}
