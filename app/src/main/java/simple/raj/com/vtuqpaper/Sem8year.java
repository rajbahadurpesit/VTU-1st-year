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



public class Sem8year extends ActionBarActivity {
    InputStream in;
    OutputStream out;
    ListView listview;
    int val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8year);
        Intent int1=getIntent();
        val=int1.getIntExtra("flag",0);
        Log.d("flag val", "flagval" + val);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }

        final int value2 = ((MyApplication) this.getApplication()).getSomeVariable();

        listview = (ListView) findViewById(R.id.year2);
        String[] values = new String[]{"1.December(2012)", "2.June-July(2013)", "3.December(2013)", "4.June-July(2014)", "5.Jan(2015)","6.June-July(2015)"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.label, values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    switch (val) {
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

                    }
                    // setContentView(R.layout.activity_about);
                }
                if (iteamposition == 1) {
                    switch (val) {
                        case 10:
                            CopyReadAssets5();
                            break;
                        case 11:
                            CopyReadAssets6();
                            break;
                        case 12:
                            CopyReadAssets7();
                            break;
                        case 13:
                            CopyReadAssets8();
                            break;

                    }
                }

                if (iteamposition == 2) {
                    switch (val) {
                        case 10:
                            CopyReadAssets9();
                            break;
                        case 11:
                            CopyReadAssets10();
                            break;
                        case 12:
                            CopyReadAssets11();
                            break;
                        case 13:
                            CopyReadAssets12();
                            break;


                    }
                }
                if (iteamposition == 3) {
                    switch (val) {
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


                    }
                }
                if (iteamposition == 4) {
                    switch (val) {
                        case 10:
                            CopyReadAssets17();
                            break;
                        case 11:
                            CopyReadAssets18();
                            break;
                        case 12:
                            CopyReadAssets19();
                            break;
                        case 13:
                            CopyReadAssets20();
                            break;


                    }
                }
                if (iteamposition == 5) {
                    switch (val) {
                        case 10:
                            CopyReadAssets21();
                            break;
                        case 11:
                            CopyReadAssets22();
                            break;
                        case 12:
                            CopyReadAssets23();
                            break;
                        case 13:
                            CopyReadAssets24();
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
        File file = new File(getFilesDir(), "sajan13.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajan13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets2() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjun13.pdf");
        try {
            in = assetManager.open("8thsem/model/mjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets3() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjan11.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjan11.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjan11.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets4() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjan13.pdf");
        try {
            in = assetManager.open("8thsem/st/stjan13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjan13.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets5() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sajun133.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajun133.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajun133.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets6() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjun12.pdf");
        try {
            in = assetManager.open("8thsem/model/mjun12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjun12.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets7() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjul11.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjul11.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjul11.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets8() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjun13.pdf");
        try {
            in = assetManager.open("8thsem/st/stjun13.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjun13.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets9() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sajan14.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajan14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets10() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjan14.pdf");
        try {
            in = assetManager.open("8thsem/model/mjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets11() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjan12.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjan12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjan12.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets12() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjan14.pdf");
        try {
            in = assetManager.open("8thsem/st/stjan14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjan14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets13() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sajun144.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajun144.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajun144.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets14() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjun14.pdf");
        try {
            in = assetManager.open("8thsem/model/mjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjun14.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets15() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjun10.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjun10.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjun10.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets16() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjun14.pdf");
        try {
            in = assetManager.open("8thsem/st/stjun14.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjun14.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets17() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sajan151.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajan151.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajan151.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets18() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjan15.pdf");
        try {
            in = assetManager.open("8thsem/model/mjan15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjan15.pdf"), "application/pdf");
        startActivity(intent);
    }


    private void CopyReadAssets19() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjan12.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjan12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjan12.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets20() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjan12.pdf");
        try {
            in = assetManager.open("8thsem/st/stjan12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjan12.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets21() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "sajun155.pdf");
        try {
            in = assetManager.open("8thsem/sa/sajun155.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/sajun155.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets22() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "mjun15.pdf");
        try {
            in = assetManager.open("8thsem/model/mjun15.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/mjun15.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void CopyReadAssets23() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "insjul11.pdf");
        try {
            in = assetManager.open("8thsem/ins/insjul11.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/insjul11.pdf"), "application/pdf");
        startActivity(intent);
    }





    private void CopyReadAssets24() {
        AssetManager assetManager = getAssets();
        File file = new File(getFilesDir(), "stjun12.pdf");
        try {
            in = assetManager.open("8thsem/st/stjun12.pdf");
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
                Uri.parse("file://" + getFilesDir() + "/stjun12.pdf"), "application/pdf");
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