package me.andrewbruce.assessment3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        setTitle("Travel Links");

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

    public void trainTimes_Click(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scotrail.co.uk/"));
        startActivity(i);
    }

    public void busTimes_Click(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.firstgroup.com/greater-glasgow"));
        startActivity(i);
    }

    public void subwayTimes_Click(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.spt.co.uk/subway/timetable/"));
        startActivity(i);
    }
}
