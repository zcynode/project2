package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mrecyclerview;
    private SearchAdapter msearchAdapter = new SearchAdapter();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mrecyclerview = findViewById(R.id.rv);
        mrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerview.setAdapter(msearchAdapter);

        List<String> items = new ArrayList<>();
        for(int i=0;i<100;i++){
            items.add("第"+String.valueOf(i)+"个");
        }
        msearchAdapter.notifyItems(items);
    }

}

