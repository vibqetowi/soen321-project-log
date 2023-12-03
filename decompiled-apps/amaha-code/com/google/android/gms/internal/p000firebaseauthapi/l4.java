package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l4  reason: invalid package */
/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7965a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static jb a(fb fbVar) {
        gb v10 = jb.v();
        int w10 = fbVar.w();
        v10.e();
        ((jb) v10.f7723v).zzd = w10;
        for (eb ebVar : fbVar.B()) {
            hb w11 = ib.w();
            String A = ebVar.w().A();
            w11.e();
            ib.y((ib) w11.f7723v, A);
            int E = ebVar.E();
            w11.e();
            ib.B((ib) w11.f7723v, E);
            int z10 = ebVar.z();
            w11.e();
            ((ib) w11.f7723v).zzg = c.d(z10);
            int v11 = ebVar.v();
            w11.e();
            ((ib) w11.f7723v).zzf = v11;
            v10.e();
            jb.z((jb) v10.f7723v, (ib) w11.c());
        }
        return (jb) v10.c();
    }
}
