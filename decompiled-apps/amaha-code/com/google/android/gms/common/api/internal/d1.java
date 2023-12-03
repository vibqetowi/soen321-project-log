package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.p000firebaseauthapi.dc;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class d1 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7360a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f7360a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            case 2:
                try {
                    return (Cipher) dc.f7781e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 3:
                try {
                    return (Cipher) dc.f7781e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 4:
                try {
                    return (Cipher) dc.f7781e.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 5:
                try {
                    return (Cipher) dc.f7781e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 6:
                try {
                    return (Cipher) dc.f7781e.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
