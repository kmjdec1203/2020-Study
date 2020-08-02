package com.example.android_study1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Cliked(View v){
        Toast.makeText(getApplicationContext(),"버튼이 눌렸어요.",Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v){
        Intent intend = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intend);
    }
            }