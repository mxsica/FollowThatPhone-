package com.babelbubble.followthatphone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class SecondActivity extends Activity {
	
	WebView webview;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		
		webview = (WebView) findViewById(R.id.webView1);
		webview.loadUrl("http://itp.nyu.edu/itp/");
				
		
	}

	public void gotoThirdActivity(View v){
		Intent intent= new Intent(this, ThirdActivity.class);
		startActivity(intent);
		
	}
	
}
