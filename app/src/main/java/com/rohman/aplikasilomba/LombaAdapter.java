package com.rohman.aplikasilomba;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class LombaAdapter extends RecyclerView.Adapter<LombaAdapter.ViewHolder> {

    private ArrayList<Lomba> list;

    LombaAdapter(ArrayList<Lomba> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_terbaru_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Lomba lomba = list.get(position);
        Glide.with(holder.itemView.getContext()).load(lomba.getImg_lomba()).into(holder.img_lomba);
        holder.tv_des_terbaru.setText(lomba.getTv_des_lomba());
        holder.tv_jdl_terbaru.setText(lomba.getTv_jdl_lomba());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(holder.itemView.getContext(),Detail.class);
                String[] lombaIntent = {
                        lomba.getTv_jdl_lomba(),
                        lomba.getTv_des_lomba(),
                        lomba.getTv_syarat_lomba(),
                        lomba.getTv_hadiah_lomba()
                };
                detail.putExtra("lomba",lombaIntent);
                detail.putExtra("imgLomba",lomba.getImg_lomba());
                holder.itemView.getContext().startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_jdl_terbaru;
        TextView tv_des_terbaru;
        ImageView img_lomba;

        ViewHolder(View view) {
            super(view);
            tv_des_terbaru = view.findViewById(R.id.tv_des_lomba);
            tv_jdl_terbaru = view.findViewById(R.id.tv_jdl_lomba);
            img_lomba = view.findViewById(R.id.img_lomba);
        }
    }
}