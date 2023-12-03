package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.f;
import java.util.ArrayList;
import java.util.Arrays;
import p7.e;
import sc.b;
/* compiled from: AdPlaybackState.java */
/* loaded from: classes.dex */
public final class a implements f {
    public static final a A = new a(null, new C0138a[0], 0, -9223372036854775807L, 0);
    public static final C0138a B;
    public static final e C;

    /* renamed from: u  reason: collision with root package name */
    public final Object f6824u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6825v;

    /* renamed from: w  reason: collision with root package name */
    public final long f6826w;

    /* renamed from: x  reason: collision with root package name */
    public final long f6827x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6828y;

    /* renamed from: z  reason: collision with root package name */
    public final C0138a[] f6829z;

    /* compiled from: AdPlaybackState.java */
    /* renamed from: com.google.android.exoplayer2.source.ads.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0138a implements f {
        public static final e B = new e(20);
        public final boolean A;

        /* renamed from: u  reason: collision with root package name */
        public final long f6830u;

        /* renamed from: v  reason: collision with root package name */
        public final int f6831v;

        /* renamed from: w  reason: collision with root package name */
        public final Uri[] f6832w;

        /* renamed from: x  reason: collision with root package name */
        public final int[] f6833x;

        /* renamed from: y  reason: collision with root package name */
        public final long[] f6834y;

        /* renamed from: z  reason: collision with root package name */
        public final long f6835z;

        public C0138a(long j10, int i6, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            boolean z11;
            if (iArr.length == uriArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            b.q(z11);
            this.f6830u = j10;
            this.f6831v = i6;
            this.f6833x = iArr;
            this.f6832w = uriArr;
            this.f6834y = jArr;
            this.f6835z = j11;
            this.A = z10;
        }

        public static String c(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(c(0), this.f6830u);
            bundle.putInt(c(1), this.f6831v);
            bundle.putParcelableArrayList(c(2), new ArrayList<>(Arrays.asList(this.f6832w)));
            bundle.putIntArray(c(3), this.f6833x);
            bundle.putLongArray(c(4), this.f6834y);
            bundle.putLong(c(5), this.f6835z);
            bundle.putBoolean(c(6), this.A);
            return bundle;
        }

        public final int b(int i6) {
            int i10;
            int i11 = i6 + 1;
            while (true) {
                int[] iArr = this.f6833x;
                if (i11 >= iArr.length || this.A || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0138a.class != obj.getClass()) {
                return false;
            }
            C0138a c0138a = (C0138a) obj;
            if (this.f6830u == c0138a.f6830u && this.f6831v == c0138a.f6831v && Arrays.equals(this.f6832w, c0138a.f6832w) && Arrays.equals(this.f6833x, c0138a.f6833x) && Arrays.equals(this.f6834y, c0138a.f6834y) && this.f6835z == c0138a.f6835z && this.A == c0138a.A) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f6830u;
            int hashCode = Arrays.hashCode(this.f6833x);
            int hashCode2 = Arrays.hashCode(this.f6834y);
            long j11 = this.f6835z;
            return ((((hashCode2 + ((hashCode + (((((this.f6831v * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f6832w)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.A ? 1 : 0);
        }
    }

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        B = new C0138a(0L, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
        C = new e(19);
    }

    public a(Object obj, C0138a[] c0138aArr, long j10, long j11, int i6) {
        this.f6824u = obj;
        this.f6826w = j10;
        this.f6827x = j11;
        this.f6825v = c0138aArr.length + i6;
        this.f6829z = c0138aArr;
        this.f6828y = i6;
    }

    public static String c(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C0138a c0138a : this.f6829z) {
            arrayList.add(c0138a.a());
        }
        bundle.putParcelableArrayList(c(1), arrayList);
        bundle.putLong(c(2), this.f6826w);
        bundle.putLong(c(3), this.f6827x);
        bundle.putInt(c(4), this.f6828y);
        return bundle;
    }

    public final C0138a b(int i6) {
        int i10 = this.f6828y;
        if (i6 < i10) {
            return B;
        }
        return this.f6829z[i6 - i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (w.a(this.f6824u, aVar.f6824u) && this.f6825v == aVar.f6825v && this.f6826w == aVar.f6826w && this.f6827x == aVar.f6827x && this.f6828y == aVar.f6828y && Arrays.equals(this.f6829z, aVar.f6829z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = this.f6825v * 31;
        Object obj = this.f6824u;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i6 + hashCode) * 31) + ((int) this.f6826w)) * 31) + ((int) this.f6827x)) * 31) + this.f6828y) * 31) + Arrays.hashCode(this.f6829z);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f6824u);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f6826w);
        sb2.append(", adGroups=[");
        int i6 = 0;
        while (true) {
            C0138a[] c0138aArr = this.f6829z;
            if (i6 < c0138aArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(c0138aArr[i6].f6830u);
                sb2.append(", ads=[");
                for (int i10 = 0; i10 < c0138aArr[i6].f6833x.length; i10++) {
                    sb2.append("ad(state=");
                    int i11 = c0138aArr[i6].f6833x[i10];
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(c0138aArr[i6].f6834y[i10]);
                    sb2.append(')');
                    if (i10 < c0138aArr[i6].f6833x.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i6 < c0138aArr.length - 1) {
                    sb2.append(", ");
                }
                i6++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
