package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d8  reason: invalid package */
/* loaded from: classes.dex */
public final class d8 {

    /* renamed from: a  reason: collision with root package name */
    public final w3 f7775a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7776b;

    /* renamed from: c  reason: collision with root package name */
    public final d7 f7777c;

    public /* synthetic */ d8(w3 w3Var, int i6, d7 d7Var) {
        this.f7775a = w3Var;
        this.f7776b = i6;
        this.f7777c = d7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        if (this.f7775a != d8Var.f7775a || this.f7776b != d8Var.f7776b || !this.f7777c.equals(d8Var.f7777c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7775a, Integer.valueOf(this.f7776b), Integer.valueOf(this.f7777c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f7775a, Integer.valueOf(this.f7776b), this.f7777c);
    }
}
