package com.example.helloworld;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btn1,btn2;
	private Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		context = this;
		
		btn1 = (Button) findViewById(R.id.button1); 
		btn2 = (Button) findViewById(R.id.button2);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(context, "Hello Supratim...!!!", Toast.LENGTH_LONG).show();
			}
		});
	}

}
