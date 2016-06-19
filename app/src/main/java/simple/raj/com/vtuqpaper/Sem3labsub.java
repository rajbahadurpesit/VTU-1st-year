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


public class Sem3labsub extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_sem3labsub);
    }
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_sem3labsub, container, false);

        final ListView listview = (ListView)v.findViewById(R.id.listView);

        String[] values = new String[]{"Syllabus","1.Sum of 2 Polynomial","2.Infix to Postfix","3.Postfix Evaluation","4.Implement queue"
        ,"5.Employee class","6.VTU BELGAUM by copy constructor","7.Stack overload + and -","8.Linked List","9.Sparse Matrix"
        ,"10.Max Heap","11.Doubly Linked List","12.Class Date","13.OCTAL","14.Binary Tree","LOGIC DESIGN ","8:1 MUX","D flip-flop",
        "Mod 8 counter","Tail Counter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                   i.putExtra("flag", 500);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 501);
                    startActivity(i);
                }
                if (iteamposition == 2) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                   i.putExtra("flag", 502);
                    startActivity(i);
                }

                if (iteamposition == 3) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 503);
                    startActivity(i);
                }

                if (iteamposition == 4) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 504);
                    startActivity(i);
                }

                if (iteamposition == 5) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                   i.putExtra("flag", 505);
                    startActivity(i);
                }

                if (iteamposition == 6) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 506);
                    startActivity(i);
                }

                if (iteamposition == 7) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 507);
                    startActivity(i);
                }

                if (iteamposition == 8) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 508);
                    startActivity(i);
                }

                if (iteamposition == 9) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 509);
                    startActivity(i);
                }

                if (iteamposition == 10) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 510);
                    startActivity(i);
                }

                if (iteamposition == 11) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 511);
                    startActivity(i);
                }

                if (iteamposition == 12) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 512);
                    startActivity(i);
                }

                if (iteamposition == 13) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 513);
                    startActivity(i);
                }

                if (iteamposition == 14) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 514);
                    startActivity(i);
                }

                if (iteamposition == 15) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 515);
                    startActivity(i);
                }
                if (iteamposition == 16) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 517);
                    startActivity(i);
                }

                if (iteamposition == 17) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 518);
                    startActivity(i);
                }
                if (iteamposition == 18) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 519);
                    startActivity(i);
                }
                if (iteamposition == 19) {
                    Intent i = new Intent(getActivity(), Sem3labprog.class);
                    i.putExtra("flag", 520);
                    startActivity(i);
                }



            }
        });
        return v;
    }

}
