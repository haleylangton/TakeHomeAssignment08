package com.example.android.studyguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Destination> destinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(destinations, this));
    }

    private void initialData(){

        destinations = new ArrayList<>();
        destinations.add(new Destination(R.string.australia, R.string.destination_australia, R.drawable.australia));
        destinations.add(new Destination(R.string.oceans, R.string.destination_europe, R.drawable.europe));
        destinations.add(new Destination(R.string.middle_east, R.string.destination_india,R.drawable.india));
        destinations.add(new Destination(R.string.africa, R.string.destination_africa, R.drawable.africa));
        destinations.add(new Destination(R.string.americas, R.string.destination_canada, R.drawable.canada));
        destinations.add(new Destination(R.string.asia, R.string.destination_asia, R.drawable.asia));
    }
}
