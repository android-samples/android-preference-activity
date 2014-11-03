package com.example.mypreferences;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.Toast;

public class SettingsActivity
	extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// XML設定
		addPreferencesFromResource(R.xml.pref);
		// 自前設定
		Preference p =
			findPreference("normal");
		Preference.OnPreferenceClickListener listener
		= new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// クリック時の処理
				Toast.makeText(
						SettingsActivity.this,
						"test",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		};
		p.setOnPreferenceClickListener(listener);
		
	}

}
