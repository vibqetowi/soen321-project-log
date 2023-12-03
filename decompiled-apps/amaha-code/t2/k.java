package t2;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.q;
/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f32402a;

    static {
        String f = q.f("NetworkStateTracker");
        kotlin.jvm.internal.i.f(f, "tagWithPrefix(\"NetworkStateTracker\")");
        f32402a = f;
    }

    public static final r2.b a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities a10;
        boolean b10;
        kotlin.jvm.internal.i.g(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a10 = w2.i.a(connectivityManager, w2.j.a(connectivityManager));
            } catch (SecurityException e10) {
                q.d().c(f32402a, "Unable to validate active network", e10);
            }
            if (a10 != null) {
                b10 = w2.i.b(a10, 16);
                return new r2.b(z10, b10, n0.a.a(connectivityManager), (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) ? false : false);
            }
        }
        b10 = false;
        return new r2.b(z10, b10, n0.a.a(connectivityManager), (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) ? false : false);
    }
}
