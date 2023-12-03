package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ConnectivityCompat.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014B1\u0012\u0006\u0010\r\u001a\u00020\f\u0012 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/ConnectivityApi24;", "Lcom/bugsnag/android/Connectivity;", "Lhs/k;", "registerForNetworkChanges", "unregisterForNetworkChanges", "", "hasNetworkConnection", "", "retrieveNetworkAccessState", "Lcom/bugsnag/android/ConnectivityApi24$ConnectivityTrackerCallback;", "networkCallback", "Lcom/bugsnag/android/ConnectivityApi24$ConnectivityTrackerCallback;", "Landroid/net/ConnectivityManager;", "cm", "Landroid/net/ConnectivityManager;", "Lkotlin/Function2;", "Lcom/bugsnag/android/NetworkChangeCallback;", "callback", "<init>", "(Landroid/net/ConnectivityManager;Lss/p;)V", "ConnectivityTrackerCallback", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ConnectivityApi24 implements Connectivity {

    /* renamed from: cm  reason: collision with root package name */
    private final ConnectivityManager f5909cm;
    private final ConnectivityTrackerCallback networkCallback;

    /* compiled from: ConnectivityCompat.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR.\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/ConnectivityApi24$ConnectivityTrackerCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "", "hasConnection", "Lhs/k;", "invokeNetworkCallback", "onUnavailable", "Landroid/net/Network;", "network", "onAvailable", "Ljava/util/concurrent/atomic/AtomicBoolean;", "receivedFirstCallback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/Function2;", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "cb", "Lss/p;", "<init>", "(Lss/p;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ConnectivityTrackerCallback extends ConnectivityManager.NetworkCallback {

        /* renamed from: cb  reason: collision with root package name */
        private final p<Boolean, String, k> f5910cb;
        private final AtomicBoolean receivedFirstCallback = new AtomicBoolean(false);

        /* JADX WARN: Multi-variable type inference failed */
        public ConnectivityTrackerCallback(p<? super Boolean, ? super String, k> pVar) {
            this.f5910cb = pVar;
        }

        private final void invokeNetworkCallback(boolean z10) {
            p<Boolean, String, k> pVar;
            if (this.receivedFirstCallback.getAndSet(true) && (pVar = this.f5910cb) != null) {
                pVar.invoke(Boolean.valueOf(z10), UnknownConnectivity.INSTANCE.retrieveNetworkAccessState());
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            i.h(network, "network");
            super.onAvailable(network);
            invokeNetworkCallback(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            invokeNetworkCallback(false);
        }
    }

    public ConnectivityApi24(ConnectivityManager cm2, p<? super Boolean, ? super String, k> pVar) {
        i.h(cm2, "cm");
        this.f5909cm = cm2;
        this.networkCallback = new ConnectivityTrackerCallback(pVar);
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        Network activeNetwork;
        activeNetwork = this.f5909cm.getActiveNetwork();
        if (activeNetwork != null) {
            return true;
        }
        return false;
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
        this.f5909cm.registerDefaultNetworkCallback(this.networkCallback);
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        activeNetwork = this.f5909cm.getActiveNetwork();
        if (activeNetwork != null) {
            networkCapabilities = this.f5909cm.getNetworkCapabilities(activeNetwork);
        } else {
            networkCapabilities = null;
        }
        if (networkCapabilities == null) {
            return Constants.SUBSCRIPTION_NONE;
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return "unknown";
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
        this.f5909cm.unregisterNetworkCallback(this.networkCallback);
    }
}
