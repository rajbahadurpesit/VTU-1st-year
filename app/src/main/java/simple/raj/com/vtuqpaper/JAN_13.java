package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;


public class JAN_13 extends ActionBarActivity {

    Button lb,rb;

    int value1 = 0,value2=0;
    TextView mtxt1;
    InputStream ss;
    ImageView img,img1;
    RelativeLayout bwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan_13);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        bwd=(RelativeLayout)findViewById(R.id.bwd);
        mtxt1 = (TextView) findViewById(R.id.rec1);


//        lb=(Button)findViewById(R.id.left);
  //      rb=(Button)findViewById(R.id.right);



        int value2 = ((MyApplication) this.getApplication()).getSomeVariable();





        switch (value2) {


            case 30:
                try {
                    ss = getAssets().open("5thsem/DBMS/1DBMS_Dec(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 31:
                try {
                    ss = getAssets().open("5thsem/SE/jan13");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 32:
                try {
                    ss = getAssets().open("5thsem/CN/1CN_Dec(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 33:
                try {
                    ss = getAssets().open("5thsem/SS/1SS_Dec(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 34:
                try {
                    ss = getAssets().open("5thsem/OS/1OS_Dec(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
           /* case 15:
                try {
                    ss = getAssets().open("5thsem/CN/1CN_Dec(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;*/
            //7thsem

            case 10:
                try {
                    ss = getAssets().open("7thsem/PTW/1PTW_DEC(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
         /*   case 11:
                try {
                    ss = getAssets().open("7thsem/ECS/1ECS_DEC(12).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;*/
            case 13:
                try {
                    ss = getAssets().open("7thsem/OOMD/1OOMD_DEC(12).txt");
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

            int size = ss.available();
            byte[] buffer = new byte[size];
            ss.read(buffer);
            ss.close();
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
        getMenuInflater().inflate(R.menu.menu_jan_13, menu);
        return true;
    }


}
