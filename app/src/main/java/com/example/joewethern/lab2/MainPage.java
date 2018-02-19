package com.example.joewethern.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.Arrays;

public class MainPage extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //These lines fill the list with 'Devices'.  These devices are stored in the
        // strings.xml file so that the list will update itself when the set of devices changes
        ListView lv = (ListView) findViewById(R.id.listViewDevice);
        ArrayList<String> arrayDevice = new ArrayList<>();
        arrayDevice.addAll(Arrays.asList(getResources().getStringArray(R.array.array_device)));
        adapter = new ArrayAdapter<>(
                MainPage.this,
                android.R.layout.simple_list_item_1,
                arrayDevice);
        lv.setAdapter(adapter);
        //This function tells the app to go to the DeviceActivity page when a device from the list is selected
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(view.getContext(), DeviceActivity.class);
                startActivity(myIntent);
            }
        });
    }


}
