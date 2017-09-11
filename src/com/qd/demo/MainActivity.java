package com.qd.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
	private ImageView mImageView;
	private Button mScale;
	private Button mAlpha;
	private Button mRotate;
	private Button mTranslate;
	private Button mContinue;
	

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
		
		mContinue = (Button) findViewById(R.id.continue1);
		mContinue.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
				final Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
				//先给图片设置translate动画
				mImageView.startAnimation(animation1);
			    //设置动画的监听事件
				animation1.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation arg0) {
						//translate动画结束之后设置旋转动画
						mImageView.startAnimation(animation2);
					}
				});
			}
		});
	}

	
}
