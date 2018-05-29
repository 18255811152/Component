package com.example.jack.view.adapter;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jack.view.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 18-5-2.
 * <p>
 * /**
 * 用RecyclerView实现一个图片滚动的列表
 */

public class PictureScrollListAdapter extends RecyclerView.Adapter<PictureScrollListAdapter.MyHolder> {

    List<Integer> mDate = new ArrayList<>();
    Context mcontext;

    public PictureScrollListAdapter(Context context, List<Integer> mDate) {
        this.mcontext = context;
        this.mDate = mDate;
    }

    @Override

    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.item_pic_scroll_list, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.mImageView.setImageResource(mDate.get(position));
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public MyHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.image_scroll);
        }
    }

}
