package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class a1 extends e1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ j1 C;
    public final /* synthetic */ Object D;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8300y = 1;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8301z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j1 j1Var, String str, String str2, Object obj, boolean z10) {
        super(j1Var, true);
        this.C = j1Var;
        this.f8301z = str;
        this.A = str2;
        this.D = obj;
        this.B = z10;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8300y) {
            case 0:
                k0 k0Var = this.C.f8442h;
                v9.o.h(k0Var);
                k0Var.getUserProperties(this.f8301z, this.A, this.B, (g0) this.D);
                return;
            default:
                k0 k0Var2 = this.C.f8442h;
                v9.o.h(k0Var2);
                k0Var2.setUserProperty(this.f8301z, this.A, new da.b(this.D), this.B, this.f8349u);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void b() {
        switch (this.f8300y) {
            case 0:
                ((g0) this.D).t(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j1 j1Var, String str, String str2, boolean z10, g0 g0Var) {
        super(j1Var, true);
        this.C = j1Var;
        this.f8301z = str;
        this.A = str2;
        this.B = z10;
        this.D = g0Var;
    }
}
