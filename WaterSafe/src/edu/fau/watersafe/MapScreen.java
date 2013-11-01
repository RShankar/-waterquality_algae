package edu.fau.watersafe;

import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MapScreen extends Activity {

	MapView mMapView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);

		mMapView = new MapView(this);

		// Retrieve the map and initial extent from XML layout
				mMapView = (MapView)findViewById(R.id.map);
				// Add dynamic layer to MapView
				mMapView.addLayer(new ArcGISTiledMapServiceLayer("" +
				"http://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer")); 

    }

	@Override
	protected void onDestroy() {
		super.onDestroy();
 }
	@Override
	protected void onPause() {
		super.onPause();
		//mMapView.pause();
 }
	@Override
	protected void onResume() {
		super.onResume();
		//mMapView.unpause();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_screen, menu);
		return true;
	}
	
	public void openMenuScreen(View v){
		Intent openMenuScreen = new Intent (MapScreen.this, MenuScreen.class);
		startActivity(openMenuScreen);
	}

}
