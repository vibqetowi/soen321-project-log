package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
/* compiled from: ServiceStarter.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    public static a0 f9673e;

    /* renamed from: a  reason: collision with root package name */
    public String f9674a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f9675b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f9676c = null;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f9677d = new ArrayDeque();

    public static synchronized a0 a() {
        a0 a0Var;
        synchronized (a0.class) {
            if (f9673e == null) {
                f9673e = new a0();
            }
            a0Var = f9673e;
        }
        return a0Var;
    }

    public final boolean b(Context context) {
        boolean z10;
        if (this.f9676c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9676c = Boolean.valueOf(z10);
        }
        if (!this.f9675b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9676c.booleanValue();
    }

    public final boolean c(Context context) {
        boolean z10;
        if (this.f9675b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9675b = Boolean.valueOf(z10);
        }
        if (!this.f9675b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9675b.booleanValue();
    }
}
