package com.example.jack.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jack.view.R;
import com.example.jack.view.activity.SpannableStringBuilderTest;
import com.example.jack.view.activity.UseRecyclerview.RecycleHome;
import com.example.jack.view.activity.customView.customActivity.CustomViewActivity;
import com.example.jack.view.util.ActivityUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 18-5-1.
 */

public class MainRecycleAdapter extends RecyclerView.Adapter<MainRecycleAdapter.MyViewHolder> {
    private List<String> mDate = new ArrayList<>();
    private Context context;

    public MainRecycleAdapter(List<String> mDate, Context context) {
        this.mDate = mDate;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv.setText(mDate.get(position));
        holder.tv.setHeight(100 + (position / 30) * 30);//动态设置recycle的高度

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        ActivityUtil.startActivity(CustomViewActivity.class);
                        break;
                    case 1:
                        ActivityUtil.startActivity(RecycleHome.class);
                        break;
                    case 2:
                        ActivityUtil.startActivity(SpannableStringBuilderTest.class);
                        break;
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }


}
