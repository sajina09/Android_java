package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SajinaRecyclerView extends AppCompatActivity {

    RecyclerView myRecyclerView ;
    SimpleRecyclerViewAdapter adapter;
    LinearLayoutManager linearLayoutManager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        ArrayList<String> playersList = new ArrayList<>();
        playersList.add("Rachel Green");
        playersList.add("Ross Geller");
        playersList.add("Joey Tribbiani");
        playersList.add("Phoebe Buffay");
        playersList.add("Chandler Bing");
        playersList.add("Monica Geller");

        myRecyclerView = findViewById(R.id.myRecyclerView);
        adapter = new SimpleRecyclerViewAdapter(playersList);
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        myRecyclerView.setAdapter(adapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);
    }
}