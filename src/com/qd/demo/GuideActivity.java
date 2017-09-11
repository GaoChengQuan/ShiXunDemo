package com.qd.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class GuideActivity extends Activity{
	private ViewPager mViewPager;
	//存放导航的4个页面
	private List<View> mViewList;

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
		
		
		
		
	}
}
