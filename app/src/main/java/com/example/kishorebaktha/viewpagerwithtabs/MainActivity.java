package com.example.kishorebaktha.viewpagerwithtabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
 private android.support.v7.widget.Toolbar toolbar;
 ViewPager viewPager;
 ViewPagerAdapter viewPagerAdapter;
 private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager=findViewById(R.id.pager);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
