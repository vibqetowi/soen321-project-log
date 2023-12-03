package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
/* compiled from: FcmBroadcastProcessor.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9742c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static m0 f9743d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9744a;

    /* renamed from: b  reason: collision with root package name */
    public final oe.f f9745b = new oe.f(2);

    public k(Context context) {
        this.f9744a = context;
    }

    public static ya.v a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (a0.a().c(context)) {
            m0 b10 = b(context);
            synchronized (k0.f9747b) {
                k0.a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    k0.f9748c.a(k0.f9746a);
                }
                b10.b(intent).addOnCompleteListener(new j0(0, intent));
            }
        } else {
            b(context).b(intent);
        }
        return ya.k.e(-1);
    }

    public static m0 b(Context context) {
        m0 m0Var;
        synchronized (f9742c) {
            if (f9743d == null) {
                f9743d = new m0(context);
            }
            m0Var = f9743d;
        }
        return m0Var;
    }

    public final ya.h<Integer> c(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean a10 = aa.g.a();
        Context context = this.f9744a;
        if (a10 && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent);
        }
        w5.u uVar = new w5.u(context, 5, intent);
        oe.f fVar = this.f9745b;
        return ya.k.c(fVar, uVar).continueWithTask(fVar, new dd.a(context, 23, intent));
    }
}
