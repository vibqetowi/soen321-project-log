package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p5  reason: invalid package */
/* loaded from: classes.dex */
public final class p5 implements zb {

    /* renamed from: a  reason: collision with root package name */
    public final String f8041a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8042b;

    /* renamed from: c  reason: collision with root package name */
    public final e9 f8043c;

    /* renamed from: d  reason: collision with root package name */
    public final n8 f8044d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8045e;
    public final n9 f;

    public p5(ab abVar) {
        String A = abVar.A();
        this.f8041a = A;
        if (A.equals(m4.f7979b)) {
            try {
                g9 y10 = g9.y(abVar.z(), r0.f8101b);
                this.f8043c = (e9) k4.b(abVar);
                this.f8042b = y10.v();
            } catch (zzadn e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (A.equals(m4.f7978a)) {
            try {
                p8 x10 = p8.x(abVar.z(), r0.f8101b);
                this.f8044d = (n8) k4.b(abVar);
                int v10 = x10.y().v();
                this.f8045e = v10;
                this.f8042b = v10 + x10.z().v();
            } catch (zzadn e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (A.equals(f5.f7849a)) {
            try {
                p9 y11 = p9.y(abVar.z(), r0.f8101b);
                this.f = (n9) k4.b(abVar);
                this.f8042b = y11.v();
            } catch (zzadn e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(A)));
        }
    }
}
