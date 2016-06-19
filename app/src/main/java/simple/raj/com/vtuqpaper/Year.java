package simple.raj.com.vtuqpaper;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Year extends ActionBarActivity {
    ListView listview;
    InputStream in;
    OutputStream out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
     //   getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final int value2 = ((MyApplication) this.getApplication()).getSomeVariable();



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }



        listview = (ListView) findViewById(R.id.year);
        String[] values = new String[]{"1.December(2012)","2.June-July(2013)","3.December(2013)","4.June-July(2014)","5.Jan(2015)"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout,R.id.label,values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);


                if(iteamposition==0 ){
                    switch(value2){
                        case 12:CopyReadAssets2();break;
                        case 11:CopyReadAssets4();break;
                        case 14:CopyReadAssets6();break;
                        case 15:CopyReadAssets10();break;
                        default:
                    Intent i = new Intent(getApplicationContext(),JAN_13.class);

                    startActivity(i);
                    break;}
                    // setContentView(R.layout.activity_about);
                }
                if(iteamposition==1){
                    switch(value2){
                        case 12:CopyReadAssets3();break;
                        case 11:CopyReadAssets5();break;
                        case 14:CopyReadAssets7();break;
                        case 13:CopyReadAssets8();break;
                        case 10:CopyReadAssets9();break;
                        case 15:CopyReadAssets11();break;
                        default:
                        Intent i = new Intent(getApplicationContext(),JUNE_13.class);

                          startActivity(i);
                            break;}
                }

                if(iteamposition==2){
                    switch(value2){
                        case 12:CopyReadAssets1();break;
                        case 15:CopyReadAssets12();break;
                        case 33:CopyReadAssets62();break;
                        case 34:CopyReadAssets64();break;
                        case 30:CopyReadAssets65();break;

                    default:
                    Intent i = new Intent(getApplicationContext(),JAN_14.class);

                    startActivity(i);
                        break;
                    }
                }
                if(iteamposition==3){
                    switch(value2) {
                        case 15:
                            CopyReadAssets13();
                            break;
                        case 31:
                            CopyReadAssets60();
                            break;

                        default:

                            Intent i = new Intent(getApplicationContext(), JUNE_14.class);
                            startActivity(i);
                            break;
                    }
                }
                if(iteamposition==4){

                    switch(value2) {
                        case 15:
                            CopyReadAssets14();
                            break;
                        case 31:
                            CopyReadAssets61();
                            break;
                        case 33:CopyReadAssets63();break;

                        default:
                        Intent i = new Intent(getApplicationContext(), JAN_15.class);

                        startActivity(i);
                        break;
                    }
                }
            }
        });


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    //    int value2 = ((MyApplication) this.getApplication()).getSomeVariable();



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
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
        getMenuInflater().inflate(R.menu.menu_year, menu);
        return true;
    }


    private void CopyReadAssets1()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "acajan14.pdf");
        try
        {
            in = assetManager.open("7thsem/ACA/acajan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/acajan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ACA-D12.pdf");
        try
        {
            in = assetManager.open("7thsem/ACA/ACA-D12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ACA-D12.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets3()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "acajun13.pdf");
        try
        {
            in = assetManager.open("7thsem/ACA/acajun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/acajun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ECS-D12.pdf");
        try
        {
            in = assetManager.open("7thsem/ECS/ECS-D12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ECS-D12.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets5()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ECS.pdf");
        try
        {
            in = assetManager.open("7thsem/ECS/ECS.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ECS.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets6()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "JAVA-D12.pdf");
        try
        {
            in = assetManager.open("7thsem/JAVA/JAVA-D12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/JAVA-D12.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets7()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "JAVA-M13.pdf");
        try
        {
            in = assetManager.open("7thsem/JAVA/JAVA-M13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/JAVA-M13.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets8()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "OOMD-M13.pdf");
        try
        {
            in = assetManager.open("7thsem/OOMD/OOMD-M13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/OOMD-M13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "PW-M13.pdf");
        try
        {
            in = assetManager.open("7thsem/PTW/PW-M13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/PW-M13.pdf"), "application/pdf");
        startActivity(intent);
    }



    private void CopyReadAssets10()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DM-D12.pdf");
        try
        {
            in = assetManager.open("7thsem/DM/DM-D12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DM-D12.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets13()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DM-D11.pdf");
        try
        {
            in = assetManager.open("7thsem/DM/DM-D11.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DM-D11.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets12()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "dwdmjan14.pdf");
        try
        {
            in = assetManager.open("7thsem/DM/dwdmjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/dwdmjan14.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets11()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DM-M13.pdf");
        try
        {
            in = assetManager.open("7thsem/DM/DM-M13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DM-M13.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets14()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "jun10.pdf");
        try
        {
            in = assetManager.open("7thsem/DM/jun10.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/jun10.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets60()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "SE-M14.pdf");
        try
        {
            in = assetManager.open("5thsem/SE/SE-M14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/SE-M14.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets61()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sejan15.pdf");
        try
        {
            in = assetManager.open("5thsem/SE/sejan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sejan15.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets62()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ss.pdf");
        try
        {
            in = assetManager.open("5thsem/SS/ss.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ss.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets63()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ssjan15.pdf");
        try
        {
            in = assetManager.open("5thsem/SS/ssjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ssjan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets64()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "osjan14.pdf");
        try
        {
            in = assetManager.open("5thsem/OS/osjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/osjan14.pdf"), "application/pdf");
        startActivity(intent);
    }
    private void CopyReadAssets65()
    {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "dbjan14.pdf");
        try
        {
            in = assetManager.open("5thsem/DBMS/dbjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/dbjan14.pdf"), "application/pdf");
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


