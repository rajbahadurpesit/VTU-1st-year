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



public class Pyear extends ActionBarActivity {
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
                        case 20:
                            CopyReadAssets1();
                            break;
                        case 21:
                            CopyReadAssets2();
                            break;
                        case 22:
                            CopyReadAssets3();
                            break;
                        case 23:
                            CopyReadAssets4();
                            break;
                        case 24:
                            CopyReadAssets5();
                            break;
                        case 25:
                            CopyReadAssets6();
                            break;
                        case 26:
                            CopyReadAssets40();
                            break;
                    }
                    // setContentView(R.layout.activity_about);
                }
                if (iteamposition == 1) {
                    switch (value2) {
                        case 20:
                            CopyReadAssets7();
                            break;
                        case 21:
                            CopyReadAssets8();
                            break;
                        case 22:
                            CopyReadAssets9();
                            break;
                        case 23:
                            CopyReadAssets10();
                            break;
                        case 24:
                            CopyReadAssets11();
                            break;
                        case 25:
                            CopyReadAssets12();
                            break;
                        case 26:
                            CopyReadAssets41();
                            break;
                    }
                }

                if (iteamposition == 2) {
                    switch (value2) {
                        case 20:
                            CopyReadAssets13();
                            break;
                        case 21:
                            CopyReadAssets14();
                            break;
                        case 22:
                            CopyReadAssets15();
                            break;
                        case 23:
                            CopyReadAssets16();
                            break;
                        case 24:
                            CopyReadAssets17();
                            break;
                        case 25:
                            CopyReadAssets18();
                            break;
                        case 26:
                            CopyReadAssets42();
                            break;
                    }
                }
                if (iteamposition == 3) {
                    switch (value2) {
                        case 20:
                            CopyReadAssets19();
                            break;
                        case 21:
                            CopyReadAssets20();
                            break;
                        case 22:
                            CopyReadAssets21();
                            break;
                        case 23:
                            CopyReadAssets22();
                            break;

                        case 24:
                            CopyReadAssets24();
                            break;
                        case 25:
                            CopyReadAssets43();
                            break;
                        case 26:
                            CopyReadAssets43();
                            break;
                    }
                }
                if (iteamposition == 4) {
                    switch (value2) {
                        case 20:
                            CopyReadAssets25();
                            break;
                        case 21:
                            CopyReadAssets26();
                            break;
                        case 22:
                            CopyReadAssets27();
                            break;
                        case 23:
                            CopyReadAssets28();
                            break;
                        case 24:
                            CopyReadAssets29();
                            break;
                        case 25:
                            CopyReadAssets30();
                            break;
                        case 26:
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
        File file = new File(getFilesDir(), "phyjan13.pdf");
        try {
            in = assetManager.open("pcycle/physics/phyjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/phyjan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "m2jan13.pdf");
        try {
            in = assetManager.open("pcycle/math/m2jan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/m2jan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets3() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "elejan13.pdf");
        try {
            in = assetManager.open("pcycle/ele/elejan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/elejan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mechjan13.pdf");
        try {
            in = assetManager.open("pcycle/mech/mechjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mechjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets5() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "civiljan13.pdf");
        try {
            in = assetManager.open("pcycle/civil/civiljan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/civiljan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets6() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "cipjan13.pdf");
        try {
            in = assetManager.open("pcycle/cip/cipjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/cipjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets7() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "phyjun13.pdf");
        try {
            in = assetManager.open("pcycle/physics/phyjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/phyjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets8() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "m2jun13.pdf");
        try {
            in = assetManager.open("pcycle/math/m2jun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/m2jun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "elejun13.pdf");
        try {
            in = assetManager.open("pcycle/ele/elejun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/elejun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets10() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mechjun13.pdf");
        try {
            in = assetManager.open("pcycle/mech/mechjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mechjun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets11() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "civiljun13.pdf");
        try {
            in = assetManager.open("pcycle/civil/civiljun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/civiljun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets12() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "cipjun13.pdf");
        try {
            in = assetManager.open("pcycle/cip/cipjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/cipjun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets13() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "phyjan14.pdf");
        try {
            in = assetManager.open("pcycle/physics/phyjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/phyjan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets14() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Jan-2014.pdf");
        try {
            in = assetManager.open("pcycle/math/Jan-2014.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Jan-2014.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets15() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "elejan14.pdf");
        try {
            in = assetManager.open("pcycle/ele/elejan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/elejan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets16() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mechjan14.pdf");
        try {
            in = assetManager.open("pcycle/mech/mechjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mechjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets17() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "civiljan14.pdf");
        try {
            in = assetManager.open("pcycle/civil/civiljan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/civiljan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets18() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), ".pdf");
        try {
            in = assetManager.open(".pdf");
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
                Uri.parse("file://" + getFilesDir() + "/.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets19() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "phyjun14.pdf");
        try {
            in = assetManager.open("pcycle/physics/phyjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/phyjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets20() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "m2jun14.pdf");
        try {
            in = assetManager.open("pcycle/math/m2jun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/m2jun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets21() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "elejun14.pdf");
        try {
            in = assetManager.open("pcycle/ele/elejun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/elejun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets22() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mechjun14.pdf");
        try {
            in = assetManager.open("pcycle/mech/mechjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mechjun14.pdf"), "application/pdf");
        startActivity(intent);
    }





    private void CopyReadAssets24() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "civiljun14.pdf");
        try {
            in = assetManager.open("pcycle/civil/civiljun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/civiljun14.pdf"), "application/pdf");
        startActivity(intent);
    }



    private void CopyReadAssets25() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "phyjan15.pdf");
        try {
            in = assetManager.open("pcycle/physics/phyjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/phyjan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets26() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "model.pdf");
        try {
            in = assetManager.open("pcycle/math/model.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/model.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets27() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "elejan15.pdf");
        try {
            in = assetManager.open("pcycle/ele/elejan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/elejan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets28() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mechjan15.pdf");
        try {
            in = assetManager.open("pcycle/mech/mechjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mechjan15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets29() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "civiljan15.pdf");
        try {
            in = assetManager.open("pcycle/civil/civiljan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/civiljan15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets30() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "cipjan15.pdf");
        try {
            in = assetManager.open("pcycle/cip/cipjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/cipjan15.pdf"), "application/pdf");
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
        File file = new File(getFilesDir(), "cipjun12.pdf");
        try {
            in = assetManager.open("pcycle/cip/cipjun12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/cipjun12.pdf"), "application/pdf");
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