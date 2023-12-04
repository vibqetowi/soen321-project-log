package com.google.android.gms.internal.p001authapi;

import android.util.Base64;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* renamed from: com.google.android.gms.internal.auth-api.zbbb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbbb {
    private static final Random zba = new Random();

    public static String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
