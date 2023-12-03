package t2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.q;
/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f32400a;

    public i(j jVar) {
        this.f32400a = jVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        kotlin.jvm.internal.i.g(network, "network");
        kotlin.jvm.internal.i.g(capabilities, "capabilities");
        q d10 = q.d();
        String str = k.f32402a;
        d10.a(str, "Network capabilities changed: " + capabilities);
        j jVar = this.f32400a;
        jVar.c(k.a(jVar.f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.i.g(network, "network");
        q.d().a(k.f32402a, "Network connection lost");
        j jVar = this.f32400a;
        jVar.c(k.a(jVar.f));
    }
}
