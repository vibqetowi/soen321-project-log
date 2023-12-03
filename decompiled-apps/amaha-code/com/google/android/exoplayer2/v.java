package com.google.android.exoplayer2;

import android.os.Bundle;
/* compiled from: PlaybackParameters.java */
/* loaded from: classes.dex */
public final class v implements f {

    /* renamed from: x  reason: collision with root package name */
    public static final v f7194x = new v(1.0f, 1.0f);

    /* renamed from: u  reason: collision with root package name */
    public final float f7195u;

    /* renamed from: v  reason: collision with root package name */
    public final float f7196v;

    /* renamed from: w  reason: collision with root package name */
    public final int f7197w;

    public v(float f, float f2) {
        boolean z10;
        if (f > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        sc.b.q(f2 > 0.0f);
        this.f7195u = f;
        this.f7196v = f2;
        this.f7197w = Math.round(f * 1000.0f);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(Integer.toString(0, 36), this.f7195u);
        bundle.putFloat(Integer.toString(1, 36), this.f7196v);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f7195u == vVar.f7195u && this.f7196v == vVar.f7196v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f7196v) + ((Float.floatToRawIntBits(this.f7195u) + 527) * 31);
    }

    public final String toString() {
        return c9.w.k("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f7195u), Float.valueOf(this.f7196v));
    }
}
