package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReadingCollectionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_collections);
    }

    public void onClisk(View view){
        Intent intent = new Intent(ReadingCollectionsActivity.this,AddReading.class);
        startActivity(intent);
    }
}
