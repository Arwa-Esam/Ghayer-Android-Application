package com.example.ghayer_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class project_gheras extends AppCompatActivity {
    ImageButton back_img_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_gheras);
        back_img_btn=findViewById(R.id.back);
        back_img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(project_gheras.this, projectes.class);
                startActivity(intent);
            }
        })
        ;
    }
}

