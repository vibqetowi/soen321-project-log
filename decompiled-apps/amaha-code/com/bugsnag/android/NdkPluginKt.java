package com.bugsnag.android;

import kotlin.jvm.internal.i;
/* compiled from: NdkPlugin.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ndkPlugin", "Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/Client;", "getNdkPlugin", "(Lcom/bugsnag/android/Client;)Lcom/bugsnag/android/NdkPlugin;", "bugsnag-plugin-android-ndk_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NdkPluginKt {
    public static final NdkPlugin getNdkPlugin(Client ndkPlugin) {
        i.h(ndkPlugin, "$this$ndkPlugin");
        return (NdkPlugin) ndkPlugin.getPlugin(NdkPlugin.class);
    }
}
