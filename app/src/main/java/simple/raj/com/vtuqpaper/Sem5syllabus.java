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


public class Sem5syllabus extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sem5syllabus);
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem5syllabus, container, false);

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Database Management System","Computer Network-1","Software Engineering",
                "Operating System","FLAT","System Software","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    Intent i = new Intent(getActivity(), DBMS.class);
                  //  i.putExtra("flag", 30);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    Intent i = new Intent(getActivity(), CN.class);
                   // i.putExtra("flag", 31);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    Intent i = new Intent(getActivity(), SE.class);
                  //  i.putExtra("flag", 32);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    Intent i = new Intent(getActivity(), OS.class);
                   // i.putExtra("flag", 33);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    Intent i = new Intent(getActivity(), FLAT.class);
               //     i.putExtra("flag", 34);
                    startActivity(i);
                }
                if (iteamposition == 5) {
                    Intent i = new Intent(getActivity(), SS.class);
               //     i.putExtra("flag", 35);
                    startActivity(i);
                }
            }
        });
        return v;
    }

}
