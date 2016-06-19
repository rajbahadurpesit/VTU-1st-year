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



public class Sem4year extends ActionBarActivity {
    InputStream in;
    OutputStream out;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4year);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        final int value2 = ((MyApplication) this.getApplication()).getSomeVariable();

        listview = (ListView) findViewById(R.id.year1);
        String[] values = new String[]{"1.December(2012)", "2.June-July(2013)", "3.December(2013)", "4.June-July(2014)", "5.Jan(2015)","6.June-July(2015)"};

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
                            CopyReadAssets23();
                            break;
                        case 15:
                            CopyReadAssets24();
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

                    }
                }
                    if (iteamposition == 5) {
                        switch (value2) {
                            case 10:
                                CopyReadAssets31();
                                break;
                            case 11:
                                CopyReadAssets32();
                                break;
                            case 12:
                                CopyReadAssets33();
                                break;
                            case 13:
                                CopyReadAssets34();
                                break;
                            case 14:
                                CopyReadAssets35();
                                break;
                            case 15:
                                CopyReadAssets36();
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
        File file = new File(getFilesDir(), "Mpjan13.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJan13.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets3() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Jan13.pdf");
        try {
            in = assetManager.open("4thsem/M4/Jan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Jan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Uspjan13.pdf");
        try {
            in = assetManager.open("4thsem/USP/Uspjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Uspjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets5() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "GTCjan13.pdf");
        try {
            in = assetManager.open("4thsem/GTC/GTCjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/GTCjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets6() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "ADajan13.pdf");
        try {
            in = assetManager.open("4thsem/ADA/ADajan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/ADajan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets7() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Mpjun13.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets8() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJun13.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "June13.pdf");
        try {
            in = assetManager.open("4thsem/M4/June13pdf");
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
                Uri.parse("file://" + getFilesDir() + "/June13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets10() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "USPjun13.pdf");
        try {
            in = assetManager.open("4thsem/USP/USPjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/USPjun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets11() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "GTCjun13.pdf");
        try {
            in = assetManager.open("4thsem/GTC/GTCjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/GTCjun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets12() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Adajun13.pdf");
        try {
            in = assetManager.open("4thsem/ADA/Adajun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Adajun13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets13() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Mpjan14.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets14() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJan14.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets15() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Jan14.pdf");
        try {
            in = assetManager.open("4thsem/M4/Jan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Jan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets16() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Uspjan14.pdf");
        try {
            in = assetManager.open("4thsem/USP/Uspjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Uspjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets17() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "GTCjan14.pdf");
        try {
            in = assetManager.open("4thsem/GTC/GTCjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/GTCjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets18() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Adajan14.pdf");
        try {
            in = assetManager.open("4thsem/ADA/Adajan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Adajan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets19() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Mpjun14.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets20() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJun14.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets21() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "June14.pdf");
        try {
            in = assetManager.open("4thsem/M4/June14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/June14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets22() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "USPJun14.pdf");
        try {
            in = assetManager.open("4thsem/USP/USPJun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/USPJun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets23() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Gtcjun14.pdf");
        try {
            in = assetManager.open("4thsem/GTC/Gtcjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Gtcjun14.pdf"), "application/pdf");
        startActivity(intent);
    }





    private void CopyReadAssets24() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Adajun14.pdf");
        try {
            in = assetManager.open("4thsem/ADA/Adajun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Adajun14.pdf"), "application/pdf");
        startActivity(intent);
    }



    private void CopyReadAssets25() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Mpjan15.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets26() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJan15.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets27() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Dec14.pdf");
        try {
            in = assetManager.open("4thsem/M4/Dec14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Dec14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets28() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "UspJan15r.pdf");
        try {
            in = assetManager.open("4thsem/USP/UspJan15r.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/UspJan15r.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets29() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Gtcjan15.pdf");
        try {
            in = assetManager.open("4thsem/GTC/Gtcjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Gtcjan15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets30() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Adajan15.pdf");
        try {
            in = assetManager.open("4thsem/ADA/Adajan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Adajan15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets31() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Mpjun15.pdf");
        try {
            in = assetManager.open("4thsem/MP/Mpjun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Mpjun15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets32() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "COJun15.pdf");
        try {
            in = assetManager.open("4thsem/CO/COJun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/COJun15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets33() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Maths4.pdf");
        try {
            in = assetManager.open("4thsem/M4/Maths4.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Maths4.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets34() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "UnixJun15.pdf");
        try {
            in = assetManager.open("4thsem/USP/UnixJun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/UnixJun15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets35() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "GTCJun15.pdf");
        try {
            in = assetManager.open("4thsem/GTC/GTCJun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/GTCJun15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets36() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "Adajun15.pdf");
        try {
            in = assetManager.open("4thsem/ADA/Adajun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/Adajun15.pdf"), "application/pdf");
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