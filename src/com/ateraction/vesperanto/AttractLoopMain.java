package com.ateraction.vesperanto;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class AttractLoopMain extends Activity implements OnCompletionListener,
		SurfaceHolder.Callback {
	private MediaPlayer mediaPlayer;
	private ArrayList<String> videoList = new ArrayList<String>();
	private SurfaceHolder holder;
	private int currentVideo = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.attract_loop);

		videoList.add("/sdcard/download/test9-1.m4v");
		videoList.add("/sdcard/download/test9-2.m4v");
		videoList.add("/sdcard/download/test9-3.m4v");

	/*	SurfaceView surface = (SurfaceView) findViewById(R.id.surface);
		holder = surface.getHolder();
		holder.addCallback(this);
		holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
*/
		currentVideo = 0;

	}

	@Override
	protected void onPause() {
		
		super.onPause();
		mediaPlayer.stop();
		mediaPlayer.release();
		finish();
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		

	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		playVideo(videoList.get(0));
	}

	private void playVideo(String videoPath) {
		try {
			mediaPlayer = new MediaPlayer();
			mediaPlayer.setOnCompletionListener(this);
			mediaPlayer.setDisplay(holder);
			mediaPlayer.setDataSource(videoPath);
			mediaPlayer.prepare();
			mediaPlayer.start();
		} catch (IllegalArgumentException e) {
			Log.d("MEDIA_PLAYER", e.getMessage());
		} catch (IllegalStateException e) {
			Log.d("MEDIA_PLAYER", e.getMessage());
		} catch (IOException e) {
			Log.d("MEDIA_PLAYER", e.getMessage());
		}

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		Log.d("media player", "play next video");

	}

	@Override
	public void onCompletion(MediaPlayer mp) {
		Log.d("player", "playback complete");
		currentVideo++;
		if (currentVideo > videoList.size() - 1) {
			currentVideo = 0;
		}
		mediaPlayer.release();
		playVideo(videoList.get(currentVideo));

	}
}