package com.example.a6_4;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TourFragment extends Fragment {
    private View view;
    public RecyclerView mCollectRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //加载系统里面的布局文件
        view = inflater.inflate(R.layout.recycleview, container, false);
        init_recylerview();
        return view;
    }

    private void init_recylerview(){
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new MyAdapter(getContext(),generate_customer_list());
        recyclerView.setAdapter(adapter);
    }
    private ListElement[] generate_customer_list() {

        ListElement[] elements = {
                new ListElement(0, "宝马"),
                new ListElement(1, "宝马X3 ", "自动挡", "5", "2019", "汽油", "5.9", 2800, ""),
                new ListElement(1, "宝马X1", "手动挡", "3", "2019", "汽油", "6.8", 2609, ""),
                new ListElement(1, "宝马X7", "自动挡", "3", "2019", "汽油", "5.8", 2620, ""),
                new ListElement(0, "奔驰"),
                new ListElement(1, "奔驰A级160", "手动挡", "5", "2019", "柴油", "5.9", 2860, ""),
                new ListElement(1, "奔驰CLK", "自动挡", "3", "2019", "柴油", "7.1", 2883, ""),
                new ListElement(1, "200K 敞篷版", "手动挡", "3", "2019", "柴油", "5.5", 2925, ""),
                new ListElement(0, "奥迪"),
                new ListElement(1, "奥迪A3", "手动挡", "5", "2019", "柴油", "5.9", 2860, ""),
                new ListElement(1, "奥迪A4L", "自动挡", "3", "2019", "柴油", "7.1", 2883, ""),
                new ListElement(1, "奥迪A6L", "手动挡", "3", "2019", "柴油", "5.5", 2925, "")
        };

        return elements;
    }
}

