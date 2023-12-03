package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m4  reason: invalid package */
/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7978a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f7979b;

    static {
        new s4(0);
        f7978a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new s4(3);
        f7979b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new s4(4);
        new s4(2);
        new s4(6);
        new s4(7);
        new s4(5);
        new s4(8);
        int i6 = qb.f8085u;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        k4.g(new p4());
        w7.a();
        boolean z10 = false;
        k4.f(new s4(0));
        k4.f(new s4(3));
        if (c5.a()) {
            return;
        }
        k4.f(new s4(2));
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z10 = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        if (z10) {
            k4.f(new s4(4));
        }
        k4.f(new s4(5));
        k4.f(new s4(6));
        k4.f(new s4(7));
        k4.f(new s4(8));
    }
}
