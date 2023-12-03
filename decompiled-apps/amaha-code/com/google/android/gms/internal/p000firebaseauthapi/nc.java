package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nc  reason: invalid package */
/* loaded from: classes.dex */
public final class nc {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8012a;

    public nc(byte[] bArr, int i6) {
        byte[] bArr2 = new byte[i6];
        this.f8012a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i6);
    }

    public static nc a(byte[] bArr) {
        if (bArr != null) {
            return new nc(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nc)) {
            return false;
        }
        return Arrays.equals(((nc) obj).f8012a, this.f8012a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8012a);
    }

    public final String toString() {
        return b.m("Bytes(", r.C(this.f8012a), ")");
    }
}
