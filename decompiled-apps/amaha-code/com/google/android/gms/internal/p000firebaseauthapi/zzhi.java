package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzhi extends RuntimeException {
    public zzhi(String str) {
        super(str);
    }

    public zzhi(GeneralSecurityException generalSecurityException) {
        super("Creating a LegacyProtoKey failed", generalSecurityException);
    }
}
