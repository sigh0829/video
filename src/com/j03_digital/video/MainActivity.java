package com.j03_digital.video;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		VideoView video=(VideoView) findViewById(R.id.video);
		
		//--load and start the movie--
		video.setVideoPath("/data/samplevideo.3gp");
		video.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
