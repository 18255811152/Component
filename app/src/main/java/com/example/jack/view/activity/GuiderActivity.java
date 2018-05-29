package com.example.jack.view.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jack.view.MainActivity;
import com.example.jack.view.R;
import com.example.jack.view.util.ActivityUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class GuiderActivity extends FragmentActivity {
    private Button btn_go;
    private static final int[] resource = new int[]{R.drawable.dogview_dog, R.drawable.dogview_dog,
            R.drawable.dogview_dog, R.drawable.dogview_dog};
    private static final String TAG = GuiderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        btn_go = findViewById(R.id.btn_go);
        MyFragmentStatePager adpter = new MyFragmentStatePager(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adpter);
        ColorAnimationView colorAnimationView = (ColorAnimationView) findViewById(R.id.ColorAnimationView);
        colorAnimationView.setmViewPager(viewPager, resource.length);

        colorAnimationView
                .setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position,
                                               float positionOffset, int positionOffsetPixels) {
                        Log.e("TAG", "onPageScrolled");
                    }

                    @Override
                    public void onPageSelected(int position) {
                        //Button显示或隐藏
                        if (position == resource.length - 1) {
                            btn_go.setVisibility(View.VISIBLE);
                        } else {
                            btn_go.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                        Log.e("TAG", "onPageScrollStateChanged");
                    }
                });
    }

    @OnClick(R.id.btn_go)
    public void onViewClicked() {
        ActivityUtil.startActivity(MainActivity.class);
        finish();
    }


    public static class MyFragmentStatePager
            extends FragmentStatePagerAdapter {

        public MyFragmentStatePager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new MyFragment(position);
        }

        @Override
        public int getCount() {
            return resource.length;
        }
    }

    @SuppressLint("ValidFragment")
    public static class MyFragment
            extends Fragment {
        private int position;

        public MyFragment(int position) {
            this.position = position;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageResource(resource[position]);
            return imageView;
        }
    }


}
