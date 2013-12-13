package edu.fau.watersafe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class InformationScreen extends Activity {

	TextView mView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// make full screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_information_screen);

		// make text scrollable
		mView = (TextView) findViewById(R.id.textInformation);
		mView.setMovementMethod(new ScrollingMovementMethod());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.information_screen, menu);
		return true;
	}

	/**
	 * This method executes the button click event of the button 'mainmenu'. The
	 * Intent calls the MenuScreen class from this button click event
	 * 
	 * @param v
	 */
	public void mainmenu(View v) {
		Intent intent = new Intent(InformationScreen.this, MenuScreen.class);
		InformationScreen.this.startActivity(intent);
	}

}
