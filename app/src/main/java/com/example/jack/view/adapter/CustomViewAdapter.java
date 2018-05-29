package com.example.jack.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jack.view.DogMainActivity;
import com.example.jack.view.MSPropties;
import com.example.jack.view.R;
import com.example.jack.view.activity.customView.customActivity.XFlowLayoutActvity;
import com.example.jack.view.util.ActivityUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by jack on 18-5-3.
 */

public class CustomViewAdapter extends RecyclerView.Adapter<CustomViewAdapter.MyHolder> {

    private List<String> mDate = new ArrayList<>();
    private Context context;

    public CustomViewAdapter(List<String> mDate, Context context) {
        this.mDate = mDate;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        holder.tv.setText(mDate.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        ActivityUtil.startActivity(DogMainActivity.class);
                        break;
                    case 1:
                        ActivityUtil.startActivity(XFlowLayoutActvity.class);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }
    class MyHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }


}
