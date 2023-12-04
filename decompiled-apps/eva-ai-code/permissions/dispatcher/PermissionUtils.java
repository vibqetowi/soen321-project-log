package permissions.dispatcher;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
/* loaded from: classes5.dex */
public final class PermissionUtils {
    private static final SimpleArrayMap<String, Integer> MIN_SDK_PERMISSIONS;

    static {
        SimpleArrayMap<String, Integer> simpleArrayMap = new SimpleArrayMap<>(13);
        MIN_SDK_PERMISSIONS = simpleArrayMap;
        simpleArrayMap.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        simpleArrayMap.put("android.permission.READ_CALL_LOG", 16);
        simpleArrayMap.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        simpleArrayMap.put("android.permission.WRITE_CALL_LOG", 16);
        simpleArrayMap.put("android.permission.BODY_SENSORS", 20);
        simpleArrayMap.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        simpleArrayMap.put("android.permission.WRITE_SETTINGS", 23);
        simpleArrayMap.put("android.permission.READ_PHONE_NUMBERS", 26);
        simpleArrayMap.put("android.permission.ANSWER_PHONE_CALLS", 26);
        simpleArrayMap.put("android.permission.ACCEPT_HANDOVER", 28);
        simpleArrayMap.put("android.permission.ACTIVITY_RECOGNITION", 29);
        simpleArrayMap.put("android.permission.ACCESS_MEDIA_LOCATION", 29);
        simpleArrayMap.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
    }

    private PermissionUtils() {
    }

    public static boolean verifyPermissions(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean permissionExists(String str) {
        Integer num = MIN_SDK_PERMISSIONS.get(str);
        return num == null || Build.VERSION.SDK_INT >= num.intValue();
    }

    public static boolean hasSelfPermissions(Context context, String... strArr) {
        for (String str : strArr) {
            if (permissionExists(str) && !hasSelfPermission(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasSelfPermission(Context context, String str) {
        try {
            return ContextCompat.checkSelfPermission(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean shouldShowRequestPermissionRationale(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }
}
