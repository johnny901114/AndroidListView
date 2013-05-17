package com.listview.demo.normal;

import com.example.listitemtest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnFilter;
	private Button btnSmooth;
	private Button btnTranscript;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setView();
	}

	private void setView() {
		btnFilter = (Button) findViewById(R.id.btn_list_filter);
		btnSmooth = (Button) findViewById(R.id.btn_list_smooth);
		btnTranscript = (Button) findViewById(R.id.btn_list_transcript_stack);
		btnFilter.setOnClickListener(this);
		btnSmooth.setOnClickListener(this);
		btnTranscript.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_list_filter:
			startActivity(new Intent(this,ListViewFilterActivity.class));
			break;
		case R.id.btn_list_smooth:
			startActivity(new Intent(this,ListViewSmoothActivity.class));
			break;
		case R.id.btn_list_transcript_stack:
			startActivity(new Intent(this,ListViewTranscriptStackActivity.class));
			break;
		}
	}
	
}
