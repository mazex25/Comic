package com.example.appdoctruyen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;
import androidx.appcompat.widget.Toolbar;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public class Test extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textView=findViewById(R.id.tv_test);

        String a="ĐỆ NHẤT DANH SÁCH\n" +
                "VÕ LUYỆN ĐỈNH PHONG\n" +
                "THÔNG U ĐẠI THÁNH\n" +
                "TA LÀ CHÍ TÔN\n" +
                "THƯƠNG NGUYÊN ĐỒ\n" +
                "THẦN HỒN VÕ ĐẾ\n" +
                "LĂNG THIÊN THẦN ĐẾ\n" +
                "TU LA KIẾM TÔN\n" +
                "KHOA KỸ ĐẠI TIÊN TÔNG\n" +
                "VÕ THẦN CHÚA TỂ\n" +
                "TA LÀ ĐẠI THẦN TIÊN\n" +
                "ĐƯỜNG DẦN TẠI DỊ GIỚI\n" +
                "THANH NINH CHI HẠ \n" +
                "BẠN HỌC CỦA TÔI LÀ LÍNH ĐÁNH THUÊ\n" +
                "TÌNH YÊU TUỔI TRẺ\n" +
                "HỌC VIỆN CAO THỦ\n" +
                "SỰ TRẢ THÙ CỦA NỮ VƯƠNG\n" +
                "DANH MÔN CHÍ ÁI\n" +
                "THUẦN TÌNH NHA ĐẦU HOẢ LẠT LẠT\n" +
                "THÔNG LINH PHI";
        textView.setText(ChuyenDoiChu(a));
        String f=ChuyenDoiChu((a));
        System.out.println(f);
    }

    public static String ChuyenDoiChu(String s) {

        s=s.toLowerCase();
        s=s.replaceAll("đ", "d");
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }

}