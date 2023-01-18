package com.example.ghayer_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class slidebar extends AppCompatActivity {
    ImageView img_view_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidebar);
        img_view_back=findViewById(R.id.img_view_back);
        img_view_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(slidebar.this,home.class);
                startActivity(intent);
            }
        });
    }
}
