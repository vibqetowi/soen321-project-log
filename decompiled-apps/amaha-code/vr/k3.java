package vr;

import java.util.logging.Logger;
/* compiled from: TransportFrameUtil.java */
/* loaded from: classes2.dex */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f35747a = Logger.getLogger(k3.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f35748b = "-bin".getBytes(nc.c.f25986a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i6 = length; i6 < bArr.length; i6++) {
            if (bArr[i6] != bArr2[i6 - length]) {
                return false;
            }
        }
        return true;
    }
}
