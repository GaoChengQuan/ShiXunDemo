package com.qd.demo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
	private ImageView mImageView;
	private Button mScale;
	private Button mAlpha;
	private Button mRotate;
	private Button mTranslate;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mImageView = (ImageView) findViewById(R.id.imageView);
		mScale = (Button) findViewById(R.id.scale);
		mScale.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
				mImageView.startAnimation(animation);
			}
		});
		
		mAlpha = (Button) findViewById(R.id.alpha);
		mAlpha.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
				mImageView.startAnimation(animation);
			}
		});
		
		mRotate = (Button) findViewById(R.id.rotate);
		mRotate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
				mImageView.startAnimation(animation);
			}
		});
		
		mTranslate = (Button) findViewById(R.id.translate);
		mTranslate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
				mImageView.startAnimation(animation);
			}
		});
	}

	
}
