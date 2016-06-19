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


public class Sem7syllabus extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sem7syllabus);
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem7syllabus, container, false);

    final ListView listview = (ListView)v.findViewById(R.id.listView);
    String[] values = new String[]{"Data Warehousing and Data Mining","Advanced Computer Architecture","Programming The Web", "Embedded Computing System",
            "OOMD",  "Java and J2EE", "Information System","Game Theory","C# Programming and .NET"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
    listview.setAdapter(adapter);
    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            int iteamposition = position;
            String itemValue = (String) listview.getItemAtPosition(position);

            if (iteamposition == 0) {
                Intent i = new Intent(getActivity(), Warehousing.class);
             //   i.putExtra("flag", 20);
                startActivity(i);

            }
            if (iteamposition == 1) {
                Intent i = new Intent(getActivity(), ACA.class);
              //  i.putExtra("flag", 21);
                startActivity(i);
            }
            if (iteamposition == 2) {
                Intent i = new Intent(getActivity(), WEB.class);
              //  i.putExtra("flag", 22);
                startActivity(i);
            }
            if (iteamposition == 3) {
                Intent i = new Intent(getActivity(), ECS.class);
              //  i.putExtra("flag", 23);
                startActivity(i);
            }
            if (iteamposition == 4) {
                Intent i = new Intent(getActivity(), OOMD.class);
              //  i.putExtra("flag", 24);
                startActivity(i);
            }
            if (iteamposition == 5) {
                Intent i = new Intent(getActivity(), Javaj2ee.class);
               // i.putExtra("flag", 25);
                startActivity(i);
            }
            if (iteamposition == 6) {
                Intent i = new Intent(getActivity(), IS.class);
               // i.putExtra("flag", 26);
                startActivity(i);
            }
            if (iteamposition == 7) {
                Intent i = new Intent(getActivity(), Gametheory.class);
             //   i.putExtra("flag", 27);
                startActivity(i);
            }
            if (iteamposition == 8) {
                Intent i = new Intent(getActivity(), Candnet.class);
                //   i.putExtra("flag", 27);
                startActivity(i);
            }
        }
    });
    return v;
}




}
