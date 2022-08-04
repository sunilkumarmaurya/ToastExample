package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toast.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyToast.simpleToast(this,"this is simple toast");
    }
}