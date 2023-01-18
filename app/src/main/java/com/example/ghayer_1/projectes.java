package com.example.ghayer_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class projectes extends AppCompatActivity {
    ImageButton img_but_map;

    ImageButton img_but_quranic;
    ImageButton img_but_ghras;
    ImageButton img_but_qordova;
    ImageButton imageButton_back;
    //String  name,about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        img_but_ghras=findViewById(R.id.img_but_ghras);
        img_but_map=findViewById(R.id.img_but_map);
        img_but_qordova=findViewById(R.id.img_but_qordova);
        img_but_quranic= findViewById(R.id.img_but_quranic);
        imageButton_back=findViewById(R.id.back_img_btn);
        imageButton_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent i=new Intent(projectes.this ,home.class);
            startActivity(i) ;
            }
        });
        img_but_quranic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //     name=" ahmed ";
                //   about=" mbhujgb";
                Intent i=new Intent(projectes.this,projecct_qhv.class);
                //i.putExtra("name",name);
                //i.putExtra("name",about);
                startActivity(i);






            }

        });



        img_but_qordova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  name=" ahmed ";
                //about="kjbjb";
                Intent i=new Intent(projectes.this,project_qurdova.class);
                //i.putExtra("name",name);
                // i.putExtra("name",about);
                //startActivityForResult(i,0);
                startActivity(i);





            }

        });

        img_but_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                name=" map ";
                //              about=" n kjbujj";
                Intent i=new Intent(projectes.this,project_map.class);
                //            i.putExtra("name",name);
                //          i.putExtra("name",about);
                //        startActivityForResult(i,0);
                startActivity(i);





            }

        });

        img_but_ghras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                name="ghrass";
                //              about="jbjbjmbj";
                Intent i=new Intent(projectes.this,project_gheras.class);
                //          i.putExtra("name",name);
                //        i.putExtra("name",about);
                //      startActivityForResult(i,0);
                startActivity(i);





            }

        });


    }


}
