package com.example.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continentList;
    private Listener listener;

    public ContinentAdapter(ArrayList<Continent> arrayList, Listener listener) {
        this.continentList = arrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentsBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public Continent getContinent(int position) {
        return continentList.get(position);
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ItemContinentsBinding binding;

        public ContinentViewHolder(@NonNull ItemContinentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continent continent) {
            binding.tvContinent.setText(continent.getName());
            binding.imgView.setImageResource(continent.getImageResource());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(continent);
                }
            });

        }
    }

}