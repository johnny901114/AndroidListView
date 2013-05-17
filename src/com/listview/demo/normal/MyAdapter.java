package com.listview.demo.normal;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter implements Filterable {

	private List<String> data;
	private Context context;
	private MyFilter filter;

	public MyAdapter(Context context, List<String> data) {
		this.data = data;
		this.context = context;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(
					android.R.layout.simple_list_item_1, null);
		}
		TextView tv = (TextView) convertView.findViewById(android.R.id.text1);
		tv.setText(data.get(position));
		return convertView;
	}

	@Override
	public Filter getFilter() {
		if (filter == null) {
			filter = new MyFilter(data, this);
		}
		return filter;
	}

	public static class MyFilter extends Filter {
		private List<String> data;
		private List<String> persist = new ArrayList<String>();
		MyAdapter adapter;

		public MyFilter(List<String> data, MyAdapter adapter) {
			this.data = data;
			this.persist.addAll(data);
			this.adapter = adapter;
		}

		@Override
		protected FilterResults performFiltering(CharSequence constraint) {
			System.out.println("===========>constraint:"+constraint);
			FilterResults results = new FilterResults();
			if (constraint != null && constraint.length() > 0) {
				List<String> tempList = new ArrayList<String>();
				for (String str : persist) {
					if (str.contains(constraint)) {
						tempList.add(str);
					}
				}
				results.count = tempList.size();
				results.values = tempList;

			} else {
				results.count = persist.size();
				results.values = persist;
			}
			return results;
		}

		@Override
		protected void publishResults(CharSequence constraint,
				FilterResults results) {
			data.clear();
			data.addAll((List<String>) results.values);
			adapter.notifyDataSetChanged();
		}
	}

}
