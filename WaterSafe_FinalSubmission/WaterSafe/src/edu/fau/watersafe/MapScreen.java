package edu.fau.watersafe;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MapScreen extends Activity {

	private GoogleMap mMap;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// make full screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_map_screen);

		// create the map
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();

		// add every location (marker) to the map
		//  - assigns a lat and long, and an image for the pin
		final Marker jensenBeachCauswayEast = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.255850, -80.210549)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker jensenPublicBeach = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.255850, -80.197159)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker rooseveltBridge = mMap.addMarker(new MarkerOptions()
				.position(new LatLng(27.201587, -80.257973)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pinred)));
		final Marker stuartCauseway = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.208992, -80.187849)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker stuartPublicBeach = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.214984, -80.174367)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker bathtubPublicBeach = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.187128, -80.160248)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker hobeSoundWildlifeRefuge = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.089390, -80.126480)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));
		final Marker hobeSoundPublicBeach = mMap
				.addMarker(new MarkerOptions().position(
						new LatLng(27.066502, -80.115291)).icon(
						BitmapDescriptorFactory.fromResource(R.drawable.pingreen)));

		// pin listener
		mMap.setOnMarkerClickListener(new OnMarkerClickListener() {
			@Override
			public boolean onMarkerClick(Marker arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MapScreen.this, ReportScreen.class));

				return false;
			}
		});

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_screen, menu);
		return true;
	}

	
	/**
	 * Opens the Menu Screen. Not being used.
	 * @param v
	 */
	public void openMenuScreen(View v) {
		Intent openMenuScreen = new Intent(MapScreen.this, MenuScreen.class);
		startActivity(openMenuScreen);
	}

}
