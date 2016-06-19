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



public class Newyear extends ActionBarActivity {
    InputStream in;
    OutputStream out;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year2);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        final int value2 = ((MyApplication) this.getApplication()).getSomeVariable();

        listview = (ListView) findViewById(R.id.year1);
        String[] values = new String[]{"1.December(2012)", "2.June-July(2013)", "3.December(2013)", "4.June-July(2014)", "5.Jan(2015)"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    switch (value2) {
                        case 10:
                            CopyReadAssets1();
                            break;
                        case 11:
                            CopyReadAssets2();
                            break;
                        case 12:
                            CopyReadAssets3();
                            break;
                        case 13:
                            CopyReadAssets4();
                            break;
                        case 14:
                            CopyReadAssets5();
                            break;
                        case 15:
                            CopyReadAssets6();
                            break;
                        case 16:
                            CopyReadAssets40();
                            break;
                    }
                    // setContentView(R.layout.activity_about);
                }
                if (iteamposition == 1) {
                    switch (value2) {
                        case 10:
                            CopyReadAssets7();
                            break;
                        case 11:
                            CopyReadAssets8();
                            break;
                        case 12:
                            CopyReadAssets9();
                            break;
                        case 13:
                            CopyReadAssets10();
                            break;
                        case 14:
                            CopyReadAssets11();
                            break;
                        case 15:
                            CopyReadAssets12();
                            break;
                        case 16:
                            CopyReadAssets41();
                            break;
                    }
                }

                if (iteamposition == 2) {
                    switch (value2) {
                        case 10:
                            CopyReadAssets13();
                            break;
                        case 11:
                            CopyReadAssets14();
                            break;
                        case 12:
                            CopyReadAssets15();
                            break;
                        case 13:
                            CopyReadAssets16();
                            break;
                        case 14:
                            CopyReadAssets17();
                            break;
                        case 15:
                            CopyReadAssets18();
                            break;
                        case 16:
                            CopyReadAssets42();
                            break;
                    }
                }
                if (iteamposition == 3) {
                    switch (value2) {
                        case 10:
                            CopyReadAssets19();
                            break;
                        case 11:
                            CopyReadAssets20();
                            break;
                        case 12:
                            CopyReadAssets21();
                            break;
                        case 13:
                            CopyReadAssets22();
                            break;

                        case 14:
                            CopyReadAssets24();
                            break;
                        case 15:
                            CopyReadAssets43();
                            break;
                        case 16:
                            CopyReadAssets43();
                            break;
                    }
                }
                if (iteamposition == 4) {
                    switch (value2) {
                        case 10:
                            CopyReadAssets25();
                            break;
                        case 11:
                            CopyReadAssets26();
                            break;
                        case 12:
                            CopyReadAssets27();
                            break;
                        case 13:
                            CopyReadAssets28();
                            break;
                        case 14:
                            CopyReadAssets29();
                            break;
                        case 15:
                            CopyReadAssets30();
                            break;
                        case 16:
                            CopyReadAssets44();
                            break;
                    }

                }
            }
        });


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


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


    private void CopyReadAssets1() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ecjan13.pdf");
        try {
            in = assetManager.open("chemcycle/ec/ecjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ecjan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "chemjan13.pdf");
        try {
            in = assetManager.open("chemcycle/chemistry/chemjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/chemjan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets3() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "evsjan13.pdf");
        try {
            in = assetManager.open("chemcycle/env/evsjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/evsjan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "M1jan13.pdf");
        try {
            in = assetManager.open("chemcycle/m1/M1jan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/M1jan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets5() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "CCPrealjan13.pdf");
        try {
            in = assetManager.open("chemcycle/ccp/CCPrealjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/CCPrealjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets6() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DSC(D12).pdf");
        try {
            in = assetManager.open("3rdsem/DS/DSC(D12).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/DSC(D12).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets7() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ecjun13.pdf");
        try {
            in = assetManager.open("chemcycle/ec/ecjun13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ecjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets8() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "chemjune13.pdf");
        try {
            in = assetManager.open("chemcycle/chemistry/chemjune13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/chemjune13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "");
        try {
            in = assetManager.open("chemcycle/env/");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets10() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "M1jun13.pdf");
        try {
            in = assetManager.open("chemcycle/m1/M1jun13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/M1jun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets11() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "CCPjan13.pdf");
        try {
            in = assetManager.open("chemcycle/ccp/CCPjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/CCPjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets12() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DSC(JUL13).pdf");
        try {
            in = assetManager.open("3rdsem/DS/DSC(JUL13).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/DSC(JUL13).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets13() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ecjan14.pdf");
        try {
            in = assetManager.open("chemcycle/ec/ecjan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ecjan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets14() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "jan14.pdf");
        try {
            in = assetManager.open("chemcycle/chemistry/jan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/jan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets15() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "evsjan14.pdf");
        try {
            in = assetManager.open("chemcycle/env/evsjan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/evsjan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets16() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "M1jan14.pdf");
        try {
            in = assetManager.open("chemcycle/m1/M1jan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/M1jan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets17() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ccpjan14.pdf");
        try {
            in = assetManager.open("chemcycle/ccp/ccpjan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ccpjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets18() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ds(JAN14).pdf");
        try {
            in = assetManager.open("3rdsem/DS/ds(JAN14).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ds(JAN14).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets19() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ecjun14.pdf");
        try {
            in = assetManager.open("chemcycle/ec/ecjun14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ecjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets20() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "EC--M14.pdf");
        try {
            in = assetManager.open("chemcycle/chemistry/EC--M14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/EC--M14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets21() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "evsjun14.pdf");
        try {
            in = assetManager.open("chemcycle/env/evsjun14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/evsjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets22() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "M1jun14.pdf");
        try {
            in = assetManager.open("chemcycle/m1/M1jun14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/M1jun14.pdf"), "application/pdf");
        startActivity(intent);
    }





    private void CopyReadAssets24() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "jun2014.pdf");
        try {
            in = assetManager.open("chemcycle/ccp/jun2014.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/jun2014.pdf"), "application/pdf");
        startActivity(intent);
    }



    private void CopyReadAssets25() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ecjan15.pdf");
        try {
            in = assetManager.open("chemcycle/ec/ecjan15.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ecjan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets26() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "EC-D14.pdf");
        try {
            in = assetManager.open("chemcycle/chemistry/EC-D14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/EC-D14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets27() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "eC(DEC14).pdf");
        try {
            in = assetManager.open("3rdsem/EC/eC(DEC14).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/eC(DEC14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets28() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "M1jan15.pdf");
        try {
            in = assetManager.open("chemcycle/m1/M1jan15.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/M1jan15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets29() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ccpdec14.pdf");
        try {
            in = assetManager.open("chemcycle/ccp/ccpdec14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ccpdec14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets30() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ds(jaN15).pdf");
        try {
            in = assetManager.open("3rdsem/DS/ds(jaN15).pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/ds(jaN15).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets40() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "flatjan13.pdf");
        try {
            in = assetManager.open("5thsem/FLAT/flatjan13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/flatjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets41() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "flatjun13.pdf");
        try {
            in = assetManager.open("5thsem/FLAT/flatjun13.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/flatjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets42() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "flatjan14.pdf");
        try {
            in = assetManager.open("5thsem/FLAT/flatjan14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/flatjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets43() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "flatjun14.pdf");
        try {
            in = assetManager.open("5thsem/FLAT/flatjun14.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/flatjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets44() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "flatjan15.pdf");
        try {
            in = assetManager.open("5thsem/FLAT/flatjan15.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/flatjan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }


}