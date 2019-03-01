package a1.labs.kelayn.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

import a1.labs.kelayn.lab1.utils.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i<1000000; i++) list.add("");
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.myRec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter (list);
        recyclerView.setAdapter(adapter);
    }
}
