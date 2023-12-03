package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y3  reason: invalid package */
/* loaded from: classes.dex */
public final class y3 {
    public static x3 a(String str) {
        Map unmodifiableMap;
        Logger logger = k4.f7938a;
        synchronized (k4.class) {
            unmodifiableMap = Collections.unmodifiableMap(k4.f);
        }
        x3 x3Var = (x3) unmodifiableMap.get(str);
        if (x3Var != null) {
            return x3Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
