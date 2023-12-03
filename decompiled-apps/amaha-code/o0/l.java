package o0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* compiled from: UserManagerCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: UserManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            Object systemService;
            boolean isUserUnlocked;
            systemService = context.getSystemService(UserManager.class);
            isUserUnlocked = ((UserManager) systemService).isUserUnlocked();
            return isUserUnlocked;
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
