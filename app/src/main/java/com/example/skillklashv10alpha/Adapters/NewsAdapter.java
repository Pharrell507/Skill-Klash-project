package com.example.skillklashv10alpha.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.skillklashv10alpha.ArrayLists.Newsdb;
import com.example.skillklashv10alpha.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<Newsdb> news;

    public NewsAdapter(ArrayList<Newsdb> news){this.news = news;}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public ViewHolder(View itemview) {
            super(itemview);
            img = (ImageView) itemview.findViewById(R.id.pic);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_items_layout,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.img.setImageResource(news.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }
}
