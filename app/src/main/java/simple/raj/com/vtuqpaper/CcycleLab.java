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


public class CcycleLab extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sem7lab);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_ccycle_lab, container, false);

        final ListView listview = (ListView)v.findViewById(R.id.listView);
        String[] values = new String[]{"1.Quick Sort","2.Merge Sort Parallelized","3a.Topological Ordering","3b.Warshall's Algorithm","4.Knapsack","5.Dijkstra's Algorithm","6.Kruskal","7a.BFS",
                "7b.DFS","8.Subset Sum","9.TSP","10.Prims Algorithm","11.Floyds Algorithm","12.N-Queens","",""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listitemlayout,R.id.label,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iteamposition = position;
                String itemValue = (String) listview.getItemAtPosition(position);

                if (iteamposition == 0) {
                    Intent i = new Intent(getActivity(), Sem7labsub.class);
                    i.putExtra("flag", 22);
                    startActivity(i);

                }
                if (iteamposition == 1) {
                    Intent i = new Intent(getActivity(), Sem7labsub.class);
                    i.putExtra("flag", 23);
                    startActivity(i);
                }


            }
        });
        return v;
    }

}
