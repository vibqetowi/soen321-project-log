package f0;

import android.app.AppOpsManager;
import android.content.Context;
/* compiled from: AppOpsManagerCompat.java */
/* loaded from: classes.dex */
public final class i {
    public static int a(AppOpsManager appOpsManager, String str, int i6, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i6, str2);
    }

    public static String b(Context context) {
        String opPackageName;
        opPackageName = context.getOpPackageName();
        return opPackageName;
    }

    public static AppOpsManager c(Context context) {
        Object systemService;
        systemService = context.getSystemService(AppOpsManager.class);
        return (AppOpsManager) systemService;
    }
}
