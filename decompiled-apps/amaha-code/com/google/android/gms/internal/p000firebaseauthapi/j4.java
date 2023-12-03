package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j4  reason: invalid package */
/* loaded from: classes.dex */
public final class j4 extends r3 implements i4 {

    /* renamed from: c  reason: collision with root package name */
    public final b7 f7912c;

    /* renamed from: d  reason: collision with root package name */
    public final p6 f7913d;

    public j4(b7 b7Var, p6 p6Var, Class cls) {
        super(b7Var, cls);
        this.f7912c = b7Var;
        this.f7913d = p6Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i4
    public final ya a(h0 h0Var) {
        p6 p6Var = this.f7913d;
        b7 b7Var = this.f7912c;
        try {
            b2 c10 = b7Var.c(h0Var);
            b7Var.e(c10);
            b2 h10 = b7Var.h(c10);
            p6Var.e(h10);
            xa v10 = ya.v();
            String d10 = p6Var.d();
            v10.e();
            ((ya) v10.f7723v).zzd = d10;
            g0 n10 = h10.n();
            v10.e();
            ((ya) v10.f7723v).zze = n10;
            int b10 = p6Var.b();
            v10.e();
            ya.D((ya) v10.f7723v, b10);
            return (ya) v10.c();
        } catch (zzadn e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
