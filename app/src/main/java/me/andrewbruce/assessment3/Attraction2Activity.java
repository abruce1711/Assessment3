package me.andrewbruce.assessment3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Attraction2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction2);
        setTitle("Riverside Museum");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnMap_Click(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/2EAZe8Y"));
        startActivity(i);
    }

    public void btnWebsite_Click(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/2H9sNgf"));
        startActivity(i);
    }
}
