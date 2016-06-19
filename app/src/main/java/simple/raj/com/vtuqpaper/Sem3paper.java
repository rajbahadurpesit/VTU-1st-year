package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.InputStream;
import java.io.OutputStream;

import simple.raj.com.vtuqpaper1.Previous_year;

public class Sem3paper extends Fragment {

    InputStream in;
    OutputStream out;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  //      setContentView(R.layout.activity_sem3paper);
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem3paper, container, false);


        final MyApplication someVariable = (MyApplication) getActivity().getApplicationContext();

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Discrete Mathematical Structure","Engineering Mathematics-III","Electronic Circuit","Logic Design",
                "OOPS with C++","Data Structure with C","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    someVariable.setSomeVariable(150);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //    i.putExtra("flag", 30);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    someVariable.setSomeVariable(151);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //     i.putExtra("flag", 31);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    someVariable.setSomeVariable(152);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //  i.putExtra("flag", 32);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    someVariable.setSomeVariable(153);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //   i.putExtra("flag", 33);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    someVariable.setSomeVariable(154);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //    i.putExtra("flag", 34);
                    startActivity(i);
                }
                if (iteamposition == 5) {
                    someVariable.setSomeVariable(155);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                    //    i.putExtra("flag", 34);
                    startActivity(i);
                }

            }
        });
        return v;
    }






}
