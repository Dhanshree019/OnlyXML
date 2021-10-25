package com.vkonex.onlyxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
List<FAQ> FAQList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView1=findViewById(R.id.RV1);
        recyclerView2=findViewById(R.id.RV2);
        recyclerView3=findViewById(R.id.RV3);
        recyclerView4=findViewById(R.id.RV4);
        initData();
        setRecyclerView1();
        setRecyclerView2();
        setRecyclerView3();
        setRecyclerView4();
    }

    private void setRecyclerView1() {
        FAQ_Adapter faqAdapter =new FAQ_Adapter(FAQList);
        recyclerView1.setAdapter(faqAdapter);
        recyclerView1.setHasFixedSize(true);
    }
    private void setRecyclerView2() {
        FAQ_Adapter faqAdapter =new FAQ_Adapter(FAQList);
        recyclerView2.setAdapter(faqAdapter);
        recyclerView2.setHasFixedSize(true);
    }
    private void setRecyclerView3() {
        FAQ_Adapter faqAdapter =new FAQ_Adapter(FAQList);
        recyclerView3.setAdapter(faqAdapter);
        recyclerView3.setHasFixedSize(true);
    }
    private void setRecyclerView4() {
        FAQ_Adapter faqAdapter =new FAQ_Adapter(FAQList);
        recyclerView4.setAdapter(faqAdapter);
        recyclerView4.setHasFixedSize(true);
    }

    private void initData() {
        FAQList=new ArrayList<>();
        FAQList.add(new FAQ("Open Collapsible","Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));
        FAQList.add(new FAQ("Open Collapsible","Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));



    }
}