package com.example.dtasker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dtasker.Adapter.ToDoAdapter;
import com.example.dtasker.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, loginScreen.class);
            startActivity(intent);
            finish();
        }, 3000);

    }
}