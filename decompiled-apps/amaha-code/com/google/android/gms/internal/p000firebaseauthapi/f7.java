package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f7  reason: invalid package */
/* loaded from: classes.dex */
public final class f7 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7851a;

    /* renamed from: b  reason: collision with root package name */
    public final nc f7852b;

    public /* synthetic */ f7(Class cls, nc ncVar) {
        this.f7851a = cls;
        this.f7852b = ncVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        if (!f7Var.f7851a.equals(this.f7851a) || !f7Var.f7852b.equals(this.f7852b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7851a, this.f7852b});
    }

    public final String toString() {
        return d.f(this.f7851a.getSimpleName(), ", object identifier: ", String.valueOf(this.f7852b));
    }
}
