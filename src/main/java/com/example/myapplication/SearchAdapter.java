package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<TextViewHolder> {

    private List<String> mItems = new ArrayList<>();

    public TextViewHolder onCreateViewHolder(ViewGroup parent ,int ViewType){
        return new TextViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_text,parent,false));

    }

    public void onBindViewHolder(TextViewHolder holder, int position){
        holder.bind(mItems.get(position));
    }

    public int getItemCount(){
        return mItems.size();
    }

    public void notifyItems(List<String> items)
    {
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }
}
