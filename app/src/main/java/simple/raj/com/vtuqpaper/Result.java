package simple.raj.com.vtuqpaper;


import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Result extends ActionBarActivity {

    private Context context;
    public   String s;
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.ColorPrimaryDark));
        }
        final EditText phone = (EditText) findViewById(R.id.editPhone);

        context = this.getApplicationContext();




        phone.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Toast msg = Toast.makeText(getBaseContext(), "Only 10 Character",

                        Toast.LENGTH_LONG);

                msg.show();

            }

        });
        Button next = (Button) findViewById(R.id.nextBtn);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //  Intent intent=new Intent(getApplicationContext(),Displayresult.class);
                s = phone.getText().toString();
                Intent intent = new Intent(Result.this, Displayresult.class);
                intent.putExtra("s",s);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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
        }
    }


}
