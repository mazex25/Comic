package com.example.appdoctruyen.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdoctruyen.fragment.CuaHangFragment;
import com.example.appdoctruyen.fragment.GoiYTruyenFragment;
import com.example.appdoctruyen.fragment.KhoVatPhamFragment;
import com.example.appdoctruyen.fragment.LichSuDocTruyenFragment;
import com.example.appdoctruyen.fragment.LichSuDoiFragment;

public class FragmentAdapterTuSach extends FragmentStateAdapter {

    public  FragmentAdapterTuSach(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 1:
                return new GoiYTruyenFragment();
        }
        return new LichSuDocTruyenFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
