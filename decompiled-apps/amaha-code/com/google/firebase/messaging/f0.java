package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
/* compiled from: TopicsStore.java */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<f0> f9706d;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9707a;

    /* renamed from: b  reason: collision with root package name */
    public b0 f9708b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9709c;

    public f0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f9709c = scheduledExecutorService;
        this.f9707a = sharedPreferences;
    }

    public final synchronized e0 a() {
        e0 e0Var;
        String b10 = this.f9708b.b();
        Pattern pattern = e0.f9701d;
        if (!TextUtils.isEmpty(b10)) {
            String[] split = b10.split("!", -1);
            if (split.length == 2) {
                e0Var = new e0(split[0], split[1]);
            }
        }
        e0Var = null;
        return e0Var;
    }

    public final synchronized void b() {
        this.f9708b = b0.a(this.f9707a, this.f9709c);
    }

    public final synchronized void c(e0 e0Var) {
        this.f9708b.c(e0Var.f9704c);
    }
}
