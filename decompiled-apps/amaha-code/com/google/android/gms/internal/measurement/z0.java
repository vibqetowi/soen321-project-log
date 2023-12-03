package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class z0 extends e1 {
    public final /* synthetic */ j1 A;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8724y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ g0 f8725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(j1 j1Var, g0 g0Var, int i6) {
        super(j1Var, true);
        this.f8724y = i6;
        this.A = j1Var;
        this.f8725z = g0Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8724y) {
            case 0:
                k0 k0Var = this.A.f8442h;
                v9.o.h(k0Var);
                k0Var.getGmpAppId(this.f8725z);
                return;
            case 1:
                k0 k0Var2 = this.A.f8442h;
                v9.o.h(k0Var2);
                k0Var2.getCachedAppInstanceId(this.f8725z);
                return;
            case 2:
                k0 k0Var3 = this.A.f8442h;
                v9.o.h(k0Var3);
                k0Var3.generateEventId(this.f8725z);
                return;
            case 3:
                k0 k0Var4 = this.A.f8442h;
                v9.o.h(k0Var4);
                k0Var4.getCurrentScreenName(this.f8725z);
                return;
            default:
                k0 k0Var5 = this.A.f8442h;
                v9.o.h(k0Var5);
                k0Var5.getCurrentScreenClass(this.f8725z);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void b() {
        int i6 = this.f8724y;
        g0 g0Var = this.f8725z;
        switch (i6) {
            case 0:
                g0Var.t(null);
                return;
            case 1:
                g0Var.t(null);
                return;
            case 2:
                g0Var.t(null);
                return;
            case 3:
                g0Var.t(null);
                return;
            default:
                g0Var.t(null);
                return;
        }
    }
}
