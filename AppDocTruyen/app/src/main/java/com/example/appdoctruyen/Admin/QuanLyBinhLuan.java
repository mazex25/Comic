package com.example.appdoctruyen.Admin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdoctruyen.R;
import com.example.appdoctruyen.adapter.AdapterAdmin.QLBinhLuanAdapter;
import com.example.appdoctruyen.database.Database;
import com.example.appdoctruyen.model.BinhLuan;
import com.example.appdoctruyen.model.TaiKhoan;

import java.util.ArrayList;

public class QuanLyBinhLuan extends AppCompatActivity {
    Database db;
    private RecyclerView rcv;
    private QLBinhLuanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quanlybinhluan);

        Anhxa();
        db=new Database(this);

        recyclerViewQLBinhLuan();
    }

    private void recyclerViewQLBinhLuan(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);
        ArrayList<BinhLuan> list=db.getListBinhLuan();
        adapter=new QLBinhLuanAdapter(this,list,db);
        rcv.setAdapter(adapter);
    }

    private void Anhxa() {
        rcv=findViewById(R.id.rcv_quanlybinhluan);
    }
}
