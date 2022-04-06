package com.example.appdoctruyen.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdoctruyen.TheLoaiLuotXemFragment;
import com.example.appdoctruyen.TheLoaiNewFragment;
import com.example.appdoctruyen.TheLoaiVoteFragment;
import com.example.appdoctruyen.fragment.CuaHangFragment;
import com.example.appdoctruyen.fragment.KhoVatPhamFragment;
import com.example.appdoctruyen.fragment.LichSuDoiFragment;

public class FragmentAdapterCuaHang extends FragmentStateAdapter {
    public  FragmentAdapterCuaHang(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 1:
                return new KhoVatPhamFragment();
            case 2:
                return new LichSuDoiFragment();
        }
        return new CuaHangFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
