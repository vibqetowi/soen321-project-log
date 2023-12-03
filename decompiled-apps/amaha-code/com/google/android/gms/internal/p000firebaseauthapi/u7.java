package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u7  reason: invalid package */
/* loaded from: classes.dex */
public final class u7 extends y7 {

    /* renamed from: b  reason: collision with root package name */
    public final int f8175b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8176c;

    /* renamed from: d  reason: collision with root package name */
    public final t7 f8177d;

    /* renamed from: e  reason: collision with root package name */
    public final s7 f8178e;

    public /* synthetic */ u7(int i6, int i10, t7 t7Var, s7 s7Var) {
        this.f8175b = i6;
        this.f8176c = i10;
        this.f8177d = t7Var;
        this.f8178e = s7Var;
    }

    public final int c() {
        t7 t7Var = t7.f8154e;
        int i6 = this.f8176c;
        t7 t7Var2 = this.f8177d;
        if (t7Var2 == t7Var) {
            return i6;
        }
        if (t7Var2 == t7.f8151b) {
            return i6 + 5;
        }
        if (t7Var2 == t7.f8152c) {
            return i6 + 5;
        }
        if (t7Var2 == t7.f8153d) {
            return i6 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (u7Var.f8175b != this.f8175b || u7Var.c() != c() || u7Var.f8177d != this.f8177d || u7Var.f8178e != this.f8178e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8176c), this.f8177d, this.f8178e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8177d);
        String valueOf2 = String.valueOf(this.f8178e);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.f8176c + "-byte tags, and " + this.f8175b + "-byte key)";
    }
}
