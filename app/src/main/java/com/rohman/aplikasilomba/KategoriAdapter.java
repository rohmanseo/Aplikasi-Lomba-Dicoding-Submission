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

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.ViewHolder> {

    private ArrayList<Kategori> list;

    KategoriAdapter(ArrayList<Kategori> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_kategori_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext()).load(list.get(position).getImg_kategori()).into(holder.imgKategori);
        holder.tvKategori.setText(list.get(position).getTv_kategori());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DaftarKategori.class);
                intent.putExtra("kategori", list.get(position).getTv_kategori());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgKategori;
        TextView tvKategori;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgKategori = itemView.findViewById(R.id.img_kategori);
            tvKategori = itemView.findViewById(R.id.tv_kategori);
        }
    }
}
