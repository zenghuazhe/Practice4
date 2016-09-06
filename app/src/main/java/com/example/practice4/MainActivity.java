package com.example.practice4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String NUMBER="number";
    private final static String SEX="sex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"曾华哲","林磊","胡忠宇","肖天栋"};
        String[] numbers={"0121","0129","0348","0277"};
        String[] sexs={"男，1402班","男，1402班","男，1402班","男，1401班"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, names[i]);
            item.put(NUMBER, numbers[i]);
            item.put(SEX, sexs[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,NUMBER,SEX},new int[]{R.id.sName,R.id.sNum,R.id.sSex});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);


    }
}
