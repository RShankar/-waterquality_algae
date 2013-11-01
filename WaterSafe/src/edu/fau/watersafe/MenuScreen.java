package edu.fau.watersafe;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;




public class MenuScreen extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_screen);

		setupMessageButton();
		
		
	}

	
	//two buttons on bottom of screen
	private void setupMessageButton() {
		// TODO Auto-generated method stub
		Button messageButton = (Button) findViewById(R.id.button5);
		Button messageButton1 = (Button) findViewById(R.id.button6);

		messageButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				startActivity(new Intent(MenuScreen.this, MapScreen.class));
			}
		});

		messageButton1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				startActivity(new Intent(MenuScreen.this, LinksScreen.class));
			}
		});
		
	}
	
	

	public void onClick(View view) {
	}

	public void locationBtn(View view) {
		
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"This is the information regarding the location where the harmful bacteria of Entero is present in the water.Below is listed the details of each loaction.")
				.setNeutralButton("OK", null)
				.show();
	}

	public void enteroBtn(View view) {
		
		DialogInterface.OnClickListener heyListen= new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MenuScreen.this, InformationScreen.class));
				
			}
		};
		
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"Entero is a harmful bacteria found in water that causes disease to human beings when in contact with the bacteria .")
				.setPositiveButton("OK", null)
				.setNegativeButton("More Info", heyListen)
				.show();
	}

	public void geoBtn(View view) {
		
		
		DialogInterface.OnClickListener heyListen= new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MenuScreen.this, InformationScreen.class));
				
			}
		};
		
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"Entero is a harmful bacteria found in water that causes disease to human beings when in contact with the bacteria .")
				.setPositiveButton("OK", null)
				.setNegativeButton("More Info", heyListen)
				.show();
	}

	public void advisoryBtn(View view) {
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"This is the information regarding the location where the harmful bacteria of Entero is present in the water.Below is listed the details of each loaction.")
				.setNeutralButton("OK", null)
				.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_screen, menu);
		return true;
	}

	// Locations' onClick events
	public void onClick_SampleLocation1(View v) {
		startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	}

	public void onClick_SampleLocation2(View v) {
		startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	}

	public void onClick_SampleLocation3(View v) {
		startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	}

}
