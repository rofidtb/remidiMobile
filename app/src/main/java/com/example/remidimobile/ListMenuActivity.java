package com.example.remidimobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class ListMenuActivity extends AppCompatActivity {
    FrameLayout c1,c2,c3,c4,c5,c6,c7,c8,c9;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_menu);

        c1 = findViewById(R.id.fragment1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f1();
                loadFragment(fragment,1);
            }
        });

        c2 = findViewById(R.id.fragment2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f2();
                loadFragment(fragment,2);
            }
        });

        c3 = findViewById(R.id.fragment3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f3();
                loadFragment(fragment,3);
            }
        });

        c4 = findViewById(R.id.fragment4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f4();
                loadFragment(fragment,4);
            }
        });

        c5 = findViewById(R.id.fragment5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f5();
                loadFragment(fragment,5);
            }
        });

        c6 = findViewById(R.id.fragment6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f6();
                loadFragment(fragment,6);
            }
        });

        c7 = findViewById(R.id.fragment7);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f7();
                loadFragment(fragment,7);
            }
        });

        c8 = findViewById(R.id.fragment8);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f8();
                loadFragment(fragment,8);
            }
        });

        c9 = findViewById(R.id.fragment9);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new f9();
                loadFragment(fragment,9);
            }
        });
    }
    private void loadFragment(Fragment fragment,int foo){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (foo == 1)
            transaction.replace(R.id.fragment1,fragment);
        else if (foo == 2)
            transaction.replace(R.id.fragment2,fragment);
        else if (foo == 3)
            transaction.replace(R.id.fragment3,fragment);
        else if (foo == 4)
            transaction.replace(R.id.fragment4,fragment);
        else if (foo == 5)
            transaction.replace(R.id.fragment5,fragment);
        else if (foo == 6)
            transaction.replace(R.id.fragment6,fragment);
        else if (foo == 7)
            transaction.replace(R.id.fragment7,fragment);
        else if (foo == 8)
            transaction.replace(R.id.fragment8,fragment);
        else
            transaction.replace(R.id.fragment9,fragment);

        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}

