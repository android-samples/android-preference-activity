package com.example.mypreferences;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

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

	@Override
	public boolean onOptionsItemSelected(
			MenuItem item) {
		int id = item.getItemId();
		if(id == R.id.action_settings){
			Intent intent = new Intent(this,
				SettingsActivity.class);
			startActivity(intent);
		}
		return false;
	}

	public void buttonMethod(View button){
		SharedPreferences pref;
		pref = PreferenceManager.
				getDefaultSharedPreferences(this);
		// チェックボックス
		boolean b = pref.getBoolean(
				"check", false);
		TextView textView = (TextView)
				findViewById(R.id.textView1);
		textView.setText(b ? "○" : "×");
		// テキスト
		String s = pref.getString("text", "");
		TextView textView2 = (TextView)
				findViewById(R.id.textView2);
		textView2.setText(s);
		// テキスト
		s = pref.getString("list", "");
		TextView textView3 = (TextView)
				findViewById(R.id.TextView3);
		textView3.setText(s);
		
	}
	
	
	
	

}
