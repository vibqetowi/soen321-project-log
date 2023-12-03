package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g4  reason: invalid package */
/* loaded from: classes.dex */
public final class g4 implements Comparable {

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f7861u;

    public /* synthetic */ g4(byte[] bArr) {
        this.f7861u = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        g4 g4Var = (g4) obj;
        byte[] bArr = this.f7861u;
        int length = bArr.length;
        int length2 = g4Var.f7861u.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b10 = bArr[i6];
            byte b11 = g4Var.f7861u[i6];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g4)) {
            return false;
        }
        return Arrays.equals(this.f7861u, ((g4) obj).f7861u);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7861u);
    }

    public final String toString() {
        return r.C(this.f7861u);
    }
}
