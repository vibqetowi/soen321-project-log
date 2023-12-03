package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: HeartRating.java */
/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f6680x = new com.google.firebase.messaging.j(3);

    /* renamed from: v  reason: collision with root package name */
    public final boolean f6681v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6682w;

    public o() {
        this.f6681v = false;
        this.f6682w = false;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), 0);
        bundle.putBoolean(b(1), this.f6681v);
        bundle.putBoolean(b(2), this.f6682w);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6682w != oVar.f6682w || this.f6681v != oVar.f6681v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6681v), Boolean.valueOf(this.f6682w)});
    }

    public o(boolean z10) {
        this.f6681v = true;
        this.f6682w = z10;
    }
}
