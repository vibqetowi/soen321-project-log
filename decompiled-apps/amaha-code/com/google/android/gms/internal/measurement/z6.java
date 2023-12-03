package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class z6 implements g7 {

    /* renamed from: a  reason: collision with root package name */
    public final v6 f8727a;

    /* renamed from: b  reason: collision with root package name */
    public final r7 f8728b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8729c;

    /* renamed from: d  reason: collision with root package name */
    public final j5 f8730d;

    public z6(r7 r7Var, j5 j5Var, v6 v6Var) {
        this.f8728b = r7Var;
        this.f8729c = j5Var.c(v6Var);
        this.f8730d = j5Var;
        this.f8727a = v6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void a(Object obj) {
        this.f8728b.g(obj);
        this.f8730d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final int b(Object obj) {
        int hashCode = this.f8728b.d(obj).hashCode();
        if (!this.f8729c) {
            return hashCode;
        }
        this.f8730d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final boolean c(Object obj) {
        this.f8730d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final w5 d() {
        v6 v6Var = this.f8727a;
        if (v6Var instanceof w5) {
            return (w5) ((w5) v6Var).t(4);
        }
        return v6Var.b().h();
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final int e(Object obj) {
        r7 r7Var = this.f8728b;
        int b10 = r7Var.b(r7Var.d(obj));
        if (!this.f8729c) {
            return b10;
        }
        this.f8730d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void f(Object obj, Object obj2) {
        Class cls = h7.f8413a;
        r7 r7Var = this.f8728b;
        r7Var.h(obj, r7Var.e(r7Var.d(obj), r7Var.d(obj2)));
        if (!this.f8729c) {
            return;
        }
        this.f8730d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final boolean g(Object obj, Object obj2) {
        r7 r7Var = this.f8728b;
        if (!r7Var.d(obj).equals(r7Var.d(obj2))) {
            return false;
        }
        if (!this.f8729c) {
            return true;
        }
        j5 j5Var = this.f8730d;
        j5Var.a(obj);
        j5Var.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void h(Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        w5 w5Var = (w5) obj;
        if (w5Var.zzc == s7.f) {
            w5Var.zzc = s7.b();
        }
        u5 u5Var = (u5) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void i(Object obj, f5 f5Var) {
        this.f8730d.a(obj);
        throw null;
    }
}
