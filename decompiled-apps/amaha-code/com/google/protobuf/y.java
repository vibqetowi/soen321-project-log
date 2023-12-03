package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f10086a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f10087b;

    /* renamed from: c  reason: collision with root package name */
    public static final ByteBuffer f10088c;

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface a {
        int e();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(int i6);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface c extends d<Integer> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface d<E> extends List<E>, RandomAccess {
        d<E> A(int i6);

        boolean d0();

        void w();
    }

    static {
        Charset.forName("US-ASCII");
        f10086a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f10087b = bArr;
        f10088c = ByteBuffer.wrap(bArr);
        i.f(bArr, 0, 0, false);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
