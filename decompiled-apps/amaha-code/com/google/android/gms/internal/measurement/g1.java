package com.google.android.gms.internal.measurement;

import android.app.Activity;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class g1 extends e1 {
    public final /* synthetic */ i1 A;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8391y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Activity f8392z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Activity activity, int i6) {
        super(i1Var.f8421u, true);
        this.f8391y = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        this.A = i1Var;
                        this.f8392z = activity;
                        return;
                    }
                    this.A = i1Var;
                    this.f8392z = activity;
                    super(i1Var.f8421u, true);
                    return;
                }
                this.A = i1Var;
                this.f8392z = activity;
                super(i1Var.f8421u, true);
                return;
            }
            this.A = i1Var;
            this.f8392z = activity;
            super(i1Var.f8421u, true);
            return;
        }
        this.A = i1Var;
        this.f8392z = activity;
        super(i1Var.f8421u, true);
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8391y) {
            case 0:
                k0 k0Var = this.A.f8421u.f8442h;
                v9.o.h(k0Var);
                k0Var.onActivityStarted(new da.b(this.f8392z), this.f8350v);
                return;
            case 1:
                k0 k0Var2 = this.A.f8421u.f8442h;
                v9.o.h(k0Var2);
                k0Var2.onActivityResumed(new da.b(this.f8392z), this.f8350v);
                return;
            case 2:
                k0 k0Var3 = this.A.f8421u.f8442h;
                v9.o.h(k0Var3);
                k0Var3.onActivityPaused(new da.b(this.f8392z), this.f8350v);
                return;
            case 3:
                k0 k0Var4 = this.A.f8421u.f8442h;
                v9.o.h(k0Var4);
                k0Var4.onActivityStopped(new da.b(this.f8392z), this.f8350v);
                return;
            default:
                k0 k0Var5 = this.A.f8421u.f8442h;
                v9.o.h(k0Var5);
                k0Var5.onActivityDestroyed(new da.b(this.f8392z), this.f8350v);
                return;
        }
    }
}
