package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;


public class VTU extends ActionBarActivity {
    private FragmentTabHost mTabHost;
    Intent i;
    int value;
    LinearLayout bwd;
    FrameLayout fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vtu);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }


        //     getSupportActionBar().setDisplayUseLogoEnabled(true);
        //  Intent i;

  //  bwd=(LinearLayout)findViewById(R.id.id1);
  //      bwd.setBackgroundColor(Color.parseColor("#ff212185"));

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

//    fm=(FrameLayout)view.findViewById(R.id.tabcontent);

        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
      //  mTabHost.getTabWidget().getLayoutParams().height = 80;

                mTabHost.getTabWidget().setBackgroundColor(Color.parseColor("#195f77"));


        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("CSE", null),
                SEM.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("ISE", null),
                SEM.class, null);

        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#ffffff"));
            tv.setTextSize(18);

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            default:
                return super.onOptionsItemSelected(item);

            case  R.id.about:
                Intent inte=new Intent(getApplicationContext(),About.class);
                startActivity(inte);
                return true;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vtu, menu);
        return true;
    }



}
