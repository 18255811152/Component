package com.example.jack.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jack.view.MSPropties;
import com.example.jack.view.R;
import com.example.jack.view.base.BaseViewHolder;
import com.example.jack.view.util.BannerConfigInit;
import com.example.jack.view.util.ToastUtil;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by jack on 18-5-11.
 */

public class RecyleHomeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private final int BANNER = 0;
    private final int SCORTEXT = 1;
    private final int CONTENT = 2;
    private final int BOTTOM_COPRITY = 3;
    private static LayoutInflater mLayoutInflater;


    private Context mContext;
    private BannerViewHolder bannerViewHolder;
    private CorTextViewHolder corTextViewHolder;
    private ContentViewHolder contentViewHolder;
    private BottomCoprutyViewHolder bottomCoprutyViewHolder;

    public RecyleHomeAdapter(Context context, LayoutInflater layoutInflater) {
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case BANNER:
                bannerViewHolder = new BannerViewHolder(mLayoutInflater.inflate(R.layout.item_banner, parent, false));
                return bannerViewHolder;
            case SCORTEXT:
                corTextViewHolder = new CorTextViewHolder(mLayoutInflater.inflate(R.layout.item_coretextview, parent, false));
                return corTextViewHolder;
            case CONTENT:
                contentViewHolder = new ContentViewHolder(mLayoutInflater.inflate(R.layout.item_coretextview, parent, false));
                return contentViewHolder;
            case BOTTOM_COPRITY:
                bottomCoprutyViewHolder = new BottomCoprutyViewHolder(mLayoutInflater.inflate(R.layout.item_coretextview, parent, false));
                return bottomCoprutyViewHolder;
            default:
        }
        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBindView();
    }

    @Override
    public int getItemCount() {
        return 4;
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return BANNER;
            case 1:
                return SCORTEXT;
            case 2:
                return CONTENT;
            case 3:
                return BOTTOM_COPRITY;
        }
        return CONTENT;
    }

    class BannerViewHolder extends BaseViewHolder {
        @BindView(R.id.banner)
        Banner banner;


        public BannerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onBindView() {
            super.onBindView();
            BannerConfigInit configInit = new BannerConfigInit(banner, MSPropties.getImageRes(), MSPropties.getimageTitle(), new OnBannerListener() {
                @Override
                public void OnBannerClick(int position) {
                    ToastUtil.showShortToast("sssssssssssss");
                }
            });
            configInit.start();
        }
    }

    class CorTextViewHolder extends BaseViewHolder {
        @BindView(R.id.text)
        TextView text;

        @Override
        public void onBindView() {
            super.onBindView();
            text.setText("wo shi  di  er  ge ");
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        public CorTextViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    class ContentViewHolder extends BaseViewHolder {
        @BindView(R.id.text)
        TextView text;

        @Override
        public void onBindView() {
            super.onBindView();
            text.setText("wo shi  di  san  ge ");
        }

        public ContentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class BottomCoprutyViewHolder extends BaseViewHolder {
        @BindView(R.id.text)
        TextView text;

        @Override
        public void onBindView() {
            super.onBindView();
            text.setText("wo shi  di  si  ge ");
        }

        public BottomCoprutyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    /**
     * 设置banner的数据
     */
    public static void setBanner() {

    }

}
