package com.example.scvngr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class GameSet extends Activity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameset_main);
        
        findViewById(R.id.track).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GameSet.this, MapLoading.class);
				startActivity(intent);
			}
		});
        
        findViewById(R.id.swift).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GameSet.this, MapLoading.class);
				startActivity(intent);
			}
		});
        
        
        findViewById(R.id.act).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GameSet.this, MapActivity.class);
				startActivity(intent);
			}
		});
        
        findViewById(R.id.gamehelp).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GameSet.this, GameSetHelp.class);
				startActivity(intent);
			}
		}); 
        
        findViewById(R.id.how_to_video).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GameSet.this, How_To_Video.class);
				startActivity(intent);
			}
		}); 
        
       
        
         
	}
}
