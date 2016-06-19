package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Sem7labsub extends ActionBarActivity {

    ListView listview;
    int value1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7labsub);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }
        Intent intenttwo = getIntent();
        value1 = intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value1);

        listview = (ListView) findViewById(R.id.branch);
        if(value1==22) {
            String[] values = new String[]{"Syllabus", "1.Point to point", "2.4 Node Point to Point", "3.Ping Message", "4.Ethernet LAN(n nodes)", "5.Ethernet LAN(multiple traffic)"
            ,"6.ESS","7.CRC-CCIT","8.Distance-Vector","9.TCP/IP Socket","10.TCP/IP as FIFO/IPC/msgqueue","11.RSA","12.Leaky Bucket",""};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int iteamposition = position;
                    String itemValue = (String) listview.getItemAtPosition(position);

                    if (iteamposition == 0) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 80);
                        startActivity(i);
                        // setContentView(R.layout.activity_about);
                    }
                    if (iteamposition == 1) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 81);
                        startActivity(i);
                    }
                    if (iteamposition == 2) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 82);
                        startActivity(i);
                    }
                    if (iteamposition == 3) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 83);
                        startActivity(i);
                    }
                    if (iteamposition == 4) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 84);
                        startActivity(i);
                    }
                    if (iteamposition == 5) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 85);
                        startActivity(i);
                    }
                    if (iteamposition == 6) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 86);
                        startActivity(i);
                    }
                    if (iteamposition == 7) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 150);
                        startActivity(i);
                    }
                    if (iteamposition == 8) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 151);
                        startActivity(i);
                    }
                    if (iteamposition == 9) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 152);
                        startActivity(i);
                    }
                    if (iteamposition == 10) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 153);
                        startActivity(i);
                    }
                    if (iteamposition == 11) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 154);
                        startActivity(i);
                    }
                    if (iteamposition == 12) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 155);
                        startActivity(i);
                    }
                }
            });
        }

        if(value1==23) {
            String[] values = new String[]{"Syllabus","1.Fibonacci square","2.USN SEM","3.Stack Implementation","4.VTU XSLT sheet"
            ,"5.Server Info and Perl Program","6.User Name and Visitors","7.Digital Clock","8.MySQL","9.COOKIES","10.SESSION"
            ,"11.Address and E-mail in MySQL","12.Rails Application",""};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int iteamposition = position;
                    String itemValue = (String) listview.getItemAtPosition(position);

                    if (iteamposition == 0) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 87);
                        startActivity(i);
                        // setContentView(R.layout.activity_about);
                    }
                    if (iteamposition == 1) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 88);
                        startActivity(i);
                    }
                    if (iteamposition == 2) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 89);
                        startActivity(i);
                    }
                    if (iteamposition == 3) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 90);
                        startActivity(i);
                    }
                    if (iteamposition == 4) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 91);
                        startActivity(i);
                    }
                    if (iteamposition == 5) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 92);
                        startActivity(i);
                    }
                    if (iteamposition == 6) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 93);
                        startActivity(i);
                    }
                    if (iteamposition == 7) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 94);
                        startActivity(i);
                    }
                    if (iteamposition == 8) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 95);
                        startActivity(i);
                    }
                    if (iteamposition == 9) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 96);
                        startActivity(i);
                    }
                    if (iteamposition == 10) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 97);
                        startActivity(i);
                    }
                    if (iteamposition == 11) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 98);
                        startActivity(i);
                    }
                    if (iteamposition == 12) {
                        Intent i = new Intent(getApplicationContext(), Sem7labprog.class);
                        i.putExtra("flag", 99);
                        startActivity(i);
                    }





                }
            });
        }


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sem7labsub, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

            case  R.id.about:
                Intent inte=new Intent(getApplicationContext(),About.class);
                startActivity(inte);
                return true;
        }
    }

}
