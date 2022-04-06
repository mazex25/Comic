package com.example.appdoctruyen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdoctruyen.R;
import com.example.appdoctruyen.adapter.LSNhanDiemAdapter;
import com.example.appdoctruyen.database.Database;
import com.example.appdoctruyen.model.TaiKhoan;
import com.example.appdoctruyen.model.DiemThuong;

import java.util.ArrayList;

public class LichSuNhanDiem extends AppCompatActivity {
    String email;
    TaiKhoan taiKhoan;
    Database db;

    public RecyclerView rcv;
    public LSNhanDiemAdapter rcv_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lichsunhandiem);
        db=new Database(this);
        Anhxa();

        Intent i = getIntent();
        email=i.getStringExtra("email");
        taiKhoan = db.getTaiKhoan(email);

        recyclerViewDiemThuong();
    };

    public void recyclerViewDiemThuong() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);

        ArrayList<DiemThuong> diemThuong=db.getDiemThuong(taiKhoan.getId());
        rcv_adapter=new LSNhanDiemAdapter(this,diemThuong);
        rcv.setAdapter(rcv_adapter);
    }

    public void Anhxa(){
        rcv=findViewById(R.id.rcv_lsnd);
    }
}
