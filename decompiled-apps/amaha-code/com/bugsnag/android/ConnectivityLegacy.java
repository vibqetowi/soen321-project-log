package com.bugsnag.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ConnectivityCompat.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB9\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\n\u001a\u00060\tR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/ConnectivityLegacy;", "Lcom/bugsnag/android/Connectivity;", "Lhs/k;", "registerForNetworkChanges", "unregisterForNetworkChanges", "", "hasNetworkConnection", "", "retrieveNetworkAccessState", "Lcom/bugsnag/android/ConnectivityLegacy$ConnectivityChangeReceiver;", "changeReceiver", "Lcom/bugsnag/android/ConnectivityLegacy$ConnectivityChangeReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "cm", "Landroid/net/ConnectivityManager;", "Landroid/net/NetworkInfo;", "getActiveNetworkInfo", "()Landroid/net/NetworkInfo;", "activeNetworkInfo", "Lkotlin/Function2;", "Lcom/bugsnag/android/NetworkChangeCallback;", "callback", "<init>", "(Landroid/content/Context;Landroid/net/ConnectivityManager;Lss/p;)V", "ConnectivityChangeReceiver", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ConnectivityLegacy implements Connectivity {
    private final ConnectivityChangeReceiver changeReceiver;

    /* renamed from: cm  reason: collision with root package name */
    private final ConnectivityManager f5912cm;
    private final Context context;

    /* compiled from: ConnectivityCompat.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR.\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/ConnectivityLegacy$ConnectivityChangeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lhs/k;", "onReceive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "receivedFirstCallback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/Function2;", "", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "cb", "Lss/p;", "<init>", "(Lcom/bugsnag/android/ConnectivityLegacy;Lss/p;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public final class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* renamed from: cb  reason: collision with root package name */
        private final p<Boolean, String, k> f5913cb;
        private final AtomicBoolean receivedFirstCallback = new AtomicBoolean(false);

        /* JADX WARN: Multi-variable type inference failed */
        public ConnectivityChangeReceiver(p<? super Boolean, ? super String, k> pVar) {
            this.f5913cb = pVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            p<Boolean, String, k> pVar;
            i.h(context, "context");
            i.h(intent, "intent");
            if (this.receivedFirstCallback.getAndSet(true) && (pVar = this.f5913cb) != null) {
                pVar.invoke(Boolean.valueOf(ConnectivityLegacy.this.hasNetworkConnection()), ConnectivityLegacy.this.retrieveNetworkAccessState());
            }
        }
    }

    public ConnectivityLegacy(Context context, ConnectivityManager cm2, p<? super Boolean, ? super String, k> pVar) {
        i.h(context, "context");
        i.h(cm2, "cm");
        this.context = context;
        this.f5912cm = cm2;
        this.changeReceiver = new ConnectivityChangeReceiver(pVar);
    }

    private final NetworkInfo getActiveNetworkInfo() {
        try {
            return this.f5912cm.getActiveNetworkInfo();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
        ContextExtensionsKt.registerReceiverSafe$default(this.context, this.changeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4, null);
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        Integer num;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            num = Integer.valueOf(activeNetworkInfo.getType());
        } else {
            num = null;
        }
        if (num == null) {
            return Constants.SUBSCRIPTION_NONE;
        }
        if (num.intValue() == 1) {
            return "wifi";
        }
        if (num.intValue() == 9) {
            return "ethernet";
        }
        return "cellular";
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
        ContextExtensionsKt.unregisterReceiverSafe$default(this.context, this.changeReceiver, null, 2, null);
    }
}
