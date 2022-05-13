package com.example.firebase_record_and_post_video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class Playvideo extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_playvideo);
        videoView = findViewById(R.id.videoview);


        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}