package com.example.leighjones;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StickerIndexingService.enqueueWork(MainActivity.this);

        setContentView(R.layout.activity_main);

    }
}
