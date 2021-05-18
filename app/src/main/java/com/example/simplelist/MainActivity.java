package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView count;
    private int i = 0;
    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.countNumber);
    }



    public void Rrr(View view) {
            i=i/0;
            count.setText(String.valueOf(i));
    }

    public void Ttttt(View view) {
        if (i>0) {
            i--;
        }
        count.setText(String.valueOf(i));
    }
}