package t0;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class r0 {

    /* compiled from: WindowCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Window window, boolean z10) {
            int i6;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i6 = systemUiVisibility & (-1793);
            } else {
                i6 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i6);
        }
    }

    /* compiled from: WindowCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static void a(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
