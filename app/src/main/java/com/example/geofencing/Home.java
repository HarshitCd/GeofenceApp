package com.example.geofencing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<LatLng> pos = new ArrayList<LatLng>();
    ArrayList<String> message = new ArrayList<String>();
    ArrayList<Integer> radius = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Geofencing List");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.join_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        System.out.println(id);

        Intent intent = new Intent(getBaseContext(), AddFence.class);
        startActivity(intent);

        return true;
    }

}
