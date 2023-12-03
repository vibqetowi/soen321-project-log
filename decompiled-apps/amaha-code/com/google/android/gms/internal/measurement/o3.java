package com.google.android.gms.internal.measurement;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o3 extends f4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8527a;

    /* renamed from: b  reason: collision with root package name */
    public final m4 f8528b;

    public o3(Context context, m4 m4Var) {
        this.f8527a = context;
        this.f8528b = m4Var;
    }

    @Override // com.google.android.gms.internal.measurement.f4
    public final Context a() {
        return this.f8527a;
    }

    @Override // com.google.android.gms.internal.measurement.f4
    public final m4 b() {
        return this.f8528b;
    }

    public final boolean equals(Object obj) {
        m4 m4Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            if (this.f8527a.equals(f4Var.a()) && ((m4Var = this.f8528b) != null ? m4Var.equals(f4Var.b()) : f4Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8527a.hashCode() ^ 1000003) * 1000003;
        m4 m4Var = this.f8528b;
        if (m4Var == null) {
            hashCode = 0;
        } else {
            hashCode = m4Var.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.f8527a.toString();
        String valueOf = String.valueOf(this.f8528b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
