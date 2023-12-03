package com.google.android.gms.internal.cast;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7570a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7571b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7571b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static c3 b(Object obj, Object obj2) {
        a3 u10 = ((c4) obj).u();
        c4 c4Var = (c4) obj2;
        u10.getClass();
        if (u10.f7476u.getClass().isInstance(c4Var)) {
            u10.e((c3) ((g2) c4Var));
            return u10.c();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
