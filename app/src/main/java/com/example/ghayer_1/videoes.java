package com.example.ghayer_1;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class videoes extends AppCompatActivity {
    ImageButton imageButton;
    VideoView videoView;
    Uri uri;
    boolean isplay;
    ProgressBar progressBar;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vidoe_layout);

        // imageButton= findViewById(R.id.playbut);
        videoView = findViewById(R.id.videoView);
        progressBar = findViewById(R.id.progressBar);
        String urinew = getIntent().getStringExtra("uri");


        uri = Uri.parse(urinew);
        videoView.setVideoURI(uri);

        isplay = false;
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();


    }
}
