package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
import com.google.android.gms.common.api.internal.d1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w4  reason: invalid package */
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: c  reason: collision with root package name */
    public static final d1 f8224c = new d1(2);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f8225a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8226b;

    public w4(byte[] bArr, boolean z10) {
        if (r.F(2)) {
            mc.b(bArr.length);
            this.f8225a = new SecretKeySpec(bArr, "AES");
            this.f8226b = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i6;
        AlgorithmParameterSpec gCMParameterSpec;
        int i10 = 12;
        if (bArr.length == 12) {
            boolean z10 = this.f8226b;
            if (true != z10) {
                i6 = 16;
            } else {
                i6 = 28;
            }
            int length = bArr2.length;
            if (length >= i6) {
                if (z10 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                if (lc.a() && Integer.valueOf(Build.VERSION.SDK_INT).intValue() <= 19) {
                    gCMParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                }
                d1 d1Var = f8224c;
                ((Cipher) d1Var.get()).init(2, this.f8225a, gCMParameterSpec);
                if (true != z10) {
                    i10 = 0;
                }
                if (z10) {
                    length -= 12;
                }
                return ((Cipher) d1Var.get()).doFinal(bArr2, i10, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
