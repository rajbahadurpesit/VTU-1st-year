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

public class Sem6lab extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_sem5lab);
    }
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem6lab, container, false);

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"Computer Graphics LAB","USP & CD LAB","","","","","","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    Intent i = new Intent(getActivity(), Sem6cgprog.class);
                    i.putExtra("flag", 20);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    Intent i = new Intent(getActivity(), Sem6uspprog.class);
                    i.putExtra("flag", 21);
                    startActivity(i);
                }


            }
        });
        return v;
    }



}