package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: StarRating.java */
/* loaded from: classes.dex */
public final class b0 extends y {

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f6334x = new com.google.firebase.messaging.j(14);

    /* renamed from: v  reason: collision with root package name */
    public final int f6335v;

    /* renamed from: w  reason: collision with root package name */
    public final float f6336w;

    public b0(int i6) {
        sc.b.p("maxStars must be a positive integer", i6 > 0);
        this.f6335v = i6;
        this.f6336w = -1.0f;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), 2);
        bundle.putInt(b(1), this.f6335v);
        bundle.putFloat(b(2), this.f6336w);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f6335v != b0Var.f6335v || this.f6336w != b0Var.f6336w) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6335v), Float.valueOf(this.f6336w)});
    }

    public b0(float f, int i6) {
        boolean z10 = false;
        sc.b.p("maxStars must be a positive integer", i6 > 0);
        if (f >= 0.0f && f <= i6) {
            z10 = true;
        }
        sc.b.p("starRating is out of range [0, maxStars]", z10);
        this.f6335v = i6;
        this.f6336w = f;
    }
}
