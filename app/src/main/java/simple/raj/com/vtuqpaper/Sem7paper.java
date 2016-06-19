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


public class Sem7paper extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_sem7paper);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem7paper, container, false);
        // TextView tv = (TextView) v.findViewById(R.id.text);
        //  tv.setText(this.getTag() + " Content");

        final MyApplication someVariable = (MyApplication) getActivity().getApplicationContext();

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Programming The Web", "Embedded Computing System","Advanced Computer Architecture"
        ,"OOMD","Java and J2EE","Data Warehousing and Mining","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    someVariable.setSomeVariable(10);
                    Intent i = new Intent(getActivity(), Year.class);
                    i.putExtra("flag", 10);
                    startActivity(i);
                }
                if (iteamposition == 1) {
                    someVariable.setSomeVariable(11);
                    Intent i = new Intent(getActivity(), Year.class);
                    i.putExtra("flag", 11);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    someVariable.setSomeVariable(12);
                    Intent i = new Intent(getActivity(), Year.class);
                //    i.putExtra("flag", 12);
                    startActivity(i);
                }
                if (iteamposition == 3) {
                    someVariable.setSomeVariable(13);
                    Intent i = new Intent(getActivity(), Year.class);
                    i.putExtra("flag", 13);
                    startActivity(i);
                }
                if (iteamposition == 4) {
                    someVariable.setSomeVariable(14);
                    Intent i = new Intent(getActivity(), Year.class);
                    i.putExtra("flag", 14);
                    startActivity(i);
                }
                if (iteamposition == 5) {
                    someVariable.setSomeVariable(15);
                    Intent i = new Intent(getActivity(), Year.class);
                  //  i.putExtra("flag", 14);
                    startActivity(i);
                }

            }
        });
        return v;
    }








}
