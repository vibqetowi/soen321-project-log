package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t1  reason: invalid package */
/* loaded from: classes.dex */
public final class t1 implements a2 {

    /* renamed from: a  reason: collision with root package name */
    public final a2[] f8144a;

    public t1(a2... a2VarArr) {
        this.f8144a = a2VarArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final z1 a(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            a2 a2Var = this.f8144a[i6];
            if (a2Var.b(cls)) {
                return a2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final boolean b(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f8144a[i6].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
