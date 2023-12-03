package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k1  reason: invalid package */
/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a  reason: collision with root package name */
    public volatile b2 f7931a;

    /* renamed from: b  reason: collision with root package name */
    public volatile h0 f7932b;

    static {
        r0 r0Var = r0.f8101b;
    }

    public final h0 a() {
        if (this.f7932b != null) {
            return this.f7932b;
        }
        synchronized (this) {
            if (this.f7932b != null) {
                return this.f7932b;
            }
            if (this.f7931a == null) {
                this.f7932b = h0.f7869v;
            } else {
                this.f7932b = this.f7931a.n();
            }
            return this.f7932b;
        }
    }

    public final void b(b2 b2Var) {
        if (this.f7931a != null) {
            return;
        }
        synchronized (this) {
            if (this.f7931a == null) {
                try {
                    this.f7931a = b2Var;
                    this.f7932b = h0.f7869v;
                } catch (zzadn unused) {
                    this.f7931a = b2Var;
                    this.f7932b = h0.f7869v;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        b2 b2Var = this.f7931a;
        b2 b2Var2 = k1Var.f7931a;
        if (b2Var == null && b2Var2 == null) {
            return a().equals(k1Var.a());
        }
        if (b2Var != null && b2Var2 != null) {
            return b2Var.equals(b2Var2);
        }
        if (b2Var != null) {
            k1Var.b(b2Var.a());
            return b2Var.equals(k1Var.f7931a);
        }
        b(b2Var2.a());
        return this.f7931a.equals(b2Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
