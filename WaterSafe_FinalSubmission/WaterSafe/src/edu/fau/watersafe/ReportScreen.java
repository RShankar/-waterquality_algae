package edu.fau.watersafe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ReportScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//make full screen
				requestWindowFeature(Window.FEATURE_NO_TITLE);
				getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.activity_report_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.report_screen, menu);
		return true;
	}
	
	/**
	 * Called when Menu button clicked from Report screen
	 *  - Opens menu activity
	 * @param v
	 */
	public void reportmenu(View v)
	{
		Intent intent = new Intent(ReportScreen.this,MenuScreen.class );
		ReportScreen.this.startActivity(intent);
	}
	
	}


