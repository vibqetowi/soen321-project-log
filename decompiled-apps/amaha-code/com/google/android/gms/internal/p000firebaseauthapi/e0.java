package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e0  reason: invalid package */
/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: x  reason: collision with root package name */
    public final int f7796x;

    public e0(byte[] bArr, int i6) {
        super(bArr);
        h0.C(0, i6, bArr.length);
        this.f7796x = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g0, com.google.android.gms.internal.p000firebaseauthapi.h0
    public final byte e(int i6) {
        int i10 = this.f7796x;
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(c.p("Index < 0: ", i6));
            }
            throw new ArrayIndexOutOfBoundsException(b.j("Index > length: ", i6, ", ", i10));
        }
        return this.f7860w[i6];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g0, com.google.android.gms.internal.p000firebaseauthapi.h0
    public final byte g(int i6) {
        return this.f7860w[i6];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g0, com.google.android.gms.internal.p000firebaseauthapi.h0
    public final int m() {
        return this.f7796x;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g0, com.google.android.gms.internal.p000firebaseauthapi.h0
    public final void o(int i6, byte[] bArr) {
        System.arraycopy(this.f7860w, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g0
    public final void L() {
    }
}
