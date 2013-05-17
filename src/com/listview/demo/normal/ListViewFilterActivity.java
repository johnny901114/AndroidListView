package com.listview.demo.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.listitemtest.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter.FilterListener;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewFilterActivity extends ListActivity {
	String[] array = { "qqqq", "qqqqww", "qqqqaaa", "wwwwqddd", "aaaxxxss",
			"uuuuu" };
	private Button btnAdd;
	public List<String> data = new ArrayList<String>();
	private MyAdapter adapter;
	private EditText etSearch;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview_filter);
		ListView listView = getListView();
		setView();
		data.addAll(Arrays.asList(array));
		adapter = new MyAdapter(this, data);
		listView.setAdapter(adapter);

	}

	private void setView() {
		btnAdd = (Button) findViewById(R.id.btn_add);
		etSearch = (EditText) findViewById(R.id.et_search);
		etSearch.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {
				final String value = s.toString();
				adapter.getFilter().filter(value, new FilterListener() {
					@Override
					public void onFilterComplete(int count) {
						if (toast == null) {
							toast = Toast.makeText(ListViewFilterActivity.this,
									"search complete. constraint is " + value,
									Toast.LENGTH_SHORT);
						}else {
							toast.setText("search complete. constraint is " + value);
						}
						toast.show();
					}
				});

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
