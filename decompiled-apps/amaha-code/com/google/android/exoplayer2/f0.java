package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.util.Arrays;
import java.util.List;
/* compiled from: TracksInfo.java */
/* loaded from: classes.dex */
public final class f0 implements f {

    /* renamed from: v  reason: collision with root package name */
    public static final f0 f6487v;

    /* renamed from: u  reason: collision with root package name */
    public final com.google.common.collect.s<a> f6488u;

    /* compiled from: TracksInfo.java */
    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: u  reason: collision with root package name */
        public final o8.o f6489u;

        /* renamed from: v  reason: collision with root package name */
        public final int[] f6490v;

        /* renamed from: w  reason: collision with root package name */
        public final int f6491w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean[] f6492x;

        static {
            new com.google.firebase.messaging.j(20);
        }

        public a(o8.o oVar, int[] iArr, int i6, boolean[] zArr) {
            boolean z10;
            int length = iArr.length;
            int i10 = oVar.f27302u;
            if (i10 == length && i10 == zArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.q(z10);
            this.f6489u = oVar;
            this.f6490v = (int[]) iArr.clone();
            this.f6491w = i6;
            this.f6492x = (boolean[]) zArr.clone();
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(b(0), this.f6489u.a());
            bundle.putIntArray(b(1), this.f6490v);
            bundle.putInt(b(2), this.f6491w);
            bundle.putBooleanArray(b(3), this.f6492x);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f6491w == aVar.f6491w && this.f6489u.equals(aVar.f6489u) && Arrays.equals(this.f6490v, aVar.f6490v) && Arrays.equals(this.f6492x, aVar.f6492x)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f6490v);
            return Arrays.hashCode(this.f6492x) + ((((hashCode + (this.f6489u.hashCode() * 31)) * 31) + this.f6491w) * 31);
        }
    }

    static {
        s.b bVar = com.google.common.collect.s.f9446v;
        f6487v = new f0(l0.f9412y);
    }

    public f0(List<a> list) {
        this.f6488u = com.google.common.collect.s.z(list);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), c9.a.c(this.f6488u));
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            return this.f6488u.equals(((f0) obj).f6488u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6488u.hashCode();
    }
}
