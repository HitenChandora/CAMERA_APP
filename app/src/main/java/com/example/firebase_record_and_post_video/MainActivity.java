
package com.example.firebase_record_and_post_video;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static int VIDEO_REQUEST = 101;
    private Uri videoUri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void capture(View view) {
        Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (videoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(videoIntent, VIDEO_REQUEST);
        }
    }

    public void play(View view) {
        Intent playIntent = new Intent(this, Playvideo.class);
        playIntent.putExtra("videoUri", videoUri.toString());
        startActivity(playIntent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VIDEO_REQUEST && resultCode == RESULT_OK) {
            videoUri = data.getData();
        }

    }

}



   // public static final int MEDIA_TYPE_IMAGE = 1;
   // public static final int MEDIA_TYPE_VIDEO = 2;

    /** Create a file Uri for saving an image or video */
  //  private static Uri getOutputMediaFileUri(int type){
  //      return Uri.fromFile(getOutputMediaFile(type));
  //  }

    /** Create a File for saving an image or video */
   // private static File getOutputMediaFile(int type){
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.

     //   File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
     //           Environment.DIRECTORY_PICTURES), "MyCameraApp");
        // This location works best if you want the created images to be shared
        // between applications and persist after your app has been uninstalled.

        // Create the storage directory if it does not exist
      //  if (! mediaStorageDir.exists()){
      //      if (! mediaStorageDir.mkdirs()){
       //         Log.d("MyCameraApp", "failed to create directory");
       //         return null;
      //      }
      //  }

        // Create a media file name
      //  String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
       // File mediaFile;
        //if (type == MEDIA_TYPE_IMAGE){
        //    mediaFile = new File(mediaStorageDir.getPath() + File.separator +
       //             "IMG_"+ timeStamp + ".jpg");
       // } else if(type == MEDIA_TYPE_VIDEO) {
      //      mediaFile = new File(mediaStorageDir.getPath() + File.separator +
           //         "VID_"+ timeStamp + ".mp4");
       // } else {
      //      return null;
       // }

       // return mediaFile;
   // }
