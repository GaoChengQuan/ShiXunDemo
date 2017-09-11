package com.qd.demo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{
	//调转到主页
	private static final int GO_MAIN = 0;
	//跳转到引导页
	private static final int GO_GUIDE = 1;
	
	//延迟处理的Handler
	private Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case GO_MAIN://延迟3秒后跳转到主页
				System.out.println("GO_MAIN");
				Intent intent1 = new Intent(SplashActivity.this, MainActivity.class);
				startActivity(intent1);
				finish();
				break;
			case GO_GUIDE://延迟3秒后跳转到引导页
				System.out.println("GO_GUIDE");
				Intent intent2 = new Intent(SplashActivity.this, GuideActivity.class);
				startActivity(intent2);
				finish();
				break;
			default:
				break;
			}
		};
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		init();
	}

	private void init() {
		SharedPreferences preferences = getSharedPreferences("shixun", MODE_PRIVATE);
		//isFirstRun=true表示程序第一次运行
		boolean isFirstRun = preferences.getBoolean("isFirstRun", true);
		if (isFirstRun) {//如果是第一次运行,跳转到引导页
			mHandler.sendEmptyMessageDelayed(GO_GUIDE, 3000);
		} else {//如果不是第一次运行，跳转到主页
			mHandler.sendEmptyMessageDelayed(GO_MAIN, 3000);
		}
	}
	
}
