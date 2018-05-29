package com.example.jack.view;

import android.content.Context;

import com.example.jack.view.base.BaseApplication;
import com.example.jack.view.bean.BannerRes;
import com.example.jack.view.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 18-5-2.
 */

public class MSPropties {

    public static String[] HomeDate = BaseApplication.getContext().getResources().getStringArray(R.array.homeDate);
    public static String[] CustomViewDate = BaseApplication.getContext().getResources().getStringArray(R.array.customViewDate);
    public static List<BannerRes> bannerImageRes = new ArrayList<>();


    public static String[] imageUrl = new String[]{"http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=0&spn=0&di=211625404100&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=61561371%2C604619965&os=617330802%2C2677125310&simid=3396450852%2C236865172&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic.58pic.com%2F58pic%2F13%2F66%2F58%2F20258PICpDh_1024.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bcbrtv_z%26e3Bv54AzdH3Frf1AzdH3F8nmmcbda_z%26e3Bip4s&gsm=0&islist=&querylist=", "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=1&spn=0&di=147781367360&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=302701032%2C2300144492&os=2254158680%2C3118847255&simid=3383544786%2C381534848&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg05.tooopen.com%2Fimages%2F20150820%2Ftooopen_sy_139205349641.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bp555rjg_z%26e3Bv54AzdH3FetjoAzdH3F8ac0a0c_z%26e3Bip4s&gsm=0&islist=&querylist=", "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=2&spn=0&di=1724051670&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=3873040750%2C1105020127&os=1323462968%2C483572722&simid=3367468327%2C266489853&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0125fd5770dfa50000018c1b486f15.jpg%401280w_1l_2o_100sh.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bzv55s_z%26e3Bv54_z%26e3BvgAzdH3Fo56hAzdH3FZMTYcOThaNzI%3D_z%26e3Bip4s&gsm=0&islist=&querylist=", "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=3&spn=0&di=64456787670&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2913363851%2C2723960644&os=1423318422%2C2243010952&simid=4282571797%2C687665414&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0123e05543863d0000019ae99bdfc4.jpg%40900w_1l_2o_100sh.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bzv55s_z%26e3Bv54_z%26e3BvgAzdH3Fo56hAzdH3FZNTMxM3vdOA%3D%3DAzdH3Fd_z%26e3Bip4s&gsm=0&islist=&querylist=", "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=4&spn=0&di=43027479440&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=1710356827%2C4037454180&os=2127393365%2C91076803&simid=0%2C0&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0191f1589c3469a8012060c83cebf3.jpg%401280w_1l_2o_100sh.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bzv55s_z%26e3Bv54_z%26e3BvgAzdH3Fo56hAzdH3FZM3AxODEcND2%3DAzdH3F0_z%26e3Bip4s&gsm=0&islist=&querylist="};

    public static String[] imageTitle = new String[]{"111", "2222", "333", "444"};


    public MSPropties() {

    }

    /**
     * 1.自定义视图
     * 2.recycle的使用
     */
    public static List getHomeDate(Context context) {

        List<String> itemName = new ArrayList<>();
        for (String homeDateItem : MSPropties.HomeDate) {
            itemName.add(homeDateItem);
        }
        return itemName;
    }

    /**
     * View的数据
     */
    public static List getCustomViewDate() {
        List<String> itemView = new ArrayList<>();
        for (String CustomViewDateItem : MSPropties.CustomViewDate) {
            itemView.add(CustomViewDateItem);
        }
        return itemView;
    }

    /**
     * banner图片集合
     */
    public static List getBannerImageRes() {
        List<BannerRes> bannerRes = new ArrayList<>();
        for (int count = 0; count < imageUrl.length; count++) {
            BannerRes bannerRes1 = new BannerRes();
            bannerRes1.setImage(imageUrl[count]);
            bannerRes1.setTitle(imageTitle[count]);
            bannerRes.add(bannerRes1);
        }
        return bannerRes;
    }

    /**
     * 圖片的url地址集合
     *
     * @return
     */
    public static List getImageRes() {
        List<String> imageRes = new ArrayList<>();
        for (int count = 0; count < imageUrl.length; count++) {
            imageRes.add(imageUrl[count]);

        }
        return imageRes;
    }

    /**
     * 圖片对应的title的名字集合
     *
     * @return
     */
    public static List getimageTitle() {
        List<String> imageRes = new ArrayList<>();
        for (int count = 0; count < imageTitle.length; count++) {
            imageRes.add(imageTitle[count]);

        }
        return imageRes;

    }

}
