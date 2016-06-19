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

import simple.raj.com.vtuqpaper1.Previous_year;


public class Sem5paper extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sem5paper);


    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem5paper, container, false);


      final MyApplication someVariable = (MyApplication) getActivity().getApplicationContext();

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Database Management System ","Software Engineering","Computer Network-1",
        "System Software","Operating System","FLAT","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    someVariable.setSomeVariable(30);
                    Intent i = new Intent(getActivity(), Year.class);
                //    i.putExtra("flag", 30);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    someVariable.setSomeVariable(31);
                    Intent i = new Intent(getActivity(), Year.class);
                  //  i.putExtra("flag", 31);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    someVariable.setSomeVariable(32);
                    Intent i = new Intent(getActivity(), Year.class);
                 //   i.putExtra("flag", 32);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    someVariable.setSomeVariable(33);
                    Intent i = new Intent(getActivity(), Year.class);
                  //  i.putExtra("flag", 33);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    someVariable.setSomeVariable(34);
                    Intent i = new Intent(getActivity(), Year.class);
                //    i.putExtra("flag", 34);
                    startActivity(i);
                }
                if (iteamposition == 5) {
                    someVariable.setSomeVariable(156);
                    Intent i = new Intent(getActivity(), Previous_year.class);
                  //  i.putExtra("flag", 34);
                    startActivity(i);
                }


            }
        });
        return v;
    }

}
