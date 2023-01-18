package com.example.ghayer_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class coming_event extends AppCompatActivity {
    ImageButton back_img_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming_event);
        back_img_btn=findViewById(R.id.back_img_btn);
        back_img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(coming_event.this,home.class);
                startActivity(intent);
            }
        })
        ;
    }
}
