package com.example.recycleview_card_practice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<viewHolder>{

    ArrayList<Model> data;
    Context context;
    public myAdapter(ArrayList<Model> data,Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_row_design, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final Model temp = data.get(position);

        holder.title.setText(data.get(position).getTitle());
        holder.techDesc.setText(data.get(position).getTechDescription());
        holder.techLogo.setImageResource(data.get(position).getImage());

        holder.techLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DataActivity.class);
                intent.putExtra("imagePath",temp.getImage());
                intent.putExtra("titleString",temp.getTitle());
                intent.putExtra("descSting",temp.getTechDescription());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
