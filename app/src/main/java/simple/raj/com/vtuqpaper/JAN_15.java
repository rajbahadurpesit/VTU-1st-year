package simple.raj.com.vtuqpaper;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class JAN_15 extends ActionBarActivity {

    Button playButton,stopButton,lb,rb;
    InputStream in;
    OutputStream out;

    int value2=0;
    TextView mtxt1;
    InputStream ss1;
    ImageView img,img1;
    RelativeLayout bwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan_15);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        bwd=(RelativeLayout)findViewById(R.id.bwd1);
        mtxt1 = (TextView) findViewById(R.id.rec2);
       // img=(ImageView)findViewById(R.id.flat13);
       // img1=(ImageView)findViewById(R.id.nw1);

        int value2 = ((MyApplication) this.getApplication()).getSomeVariable();

       /*
        Intent intenttwo = getIntent();
        value2= intenttwo.getIntExtra("flag", 0);
        Log.d("flag value", "flagvalue= " + value2);*/
     //   lb=(Button)findViewById(R.id.left);
        rb=(Button)findViewById(R.id.right);


        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), JUNE_14.class);
                //  intent.putExtra("flag",value3);
                startActivity(intent);

            }
        });





        switch (value2) {

            case 500:CopyReadAssets1();
                    break;
            case 501:CopyReadAssets2();
                        break;
            case 10:
                try {
                    ss1 = getAssets().open("7thsem/PTW/5PTW_jan(15).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();

                break;
            case 11:
                try {
                    ss1 = getAssets().open("7thsem/ECS/jan15.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 12:
                try {
                    ss1 = getAssets().open("7thsem/ACA/jan15.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 13:
                try {
                    ss1 = getAssets().open("7thsem/OOMD/5OOMD_jan(15).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;
            case 14:
                try {
                    ss1 = getAssets().open("7thsem/JAVA/7java2");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            //5thsem

            case 30:
                try {
                    ss1 = getAssets().open("5thsem/DBMS/5DBMS_jan(15).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;


            case 32:
                try {
                    ss1 = getAssets().open("5thsem/CN/5CN_jan(15).txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadDataFromAsset();
                break;

            case 34:
                try {
                    ss1 = getAssets().open("5thsem/OS/5OS_jan(15).txt");
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
        getMenuInflater().inflate(R.menu.menu_jan_15, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.

              /*  Intent inte1=new Intent(getApplicationContext(),Year.class);
                startActivity(inte1);
                return true;*/

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




    private void CopyReadAssets1()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "dMS(JAN15).pdf");
        try
        {
            in = assetManager.open("3rdsem/DMS/dMS(JAN15).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/dMS(JAN15).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets2()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "math(dec14).pdf");
        try
        {
            in = assetManager.open("math(dec14).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/math(dec14).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }



}
