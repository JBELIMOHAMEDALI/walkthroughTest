package com.example.walkthroughtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class listCampActivity extends AppCompatActivity {

    private listCampAdapter pad;
    private RecyclerView.LayoutManager LM;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_camp);
        List<Camp> lstPr=new ArrayList<Camp>();
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        lstPr.add(new Camp("nom","soustitre"));
        rv= findViewById(R.id.recyclerview_camp);
        LM=new LinearLayoutManager(this);
        rv.setLayoutManager(LM);
        pad=new listCampAdapter(lstPr, this);
        rv.setAdapter(pad);
        DividerItemDecoration d=new DividerItemDecoration(rv.getContext(),DividerItemDecoration.VERTICAL);
        rv.addItemDecoration(d);
    }
}