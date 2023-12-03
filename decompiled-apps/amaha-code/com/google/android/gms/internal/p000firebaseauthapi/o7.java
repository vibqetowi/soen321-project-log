package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import pl.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o7  reason: invalid package */
/* loaded from: classes.dex */
public final class o7 extends y7 {

    /* renamed from: b  reason: collision with root package name */
    public final int f8024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8025c;

    /* renamed from: d  reason: collision with root package name */
    public final n7 f8026d;

    public /* synthetic */ o7(int i6, int i10, n7 n7Var) {
        this.f8024b = i6;
        this.f8025c = i10;
        this.f8026d = n7Var;
    }

    public final int c() {
        n7 n7Var = n7.f8010e;
        int i6 = this.f8025c;
        n7 n7Var2 = this.f8026d;
        if (n7Var2 == n7Var) {
            return i6;
        }
        if (n7Var2 == n7.f8007b) {
            return i6 + 5;
        }
        if (n7Var2 == n7.f8008c) {
            return i6 + 5;
        }
        if (n7Var2 == n7.f8009d) {
            return i6 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        if (o7Var.f8024b != this.f8024b || o7Var.c() != c() || o7Var.f8026d != this.f8026d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8025c), this.f8026d});
    }

    public final String toString() {
        StringBuilder g5 = d.g("AES-CMAC Parameters (variant: ", String.valueOf(this.f8026d), ", ");
        g5.append(this.f8025c);
        g5.append("-byte tags, and ");
        return a.g(g5, this.f8024b, "-byte key)");
    }
}
