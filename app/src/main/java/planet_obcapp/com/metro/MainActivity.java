package planet_obcapp.com.metro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//import planet_obcapp.com.metro.data.Line;
import planet_obcapp.com.metro.data.Line;
import planet_obcapp.com.metro.data.Utility;
import planet_obcapp.com.metro.graph.Node;
import planet_obcapp.com.metro.graph2.Graph;

public class MainActivity extends AppCompatActivity {

    Spinner from, to;
    Button btn_find;
    TextView txt_route;
    List<Node> list_Nodes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        btn_find = findViewById(R.id.btn_find);
        txt_route = findViewById(R.id.txt_route);

        BindData();


        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Node Src_node = (Node) from.getSelectedItem();
                Node Dest_node = (Node) to.getSelectedItem();
                ArrayList<String> gf = Graph.getAllpaths(Src_node.getSource(), Dest_node.getSource());

                System.out.println(gf);
                txt_route.setText(String.valueOf(gf));
            }
        });


    }


    void BindData() {
        list_Nodes = new ArrayList<>();
        list_Nodes.add(new Node(0, 1));
        list_Nodes.add(new Node(1, 3));
        list_Nodes.add(new Node(1, 6));
        list_Nodes.add(new Node(3, 5));
        list_Nodes.add(new Node(2, 3));
        list_Nodes.add(new Node(5, 4));
        list_Nodes.add(new Node(5, 6));
/****************************************************************/
        ArrayList<Line> lines = Utility.getAllLinesData();
        ArrayAdapter<Line> dataAdapter = new ArrayAdapter<Line>(MainActivity.this,
                android.R.layout.simple_spinner_item, lines);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(dataAdapter);
        to.setAdapter(dataAdapter);

/************************************************/


        List<Node> g1 = new ArrayList<>();
        for (Node node : list_Nodes) {
            g1.add(new Node(node.getDestination(), node.getSource()));
        }


        List<Node> g2 = new ArrayList<>();
        g2.addAll(list_Nodes);
        g2.addAll(g1);
        Graph.addNode(g2);


/**************************************************************/

    }


}
