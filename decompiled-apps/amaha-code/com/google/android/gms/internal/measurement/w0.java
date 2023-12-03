package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class w0 extends e1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ j1 B;
    public final /* synthetic */ Object C;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8639y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8640z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(j1 j1Var, String str, String str2, Object obj, int i6) {
        super(j1Var, true);
        this.f8639y = i6;
        this.B = j1Var;
        this.f8640z = str;
        this.A = str2;
        this.C = obj;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8639y) {
            case 0:
                k0 k0Var = this.B.f8442h;
                v9.o.h(k0Var);
                k0Var.clearConditionalUserProperty(this.f8640z, this.A, (Bundle) this.C);
                return;
            case 1:
                k0 k0Var2 = this.B.f8442h;
                v9.o.h(k0Var2);
                k0Var2.getConditionalUserProperties(this.f8640z, this.A, (g0) this.C);
                return;
            default:
                k0 k0Var3 = this.B.f8442h;
                v9.o.h(k0Var3);
                k0Var3.setCurrentScreen(new da.b((Activity) this.C), this.f8640z, this.A, this.f8349u);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void b() {
        switch (this.f8639y) {
            case 1:
                ((g0) this.C).t(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j1 j1Var, Activity activity, String str, String str2) {
        super(j1Var, true);
        this.f8639y = 2;
        this.B = j1Var;
        this.C = activity;
        this.f8640z = str;
        this.A = str2;
    }
}
