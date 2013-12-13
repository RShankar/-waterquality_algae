package edu.fau.watersafe;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

public class SplashScreen extends Activity {

	VideoView vVideo;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//make full screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_splash_screen);

		// splash code
		vVideo = new VideoView(this);

		setContentView(vVideo);
		Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
				+ R.raw.splashmovie);
		vVideo.setVideoURI(video);

		vVideo.setOnCompletionListener(new OnCompletionListener() {

			//waits for video to end, then opens the menu screen
			public void onCompletion(MediaPlayer mp) {
				Intent openMenuScreen = new Intent(SplashScreen.this,
						MenuScreen.class);
				
				startActivity(openMenuScreen);
				finish();
			}

		});
		vVideo.start();
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}
	

}
