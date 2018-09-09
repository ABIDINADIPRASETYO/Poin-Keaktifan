package ub.poros.divisimobile.poinkeaktifan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;


import java.util.ArrayList;
import java.util.List;



import ub.poros.divisimobile.poinkeaktifan.Adapter.RecyclerviewAdapter;
import ub.poros.divisimobile.poinkeaktifan.Model.model;

public class MainActivity extends AppCompatActivity {
    public List<model> modelList = new ArrayList<>();
    RecyclerviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listModel();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerviewAdapter(modelList);
        recyclerView.setAdapter(adapter);


    }

    public void listModel(){
        model mode;
        mode = new model("ali", "mobile");
        modelList.add(mode);
        mode = new model("budi", "web");
        modelList.add(mode);
        /*model = new model("wawan", "os");
        modelList.add(model);
        model = new model("riski", "mobile");
        modelList.add(model);
        model = new model("alfin", "web");
        modelList.add(model);
        model = new model("feri", "os");
        modelList.add(model);
*/
       //adapter.notifyDataSetChanged();
    }

}
