package com.google.android.gms.internal.cast;

import android.graphics.PointF;
import android.util.Log;
import com.google.android.gms.internal.measurement.l8;
import java.util.List;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class w implements k3.a0, r3.a, ta.h2, uf.l {

    /* renamed from: u  reason: collision with root package name */
    public static final w f7667u = new w();

    /* renamed from: v  reason: collision with root package name */
    public static final w f7668v = new w();

    /* renamed from: w  reason: collision with root package name */
    public static final w f7669w = new w();

    /* renamed from: x  reason: collision with root package name */
    public static final w f7670x = new w();

    /* renamed from: y  reason: collision with root package name */
    public static final w f7671y = new w();

    /* renamed from: z  reason: collision with root package name */
    public static final w f7672z = new w();
    public static final w A = new w();
    public static final /* synthetic */ w B = new w();

    public static void g(int i6, String str) {
        if (i6 != 0) {
            if (2 - i6 <= 0) {
                System.out.println((Object) str);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        int J = cVar.J();
        if (J == 1) {
            return k3.l.b(cVar, f);
        }
        if (J == 3) {
            return k3.l.b(cVar, f);
        }
        if (J == 7) {
            PointF pointF = new PointF(((float) cVar.s()) * f, ((float) cVar.s()) * f);
            while (cVar.m()) {
                cVar.e0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(defpackage.b.E(J)));
    }

    @Override // ta.h2
    public Object a() {
        List list = ta.j2.f32639a;
        return Integer.valueOf((int) l8.f8459v.a().D());
    }

    @Override // r3.a
    public void b() {
        g(2, "Skip event for opt out config.");
    }

    @Override // r3.a
    public void c(String message) {
        kotlin.jvm.internal.i.g(message, "message");
        g(4, message);
    }

    public boolean d(int i6) {
        if (4 > i6 && !Log.isLoggable("FirebaseCrashlytics", i6)) {
            return false;
        }
        return true;
    }

    public void e(String str) {
        if (d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // r3.a
    public void f(String message) {
        kotlin.jvm.internal.i.g(message, "message");
        g(3, message);
    }

    public void h(String str) {
        if (d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // uf.l
    public Object i() {
        return new TreeMap();
    }

    public void j(String str, Exception exc) {
        if (d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
