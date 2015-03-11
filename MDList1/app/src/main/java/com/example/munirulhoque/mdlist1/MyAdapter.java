package com.example.munirulhoque.mdlist1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by munirul.hoque on 3/11/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

   private DataItems[] dataItem;

    public MyAdapter(DataItems[] dataItem)
    {
        this.dataItem = dataItem;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
   {
       public TextView tv ;
       public ImageView iv;

       public MyViewHolder(View itemLayoutView)
       {
           super(itemLayoutView);
           tv = (TextView)itemLayoutView.findViewById(R.id.id_textview);
           iv = (ImageView)itemLayoutView.findViewById(R.id.id_icon);
       }
   }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        MyViewHolder myHolder = new MyViewHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.tv.setText(dataItem[i].getTitle());
        myViewHolder.iv.setImageResource(dataItem[i].getImageUrl());
    }

    @Override
    public int getItemCount() {
        return dataItem.length;
    }
}
