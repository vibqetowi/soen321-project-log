package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class x0 extends e1 {
    public final /* synthetic */ j1 A;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8678y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(j1 j1Var, String str, int i6) {
        super(j1Var, true);
        this.f8678y = i6;
        this.A = j1Var;
        this.f8679z = str;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f8678y) {
            case 0:
                k0 k0Var = this.A.f8442h;
                v9.o.h(k0Var);
                k0Var.setUserId(this.f8679z, this.f8349u);
                return;
            case 1:
                k0 k0Var2 = this.A.f8442h;
                v9.o.h(k0Var2);
                k0Var2.beginAdUnitExposure(this.f8679z, this.f8350v);
                return;
            default:
                k0 k0Var3 = this.A.f8442h;
                v9.o.h(k0Var3);
                k0Var3.endAdUnitExposure(this.f8679z, this.f8350v);
                return;
        }
    }
}
