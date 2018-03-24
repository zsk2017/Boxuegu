package cn.edu.gdmec.android.boxuegu.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2018/3/22.
 */

public class AnalysisUtils {
    //从SharedPreferences中读取用户名
    public static String readLoginUserName(Context context){
        SharedPreferences sp = context.getSharedPreferences("loginInfo",
                Context.MODE_PRIVATE);
        String userName = sp.getString("loginUserName","");
        return userName;
    }
}
