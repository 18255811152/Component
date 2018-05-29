//package com.example.jack.view.util;
//
//import android.content.Context;
//import android.os.Build;
//import android.support.annotation.NonNull;
//import android.support.annotation.RequiresApi;
//import android.text.TextUtils;
//import android.webkit.CookieSyncManager;
//import android.webkit.WebSettings;
//
//
//import com.example.jack.view.net.TlsSniSocketFactory;
//import com.example.jack.view.net.TrueHostnameVerifier;
//
//import java.net.CookieManager;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import okhttp3.OkHttpClient;
//import okhttp3.Response;
//
//public class NetUtil {
//    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//    public static String getUserAgent(Context context) {
//        String userAgent = "";
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
//            try {
//                userAgent = WebSettings.getDefaultUserAgent(context);
//            } catch (Exception e) {
//                userAgent = System.getProperty("http.agent");
//            }
//        } else {
//            userAgent = System.getProperty("http.agent");
//        }
//        if (userAgent == null || "".equals(userAgent)) {
//            userAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
//        }
//
//
//        String ua = userAgent.replace("Android", "app_android");
//        userAgent = ua + "; app_version=v3.0";
//
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0, length = userAgent.length(); i < length; i++) {
//            char c = userAgent.charAt(i);
//            if (c <= '\u001f' || c >= '\u007f') {
//                sb.append(String.format("\\u%04x", (int) c));
//            } else {
//                sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
//
////    @NonNull
////    public static Map<String, String> setHeaders() {
////        Map<String, String> headers = new HashMap<>();
////        headers.put("Host", DataCenter.getInstance().getDomain());
////        headers.put("X-Requested-With", "XMLHttpRequest");
////        headers.put("User-Agent", "app_android;Android");
////        CookieManager cookieManager = CookieManager.getInstance();
////        String cookie = DataCenter.getInstance().getCookie();
////        LogUtils.e(String.format("请求的Cookie --> %s", cookie));
////        if (cookie != null && cookieManager != null) {//
////            headers.put("Cookie", cookie);
////            cookieManager.setCookie(DataCenter.getInstance().getDomain(), cookie);
////        }
////        return headers;
////    }
//
////    /**
////     * 登录后设置cookie
////     */
////    public static void setCookie(Response response) {
////        List<String> cookies = response.headers().values("Set-Cookie");
////        for (String cookie : cookies) {
////            if (cookie.contains("SID=") && cookie.length() > 80) {
////                LogUtils.e("登录后Cookie ==> " + cookie);
////                DataCenter.getInstance().setCookie(cookie);
////                CookieManager.getInstance().setCookie(DataCenter.getInstance().getDomain(), cookie);
////            }
////        }
////    }
//
//    /**
//     * 这个两个在 API level 21 被抛弃
//     * CookieManager.getInstance().removeSessionCookie();
//     * CookieManager.getInstance().removeAllCookie();
//     * <p>
//     * 推荐使用这两个， level 21 新加的
//     * CookieManager.getInstance().removeSessionCookies();
//     * CookieManager.getInstance().removeAllCookies();
//     **/
//    public static void removeCookies() {
//        CookieManager cookieManager = CookieManager.getInstance();
//        cookieManager.removeAllCookie();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            cookieManager.flush();
//        } else {
//            CookieSyncManager.createInstance(BoxApplication.getContext());
//            CookieSyncManager.getInstance().sync();
//        }
//    }
//
//    /**
//     * 将cookie同步到WebView
//     *
//     * @param url    WebView要加载的url
//     * @param cookie 要同步的cookie
//     * @return true 同步cookie成功，false同步cookie失败
//     */
//    public static boolean syncCookie(String url, String cookie) {
//        String domain = DataCenter.getInstance().getIp();
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//            android.webkit.CookieSyncManager cookieSyncManager = android.webkit.CookieSyncManager.createInstance(BoxApplication.getContext());
//            cookieSyncManager.sync();
//        }
//        CookieManager cookieManager = CookieManager.getInstance();
//        cookieManager.setCookie(url, cookie);
//        String newCookie = cookieManager.getCookie(domain);
//        return !TextUtils.isEmpty(newCookie);
//    }
//
//    public static String handleUrl(String url) {
//        String ip = DataCenter.getInstance().getIp();
//        // 是不是http开头
//        // 第一个字符是不是包含反斜杠
//        if (url == null) {
//            return "";
//        }
//        if (!url.contains("http") && !url.contains("www.")) {
//            if (url.indexOf("/") == 0) {
//                return (ip + url);
//            } else {
//                return (ip + "/" + url);
//            }
//        }
//        return url;
//    }
//
//    /**
//     * 创建 OkHttpClient.Builder
//     *
//     * @return
//     */
//    public static OkHttpClient.Builder getOkHttpClientBuilder() {
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.followRedirects(false)
//                .sslSocketFactory(new TlsSniSocketFactory(), new SSLUtil.TrustAllManager())
//                .hostnameVerifier(new TrueHostnameVerifier());
//        return builder;
//    }
//
////    public static String replaceIp2Domain(String mUrl) {
////        String ip = DataCenter.getInstance().getIp();
////        String domain = DataCenter.getInstance().getDomain();
////        String https = "https://";
////        String http = "http://";
////        String port8989 = ":8989";
////        String port8787 = ":8787";
////        if (ip.contains(https)) {
////            domain = https + domain;
////        } else if (ip.contains(http)) {
////            domain = http + domain;
////        }
////        if (ip.contains(port8989)) {
////            domain = domain + port8989;
////        } else if (ip.contains(port8787)) {
////            domain = domain + port8787;
////        }
////        mUrl = mUrl.replace(ip, domain);
////        return mUrl;
////    }
//}
