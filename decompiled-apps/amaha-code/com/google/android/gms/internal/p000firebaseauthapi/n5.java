package com.google.android.gms.internal.p000firebaseauthapi;

import kotlin.jvm.internal.b0;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n5  reason: invalid package */
/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f8004a;

    static {
        byte[] bArr = new byte[0];
        ab abVar = n4.f8002a;
        f8004a = a(3, abVar, 2, bArr);
        a(4, abVar, 4, bArr);
        a(3, n4.f8003b, 2, bArr);
    }

    public static ab a(int i6, ab abVar, int i10, byte[] bArr) {
        w9 v10 = x9.v();
        fa v11 = ga.v();
        v11.e();
        ga.C((ga) v11.f7723v);
        v11.e();
        ((ga) v11.f7723v).zze = b0.v(5);
        g0 J = h0.J(0, bArr, bArr.length);
        v11.e();
        ((ga) v11.f7723v).zzf = J;
        u9 v12 = v9.v();
        v12.e();
        v9.z((v9) v12.f7723v, abVar);
        y9 w10 = aa.w();
        w10.e();
        ((aa) w10.f7723v).zzd = (ga) v11.c();
        w10.e();
        ((aa) w10.f7723v).zze = (v9) v12.c();
        w10.e();
        aa.D((aa) w10.f7723v, i6);
        v10.e();
        ((x9) v10.f7723v).zzd = (aa) w10.c();
        za v13 = ab.v();
        new i5();
        v13.h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        v13.f(i10);
        v13.i(((x9) v10.c()).n());
        return (ab) v13.c();
    }
}
