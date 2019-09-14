package com.kuraps.aplikasiku;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegisterActivity extends Activity {
	TextView tv0,tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	EditText ed1,ed2,ed3;
	Button btn1;
	LinearLayout l1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);

		Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/roboto_regular.ttf");
		Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_bold.ttf");
		
		tv0=(TextView)findViewById(R.id.regist_tv0);
		tv1=(TextView)findViewById(R.id.regist_tv1);
		tv2=(TextView)findViewById(R.id.regist_tv2);
		tv3=(TextView)findViewById(R.id.regist_tv3);
		tv4=(TextView)findViewById(R.id.regist_tv4);
		tv5=(TextView)findViewById(R.id.regist_tv5);
		tv6=(TextView)findViewById(R.id.regist_tv6);
		tv7=(TextView)findViewById(R.id.regist_tv7);
		ed1=(EditText)findViewById(R.id.regist_ed1);
		ed2=(EditText)findViewById(R.id.regist_ed2);
		ed3=(EditText)findViewById(R.id.regist_ed3);
		btn1=(Button)findViewById(R.id.regist_btn);
		l1=(LinearLayout)findViewById(R.id.regist_close);
		
		tv0.setTypeface(bold);
		tv1.setTypeface(bold);
		tv2.setTypeface(regular);
		tv3.setTypeface(regular);
		tv4.setTypeface(regular);
		tv5.setTypeface(regular);
		tv6.setTypeface(bold);
		tv7.setTypeface(regular);
		btn1.setTypeface(bold);
		ed1.setTypeface(bold);
		ed2.setTypeface(bold);
		ed3.setTypeface(bold);
		l1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent go = new Intent(RegisterActivity.this, RegisterActivityDone.class);
				startActivity(go);
			}
		});
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
