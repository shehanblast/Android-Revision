package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Toast toast;
    String d;
    TextView f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        f = findViewById(R.id.name);
        d = String.valueOf(f);
    }

    public void onClisk(View view){
        Context context = getApplicationContext();
        CharSequence text ="Welcome " + d;
        int duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();

        Intent intent = new Intent(MainActivity.this,ReadingCollectionsActivity.class);
        startActivity(intent);
    }
}
