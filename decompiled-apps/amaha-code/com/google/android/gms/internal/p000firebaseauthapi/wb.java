package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wb  reason: invalid package */
/* loaded from: classes.dex */
public final class wb implements m3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8227a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8228b;

    public wb(byte[] bArr, int i6) {
        this.f8227a = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                if (r.F(2)) {
                    this.f8228b = new w4(bArr, true);
                    return;
                }
                throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            }
            this.f8228b = new z4(bArr, 1);
            return;
        }
        this.f8228b = new z4(bArr, 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i6 = this.f8227a;
        Object obj = this.f8228b;
        switch (i6) {
            case 0:
                return ((w4) obj).a(Arrays.copyOf(bArr, 12), bArr);
            case 1:
                int length = bArr.length;
                if (length >= 28) {
                    return ((z4) obj).a(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                int length2 = bArr.length;
                if (length2 >= 40) {
                    return ((z4) obj).a(ByteBuffer.wrap(bArr, 24, length2 - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        switch (this.f8227a) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }
}
