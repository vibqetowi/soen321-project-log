package com.google.android.gms.internal.p000firebaseauthapi;

import g.x;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z3  reason: invalid package */
/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public final fb f8273a;

    /* renamed from: b  reason: collision with root package name */
    public final b8 f8274b = b8.f7729b;

    public z3(fb fbVar) {
        this.f8273a = fbVar;
    }

    public static final z3 e(p2 p2Var, m3 m3Var) {
        byte[] bArr = new byte[0];
        byte[] c10 = p2Var.c();
        r0 r0Var = r0.f8101b;
        ia x10 = ia.x(c10, r0Var);
        if (x10.y().m() != 0) {
            try {
                fb A = fb.A(m3Var.a(x10.y().K(), bArr), r0Var);
                if (A.v() > 0) {
                    return new z3(A);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (zzadn unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final z3 a() {
        fb fbVar = this.f8273a;
        if (fbVar != null) {
            cb x10 = fb.x();
            for (eb ebVar : fbVar.B()) {
                ya w10 = ebVar.w();
                if (w10.w() == 3) {
                    String A = w10.A();
                    h0 z10 = w10.z();
                    AtomicReference atomicReference = k4.f7939b;
                    q3 c10 = ((v3) atomicReference.get()).c(null, A);
                    if (c10 instanceof i4) {
                        ya a10 = ((i4) c10).a(z10);
                        String A2 = a10.A();
                        ((v3) atomicReference.get()).c(null, A2).c(a10.z());
                        b1 b1Var = (b1) ebVar.m(5);
                        b1Var.b(ebVar);
                        db dbVar = (db) b1Var;
                        dbVar.e();
                        eb.A((eb) dbVar.f7723v, a10);
                        x10.e();
                        fb.D((fb) x10.f7723v, (eb) dbVar.c());
                    } else {
                        throw new GeneralSecurityException(b.m("manager for key type ", A, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int w11 = fbVar.w();
            x10.e();
            ((fb) x10.f7723v).zzd = w11;
            return new z3((fb) x10.c());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final Object b() {
        Class a10;
        boolean z10;
        h4 h4Var = (h4) k4.f7942e.get(o3.class);
        if (h4Var == null) {
            a10 = null;
        } else {
            a10 = h4Var.a();
        }
        if (a10 != null) {
            int i6 = l4.f7965a;
            fb fbVar = this.f8273a;
            int w10 = fbVar.w();
            int i10 = 0;
            boolean z11 = false;
            boolean z12 = true;
            for (eb ebVar : fbVar.B()) {
                if (ebVar.E() == 3) {
                    if (ebVar.D()) {
                        if (ebVar.z() != 1) {
                            if (ebVar.E() != 2) {
                                if (ebVar.v() == w10) {
                                    if (!z11) {
                                        z11 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (ebVar.w().w() != 4) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                z12 &= z10;
                                i10++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ebVar.v())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ebVar.v())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ebVar.v())));
                    }
                }
            }
            if (i10 != 0) {
                if (!z11 && !z12) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                e4 e4Var = new e4(a10);
                if (e4Var.f7813a != null) {
                    e4Var.f7816d = this.f8274b;
                    for (eb ebVar2 : fbVar.B()) {
                        if (ebVar2.E() == 3) {
                            ya w11 = ebVar2.w();
                            Object c10 = ((v3) k4.f7939b.get()).c(a10, w11.A()).c(w11.z());
                            if (ebVar2.v() == fbVar.w()) {
                                e4Var.b(c10, ebVar2, true);
                            } else {
                                e4Var.b(c10, ebVar2, false);
                            }
                        }
                    }
                    ConcurrentMap concurrentMap = e4Var.f7813a;
                    if (concurrentMap != null) {
                        f4 f4Var = e4Var.f7814b;
                        b8 b8Var = e4Var.f7816d;
                        Class cls = e4Var.f7815c;
                        e4 e4Var2 = new e4(concurrentMap, f4Var, b8Var, cls);
                        e4Var.f7813a = null;
                        h4 h4Var2 = (h4) k4.f7942e.get(o3.class);
                        if (h4Var2 != null) {
                            if (h4Var2.a().equals(cls)) {
                                return h4Var2.c(e4Var2);
                            }
                            throw new GeneralSecurityException("Wrong input primitive class, expected " + h4Var2.a().toString() + ", got " + cls.toString());
                        }
                        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
                    }
                    throw new IllegalStateException("build cannot be called twice");
                }
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(o3.class.getName()));
    }

    public final void c(g6 g6Var, m3 m3Var) {
        byte[] bArr = new byte[0];
        fb fbVar = this.f8273a;
        byte[] b10 = m3Var.b(fbVar.p(), bArr);
        try {
            if (fb.A(m3Var.a(b10, bArr), r0.f8101b).equals(fbVar)) {
                ha v10 = ia.v();
                g0 I = h0.I(b10);
                v10.e();
                ((ia) v10.f7723v).zzd = I;
                jb a10 = l4.a(fbVar);
                v10.e();
                ((ia) v10.f7723v).zze = a10;
                g6Var.a((ia) v10.c());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzadn unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(x xVar) {
        fb fbVar = this.f8273a;
        for (eb ebVar : fbVar.B()) {
            if (ebVar.w().w() == 1 || ebVar.w().w() == 2 || ebVar.w().w() == 3) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", b.w(ebVar.w().w()), ebVar.w().A()));
            }
            while (r1.hasNext()) {
            }
        }
        xVar.B(fbVar);
    }

    public final String toString() {
        return l4.a(this.f8273a).toString();
    }
}
