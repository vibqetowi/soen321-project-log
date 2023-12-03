package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class n6 implements u6 {

    /* renamed from: a  reason: collision with root package name */
    public final u6[] f8490a;

    public n6(u6... u6VarArr) {
        this.f8490a = u6VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final t6 a(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            u6 u6Var = this.f8490a[i6];
            if (u6Var.b(cls)) {
                return u6Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final boolean b(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f8490a[i6].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
