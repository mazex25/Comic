package com.example.appdoctruyen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdoctruyen.R;
import com.example.appdoctruyen.adapter.BinhLuanAdapter;
import com.example.appdoctruyen.adapter.DocChapterAdapter;
import com.example.appdoctruyen.adapter.ShowDanhGiaAdapter;
import com.example.appdoctruyen.database.Database;
import com.example.appdoctruyen.model.BinhLuan;
import com.example.appdoctruyen.model.DanhGia;
import com.example.appdoctruyen.model.TaiKhoan;

import java.util.ArrayList;

public class ShowDanhGia extends AppCompatActivity {

    Database db;

    private RecyclerView rcv_danhgia;
    private ShowDanhGiaAdapter rcv_adapter;
    TaiKhoan taiKhoan;
    String email;
    TextView tv_danhgia_tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdanhgia);

        db=new Database(this);
        Anhxa();
        Intent intent=getIntent();
        email=intent.getStringExtra("email");
        taiKhoan=db.getTaiKhoan(email);

        int tongdanhgia=db.getTongDanhGia(taiKhoan.getId());
        tv_danhgia_tong.setText("Tổng đánh giá: "+tongdanhgia);
        recyclerViewDanhGia();
    };

    private void recyclerViewDanhGia(){
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rcv_danhgia.setLayoutManager(linearLayoutManager2);
        ArrayList<DanhGia> listDanhGia=db.getShowDanhGia(taiKhoan.getId());
        rcv_adapter=new ShowDanhGiaAdapter(this,listDanhGia,db);
        rcv_danhgia.setAdapter(rcv_adapter);
    }

    private void Anhxa(){
        rcv_danhgia=findViewById(R.id.rcv_danhgia_tong);
        tv_danhgia_tong=findViewById(R.id.tv_danhgia_tong);
    }
}
