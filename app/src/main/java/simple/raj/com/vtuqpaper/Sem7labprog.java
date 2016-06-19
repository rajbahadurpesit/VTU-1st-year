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


public class Sem7labprog extends ActionBarActivity {


    RelativeLayout bwd;

    int value2=0;
    TextView mtxt1;
    InputStream ss1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7labprog);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimary));
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bwd=(RelativeLayout)findViewById(R.id.bwd1);
        mtxt1 = (TextView) findViewById(R.id.rec2);
        Intent intenttwo = getIntent();
        value2= intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value2);



        switch (value2) {


            case 80:
                try {
                    ss1 = getAssets().open("7thlab/CN/syllabus");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 82:
                try {
                    ss1 = getAssets().open("7thlab/CN/2");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 83:
                try {
                    ss1 = getAssets().open("7thlab/CN/3");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 84:
                try {
                    ss1 = getAssets().open("7thlab/CN/4");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            loadDataFromAsset();
            break;

            case 85:
                try {
                    ss1 = getAssets().open("7thlab/CN/5");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 86:
                try {
                    ss1 = getAssets().open("7thlab/CN/6");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 150:
                try {
                    ss1 = getAssets().open("7thlab/CN/7");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 151:
                try {
                    ss1 = getAssets().open("7thlab/CN/8");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 152:
                try {
                    ss1 = getAssets().open("7thlab/CN/9");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 153:
                try {
                    ss1 = getAssets().open("7thlab/CN/10");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 154:
                try {
                    ss1 = getAssets().open("7thlab/CN/11");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 155:
                try {
                    ss1 = getAssets().open("7thlab/CN/12");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            //Web lab

            case 87:
                try {
                    ss1 = getAssets().open("7thlab/WEB/syllabus");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 88:
                try {
                    ss1 = getAssets().open("7thlab/WEB/1");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 89:
                try {
                    ss1 = getAssets().open("7thlab/WEB/2");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 90:
                try {
                    ss1 = getAssets().open("7thlab/WEB/3");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 91:
                try {
                    ss1 = getAssets().open("7thlab/WEB/4");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 92:
                try {
                    ss1 = getAssets().open("7thlab/WEB/5");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 93:
                try {
                    ss1 = getAssets().open("7thlab/WEB/6");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 94:
                try {
                    ss1 = getAssets().open("7thlab/WEB/7");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 95:
                try {
                    ss1 = getAssets().open("7thlab/WEB/8");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 96:
                try {
                    ss1 = getAssets().open("7thlab/WEB/9");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 97:
                try {
                    ss1 = getAssets().open("7thlab/WEB/10");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 98:
                try {
                    ss1 = getAssets().open("7thlab/WEB/11");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 99:
                try {
                    ss1 = getAssets().open("7thlab/WEB/12");
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sem7labprog, menu);
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


}
