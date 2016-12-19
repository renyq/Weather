package com.renyq.weather.app;

import android.os.Environment;

import java.io.File;

/**
 * Created by codeest on 2016/8/3.
 */
public class Constants {


    //================= KEY ====================

    public static final String HEWEATHER_API = "331f4c7b25594566a159950a0c6398ff"; //需要APIKEY请去 http://www.tianapi.com/#wxnew 申请,复用会减少访问可用次数


    //================= PATH ====================

    public static final String PATH_DATA = WeatherApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";

    //================= PREFERENCE ====================

    public static final String SP_NIGHT_MODE = "night_mode";

    public static final String SP_NO_IMAGE = "no_image";

    public static final String SP_AUTO_CACHE = "auto_cache";

    public static final String SP_CURRENT_ITEM = "current_item";

    public static final String SP_LIKE_POINT = "like_point";

    public static final String SP_VERSION_POINT = "version_point";

    public static final String SP_MANAGER_POINT = "manager_point";

    //================= INTENT ====================
    public static final String IT_GANK_TYPE = "type";

    public static final String IT_GANK_TYPE_CODE = "type_code";

    public static final String IT_DETAIL_TITLE = "title";

    public static final String IT_DETAIL_URL = "url";

    public static final String IT_DETAIL_IMG_URL = "img_url";

    public static final String IT_DETAIL_ID = "id";

    public static final String IT_DETAIL_TYPE = "type";

    public static final String IT_GOLD_TYPE = "type";

    public static final String IT_GOLD_TYPE_STR = "type_str";

    public static final String IT_GOLD_MANAGER = "manager";
}
