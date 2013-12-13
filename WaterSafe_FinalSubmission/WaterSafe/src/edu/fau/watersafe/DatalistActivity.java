package edu.fau.watersafe;

//public class DataList extends Activity {

	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.data_list, menu);
		return true;
	}

}*/

/**
 * This class  is used to define 
 * the constructor that would store the value of the variables
 * location,greenId,orangeId,advisory 
 * @author prakriti
 *
 */
public class DatalistActivity
{
	private String location;
	private int greenId;
	private int orangeId;
	private int advisory;
	
	
	/**
	 * The constructor DatalistActivity takes the following parameters of
	 * location,greenButtonId, orangeButtonId and advisory
	 * @param l 
	 * @param g
	 * @param o
	 * @param a
	 */


public  DatalistActivity(String l,int g,int o,int a)
{
	location=l;
	greenId=g;
	orangeId=o;
	advisory=a;
	
}
/**
 * This method gets the value of the variable,location
 * @return
 */
 public String getlocation()
 {
	 return location;
 }
  public int getGreen()
  {
	  return greenId;
  }
  public int getOrange()
  {
	   return orangeId;
  }
  public int getAdvisory()
  {
	   return advisory;
  }
  
}
