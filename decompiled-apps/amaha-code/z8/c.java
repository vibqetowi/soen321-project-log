package z8;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import c9.w;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.n;
import com.google.common.collect.j0;
import com.google.common.collect.k0;
import com.google.common.collect.m;
import com.google.common.collect.o0;
import com.google.common.collect.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o8.o;
import o8.p;
import z8.a;
import z8.d;
import z8.j;
/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes.dex */
public final class c extends z8.f {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f39273d = new int[0];

    /* renamed from: e  reason: collision with root package name */
    public static final k0<Integer> f39274e;
    public static final k0<Integer> f;

    /* renamed from: b  reason: collision with root package name */
    public final d.b f39275b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<C0672c> f39276c;

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {
        public final int A;
        public final int B;
        public final int C;
        public final boolean D;
        public final int E;
        public final int F;
        public final int G;
        public final int H;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f39277u;

        /* renamed from: v  reason: collision with root package name */
        public final String f39278v;

        /* renamed from: w  reason: collision with root package name */
        public final C0672c f39279w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f39280x;

        /* renamed from: y  reason: collision with root package name */
        public final int f39281y;

        /* renamed from: z  reason: collision with root package name */
        public final int f39282z;

        public a(n nVar, C0672c c0672c, int i6) {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            String locale;
            String[] strArr;
            int i12;
            LocaleList locales;
            String languageTags;
            this.f39279w = c0672c;
            this.f39278v = c.g(nVar.f6652w);
            int i13 = 0;
            this.f39280x = c.e(i6, false);
            int i14 = 0;
            while (true) {
                s<String> sVar = c0672c.G;
                int size = sVar.size();
                i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                if (i14 < size) {
                    i11 = c.c(nVar, sVar.get(i14), false);
                    if (i11 > 0) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i11 = 0;
                    break;
                }
            }
            this.f39282z = i14;
            this.f39281y = i11;
            this.A = Integer.bitCount(nVar.f6654y & c0672c.H);
            if ((nVar.f6653x & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            int i15 = nVar.S;
            this.E = i15;
            this.F = nVar.T;
            int i16 = nVar.B;
            this.G = i16;
            if ((i16 != -1 && i16 > c0672c.J) || (i15 != -1 && i15 > c0672c.I)) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f39277u = z11;
            int i17 = w.f5205a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i18 = w.f5205a;
            if (i18 >= 24) {
                locales = configuration.getLocales();
                languageTags = locales.toLanguageTags();
                strArr = languageTags.split(",", -1);
            } else {
                String[] strArr2 = new String[1];
                Locale locale2 = configuration.locale;
                if (i18 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                strArr2[0] = locale;
                strArr = strArr2;
            }
            for (int i19 = 0; i19 < strArr.length; i19++) {
                strArr[i19] = w.z(strArr[i19]);
            }
            int i20 = 0;
            while (true) {
                if (i20 < strArr.length) {
                    i12 = c.c(nVar, strArr[i20], false);
                    if (i12 > 0) {
                        break;
                    }
                    i20++;
                } else {
                    i20 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i12 = 0;
                    break;
                }
            }
            this.B = i20;
            this.C = i12;
            while (true) {
                s<String> sVar2 = c0672c.K;
                if (i13 >= sVar2.size()) {
                    break;
                }
                String str = nVar.F;
                if (str != null && str.equals(sVar2.get(i13))) {
                    i10 = i13;
                    break;
                }
                i13++;
            }
            this.H = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public final int compareTo(a aVar) {
            k0 a10;
            k0<Integer> k0Var;
            boolean z10 = this.f39280x;
            boolean z11 = this.f39277u;
            if (z11 && z10) {
                a10 = c.f39274e;
            } else {
                a10 = c.f39274e.a();
            }
            m c10 = m.f9415a.c(z10, aVar.f39280x);
            Integer valueOf = Integer.valueOf(this.f39282z);
            Integer valueOf2 = Integer.valueOf(aVar.f39282z);
            j0.f9394u.getClass();
            o0 o0Var = o0.f9434u;
            m b10 = c10.b(valueOf, valueOf2, o0Var).a(this.f39281y, aVar.f39281y).a(this.A, aVar.A).c(z11, aVar.f39277u).b(Integer.valueOf(this.H), Integer.valueOf(aVar.H), o0Var);
            int i6 = this.G;
            Integer valueOf3 = Integer.valueOf(i6);
            int i10 = aVar.G;
            Integer valueOf4 = Integer.valueOf(i10);
            if (this.f39279w.O) {
                k0Var = c.f39274e.a();
            } else {
                k0Var = c.f;
            }
            m b11 = b10.b(valueOf3, valueOf4, k0Var).c(this.D, aVar.D).b(Integer.valueOf(this.B), Integer.valueOf(aVar.B), o0Var).a(this.C, aVar.C).b(Integer.valueOf(this.E), Integer.valueOf(aVar.E), a10).b(Integer.valueOf(this.F), Integer.valueOf(aVar.F), a10);
            Integer valueOf5 = Integer.valueOf(i6);
            Integer valueOf6 = Integer.valueOf(i10);
            if (!w.a(this.f39278v, aVar.f39278v)) {
                a10 = c.f;
            }
            return b11.b(valueOf5, valueOf6, a10).e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: u  reason: collision with root package name */
        public final boolean f39283u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f39284v;

        public b(n nVar, int i6) {
            this.f39283u = (nVar.f6653x & 1) != 0;
            this.f39284v = c.e(i6, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return m.f9415a.c(this.f39284v, bVar2.f39284v).c(this.f39283u, bVar2.f39283u).e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* renamed from: z8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0672c extends j {

        /* renamed from: f0  reason: collision with root package name */
        public static final /* synthetic */ int f39285f0 = 0;
        public final int S;
        public final boolean T;
        public final boolean U;
        public final boolean V;
        public final boolean W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* renamed from: a0  reason: collision with root package name */
        public final boolean f39286a0;

        /* renamed from: b0  reason: collision with root package name */
        public final boolean f39287b0;
        public final boolean c0;

        /* renamed from: d0  reason: collision with root package name */
        public final SparseArray<Map<p, e>> f39288d0;
        public final SparseBooleanArray e0;

        static {
            new C0672c(new d());
        }

        public C0672c(d dVar) {
            super(dVar);
            this.T = dVar.f39289u;
            this.U = dVar.f39290v;
            this.V = dVar.f39291w;
            this.W = dVar.f39292x;
            this.X = dVar.f39293y;
            this.Y = dVar.f39294z;
            this.Z = dVar.A;
            this.S = dVar.B;
            this.f39286a0 = dVar.C;
            this.f39287b0 = dVar.D;
            this.c0 = dVar.E;
            this.f39288d0 = dVar.F;
            this.e0 = dVar.G;
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // z8.j, com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle a10 = super.a();
            a10.putBoolean(b(1000), this.T);
            a10.putBoolean(b(1001), this.U);
            a10.putBoolean(b(1002), this.V);
            a10.putBoolean(b(1003), this.W);
            a10.putBoolean(b(1004), this.X);
            a10.putBoolean(b(1005), this.Y);
            a10.putBoolean(b(1006), this.Z);
            a10.putInt(b(1007), this.S);
            a10.putBoolean(b(1008), this.f39286a0);
            a10.putBoolean(b(1009), this.f39287b0);
            a10.putBoolean(b(1010), this.c0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i6 = 0;
            while (true) {
                SparseArray<Map<p, e>> sparseArray2 = this.f39288d0;
                if (i6 >= sparseArray2.size()) {
                    break;
                }
                int keyAt = sparseArray2.keyAt(i6);
                for (Map.Entry<p, e> entry : sparseArray2.valueAt(i6).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                a10.putIntArray(b(1011), qc.a.G(arrayList));
                a10.putParcelableArrayList(b(1012), c9.a.c(arrayList2));
                String b10 = b(1013);
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray3.put(sparseArray.keyAt(i10), ((com.google.android.exoplayer2.f) sparseArray.valueAt(i10)).a());
                }
                a10.putSparseParcelableArray(b10, sparseArray3);
                i6++;
            }
            String b11 = b(1014);
            SparseBooleanArray sparseBooleanArray = this.e0;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                iArr[i11] = sparseBooleanArray.keyAt(i11);
            }
            a10.putIntArray(b11, iArr);
            return a10;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e7 A[LOOP:0: B:49:0x0090->B:66:0x00e7, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
        @Override // z8.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0672c.class != obj.getClass()) {
                return false;
            }
            C0672c c0672c = (C0672c) obj;
            if (super.equals(c0672c) && this.T == c0672c.T && this.U == c0672c.U && this.V == c0672c.V && this.W == c0672c.W && this.X == c0672c.X && this.Y == c0672c.Y && this.Z == c0672c.Z && this.S == c0672c.S && this.f39286a0 == c0672c.f39286a0 && this.f39287b0 == c0672c.f39287b0 && this.c0 == c0672c.c0) {
                SparseBooleanArray sparseBooleanArray = this.e0;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = c0672c.e0;
                if (sparseBooleanArray2.size() == size) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i6)) >= 0) {
                        }
                    }
                    z10 = true;
                    if (z10) {
                        SparseArray<Map<p, e>> sparseArray = this.f39288d0;
                        int size2 = sparseArray.size();
                        SparseArray<Map<p, e>> sparseArray2 = c0672c.f39288d0;
                        if (sparseArray2.size() == size2) {
                            for (int i10 = 0; i10 < size2; i10++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                if (indexOfKey >= 0) {
                                    Map<p, e> valueAt = sparseArray.valueAt(i10);
                                    Map<p, e> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                    if (valueAt2.size() == valueAt.size()) {
                                        for (Map.Entry<p, e> entry : valueAt.entrySet()) {
                                            p key = entry.getKey();
                                            if (valueAt2.containsKey(key)) {
                                                if (!w.a(entry.getValue(), valueAt2.get(key))) {
                                                }
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                        }
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                }
                            }
                            z11 = true;
                            if (!z11) {
                                return true;
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            return false;
        }

        @Override // z8.j
        public final int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + this.S) * 31) + (this.f39286a0 ? 1 : 0)) * 31) + (this.f39287b0 ? 1 : 0)) * 31) + (this.c0 ? 1 : 0);
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class e implements com.google.android.exoplayer2.f {

        /* renamed from: u  reason: collision with root package name */
        public final int f39295u;

        /* renamed from: v  reason: collision with root package name */
        public final int[] f39296v;

        /* renamed from: w  reason: collision with root package name */
        public final int f39297w;

        static {
            new p7.e(23);
        }

        public e() {
            throw null;
        }

        public e(int i6, int i10, int[] iArr) {
            this.f39295u = i6;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f39296v = copyOf;
            this.f39297w = i10;
            Arrays.sort(copyOf);
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(b(0), this.f39295u);
            bundle.putIntArray(b(1), this.f39296v);
            bundle.putInt(b(2), this.f39297w);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f39295u == eVar.f39295u && Arrays.equals(this.f39296v, eVar.f39296v) && this.f39297w == eVar.f39297w) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f39296v) + (this.f39295u * 31)) * 31) + this.f39297w;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class f implements Comparable<f> {
        public final int A;
        public final int B;
        public final boolean C;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f39298u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f39299v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f39300w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f39301x;

        /* renamed from: y  reason: collision with root package name */
        public final int f39302y;

        /* renamed from: z  reason: collision with root package name */
        public final int f39303z;

        public f(n nVar, C0672c c0672c, int i6, String str) {
            boolean z10;
            boolean z11;
            s<String> sVar;
            int i10;
            boolean z12;
            boolean z13;
            boolean z14 = false;
            this.f39299v = c.e(i6, false);
            int i11 = nVar.f6653x & (~c0672c.S);
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39300w = z10;
            if ((i11 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f39301x = z11;
            s<String> sVar2 = c0672c.L;
            if (sVar2.isEmpty()) {
                sVar = s.K("");
            } else {
                sVar = sVar2;
            }
            int i12 = 0;
            while (true) {
                if (i12 < sVar.size()) {
                    i10 = c.c(nVar, sVar.get(i12), c0672c.N);
                    if (i10 > 0) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    i10 = 0;
                    break;
                }
            }
            this.f39302y = i12;
            this.f39303z = i10;
            int i13 = c0672c.M;
            int i14 = nVar.f6654y;
            int bitCount = Integer.bitCount(i13 & i14);
            this.A = bitCount;
            if ((i14 & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.C = z12;
            if (c.g(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int c10 = c.c(nVar, str, z13);
            this.B = c10;
            if (i10 > 0 || ((sVar2.isEmpty() && bitCount > 0) || this.f39300w || (this.f39301x && c10 > 0))) {
                z14 = true;
            }
            this.f39298u = z14;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public final int compareTo(f fVar) {
            m c10 = m.f9415a.c(this.f39299v, fVar.f39299v);
            Integer valueOf = Integer.valueOf(this.f39302y);
            Integer valueOf2 = Integer.valueOf(fVar.f39302y);
            k0 k0Var = j0.f9394u;
            k0Var.getClass();
            o0 o0Var = o0.f9434u;
            m b10 = c10.b(valueOf, valueOf2, o0Var);
            int i6 = this.f39303z;
            m a10 = b10.a(i6, fVar.f39303z);
            int i10 = this.A;
            m c11 = a10.a(i10, fVar.A).c(this.f39300w, fVar.f39300w);
            Boolean valueOf3 = Boolean.valueOf(this.f39301x);
            Boolean valueOf4 = Boolean.valueOf(fVar.f39301x);
            if (i6 != 0) {
                k0Var = o0Var;
            }
            m a11 = c11.b(valueOf3, valueOf4, k0Var).a(this.B, fVar.B);
            if (i10 == 0) {
                a11 = a11.d(this.C, fVar.C);
            }
            return a11.e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class g implements Comparable<g> {
        public final int A;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f39304u;

        /* renamed from: v  reason: collision with root package name */
        public final C0672c f39305v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f39306w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f39307x;

        /* renamed from: y  reason: collision with root package name */
        public final int f39308y;

        /* renamed from: z  reason: collision with root package name */
        public final int f39309z;

        public g(n nVar, C0672c c0672c, int i6, boolean z10) {
            boolean z11;
            this.f39305v = c0672c;
            float f = nVar.M;
            int i10 = nVar.B;
            int i11 = nVar.L;
            int i12 = nVar.K;
            boolean z12 = true;
            int i13 = 0;
            int i14 = -1;
            if (z10 && ((i12 == -1 || i12 <= c0672c.f39325u) && ((i11 == -1 || i11 <= c0672c.f39326v) && ((f == -1.0f || f <= c0672c.f39327w) && (i10 == -1 || i10 <= c0672c.f39328x))))) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f39304u = z11;
            if (!z10 || ((i12 != -1 && i12 < c0672c.f39329y) || ((i11 != -1 && i11 < c0672c.f39330z) || ((f != -1.0f && f < c0672c.A) || (i10 != -1 && i10 < c0672c.B))))) {
                z12 = false;
            }
            this.f39306w = z12;
            this.f39307x = c.e(i6, false);
            this.f39308y = i10;
            if (i12 != -1 && i11 != -1) {
                i14 = i12 * i11;
            }
            this.f39309z = i14;
            while (true) {
                s<String> sVar = c0672c.F;
                if (i13 < sVar.size()) {
                    String str = nVar.F;
                    if (str != null && str.equals(sVar.get(i13))) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    break;
                }
            }
            this.A = i13;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public final int compareTo(g gVar) {
            k0 a10;
            k0<Integer> k0Var;
            boolean z10 = this.f39307x;
            boolean z11 = this.f39304u;
            if (z11 && z10) {
                a10 = c.f39274e;
            } else {
                a10 = c.f39274e.a();
            }
            m c10 = m.f9415a.c(z10, gVar.f39307x).c(z11, gVar.f39304u).c(this.f39306w, gVar.f39306w);
            Integer valueOf = Integer.valueOf(this.A);
            Integer valueOf2 = Integer.valueOf(gVar.A);
            j0.f9394u.getClass();
            m b10 = c10.b(valueOf, valueOf2, o0.f9434u);
            int i6 = this.f39308y;
            Integer valueOf3 = Integer.valueOf(i6);
            int i10 = gVar.f39308y;
            Integer valueOf4 = Integer.valueOf(i10);
            if (this.f39305v.O) {
                k0Var = c.f39274e.a();
            } else {
                k0Var = c.f;
            }
            return b10.b(valueOf3, valueOf4, k0Var).b(Integer.valueOf(this.f39309z), Integer.valueOf(gVar.f39309z), a10).b(Integer.valueOf(i6), Integer.valueOf(i10), a10).e();
        }
    }

    static {
        k0<Integer> lVar;
        k0<Integer> lVar2;
        p0.d dVar = new p0.d(10);
        if (dVar instanceof k0) {
            lVar = (k0) dVar;
        } else {
            lVar = new com.google.common.collect.l(dVar);
        }
        f39274e = lVar;
        p0.d dVar2 = new p0.d(11);
        if (dVar2 instanceof k0) {
            lVar2 = (k0) dVar2;
        } else {
            lVar2 = new com.google.common.collect.l(dVar2);
        }
        f = lVar2;
    }

    public c(Context context) {
        a.b bVar = new a.b();
        int i6 = C0672c.f39285f0;
        C0672c c0672c = new C0672c(new d(context));
        this.f39275b = bVar;
        this.f39276c = new AtomicReference<>(c0672c);
    }

    public static int c(n nVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(nVar.f6652w)) {
            return 4;
        }
        String g5 = g(str);
        String g10 = g(nVar.f6652w);
        if (g10 != null && g5 != null) {
            if (!g10.startsWith(g5) && !g5.startsWith(g10)) {
                int i6 = w.f5205a;
                if (!g10.split("-", 2)[0].equals(g5.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || g10 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(o oVar, int i6, int i10, boolean z10) {
        int i11;
        n[] nVarArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Point point;
        int i19;
        int i20;
        boolean z11;
        ArrayList arrayList = new ArrayList(oVar.f27302u);
        int i21 = 0;
        while (true) {
            i11 = oVar.f27302u;
            if (i21 >= i11) {
                break;
            }
            arrayList.add(Integer.valueOf(i21));
            i21++;
        }
        if (i6 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            int i22 = 0;
            int i23 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            while (true) {
                boolean z12 = true;
                nVarArr = oVar.f27303v;
                if (i22 >= i11) {
                    break;
                }
                n nVar = nVarArr[i22];
                int i24 = nVar.K;
                if (i24 > 0 && (i14 = nVar.L) > 0) {
                    if (z10) {
                        if (i24 > i14) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i6 <= i10) {
                            z12 = false;
                        }
                        if (z11 != z12) {
                            i16 = i6;
                            i15 = i10;
                            if (i24 * i16 < i14 * i15) {
                                int i25 = w.f5205a;
                                point = new Point(i15, ((i18 + i24) - 1) / i24);
                            } else {
                                int i26 = w.f5205a;
                                point = new Point(((i17 + i14) - 1) / i14, i16);
                            }
                            i19 = nVar.K;
                            i20 = i19 * i14;
                            if (i19 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i20 < i23) {
                                i23 = i20;
                            }
                        }
                    }
                    i15 = i6;
                    i16 = i10;
                    if (i24 * i16 < i14 * i15) {
                    }
                    i19 = nVar.K;
                    i20 = i19 * i14;
                    if (i19 >= ((int) (point.x * 0.98f))) {
                        i23 = i20;
                    }
                }
                i22++;
            }
            if (i23 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n nVar2 = nVarArr[((Integer) arrayList.get(size)).intValue()];
                    int i27 = nVar2.K;
                    if (i27 != -1 && (i13 = nVar2.L) != -1) {
                        i12 = i27 * i13;
                    } else {
                        i12 = -1;
                    }
                    if (i12 == -1 || i12 > i23) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean e(int i6, boolean z10) {
        int i10 = i6 & 7;
        if (i10 != 4 && (!z10 || i10 != 3)) {
            return false;
        }
        return true;
    }

    public static boolean f(n nVar, String str, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        if ((nVar.f6654y & 16384) != 0 || !e(i6, false) || (i6 & i10) == 0) {
            return false;
        }
        if (str != null && !w.a(nVar.F, str)) {
            return false;
        }
        int i20 = nVar.K;
        if (i20 != -1 && (i15 > i20 || i20 > i11)) {
            return false;
        }
        int i21 = nVar.L;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        float f2 = nVar.M;
        if ((f2 != -1.0f && (i17 > f2 || f2 > i13)) || (i19 = nVar.B) == -1 || i18 > i19 || i19 > i14) {
            return false;
        }
        return true;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class d extends j.a {
        public boolean A;
        public int B;
        public boolean C;
        public boolean D;
        public boolean E;
        public final SparseArray<Map<p, e>> F;
        public final SparseBooleanArray G;

        /* renamed from: u  reason: collision with root package name */
        public boolean f39289u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f39290v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f39291w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f39292x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f39293y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f39294z;

        public d(Context context) {
            b(context);
            c(context);
            this.F = new SparseArray<>();
            this.G = new SparseBooleanArray();
            this.f39289u = true;
            this.f39290v = false;
            this.f39291w = true;
            this.f39292x = true;
            this.f39293y = false;
            this.f39294z = false;
            this.A = false;
            this.B = 0;
            this.C = true;
            this.D = false;
            this.E = true;
        }

        @Override // z8.j.a
        public final j.a a(int i6, int i10) {
            super.a(i6, i10);
            return this;
        }

        public final void b(Context context) {
            CaptioningManager captioningManager;
            String locale;
            int i6 = w.f5205a;
            if (i6 >= 19) {
                if ((i6 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f39344o = 1088;
                    Locale locale2 = captioningManager.getLocale();
                    if (locale2 != null) {
                        if (i6 >= 21) {
                            locale = locale2.toLanguageTag();
                        } else {
                            locale = locale2.toString();
                        }
                        this.f39343n = s.K(locale);
                    }
                }
            }
        }

        public final void c(Context context) {
            Display display;
            Point point;
            Display.Mode mode;
            int physicalWidth;
            int physicalHeight;
            String t3;
            String str;
            String[] split;
            DisplayManager displayManager;
            int i6 = w.f5205a;
            if (i6 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && w.x(context)) {
                if (i6 < 28) {
                    t3 = w.t("sys.display-size");
                } else {
                    t3 = w.t("vendor.display-size");
                }
                if (!TextUtils.isEmpty(t3)) {
                    try {
                        split = t3.trim().split("x", -1);
                    } catch (NumberFormatException unused) {
                    }
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            a(point.x, point.y);
                        }
                    }
                    String valueOf = String.valueOf(t3);
                    if (valueOf.length() != 0) {
                        str = "Invalid display size: ".concat(valueOf);
                    } else {
                        str = new String("Invalid display size: ");
                    }
                    Log.e("Util", str);
                }
                if ("Sony".equals(w.f5207c) && w.f5208d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                    a(point.x, point.y);
                }
            }
            point = new Point();
            if (i6 >= 23) {
                mode = display.getMode();
                physicalWidth = mode.getPhysicalWidth();
                point.x = physicalWidth;
                physicalHeight = mode.getPhysicalHeight();
                point.y = physicalHeight;
            } else if (i6 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            a(point.x, point.y);
        }

        @Deprecated
        public d() {
            this.F = new SparseArray<>();
            this.G = new SparseBooleanArray();
            this.f39289u = true;
            this.f39290v = false;
            this.f39291w = true;
            this.f39292x = true;
            this.f39293y = false;
            this.f39294z = false;
            this.A = false;
            this.B = 0;
            this.C = true;
            this.D = false;
            this.E = true;
        }
    }
}
