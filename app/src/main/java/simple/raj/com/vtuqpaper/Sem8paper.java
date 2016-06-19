package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.InputStream;
import java.io.OutputStream;


public class Sem8paper extends ActionBarActivity {
    InputStream in;
    OutputStream out;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8paper);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }
        final int someVariable = ((MyApplication) this.getApplication()).getSomeVariable();

      //  final int value2 = ((MyApplication) this.getApplication()).getSomeVariable();
        listview = (ListView) findViewById(R.id.year1);
        String[] values = new String[]{"Software Architecture","System Modeling & Simulation","Information & Network Security","Software Testing","","","","",""};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                   // someVariable.setSomeVariable(10);
                    Intent i = new Intent(getApplicationContext(), Sem8year.class);
                   i.putExtra("flag", 10);
                    startActivity(i);

                    }
                    // setContentView(R.layout.activity_about);

                if (iteamposition == 1) {
                    //someVariable.setSomeVariable(11);
                    Intent i = new Intent(getApplicationContext(), Sem8year.class);
                     i.putExtra("flag", 11);
                    startActivity(i);

                }

                if (iteamposition == 2) {
                   // someVariable.setSomeVariable(12);
                    Intent i = new Intent(getApplicationContext(), Sem8year.class);
                     i.putExtra("flag", 12);
                    startActivity(i);

                }
                if (iteamposition == 3) {

                   // someVariable.setSomeVariable(13);
                    Intent i = new Intent(getApplicationContext(),Sem8year.class);
                     i.putExtra("flag", 13);
                    startActivity(i);
                }


                }
            });
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);


            case R.id.about:
                Intent inte = new Intent(getApplicationContext(), About.class);
                startActivity(inte);
                return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_previous_year, menu);
        return true;
    }






}