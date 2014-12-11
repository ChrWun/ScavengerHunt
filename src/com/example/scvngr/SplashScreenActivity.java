package com.example.scvngr;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;

public class SplashScreenActivity extends Activity {
	int splashWaitingTime = 2 * 1000;// 2 seconds

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_activity);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				Intent intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
				finish();
				startActivity(intent);

				overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

			}
		}, splashWaitingTime);

		new Handler().postDelayed(new Runnable() 
		{
			@Override
			public void run() 
			{
				//Do nothing
			} 
		}, splashWaitingTime);

	}


	@Override
	public void onBackPressed() {
		finish();
		super.onBackPressed();
	}
	
	@Override
    protected void onDestroy() {
         
        super.onDestroy();
         
    }
}
