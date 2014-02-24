package com.babelbubble.followthatphone;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_activity);
		
//		getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		if (item.getItemId()==android.R.id.home) {
//			finish();
//		}
//		return super.onOptionsItemSelected(item);
//	}
	
}
