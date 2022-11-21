package com.example.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{

    private ArrayList<Country> countryList;

    public CountryAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CountryViewHolder(ItemCountryBinding
                .inflate(LayoutInflater.from(parent.getContext()),parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;
        public CountryViewHolder(@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Country country){
            binding.imgCountry.setImageResource(country.getCountryFlag());
            binding.tvCountry.setText(country.getCountryName());
            binding.tvCapital.setText(country.getCapitalName());

        }
    }
}