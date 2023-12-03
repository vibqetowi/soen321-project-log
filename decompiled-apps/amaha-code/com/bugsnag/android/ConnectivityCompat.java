package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import hs.g;
import hs.k;
import kotlin.jvm.internal.i;
import sp.b;
import ss.p;
/* compiled from: ConnectivityCompat.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/ConnectivityCompat;", "Lcom/bugsnag/android/Connectivity;", "Lhs/k;", "registerForNetworkChanges", "", "hasNetworkConnection", "unregisterForNetworkChanges", "", "retrieveNetworkAccessState", "Landroid/net/ConnectivityManager;", "cm", "Landroid/net/ConnectivityManager;", "connectivity", "Lcom/bugsnag/android/Connectivity;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lcom/bugsnag/android/NetworkChangeCallback;", "callback", "<init>", "(Landroid/content/Context;Lss/p;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ConnectivityCompat implements Connectivity {

    /* renamed from: cm  reason: collision with root package name */
    private final ConnectivityManager f5911cm;
    private final Connectivity connectivity;

    public ConnectivityCompat(Context context, p<? super Boolean, ? super String, k> pVar) {
        Connectivity connectivityLegacy;
        i.h(context, "context");
        ConnectivityManager connectivityManagerFrom = ContextExtensionsKt.getConnectivityManagerFrom(context);
        this.f5911cm = connectivityManagerFrom;
        if (connectivityManagerFrom == null) {
            connectivityLegacy = UnknownConnectivity.INSTANCE;
        } else if (Build.VERSION.SDK_INT >= 24) {
            connectivityLegacy = new ConnectivityApi24(connectivityManagerFrom, pVar);
        } else {
            connectivityLegacy = new ConnectivityLegacy(context, connectivityManagerFrom, pVar);
        }
        this.connectivity = connectivityLegacy;
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        Object j10;
        try {
            j10 = Boolean.valueOf(this.connectivity.hasNetworkConnection());
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (g.a(j10) != null) {
            j10 = Boolean.TRUE;
        }
        return ((Boolean) j10).booleanValue();
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
        try {
            this.connectivity.registerForNetworkChanges();
            k kVar = k.f19476a;
        } catch (Throwable th2) {
            b.j(th2);
        }
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        Object j10;
        try {
            j10 = this.connectivity.retrieveNetworkAccessState();
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (g.a(j10) != null) {
            j10 = "unknown";
        }
        return (String) j10;
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
        try {
            this.connectivity.unregisterForNetworkChanges();
            k kVar = k.f19476a;
        } catch (Throwable th2) {
            b.j(th2);
        }
    }
}
