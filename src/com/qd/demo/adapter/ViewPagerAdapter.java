package com.qd.demo.adapter;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerAdapter extends PagerAdapter{
	private List<View> mViewList;
	
	public ViewPagerAdapter(List<View> list){
		mViewList = list;
	}

	//返回当前页面的个数
	@Override
	public int getCount() {
		return mViewList.size();
	}

	//判断对象是否生成界面
	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == object;
	}

	//初始化position指定位置的界面
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(mViewList.get(position));
		return mViewList.get(position);
	}
	
	//移除一定position的界面
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(mViewList.get(position));
	}
	
}
