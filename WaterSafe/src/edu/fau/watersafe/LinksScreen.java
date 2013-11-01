package edu.fau.watersafe;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class LinksScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_links_screen);
		
		TextView textView =(TextView)findViewById(R.id.Link1);
		textView.setClickable(true);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://www.floridahealth.gov/healthy-environments/beach-water-quality" +
				"/county-detail.html?County=Martin&Zip=34994-5060'> Martin County Beach Water Quality </a>";
		textView.setText(Html.fromHtml(text));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.links_screen, menu);
		return true;
	}

}
