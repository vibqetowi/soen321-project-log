package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class d1 extends e1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ j1 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8328z;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Long f8327y = null;
    public final /* synthetic */ boolean D = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j1 j1Var, String str, String str2, Bundle bundle, boolean z10) {
        super(j1Var, true);
        this.E = j1Var;
        this.f8328z = str;
        this.A = str2;
        this.B = bundle;
        this.C = z10;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        long longValue;
        Long l2 = this.f8327y;
        if (l2 == null) {
            longValue = this.f8349u;
        } else {
            longValue = l2.longValue();
        }
        k0 k0Var = this.E.f8442h;
        v9.o.h(k0Var);
        k0Var.logEvent(this.f8328z, this.A, this.B, this.C, this.D, longValue);
    }
}
