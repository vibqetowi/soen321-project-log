package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a7.f<r0> f7542a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7543b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7544c;

    public h(SharedPreferences sharedPreferences, d7.u uVar, long j10) {
        int i6;
        this.f7542a = uVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.f7543b = string;
        if (j10 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        this.f7544c = i6;
    }

    public final void a(r0 r0Var, int i6) {
        a7.a aVar;
        q0 k10 = r0.k(r0Var);
        if (k10.f7478w) {
            k10.b();
            k10.f7478w = false;
        }
        r0.o((r0) k10.f7477v, this.f7543b);
        r0 d10 = k10.d();
        if (this.f7544c - 1 != 0) {
            aVar = new a7.a(Integer.valueOf(defpackage.b.b(i6)), d10, a7.d.DEFAULT);
        } else {
            aVar = new a7.a(Integer.valueOf(defpackage.b.b(i6)), d10, a7.d.VERY_LOW);
        }
        d7.u uVar = (d7.u) this.f7542a;
        uVar.getClass();
        uVar.a(aVar, new p7.b(18));
    }
}
