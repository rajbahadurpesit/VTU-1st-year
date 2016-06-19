package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;


public class JUNE_13 extends ActionBarActivity {

   Button rb;

    int value2=0;
    TextView mtxt1;
    InputStream ss1;
    ImageView img,img1;
    RelativeLayout bwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_june_13);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }


        bwd=(RelativeLayout)findViewById(R.id.bwd1);


        mtxt1 = (TextView) findViewById(R.id.rec2);

        int value2 = ((MyApplication) this.getApplication()).getSomeVariable();

      //  lb=(Button)findViewById(R.id.left);
        rb=(Button)findViewById(R.id.right);

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), JAN_13.class);
                //  intent.putExtra("flag",value3);
                startActivity(intent);

            }
        });

     /*   playButton = (Button) findViewById(R.id.play);
        stopButton = (Button) findViewById(R.id.stop);

        playButton.setVisibility(View.GONE);

        stopButton.setBackgroundColor(Color.TRANSPARENT);
       stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when play is clicked show stop button and hide play button
                bwd.setBackgroundColor(Color.parseColor("#ff181818"));
                mtxt1.setTextColor(Color.parseColor("#ffffff"));
                stopButton.setVisibility(View.GONE);
                playButton.setBackgroundColor(Color.TRANSPARENT);
                playButton.setVisibility(View.VISIBLE);



            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when play is clicked show stop button and hide play button
                playButton.setVisibility(View.GONE);
                stopButton.setVisibility(View.VISIBLE);

                bwd.setBackgroundColor(Color.parseColor("#ffffff"));
                mtxt1.setTextColor(Color.parseColor("#ff181818"));

            }
        });*/





        switch (value2) {


            case 30:
                try {
                    ss1 = getAssets().open("5thsem/DBMS/2DBMS_june(13).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 31:
                try {
                    ss1 = getAssets().open("5thsem/SE/SEJuly2013_12.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 32:
                try {
                    ss1 = getAssets().open("5thsem/CN/2CN_june(13).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 33:
                try {
                    ss1 = getAssets().open("5thsem/SS/2SS_june(13).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 34:
                try {
                    ss1 = getAssets().open("5thsem/OS/2OS_june(13).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            //7thsem

     /*       case 20:
                try {
                    ss1 = getAssets().open("7thsem/PTW/1PTW_DEC(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 21:
                try {
                    ss1 = getAssets().open("7thsem/ECS/1ECS_DEC(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 22:
                try {
                    ss1 = getAssets().open("7thsem/OOMD/1OOMD_DEC(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;*/
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
        getMenuInflater().inflate(R.menu.menu_june_13, menu);
        return true;
    }


}
