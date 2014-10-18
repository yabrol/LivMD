package com.example.livapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**Called when the user clicks the log in button */
	public void login(View view) {
		Intent intent = new Intent(this, SelectionActivity.class);
//		EditText userEditText = (EditText) findViewById(R.id.Name_edit);
//		EditText pinEditText = (EditText) findViewById(R.id.PIN_edit);
//		String usernameString = userEditText.toString();
//		Integer pinNumber = Integer.parseInt(pinEditText.toString());
//		intent.putExtra(USER_NAME, usernameString);
//		intent.putExtra(PIN_NUM, pinNumber.intValue());
//		startActivity(intent);
		
	}

}
