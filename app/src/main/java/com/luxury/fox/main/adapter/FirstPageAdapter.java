package com.luxury.fox.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luxury.fox.R;

import java.util.ArrayList;
import java.util.List;

public class FirstPageAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private List<String> dataList = new ArrayList<>();
    public FirstPageAdapter(Context context){
        this.mContext = context;

    }

    public void setData(){
        for(int i=0;i<200;i++){
            dataList.add("i = "+i);
        }
        notifyDataSetChanged();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.first_page_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder = (MyHolder) holder;
        myHolder.tv.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

  static   class MyHolder extends RecyclerView.ViewHolder{
      public   TextView tv;
        public MyHolder(View itemView) {
            super(itemView);
            tv= itemView.findViewById(R.id.tv_test);
        }
    }
}
