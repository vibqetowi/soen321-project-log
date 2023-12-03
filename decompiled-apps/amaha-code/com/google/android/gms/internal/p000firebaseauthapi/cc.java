package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cc  reason: invalid package */
/* loaded from: classes.dex */
public final class cc implements m3 {

    /* renamed from: a  reason: collision with root package name */
    public final gc f7762a;

    /* renamed from: b  reason: collision with root package name */
    public final d4 f7763b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7764c;

    public cc(gc gcVar, d4 d4Var, int i6) {
        this.f7762a = gcVar;
        this.f7763b = d4Var;
        this.f7764c = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i6 = this.f7764c;
        if (length >= i6) {
            int i10 = length - i6;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.f7763b.a(Arrays.copyOfRange(bArr, i10, length), r.Q(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)));
            return this.f7762a.a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
