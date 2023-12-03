package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class v0 extends e1 {
    public final /* synthetic */ Object A;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8628y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ j1 f8629z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(j1 j1Var, Object obj, int i6) {
        super(j1Var, true);
        this.f8628y = i6;
        this.f8629z = j1Var;
        this.A = obj;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8628y) {
            case 0:
                k0 k0Var = this.f8629z.f8442h;
                v9.o.h(k0Var);
                k0Var.setConditionalUserProperty((Bundle) this.A, this.f8349u);
                return;
            case 1:
                if (((Boolean) this.A) != null) {
                    k0 k0Var2 = this.f8629z.f8442h;
                    v9.o.h(k0Var2);
                    k0Var2.setMeasurementEnabled(((Boolean) this.A).booleanValue(), this.f8349u);
                    return;
                }
                k0 k0Var3 = this.f8629z.f8442h;
                v9.o.h(k0Var3);
                k0Var3.clearMeasurementEnabled(this.f8349u);
                return;
            default:
                k0 k0Var4 = this.f8629z.f8442h;
                v9.o.h(k0Var4);
                k0Var4.registerOnMeasurementEventListener((f1) this.A);
                return;
        }
    }
}
