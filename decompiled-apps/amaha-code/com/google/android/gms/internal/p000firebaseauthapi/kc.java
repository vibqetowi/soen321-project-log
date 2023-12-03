package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.internal.d1;
import java.security.SecureRandom;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kc  reason: invalid package */
/* loaded from: classes.dex */
public final class kc {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f7946a = new d1(7);

    public static byte[] a(int i6) {
        byte[] bArr = new byte[i6];
        ((SecureRandom) f7946a.get()).nextBytes(bArr);
        return bArr;
    }
}
