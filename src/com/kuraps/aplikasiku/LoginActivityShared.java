package com.kuraps.aplikasiku;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivityShared extends Activity {

	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	EditText ed1,ed2;
	Button btn1;
	RelativeLayout rl1,rl2;
	ImageView img1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_activity_shared);	
		img1=(ImageView)findViewById(R.id.img_illu);
		tv1=(TextView)findViewById(R.id.tv1);
		tv2=(TextView)findViewById(R.id.tv2);
		tv3=(TextView)findViewById(R.id.tv3);
		tv4=(TextView)findViewById(R.id.tv4);
		tv5=(TextView)findViewById(R.id.tv5);
		tv6=(TextView)findViewById(R.id.tv6);
		ed1=(EditText)findViewById(R.id.ed1);
		ed2=(EditText)findViewById(R.id.ed2);
		btn1=(Button)findViewById(R.id.btn1);
		
		rl1=(RelativeLayout)findViewById(R.id.bg_gradient);
		rl2=(RelativeLayout)findViewById(R.id.sheet);
		
		Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/roboto_regular.ttf");
		Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_bold.ttf");
		
		tv1.setTypeface(bold);
		tv5.setTypeface(bold);
		ed1.setTypeface(bold);
		ed2.setTypeface(bold);
		btn1.setTypeface(bold);

		tv2.setTypeface(regular);
		tv3.setTypeface(regular);
		tv4.setTypeface(regular);
		tv6.setTypeface(regular);

		tv5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent go = new Intent (LoginActivityShared.this, RegisterActivity.class);
				startActivity(go);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_activity_shared, menu);
		return true;
	}

}
