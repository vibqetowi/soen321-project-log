package f0;

import android.app.AppOpsManager;
import android.content.Context;
/* compiled from: AppOpsManagerCompat.java */
/* loaded from: classes.dex */
public final class h {
    public static <T> T a(Context context, Class<T> cls) {
        Object systemService;
        systemService = context.getSystemService(cls);
        return (T) systemService;
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOp;
        noteProxyOp = appOpsManager.noteProxyOp(str, str2);
        return noteProxyOp;
    }

    public static int c(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOpNoThrow;
        noteProxyOpNoThrow = appOpsManager.noteProxyOpNoThrow(str, str2);
        return noteProxyOpNoThrow;
    }

    public static String d(String str) {
        String permissionToOp;
        permissionToOp = AppOpsManager.permissionToOp(str);
        return permissionToOp;
    }
}
