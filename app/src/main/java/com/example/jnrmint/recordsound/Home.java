package com.example.jnrmint.recordsound;

import android.content.Intent;
//import android.content.pm.PackageManager;
import android.os.Bundle;
//import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity implements View.OnClickListener {

  private Button start, stop;
    /*private boolean permissionToRecordAccepted;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_RECORD_AUDIO_PERMISSION:
                permissionToRecordAccepted  = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                break;
        }
        if (!permissionToRecordAccepted ) finish();

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        start = findViewById(R.id.buttonStart);
        stop = findViewById(R.id.buttonStop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    public void onClick(View view){
      if(view == start){
          startService(new Intent(this, MyService.class));
      } else if( view == stop) {
          stopService(new Intent(this, MyService.class));
      }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
