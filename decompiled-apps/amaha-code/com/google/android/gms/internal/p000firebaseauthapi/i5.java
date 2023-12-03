package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import kotlin.jvm.internal.b0;
import v.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i5  reason: invalid package */
/* loaded from: classes.dex */
public final class i5 extends b7 {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7888d = new byte[0];

    public i5() {
        super(ca.class, new q4(10, o3.class));
    }

    public static n6 i(int i6, x3 x3Var, byte[] bArr, int i10) {
        int i11;
        w9 v10 = x9.v();
        fa v11 = ga.v();
        v11.e();
        ga.C((ga) v11.f7723v);
        v11.e();
        ((ga) v11.f7723v).zze = b0.v(5);
        g0 J = h0.J(0, bArr, bArr.length);
        v11.e();
        ((ga) v11.f7723v).zzf = J;
        ga gaVar = (ga) v11.c();
        za v12 = ab.v();
        ab abVar = x3Var.f8239a;
        v12.h(abVar.A());
        v12.i(h0.I(abVar.z().K()));
        int d10 = h.d(abVar.y());
        int i12 = 3;
        if (d10 != 1) {
            if (d10 != 2) {
                if (d10 != 3) {
                    if (d10 == 4) {
                        i11 = 4;
                    } else {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                } else {
                    i11 = 3;
                }
            } else {
                i11 = 2;
            }
        } else {
            i11 = 1;
        }
        int i13 = i11 - 1;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    i12 = 5;
                } else {
                    i12 = 4;
                }
            }
        } else {
            i12 = 2;
        }
        v12.f(i12);
        u9 v13 = v9.v();
        v13.e();
        v9.z((v9) v13.f7723v, (ab) v12.c());
        y9 w10 = aa.w();
        w10.e();
        ((aa) w10.f7723v).zzd = gaVar;
        w10.e();
        ((aa) w10.f7723v).zze = (v9) v13.c();
        w10.e();
        aa.D((aa) w10.f7723v, i6);
        v10.e();
        ((x9) v10.f7723v).zzd = (aa) w10.c();
        return new n6(i10, (x9) v10.c());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final o6 a() {
        return new r4(x9.class, 8);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final int b() {
        return 3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final b2 c(h0 h0Var) {
        return ca.y(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final void e(b2 b2Var) {
        boolean z10;
        ca caVar = (ca) b2Var;
        if (caVar.A().m() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            mc.c(caVar.v());
            o5.a(caVar.z().w());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b7
    public final /* synthetic */ b2 h(b2 b2Var) {
        return ((ca) b2Var).z();
    }
}
