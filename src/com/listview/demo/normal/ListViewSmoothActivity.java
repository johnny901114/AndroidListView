package com.listview.demo.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.listitemtest.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 当ListView的item高度不一样，scrollBar的大小将会发生改变，这样 的话scrollBar需要知道每个item的高度，这是损耗效率的。
 * 可以将smoothScrollBar设置false即可
 * 
 * @author YuZhiQiang
 * 
 */
public class ListViewSmoothActivity extends Activity {
	String[] array = {
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"werererewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeerererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeee",
			"wererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeeewererererererereeeeeee" };
	public List<String> data = new ArrayList<String>();
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview_smooth);
		ListView listView = (ListView) findViewById(R.id.listview);
		data.addAll(Arrays.asList(array));
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
