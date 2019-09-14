package com.kuraps.aplikasiku;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegisterActivityDone extends Activity {

	TextView tv0,tv1,tv2;
	Button btn1;
	LinearLayout l1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_activity_done);
		Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/roboto_regular.ttf");
		Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_bold.ttf");
		tv0=(TextView)findViewById(R.id.regist_tv0);
		tv1=(TextView)findViewById(R.id.regist_tv1);
		tv2=(TextView)findViewById(R.id.regist_tv2);

		btn1=(Button)findViewById(R.id.btn_done);
		l1=(LinearLayout)findViewById(R.id.regist_close);
		
		l1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		tv0.setTypeface(bold);
		tv1.setTypeface(bold);
		tv2.setTypeface(regular);
		btn1.setTypeface(bold);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register_activity_done, menu);
		return true;
	}

}
