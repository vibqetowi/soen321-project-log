package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g7  reason: invalid package */
/* loaded from: classes.dex */
public final class g7 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7864a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f7865b;

    public /* synthetic */ g7(Class cls, Class cls2) {
        this.f7864a = cls;
        this.f7865b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        if (!g7Var.f7864a.equals(this.f7864a) || !g7Var.f7865b.equals(this.f7865b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7864a, this.f7865b});
    }

    public final String toString() {
        return d.f(this.f7864a.getSimpleName(), " with serialization type: ", this.f7865b.getSimpleName());
    }
}
