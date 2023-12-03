package w2;

import android.net.ConnectivityManager;
import android.net.Network;
/* compiled from: NetworkApi23.kt */
/* loaded from: classes.dex */
public final class j {
    public static final Network a(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        kotlin.jvm.internal.i.g(connectivityManager, "<this>");
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
