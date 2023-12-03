package o0;

import android.os.Build;
import java.util.Locale;
/* compiled from: BuildCompat.java */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a() {
        boolean z10;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            return true;
        }
        if (i6 >= 32) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                    z10 = true;
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return false;
    }
}
