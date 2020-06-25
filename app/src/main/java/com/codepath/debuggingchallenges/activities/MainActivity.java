package com.codepath.debuggingchallenges.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.codepath.debuggingchallenges.R;

public class MainActivity extends AppCompatActivity {
    //Toast.makeText(MainActivity.this, "message", Toast.LENGTH_LONG).show();
    //Log.d("TAG", "message");
    //App closing - look for Fatal Exception error and "Caused by"
    //breakpoint - don't use play icon, use bug icon. There is a step symbol o step through code.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void launchActivity(Class klass) {
        Intent intent = new Intent(this, klass);
        startActivity(intent);
    }

    public void launchCurrentDayActivity(View view) {
        launchActivity(CurrentDayActivity.class);
    }

    public void launchMoviesActivity(View view) {
        launchActivity(MoviesActivity.class);
    }

    public void launchChangeBackgroundActivity(View view) {
        launchActivity(ChangeBackgroundActivity.class);
    }

    public void launchToolbarActivity(View view) {
        launchActivity(ToolbarActivity.class);
    }
}
