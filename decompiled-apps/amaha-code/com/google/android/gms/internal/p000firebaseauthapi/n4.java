package com.google.android.gms.internal.p000firebaseauthapi;

import kotlin.jvm.internal.b0;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n4  reason: invalid package */
/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f8002a = b(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ab f8003b;

    static {
        b(32);
        a(16);
        a(32);
        f8003b = c(16, 16);
        c(32, 32);
        za v10 = ab.v();
        new s4(5);
        v10.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        v10.f(2);
        ab abVar = (ab) v10.c();
        za v11 = ab.v();
        new s4(8);
        v11.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v11.f(2);
        ab abVar2 = (ab) v11.c();
    }

    public static void a(int i6) {
        z8 w10 = a9.w();
        w10.e();
        ((a9) w10.f7723v).zze = i6;
        b9 w11 = c9.w();
        w11.e();
        ((c9) w11.f7723v).zzd = 16;
        w10.e();
        ((a9) w10.f7723v).zzd = (c9) w11.c();
        za v10 = ab.v();
        v10.i(((a9) w10.c()).n());
        new s4(2);
        v10.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        v10.f(2);
        ab abVar = (ab) v10.c();
    }

    public static ab b(int i6) {
        f9 w10 = g9.w();
        w10.e();
        ((g9) w10.f7723v).zzd = i6;
        za v10 = ab.v();
        v10.i(((g9) w10.c()).n());
        new s4(3);
        v10.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        v10.f(2);
        return (ab) v10.c();
    }

    public static ab c(int i6, int i10) {
        t8 w10 = u8.w();
        v8 w11 = w8.w();
        w11.e();
        ((w8) w11.f7723v).zzd = 16;
        w10.e();
        ((u8) w10.f7723v).zzd = (w8) w11.c();
        w10.e();
        ((u8) w10.f7723v).zze = i6;
        la w12 = ma.w();
        na w13 = oa.w();
        w13.e();
        ((oa) w13.f7723v).zzd = b0.v(5);
        w13.e();
        ((oa) w13.f7723v).zze = i10;
        w12.e();
        ((ma) w12.f7723v).zzd = (oa) w13.c();
        w12.e();
        ((ma) w12.f7723v).zze = 32;
        o8 v10 = p8.v();
        v10.e();
        ((p8) v10.f7723v).zzd = (u8) w10.c();
        v10.e();
        ((p8) v10.f7723v).zze = (ma) w12.c();
        za v11 = ab.v();
        v11.i(((p8) v10.c()).n());
        new s4(0);
        v11.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        v11.f(2);
        return (ab) v11.c();
    }
}
