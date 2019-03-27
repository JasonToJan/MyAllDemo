package jan.jason.myalldemo.utils;

import android.app.Activity;
import android.content.Intent;

import jan.jason.myalldemo.MainActivityNDK;
import jan.jason.myalldemo.view.ViewMainActivity;

/**
 * desc: 跳转到Activity工具类
 * *
 * user: JasonJan 1211241203@qq.com
 * time: 2019/3/27 9:06
 **/
public class KeepToActivityUtils {

    public static void keepToViewMainActivity(Activity activity){
        Intent intent=new Intent(activity,ViewMainActivity.class);
        activity.startActivity(intent);
    }

    public static void keepToNDKMainActivity(Activity activity){
        Intent intent=new Intent(activity,MainActivityNDK.class);
        activity.startActivity(intent);
    }
}
