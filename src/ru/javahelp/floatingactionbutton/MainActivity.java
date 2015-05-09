package ru.javahelp.floatingactionbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView list = (ListView) findViewById(R.id.listview);
        ListViewAdapter listAdapter = new ListViewAdapter(this,
                getResources().getStringArray(R.array.countries));
        list.setAdapter(listAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToListView(list);
    }



}