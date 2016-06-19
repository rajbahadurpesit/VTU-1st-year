package simple.raj.com.vtuqpaper;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SEM extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_sem);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem, container, false);
        // TextView tv = (TextView) v.findViewById(R.id.text);
        //  tv.setText(this.getTag() + " Content");

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Chemistry Cycle","Physics Cycle","SEM 3", "SEM 4","SEM 5","SEM 6","SEM 7","SEM 8 Paper","SEM 8 Syllabus","VTU RESULTS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    Intent i = new Intent(getActivity(), Ccycle.class);
                    i.putExtra("flag", 1);
                    startActivity(i);
                }
                if (iteamposition == 1) {
                    Intent i = new Intent(getActivity(), Pcycle.class);
                    i.putExtra("flag", 1);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    Intent i = new Intent(getActivity(), Sem3.class);
                    i.putExtra("flag", 1);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    Intent i = new Intent(getActivity(), Sem4.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    Intent i = new Intent(getActivity(), Sem5.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }


                if (iteamposition == 5) {
                    Intent i = new Intent(getActivity(), Sem6.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }
                if (iteamposition == 6) {
                    Intent i = new Intent(getActivity(), Sem7.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }
                if (iteamposition == 7) {
                    Intent i = new Intent(getActivity(), Sem8paper.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }
                if (iteamposition == 8) {
                    Intent i = new Intent(getActivity(), Sem8syllabus.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }
                if (iteamposition == 9) {
                    Intent i = new Intent(getActivity(), Result.class);
                    i.putExtra("flag", 2);
                    startActivity(i);
                }





            }
        });
        return v;
    }



}
