package com.example.latihanlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lstItem;
    private String[] namaNegara = new String[]{
            "Indonesia","Malaysia","Jepang",
            "Singapore","Thailand","China",
            "Amerika","Inggris","Argentina",
            "Timor Leste","India","Mexico",
            "Polandia","Jerman","Rusia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana");
        lstItem = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);
        lstItem.setAdapter(adapter);
        lstItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : "+namaNegara[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}