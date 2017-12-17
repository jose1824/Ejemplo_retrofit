package com.cookiecat.retrofitejemplo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cookiecat.retrofitejemplo.dataPokemon.remote.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jesus on 16/12/17.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.PokemonViewHolder> {

    private List<Result> list;
    private Context context;

    public MainAdapter(Context context, List<Result> list) {
        this.list = list;

        this.context = context;
    }

    public void swap(List<Result> newList) {
        list.clear();
        list.addAll(newList);
        notifyDataSetChanged();

    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PokemonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_pokemon, parent, false));
    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, final int position) {
        final Result pokemon = list.get(position);
        holder.tvName.setText(pokemon.getName());
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_name);
        }
    }
}
