package com.kuraps.aplikasiku;

import android.os.Bundle;
import android.text.InputType;
import android.util.Pair;
import android.app.Activity;
import android.app.ActivityOptions;
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

public class LoginActivity extends Activity {
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	EditText ed1,ed2;
	Button btn1;
	RelativeLayout rl1,rl2;
	ImageView img1;
	
	Animation anim1;
	AnimationDrawable animationDrawable;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
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
		ed1.setInputType(InputType.TYPE_NULL);
		ed1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent sharedLogin = new Intent(LoginActivity.this, LoginActivityShared.class);
				Pair[]pairs = new Pair[11];
				pairs[0] = new Pair<View, String>(img1,"1");
				pairs[1] = new Pair<View, String>(rl2,"2");
				pairs[2] = new Pair<View, String>(tv1,"3");
				pairs[3] = new Pair<View, String>(tv2,"4");
				pairs[4] = new Pair<View, String>(tv3,"5");
				pairs[5] = new Pair<View, String>(ed1,"6");
				pairs[6] = new Pair<View, String>(tv4,"7");
				pairs[7] = new Pair<View, String>(ed2,"8");
				pairs[8] = new Pair<View, String>(tv5,"9");
				pairs[9] = new Pair<View, String>(tv6,"10");
				pairs[10] = new Pair<View, String>(btn1,"11");
				ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, pairs);
				startActivity(sharedLogin, option.toBundle());
			}
		});
		
		tv5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent go = new Intent (LoginActivity.this, RegisterActivity.class);
				startActivity(go);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
