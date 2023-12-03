package com.google.android.exoplayer2;

import android.os.Bundle;
/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: u  reason: collision with root package name */
    public final int f6513u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6514v;

    /* renamed from: w  reason: collision with root package name */
    public final int f6515w;

    public i(int i6, int i10, int i11) {
        this.f6513u = i6;
        this.f6514v = i10;
        this.f6515w = i11;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f6513u);
        bundle.putInt(b(1), this.f6514v);
        bundle.putInt(b(2), this.f6515w);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6513u == iVar.f6513u && this.f6514v == iVar.f6514v && this.f6515w == iVar.f6515w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f6513u) * 31) + this.f6514v) * 31) + this.f6515w;
    }
}
