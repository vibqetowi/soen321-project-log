package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1  reason: invalid package */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7886a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7887b;

    static {
        Charset.forName("US-ASCII");
        f7886a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7887b = bArr;
        ByteBuffer.wrap(bArr);
        int i6 = 0 + 0;
        try {
            if (i6 >= 0) {
                if (i6 <= Integer.MAX_VALUE) {
                    return;
                }
                throw zzadn.e();
            }
            throw zzadn.d();
        } catch (zzadn e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
