package com.westhillcs.mlksoundboard;

import android.media.MediaPlayer;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MLKsoundboardActivity extends AppCompatActivity {

   private static ImageView iv_mlk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlksoundboard);
        this.initialize();
    }

    private void initialize() {
        final MediaPlayer mlk_mp = MediaPlayer.create( this, R.raw.king );
        iv_mlk = (ImageView)findViewById(R.id.mlk_iv);

        iv_mlk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mlk_mp.isPlaying())
                            mlk_mp.pause();
                        else
                            mlk_mp.start();
                    }
                }
        );
    }
}
