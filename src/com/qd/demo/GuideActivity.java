package com.qd.demo;

import java.util.ArrayList;
import java.util.List;

import com.qd.demo.adapter.ViewPagerAdapter;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;

public class GuideActivity extends Activity implements OnPageChangeListener{
	private ViewPager mViewPager;
	private ViewPagerAdapter mAdapter;
	//存放导航的4个页面
	private List<View> mViewList;
	private ImageView mStart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
		
		mViewPager = (ViewPager) findViewById(R.id.viewPager);
		
		mViewList = new ArrayList<>();
		LayoutInflater inflater = LayoutInflater.from(this);
		mViewList.add(inflater.inflate(R.layout.activity_guide_one, null));
		mViewList.add(inflater.inflate(R.layout.activity_guide_two, null));
		mViewList.add(inflater.inflate(R.layout.activity_guide_three, null));
		mViewList.add(inflater.inflate(R.layout.activity_guide_four, null));
		
		mAdapter = new ViewPagerAdapter(mViewList);
		//将ViewPager和Adapter进行关联
		mViewPager.setAdapter(mAdapter);
		
		mViewPager.setOnPageChangeListener(this);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int pos) {
		if (pos == mViewList.size() - 1) {
			mStart = (ImageView) findViewById(R.id.start);
			mStart.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					//1.把Preference里面isFirstRun=false
					SharedPreferences preferences = getSharedPreferences("shixun", MODE_PRIVATE);
					Editor editor = preferences.edit();
					editor.putBoolean("isFirstRun", false);
					editor.commit();
					//2.调转到主页MainActivity
					Intent intent = new Intent(GuideActivity.this,MainActivity.class);
					startActivity(intent);
					finish();
				}
			});
		}
	}
}
