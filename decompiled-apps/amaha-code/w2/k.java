package w2;

import android.net.ConnectivityManager;
/* compiled from: NetworkApi24.kt */
/* loaded from: classes.dex */
public final class k {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.i.g(connectivityManager, "<this>");
        kotlin.jvm.internal.i.g(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
