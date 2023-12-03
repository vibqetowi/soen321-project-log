package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: ThumbRating.java */
/* loaded from: classes.dex */
public final class d0 extends y {

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f6356x = new com.google.firebase.messaging.j(15);

    /* renamed from: v  reason: collision with root package name */
    public final boolean f6357v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6358w;

    public d0() {
        this.f6357v = false;
        this.f6358w = false;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), 3);
        bundle.putBoolean(b(1), this.f6357v);
        bundle.putBoolean(b(2), this.f6358w);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f6358w != d0Var.f6358w || this.f6357v != d0Var.f6357v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6357v), Boolean.valueOf(this.f6358w)});
    }

    public d0(boolean z10) {
        this.f6357v = true;
        this.f6358w = z10;
    }
}
