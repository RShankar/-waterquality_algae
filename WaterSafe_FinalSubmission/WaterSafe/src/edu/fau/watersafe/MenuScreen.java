package edu.fau.watersafe;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

//Method used to create a list of items
public class MenuScreen extends Activity implements View.OnClickListener {
	private List<DatalistActivity> data = new ArrayList<DatalistActivity>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//make full screen
				requestWindowFeature(Window.FEATURE_NO_TITLE);
				getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.activity_menu_screen);
		
		 
		 populatedatalist();
	        populatelistview();
	        clickItem();

		setupMessageButton();  //Method for alert Box
	}
	private void clickItem() {
		// TODO Auto-generated method stub
		
		ListView list = (ListView) findViewById(R.id.Listview);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MenuScreen.this, ReportScreen.class);
				MenuScreen.this.startActivity(i);
			}
		});
		
	}
	/**
	 * This method is used to 
	 * populate the ListView
	 */
	private void populatedatalist() 
	  {
			data.add(new DatalistActivity("Bath Tub Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Hobe Sound Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Hobe Sound Wildlife Refugee",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Jensen Beach Causeway East",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Jensen Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Roosevelt Beach",R.drawable.green,R.drawable.green,R.drawable.red));
			data.add(new DatalistActivity("Stuart Causeway",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Stuart Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("BathTub Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
			data.add(new DatalistActivity("Hobe Sound Public Beach",R.drawable.green,R.drawable.green,R.drawable.green));
		}
	
	private void populatelistview() {
		// TODO Auto-generated method stub
	ArrayAdapter<DatalistActivity> adapter=new MyListAdapter();
	ListView list=(ListView) findViewById(R.id.Listview);
	list.setAdapter(adapter);
	}
	private class MyListAdapter extends ArrayAdapter<DatalistActivity>
	{
		public MyListAdapter()
		{
			super(MenuScreen.this,R.layout.activity_datalist,data);
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View itemview=convertView;
			if(itemview==null){
				itemview=getLayoutInflater().inflate(R.layout.activity_datalist,parent,false);
			}
			DatalistActivity currentdata=data.get(position);
			
			TextView loctext=(TextView) itemview.findViewById(R.id.textView1);
			loctext.setText(currentdata.getlocation());
			
			ImageView imageview=(ImageView)itemview.findViewById(R.id.imageView1);
			imageview.setImageResource(currentdata.getGreen());
			
			ImageView imageview2=(ImageView)itemview.findViewById(R.id.imageView2);
			imageview.setImageResource(currentdata.getGreen());
			
			ImageView imageview3=(ImageView) itemview.findViewById(R.id.imageView3);
			imageview3.setImageResource(currentdata.getAdvisory());
			
			
			
			return itemview;
	}
	}
	

	private void setupMessageButton() {
		// TODO Auto-generated method stub
		Button messageButton = (Button) findViewById(R.id.button5);
		Button messageButton1 = (Button) findViewById(R.id.button6);

		messageButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub

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
    /**
     * This method is used to call the AlertDialog 
     * which pops up an alert box when locationBtn is clicked.
     * @param view
     */
	public void locationBtn(View view) {
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"This is the information regarding the location where the harmful bacteria of Entero is present in the water.Below is listed the details of each loaction.")
				.setNeutralButton("OK", null).show();
	}
    /**
     * This method demonstrates the display of alert box 
     * with two buttons, calling the methods
     * setPositiveButton & setNegativeButton
     * @param view
     */
	public void enteroBtn(View view) {
DialogInterface.OnClickListener enteroBtn_info= new DialogInterface.OnClickListener() {
			
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
				.setNegativeButton("More Info", enteroBtn_info).show();
	
	}

	public void egeoBtn(View view) {
DialogInterface.OnClickListener egeoBtn_info= new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MenuScreen.this, InformationScreen.class));
			}
};
		
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"The geometric mean is the number calculated from five weeks of beach sample results, including any resampling that has taken place. As a result, it is an indication of average water quality conditions over that time period at that particular location.")
				.setPositiveButton("OK", null)
				.setNegativeButton("More Info", egeoBtn_info).show();
	}

	public void advisoryBtn(View view) {
		new AlertDialog.Builder(this)
				.setTitle("Information")
				.setMessage(
						"\r\nHigh Bacteria Levels"+

"\r\n \r\nDue to high levels of enteric bacteria, residents are urged to avoid contact with the water in and immediately around the locations that have a red advisory symbol associated with them in the table."+

"\r\n \r\nHealth risks include upset stomach, diarrhea, eye irritation and skin rashes.")
				.setNeutralButton("OK", null).show();
	}
	
	public void buttonClicked_news(View v)
	{
		Intent intent = new Intent(MenuScreen.this,LinksScreen.class );
		MenuScreen.this.startActivity(intent);
	}
	
	public void buttonClicked_map(View v)
	{
		Intent intent = new Intent(MenuScreen.this, MapScreen.class );
		MenuScreen.this.startActivity(intent);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_screen, menu);
		return true;
	}

	// Locations' onClick events
	
	
	//public void onListItemClick_SampleLocation1(ListView lv, View v, int position, long id ) {
		//startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	//}

	//public void onClick_SampleLocation2(View v) {
		//startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	//}

	//public void onClick_SampleLocation3(View v) {
		//startActivity(new Intent(MenuScreen.this, ReportScreen.class));
	//}

}
