package com.bugsnag.android.ndk;

import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Client;
import com.bugsnag.android.NdkPlugin;
import com.bugsnag.android.NdkPluginKt;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: BugsnagNDK.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/ndk/BugsnagNDK;", "", "Lhs/k;", "refreshSymbolTable", "<init>", "()V", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BugsnagNDK {
    public static final BugsnagNDK INSTANCE = new BugsnagNDK();

    private BugsnagNDK() {
    }

    public static final void refreshSymbolTable() {
        NativeBridge nativeBridge;
        if (Bugsnag.isStarted()) {
            Client client = Bugsnag.getClient();
            i.c(client, "Bugsnag.getClient()");
            NdkPlugin ndkPlugin = NdkPluginKt.getNdkPlugin(client);
            if (ndkPlugin != null && (nativeBridge = ndkPlugin.getNativeBridge()) != null) {
                nativeBridge.refreshSymbolTable();
            }
        }
    }
}
