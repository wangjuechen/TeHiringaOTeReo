package company.com.tehiringaotereoTest.Utilities;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class PhoneUtils {
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    public static int getScreenW(Activity activity) {
        DisplayMetrics dm;
        dm = activity.getResources().getDisplayMetrics();
        int w = dm.widthPixels;
        return w;
    }


}
