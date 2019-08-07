package com.kuraps.aplikasiku;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends Activity {
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	EditText ed1,ed2;
	Button btn1;
	RelativeLayout rl1,rl2;
	
	Animation anim1;
	AnimationDrawable animationDrawable;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
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
		
		anim1 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
		rl1.setBackgroundResource(R.drawable.login_gradient_animation);
		animationDrawable = (AnimationDrawable)rl1.getBackground();
		animationDrawable.setEnterFadeDuration(3500);
		animationDrawable.setExitFadeDuration(3500);
		animationDrawable.start();
		
		rl2.startAnimation(anim1);
		
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
