package com.example.LoLHelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeActivity extends Activity {
	protected static final String TAG = "WelcomeActivity";
	private static final int WELCOME_SCREEN = 101;
	private Button next;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		initButton();
		buttonListener();
	}

	public void initButton() {
		next = (Button) findViewById(R.id.welcome_enter);
	}

	public void buttonListener() {
		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(WelcomeActivity.this,
						AndroidActivity.class);
				startActivityForResult(intent, WELCOME_SCREEN);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}
}
