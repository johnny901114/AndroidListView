package com.listview.demo.normal;

import java.util.ArrayList;
import java.util.List;

import com.example.listitemtest.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListViewTranscriptStackActivity extends Activity implements OnClickListener{
	private int i;
	private Button btnAdd;
	public List<String> data = new ArrayList<String>();
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_transcript_stackbottom);
		ListView listView = (ListView) findViewById(R.id.listview);
		btnAdd = (Button) findViewById(R.id.btn_add);
		btnAdd.setOnClickListener(this);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_add:
			data.add((++i)+"");
			adapter.notifyDataSetChanged();
			break;
		}
	}

}
