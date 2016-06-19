package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.IOException;
import java.io.InputStream;


public class Sem5labprog extends ActionBarActivity {


    RelativeLayout bwd;

    int value1 = 0,value2=0;
    TextView mtxt1;
    InputStream ss1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5labprog);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimary));
        }


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bwd=(RelativeLayout)findViewById(R.id.bwd1);
        mtxt1 = (TextView) findViewById(R.id.rec2);
        Intent intenttwo = getIntent();
        value2= intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value2);






        switch (value2) {


            case 50:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/syllabus");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 51:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/db1.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 52:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/db2.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 53:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/db3.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 54:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/db4.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 55:
                try {
                    ss1 = getAssets().open("5thlab/DBMS/db5.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            //SSOS lab

            case 56:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/syllabus.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 57:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/1awc.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 58:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/1bcomm.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 59:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/2a.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 60:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/2bsent.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 61:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/3id.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 62:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/4a");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 63:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/4b");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 64:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/5a");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 65:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/5b");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 67:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/6");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 68:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/7areverse.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 69:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/7b.c");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 70:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/8a.c");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 71:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/8bfile2.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 72:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/9abundle.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 73:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/9bchild.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 74:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/10sjrnrr.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 75:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/11fibo.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 76:
                try {
                    ss1 = getAssets().open("5thlab/SSOS/12banker.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


        }

    }



    public void loadDataFromAsset() {
        try {
            // InputStream is;

            // InputStream input = getAssets().open("CSE6/01_CN-2011-12.txt");

            int size = ss1.available();
            byte[] buffer = new byte[size];
            ss1.read(buffer);
            ss1.close();
            mtxt1.setText(new String(buffer));

        } catch (IOException ex) {
            return;
        }
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


            case R.id.playButton:

                bwd.setBackgroundColor(Color.parseColor("#ffffff"));
                mtxt1.setTextColor(Color.parseColor("#ff181818"));

                return true;


            case R.id.stopButton:

                bwd.setBackgroundColor(Color.parseColor("#ff181818"));
                mtxt1.setTextColor(Color.parseColor("#ffffff"));
                return true;

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sem5labprog, menu);
        return true;
    }



}
