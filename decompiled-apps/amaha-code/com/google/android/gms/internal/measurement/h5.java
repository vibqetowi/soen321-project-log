package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8410a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8411b;

    public h5(int i6, Object obj) {
        this.f8410a = obj;
        this.f8411b = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        if (this.f8410a != h5Var.f8410a || this.f8411b != h5Var.f8411b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8410a) * 65535) + this.f8411b;
    }
}
