package simple.raj.com.vtuqpaper1;

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

import simple.raj.com.vtuqpaper.About;
import simple.raj.com.vtuqpaper.MyApplication;
import simple.raj.com.vtuqpaper.R;


public class Previous_year extends ActionBarActivity {
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
                        case 150:
                            CopyReadAssets1();
                            break;
                        case 151:
                            CopyReadAssets2();
                            break;
                        case 152:
                            CopyReadAssets3();
                            break;
                        case 153:
                            CopyReadAssets4();
                            break;
                        case 154:
                            CopyReadAssets5();
                            break;
                        case 155:
                            CopyReadAssets6();
                            break;
                        case 156:
                            CopyReadAssets40();
                            break;
                    }
                    // setContentView(R.layout.activity_about);
                }
                if (iteamposition == 1) {
                    switch (value2) {
                        case 150:
                            CopyReadAssets7();
                            break;
                        case 151:
                            CopyReadAssets8();
                            break;
                        case 152:
                            CopyReadAssets9();
                            break;
                        case 153:
                            CopyReadAssets10();
                            break;
                        case 154:
                            CopyReadAssets11();
                            break;
                        case 155:
                            CopyReadAssets12();
                            break;
                        case 156:
                            CopyReadAssets41();
                            break;
                    }
                }

                if (iteamposition == 2) {
                    switch (value2) {
                        case 150:
                            CopyReadAssets13();
                            break;
                        case 151:
                            CopyReadAssets14();
                            break;
                        case 152:
                            CopyReadAssets15();
                            break;
                        case 153:
                            CopyReadAssets16();
                            break;
                        case 154:
                            CopyReadAssets17();
                            break;
                        case 155:
                            CopyReadAssets18();
                            break;
                        case 156:
                            CopyReadAssets42();
                            break;
                    }
                }
                if (iteamposition == 3) {
                    switch (value2) {
                        case 150:
                            CopyReadAssets19();
                            break;
                        case 151:
                            CopyReadAssets20();
                            break;
                        case 152:
                            CopyReadAssets21();
                            break;
                        case 153:
                            CopyReadAssets22();
                            break;

                        case 155:
                            CopyReadAssets24();
                            break;
                        case 156:
                            CopyReadAssets43();
                            break;
                    }
                }
                if (iteamposition == 4) {
                    switch (value2) {
                        case 150:
                            CopyReadAssets25();
                            break;
                        case 151:
                            CopyReadAssets26();
                            break;
                        case 152:
                            CopyReadAssets27();
                            break;
                        case 153:
                            CopyReadAssets28();
                            break;
                        case 154:
                            CopyReadAssets29();
                            break;
                        case 155:
                            CopyReadAssets30();
                            break;
                        case 156:
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
        File file = new File(getFilesDir(), "DMS(D12).pdf");
        try {
            in = assetManager.open("3rdsem/DMS/DMS(D12).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DMS(D12).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "MATH(D12).pdf");
        try {
            in = assetManager.open("3rdsem/math/MATH(D12).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/MATH(D12).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets3() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "EC(D12).pdf");
        try {
            in = assetManager.open("3rdsem/EC/EC(D12).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/EC(D12).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "LD(D12).pdf");
        try {
            in = assetManager.open("3rdsem/LD/LD(D12).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/LD(D12).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets5() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "OOPC-D12.pdf");
        try {
            in = assetManager.open("3rdsem/OOPC/OOPC-D12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/OOPC-D12.pdf"), "application/pdf");
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
        File file = new File(getFilesDir(), "DMS(JUN13).pdf");
        try {
            in = assetManager.open("3rdsem/DMS/DMS(JUN13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DMS(JUN13).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets8() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "jUNE(13).pdf");
        try {
            in = assetManager.open("3rdsem/math/jUNE(13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/jUNE(13).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "EC(JUN13).pdf");
        try {
            in = assetManager.open("3rdsem/EC/EC(JUN13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/EC(JUN13).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets10() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "LD(JUN13).pdf");
        try {
            in = assetManager.open("3rdsem/LD/LD(JUN13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/LD(JUN13).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets11() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "oops(JUN13).pdf");
        try {
            in = assetManager.open("3rdsem/OOPS/oops(JUN13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/oops(JUN13).pdf"), "application/pdf");
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
        File file = new File(getFilesDir(), "dms(JAN14).pdf");
        try {
            in = assetManager.open("3rdsem/DMS/dms(JAN14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/dms(JAN14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets14() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mathdec(13).pdf");
        try {
            in = assetManager.open("3rdsem/math/mathdec(13).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mathdec(13).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets15() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ec(JAN14).pdf");
        try {
            in = assetManager.open("3rdsem/EC/ec(JAN14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ec(JAN14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets16() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "LD(JAN14)).pdf");
        try {
            in = assetManager.open("3rdsem/LD/LD(JAN14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/LD(JAN14).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets17() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "oop(JAN14).pdf");
        try {
            in = assetManager.open("3rdsem/OOPC/oop(JAN14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/oop(JAN14).pdf"), "application/pdf");
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
        File file = new File(getFilesDir(), "DMS(JUN14).pdf");
        try {
            in = assetManager.open("3rdsem/DMS/DMS(JUN14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DMS(JUN14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets20() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "jUNE(14).pdf");
        try {
            in = assetManager.open("3rdsem/math/jUNE(14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/jUNE(14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets21() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "EC(JUNE14).pdf");
        try {
            in = assetManager.open("3rdsem/EC/EC(JUNE14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/EC(JUNE14).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets22() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "LD(JUNE14).pdf");
        try {
            in = assetManager.open("3rdsem/LD/LD(JUNE14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/LD(JUNE14).pdf"), "application/pdf");
        startActivity(intent);
    }





    private void CopyReadAssets24() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "DS(jun14).pdf");
        try {
            in = assetManager.open("3rdsem/DS/DS(jun14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/DS(jun14).pdf"), "application/pdf");
        startActivity(intent);
    }



    private void CopyReadAssets25() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "dMS(JAN15).pdf");
        try {
            in = assetManager.open("3rdsem/DMS/dMS(JAN15).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/dMS(JAN15).pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets26() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "math(dec14).pdf");
        try {
            in = assetManager.open("3rdsem/math/math(dec14).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/math(dec14).pdf"), "application/pdf");
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
        File file = new File(getFilesDir(), "LD(jAN15)).pdf");
        try {
            in = assetManager.open("3rdsem/LD/LD(jAN15).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/LD(jAN15).pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets29() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "oops(JAN15).pdf");
        try {
            in = assetManager.open("3rdsem/OOPC/oops(JAN15).pdf");
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
                Uri.parse("file://" + getFilesDir() + "/oops(JAN15).pdf"), "application/pdf");
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