package edu.fau.watersafe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class LinksScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//make full screen
				requestWindowFeature(Window.FEATURE_NO_TITLE);
				getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.activity_links_screen);
		
		//setup links: assign a Hyper Text Name and a URL
		TextView link1 =(TextView)findViewById(R.id.Link2);
		link1.setClickable(true);
		link1.setMovementMethod(LinkMovementMethod.getInstance());
		String text1 = "<a href='http://www.floridahealth.gov/healthy-environments/beach-water-quality" +
				"/county-detail.html?County=Martin&Zip=34994-5060'> Water Samples </a>";
		link1.setText(Html.fromHtml(text1));
		
		TextView link2 =(TextView)findViewById(R.id.Link3);
		link2.setClickable(true);
		link2.setMovementMethod(LinkMovementMethod.getInstance());
		String text2 = "<a href='https://www.google.com/search?q=google+news&oq=google+news&aqs=chrome..69i57j0l2j69i65j69i60l2.1364j0j7&sourceid=chrome&espv=210&es_sm=93&ie=UTF-8#es_sm=93&espv=210&q=Martin+County+rivers+and+beaches&tbm=nws" +
				"'> Martin County News </a>";
		link2.setText(Html.fromHtml(text2));
		
		TextView link3 =(TextView)findViewById(R.id.Link4);
		link3.setClickable(true);
		link3.setMovementMethod(LinkMovementMethod.getInstance());
		String text3 = "<a href='https://www.google.com/search?q=google+news&oq=google+news&aqs=chrome..69i57j0l2j69i65j69i60l2.1364j0j7&sourceid=chrome&espv=210&es_sm=93&ie=UTF-8#es_sm=93&espv=210&q=Indian+River+florida&tbm=nws" +
				"'> Indian River News </a>";
		link3.setText(Html.fromHtml(text3));
		
		TextView link4 =(TextView)findViewById(R.id.Link5);
		link4.setClickable(true);
		link4.setMovementMethod(LinkMovementMethod.getInstance());
		String text4 = "<a href='https://www.google.com/search?q=google+news&oq=google+news&aqs=chrome..69i57j0l2j69i65j69i60l2.1364j0j7&sourceid=chrome&espv=210&es_sm=93&ie=UTF-8#es_sm=93&espv=210&q=St+lucie+river+florida&tbm=nws" +
				"'> St. Lucie River News</a>";
		link4.setText(Html.fromHtml(text4));
		
		TextView link5 =(TextView)findViewById(R.id.Link1);
		link5.setClickable(true);
		link5.setMovementMethod(LinkMovementMethod.getInstance());
		String text5 = "<a href='https://www.google.com/search?q=google+news&oq=google+news&aqs=chrome..69i57j0l2j69i65j69i60l2.1364j0j7&sourceid=chrome&espv=210&es_sm=93&ie=UTF-8#es_sm=93&espv=210&q=Florida+swimming+advisories&tbm=nws" +
				"'> Florida Swimming Advisories </a>";
		link5.setText(Html.fromHtml(text5));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.links_screen, menu);
		return true;
	}
	
	public void menu_back(View v)
	{
		Intent intent = new Intent(LinksScreen.this,MenuScreen.class );
		LinksScreen.this.startActivity(intent);
	}

}
