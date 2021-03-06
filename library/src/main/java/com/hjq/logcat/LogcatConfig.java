package com.hjq.logcat;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/Logcat
 *    time   : 2020/01/24
 *    desc   : 日志配置
 */
final class LogcatConfig {

    private static SharedPreferences sConfig;

    /**
     * 初始化
     */
    static void init(Context context) {
        sConfig = context.getSharedPreferences("logcat", Context.MODE_PRIVATE);
    }

    /**
     * 申请权限次数
     */
    private static final String PERMISSIONS_COUNT = "permissions_count";

    static int getPermissionsCount() {
        return sConfig.getInt(PERMISSIONS_COUNT, 0);
    }

    static void setPermissionsCount(int count) {
        sConfig.edit().putInt(PERMISSIONS_COUNT, count).apply();
    }

    /**
     * 日志过滤等级
     */
    private static final String LOGCAT_LEVEL = "logcat_level";

    static String getLogcatLevel() {
        return sConfig.getString(LOGCAT_LEVEL, "V");
    }

    static void setLogcatLevel(String level) {
        sConfig.edit().putString(LOGCAT_LEVEL, level).apply();
    }

    /**
     * 搜索关键字
     */
    private static final String LOGCAT_TEXT = "logcat_text";

    static String getLogcatText() {
        return sConfig.getString(LOGCAT_TEXT, "");
    }

    static void setLogcatText(String keyword) {
        sConfig.edit().putString(LOGCAT_TEXT, keyword).apply();
    }
}