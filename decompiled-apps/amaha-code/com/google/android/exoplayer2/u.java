package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: PercentageRating.java */
/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: w  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f7047w = new com.google.firebase.messaging.j(8);

    /* renamed from: v  reason: collision with root package name */
    public final float f7048v;

    public u() {
        this.f7048v = -1.0f;
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.toString(0, 36), 1);
        bundle.putFloat(Integer.toString(1, 36), this.f7048v);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        if (this.f7048v != ((u) obj).f7048v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7048v)});
    }

    public u(float f) {
        sc.b.p("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.f7048v = f;
    }
}
