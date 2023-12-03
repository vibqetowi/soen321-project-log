package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q0  reason: invalid package */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8074a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8075b;

    public q0(int i6, Object obj) {
        this.f8074a = obj;
        this.f8075b = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f8074a != q0Var.f8074a || this.f8075b != q0Var.f8075b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8074a) * 65535) + this.f8075b;
    }
}
