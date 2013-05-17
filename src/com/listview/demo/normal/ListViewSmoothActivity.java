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
 * ��ListView��item�߶Ȳ�һ����scrollBar�Ĵ�С���ᷢ���ı䣬���� �Ļ�scrollBar��Ҫ֪��ÿ��item�ĸ߶ȣ��������Ч�ʵġ�
 * ���Խ�smoothScrollBar����false����
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
