package com.example.recycleview_card_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    ImageView logo;
    TextView title,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        logo = findViewById(R.id.logoIV);
        title = findViewById(R.id.titleTV);
        description = findViewById(R.id.descTV);

        logo.setImageResource(getIntent().getIntExtra("imagePath",0));
        title.setText(getIntent().getStringExtra("titleString"));
        description.setText(getIntent().getStringExtra("descSting"));
    }
}