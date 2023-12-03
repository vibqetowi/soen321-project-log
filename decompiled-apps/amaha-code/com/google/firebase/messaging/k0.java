package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: WakeLockHolder.java */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f9746a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f9747b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static xa.a f9748c;

    public static void a(Context context) {
        if (f9748c == null) {
            xa.a aVar = new xa.a(context);
            f9748c = aVar;
            synchronized (aVar.f37697a) {
                aVar.f37702g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f9747b) {
            if (f9748c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f9748c.c();
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f9747b) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f9748c.a(f9746a);
            }
            return startService;
        }
    }
}
