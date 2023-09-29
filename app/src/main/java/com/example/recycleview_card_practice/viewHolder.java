package com.example.recycleview_card_practice;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder{
    TextView title,techDesc;
    ImageView techLogo;
    public viewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.t1);
        techDesc = itemView.findViewById(R.id.t2);
        techLogo = itemView.findViewById(R.id.logoIMG);
    }
}
