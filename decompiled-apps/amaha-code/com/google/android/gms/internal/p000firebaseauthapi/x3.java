package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x3  reason: invalid package */
/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a  reason: collision with root package name */
    public final ab f8239a;

    public x3(ab abVar) {
        this.f8239a = abVar;
    }

    public static x3 a(int i6, String str, byte[] bArr) {
        za v10 = ab.v();
        v10.h(str);
        g0 g0Var = h0.f7869v;
        v10.i(h0.J(0, bArr, bArr.length));
        int i10 = i6 - 1;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = 5;
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
        }
        v10.f(i11);
        return new x3((ab) v10.c());
    }
}
