package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class l4 extends k4 {

    /* renamed from: u  reason: collision with root package name */
    public final Object f8453u;

    public l4(Object obj) {
        this.f8453u = obj;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final Object a() {
        return this.f8453u;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l4) {
            return this.f8453u.equals(((l4) obj).f8453u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8453u.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f8453u + ")";
    }
}
