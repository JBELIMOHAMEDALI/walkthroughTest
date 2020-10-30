package com.example.walkthroughtest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listCampAdapter extends RecyclerView.Adapter<listCampAdapter.CampViewHolder> {

    List<Camp> listeCamp;
    Context context;

    public listCampAdapter (List<Camp> listeCamp, Context context) {
        this.listeCamp = listeCamp;
        this.context=context;
    }

    @NonNull
    @Override
    public CampViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vue= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_camp_item,parent,false);
        CampViewHolder PVH=new CampViewHolder(vue);
        return PVH;
    }

    @Override
    public void onBindViewHolder(@NonNull CampViewHolder holder, int position) {
        Camp pr=listeCamp.get(position);
        holder.nom.setText(pr.getLibelle());
        holder.quantite.setText(pr.getQuantité());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Libelle: "+listeCamp.get(position).getLibelle()+ "\n quantite :" + listeCamp.get(position).getQuantité(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listeCamp.size();
    }

    public static class CampViewHolder extends RecyclerView.ViewHolder{
        TextView nom;
        TextView quantite;

        public CampViewHolder(@NonNull View itemView) {
            super(itemView);
            nom=itemView.findViewById(R.id.lib);
            quantite=itemView.findViewById(R.id.sous_nom);

        }
    }
}
