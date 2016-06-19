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

import java.io.IOException;
import java.io.InputStream;


public class Sem3labprog extends ActionBarActivity {



    RelativeLayout bwd;

    int value1 = 0,value2=0;
    TextView mtxt1;
    InputStream ss1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3labprog);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bwd=(RelativeLayout)findViewById(R.id.bwd1);
        mtxt1 = (TextView) findViewById(R.id.rec2);
        Intent intenttwo = getIntent();
        value2= intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value2);



        switch (value2) {


            case 500:
                try {
                    ss1 = getAssets().open("Sem3lab/Syllabus");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 501:
                try {
                    ss1 = getAssets().open("Sem3lab/1");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 502:
                try {
                    ss1 = getAssets().open("Sem3lab/2");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 503:
                try {
                    ss1 = getAssets().open("Sem3lab/3");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 504:
                try {
                    ss1 = getAssets().open("Sem3lab/4");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 505:
                try {
                    ss1 = getAssets().open("Sem3lab/5");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;




            case 506:
                try {
                    ss1 = getAssets().open("Sem3lab/6");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 507:
                try {
                    ss1 = getAssets().open("Sem3lab/7");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 508:
                try {
                    ss1 = getAssets().open("Sem3lab/8");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 509:
                try {
                    ss1 = getAssets().open("Sem3lab/9");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 510:
                try {
                    ss1 = getAssets().open("Sem3lab/10");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 511:
                try {
                    ss1 = getAssets().open("Sem3lab/11");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 512:
                try {
                    ss1 = getAssets().open("Sem3lab/12");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 513:
                try {
                    ss1 = getAssets().open("Sem3lab/13");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 514:
                try {
                    ss1 = getAssets().open("Sem3lab/14");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;



           case 517:
                try {
                    ss1 = getAssets().open("Sem3lab/1ld");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 518:
                try {
                    ss1 = getAssets().open("Sem3lab/3ld");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 519:
                try {
                    ss1 = getAssets().open("Sem3lab/4ld");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 520:
                try {
                    ss1 = getAssets().open("Sem3lab/5ld");
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
