package me.andrewbruce.assessment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Main Menu");
    }

    public void attractions_Click(View v) {
        Intent i = new Intent(this, AttractionsActivity.class);
        startActivity(i);
    }

    public void events_Click(View v) {
        Intent i = new Intent(this, EventsActivity.class);
        startActivity(i);
    }

    public void travel_Click(View v) {
        Intent i = new Intent(this, TravelActivity.class);
        startActivity(i);
    }
}