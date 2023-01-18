package com.example.ghayer_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    private ImageButton img_btn_setting;
 private ImageView img_view_projectes;
    private ImageView img_view_videoes;
    private ImageView img_view_about;
    private ImageView img_view_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img_btn_setting=findViewById(R.id.img_btn_setting);
        img_view_projectes= findViewById(R.id.img_view_ma4ro3atna);
        img_view_videoes=findViewById(R.id.img_view_vidoes);
        img_view_about= findViewById(R.id.img_view_3nghayer);
        img_view_event=findViewById(R.id.img_btn_el2adem);
        img_view_videoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent i= new Intent(home.this, video_grid.class);

                 startActivity(i);
            }

        });
        img_view_projectes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(home.this, projectes.class);

                startActivity(i);

            }
        });
        img_btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,slidebar.class);
                startActivity(intent);
            }
        });
        img_view_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(home.this,coming_event.class);
            startActivity(i);
            }

        });
    }
}
