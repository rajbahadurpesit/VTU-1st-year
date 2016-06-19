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


public class Sem5labsub extends ActionBarActivity {
    ListView listview;
    int value1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5labsub);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        Intent intenttwo = getIntent();
        value1 = intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value1);

        listview = (ListView) findViewById(R.id.branch);
        if(value1==20) {
            String[] values = new String[]{"Syllabus", "1.Student", "2.Airline Flight", "3.Student Enrollment", "4.Book Dealer", "5.Banking Enterprise"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int iteamposition = position;
                    String itemValue = (String) listview.getItemAtPosition(position);

                    if (iteamposition == 0) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 50);
                        startActivity(i);
                        // setContentView(R.layout.activity_about);
                    }
                    if (iteamposition == 1) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 51);
                        startActivity(i);
                    }
                    if (iteamposition == 2) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 52);
                        startActivity(i);
                    }
                    if (iteamposition == 3) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 53);
                        startActivity(i);
                    }
                    if (iteamposition == 4) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 54);
                        startActivity(i);
                    }
                    if (iteamposition == 5) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 55);
                        startActivity(i);
                    }
                }
            });
        }

        if(value1==21) {
            String[] values = new String[]{"Syllabus", "1a.Word Count", "1b.Comment Line", "2a.Identifiers","2b.Sentence Simple|Compund", "3.Identifiers"
            ,"4a.Arithmetic Expression","4b.Valid Variable","5a.Evaluate Expressions","5b.Strings","6.Grammer a^nb(n>=10)"
            ,"7a.Reverse Argument order","7b.Child Execute Command","8a.File Permission","8b.File Offset","9a.Recreate file","9b.Child Process"
            ,"10.Round-Robin Scheduling","11.Multi-threaded Program","12.Banker's Algorithm",""};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int iteamposition = position;
                    String itemValue = (String) listview.getItemAtPosition(position);

                    if (iteamposition == 0) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 56);
                        startActivity(i);
                        // setContentView(R.layout.activity_about);
                    }
                    if (iteamposition == 1) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 57);
                        startActivity(i);
                    }
                    if (iteamposition == 2) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 58);
                        startActivity(i);
                    }
                    if (iteamposition == 3) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 59);
                        startActivity(i);
                    }
                    if (iteamposition == 4) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 60);
                        startActivity(i);
                    }
                    if (iteamposition == 5) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 61);
                        startActivity(i);
                    }
                    if (iteamposition == 6) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 62);
                        startActivity(i);
                    }
                    if (iteamposition == 7) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 63);
                        startActivity(i);
                    }
                    if (iteamposition == 8) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 64);
                        startActivity(i);
                    }
                    if (iteamposition == 9) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 65);
                        startActivity(i);
                    }
                    if (iteamposition == 10) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 67);
                        startActivity(i);
                    }
                    if (iteamposition == 11) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 68);
                        startActivity(i);
                    }
                    if (iteamposition == 12) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 69);
                        startActivity(i);
                    }
                    if (iteamposition == 13) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 70);
                        startActivity(i);
                    }

                    if (iteamposition == 14) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 71);
                        startActivity(i);
                    }

                    if (iteamposition == 15) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 72);
                        startActivity(i);
                    }

                    if (iteamposition == 16) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 73);
                        startActivity(i);
                    }

                    if (iteamposition == 17) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 74);
                        startActivity(i);
                    }
                    if (iteamposition == 18) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 75);
                        startActivity(i);
                    }

                    if (iteamposition == 19) {
                        Intent i = new Intent(getApplicationContext(), Sem5labprog.class);
                        i.putExtra("flag", 76);
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sem5labsub, menu);
        return true;
    }

}
