package com.example.ghayer_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class projecct_qhv extends AppCompatActivity {
    ImageButton back_img_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projecct_qhv);
        //Basic of video
        //1. get video view
        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        //2. point to video resource
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.qhv);

        //add media Control
        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        //run it
        videoView.start();

        //button
        back_img_btn=findViewById(R.id.back);
        back_img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(projecct_qhv.this, projectes.class);
                startActivity(intent);
            }
        })
        ;


    }
}


