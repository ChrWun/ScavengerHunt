package com.example.scvngr;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class How_To_Video extends Activity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_video);
	
	
	final VideoView mVideoView = (VideoView) findViewById(R.id.how_to_video);
	mVideoView.setVideoPath("http://wundidajah@wundidajah.bplaced.net/Geocaching.mp4");
	MediaController mediaController = new MediaController(this);
	mediaController.setAnchorView(mVideoView);
	mVideoView.setMediaController(mediaController);
	mVideoView.requestFocus();
	mVideoView.setOnPreparedListener(new OnPreparedListener() {
	    // Close the progress bar and play the video
	    public void onPrepared(MediaPlayer mp) {
	        mVideoView.start();
	    }
	});
	
	}
}

