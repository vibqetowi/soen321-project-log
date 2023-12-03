package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j5  reason: invalid package */
/* loaded from: classes.dex */
public final class j5 {
    static {
        new s4(9);
        new i5();
        int i6 = qb.f8085u;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        k4.g(new l5());
        k4.g(new m5());
        m4.a();
        if (c5.a()) {
            return;
        }
        k4.e(new i5(), new s4(9));
        k4.e(new y5(), new s4(10));
    }
}
