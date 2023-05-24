package com.example.networking;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public ArrayList<Mountain> MountainsList = new ArrayList<>();

    public MyAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Mountain item = this.MountainsList.get(position);
        holder.Name.setText("Name: " + item.getName()); // Name
        holder.Company.setText("Company: " + item.getCompany()); // Company
        holder.Location.setText("Location: " + item.getLocation());
        holder.Category.setText("Category: " + item.getCategory()); // Category
        holder.Size.setText("Size: " + Integer.toString(item.getSize())); //
        holder.Cost.setText("Cost: " + Integer.toString(item.getCost())); // Cost

    }

    @Override
    public int getItemCount() {
        return MountainsList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView Name;
        private final TextView Company;
        private final TextView Location;
        private final TextView Category;
        private final TextView Size;
        private final TextView Cost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.Name = itemView.findViewById(R.id.Name);
            this.Company = itemView.findViewById(R.id.Company);
            this.Location = itemView.findViewById(R.id.Location);
            this.Category = itemView.findViewById(R.id.Category);
            this.Size = itemView.findViewById(R.id.Size);
            this.Cost = itemView.findViewById(R.id.Cost);
        }



    }


}

