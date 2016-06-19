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


public class Pcyclepaper extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sem5paper);


    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_ccyclepaper, container, false);


        final MyApplication someVariable = (MyApplication) getActivity().getApplicationContext();

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Engineering Physics ","Engineering Mathematics-II","Basic Electrical Engineering","Elements of Mechanical Engineering",
                "Elements of Civil Engineering & Mechanics","Constitution of India & Proffessional Ethics","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    someVariable.setSomeVariable(20);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //    i.putExtra("flag", 30);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    someVariable.setSomeVariable(21);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //  i.putExtra("flag", 31);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    someVariable.setSomeVariable(22);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //   i.putExtra("flag", 32);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    someVariable.setSomeVariable(23);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //  i.putExtra("flag", 33);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    someVariable.setSomeVariable(24);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //    i.putExtra("flag", 34);
                    startActivity(i);
                }
                if (iteamposition == 5) {
                    someVariable.setSomeVariable(25);
                    Intent i = new Intent(getActivity(), Pyear.class);
                    //  i.putExtra("flag", 34);
                    startActivity(i);
                }


            }
        });
        return v;
    }

}
