package com.example.vlad_.first_page;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FilenameFilter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class First_page extends AppCompatActivity {

    ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        //ссылки на вьюэры
        LV = (ListView) findViewById(R.id.LV);
    }

    //создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Функции для settings
    public void onSettings(MenuItem item){
        Toast.makeText(this, "You choose Setting", Toast.LENGTH_SHORT).show();
    }

    //Функции для add
    public void onAdd(MenuItem item){
        Toast.makeText(this, "You choose Add", Toast.LENGTH_SHORT).show();
    }

    //Функции для search
    public void onSearch(MenuItem item){
        Toast.makeText(this, "You choose Search", Toast.LENGTH_SHORT).show();
    }
}
