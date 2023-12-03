package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f8318a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8319b;

    static {
        Charset.forName("US-ASCII");
        f8318a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8319b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
