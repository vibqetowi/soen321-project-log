package x;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r1.b0;
import x.d;
/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d[] S;
    public final ArrayList<d> T;
    public final boolean[] U;
    public a[] V;
    public e W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f37361a0;

    /* renamed from: b  reason: collision with root package name */
    public y.c f37362b;

    /* renamed from: b0  reason: collision with root package name */
    public int f37363b0;

    /* renamed from: c  reason: collision with root package name */
    public y.c f37364c;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f37366d0;
    public int e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f37368f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f37370g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f37372h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f37374i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37376j0;

    /* renamed from: k  reason: collision with root package name */
    public String f37377k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f37378k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f37379l;

    /* renamed from: l0  reason: collision with root package name */
    public String f37380l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f37381m;

    /* renamed from: m0  reason: collision with root package name */
    public String f37382m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f37383n;

    /* renamed from: n0  reason: collision with root package name */
    public int f37384n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f37385o;

    /* renamed from: o0  reason: collision with root package name */
    public int f37386o0;

    /* renamed from: p  reason: collision with root package name */
    public int f37387p;

    /* renamed from: p0  reason: collision with root package name */
    public final float[] f37388p0;

    /* renamed from: q  reason: collision with root package name */
    public int f37389q;

    /* renamed from: q0  reason: collision with root package name */
    public final e[] f37390q0;
    public int r;

    /* renamed from: r0  reason: collision with root package name */
    public final e[] f37391r0;

    /* renamed from: s  reason: collision with root package name */
    public int f37392s;

    /* renamed from: s0  reason: collision with root package name */
    public e f37393s0;

    /* renamed from: t  reason: collision with root package name */
    public int f37394t;

    /* renamed from: t0  reason: collision with root package name */
    public e f37395t0;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f37396u;

    /* renamed from: u0  reason: collision with root package name */
    public int f37397u0;

    /* renamed from: v  reason: collision with root package name */
    public int f37398v;

    /* renamed from: v0  reason: collision with root package name */
    public int f37399v0;

    /* renamed from: w  reason: collision with root package name */
    public int f37400w;

    /* renamed from: x  reason: collision with root package name */
    public float f37401x;

    /* renamed from: y  reason: collision with root package name */
    public int f37402y;

    /* renamed from: z  reason: collision with root package name */
    public int f37403z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f37360a = false;

    /* renamed from: d  reason: collision with root package name */
    public y.l f37365d = null;

    /* renamed from: e  reason: collision with root package name */
    public y.n f37367e = null;
    public final boolean[] f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f37369g = true;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f37371h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f37373i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f37375j = -1;

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new HashMap();
        this.f37379l = false;
        this.f37381m = false;
        this.f37383n = false;
        this.f37385o = false;
        this.f37387p = -1;
        this.f37389q = -1;
        this.r = 0;
        this.f37392s = 0;
        this.f37394t = 0;
        this.f37396u = new int[2];
        this.f37398v = 0;
        this.f37400w = 0;
        this.f37401x = 1.0f;
        this.f37402y = 0;
        this.f37403z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        d dVar = new d(this, d.a.LEFT);
        this.K = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.L = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.M = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.N = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.O = dVar5;
        d dVar6 = new d(this, d.a.CENTER_X);
        this.P = dVar6;
        d dVar7 = new d(this, d.a.CENTER_Y);
        this.Q = dVar7;
        d dVar8 = new d(this, d.a.CENTER);
        this.R = dVar8;
        this.S = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList<d> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        a aVar = a.FIXED;
        this.V = new a[]{aVar, aVar};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f37361a0 = -1;
        this.f37363b0 = 0;
        this.c0 = 0;
        this.f37366d0 = 0;
        this.f37370g0 = 0.5f;
        this.f37372h0 = 0.5f;
        this.f37376j0 = 0;
        this.f37378k0 = false;
        this.f37380l0 = null;
        this.f37382m0 = null;
        this.f37384n0 = 0;
        this.f37386o0 = 0;
        this.f37388p0 = new float[]{-1.0f, -1.0f};
        this.f37390q0 = new e[]{null, null};
        this.f37391r0 = new e[]{null, null};
        this.f37393s0 = null;
        this.f37395t0 = null;
        this.f37397u0 = -1;
        this.f37399v0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void K(int i6, int i10, String str, StringBuilder sb2) {
        if (i6 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i6);
        sb2.append(",\n");
    }

    public static void L(StringBuilder sb2, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f);
        sb2.append(",\n");
    }

    public static void s(StringBuilder sb2, String str, int i6, int i10, int i11, int i12, int i13, float f) {
        sb2.append(str);
        sb2.append(" :  {\n");
        K(i6, 0, "      size", sb2);
        K(i10, 0, "      min", sb2);
        K(i11, SubsamplingScaleImageView.TILE_SIZE_AUTO, "      max", sb2);
        K(i12, 0, "      matchMin", sb2);
        K(i13, 0, "      matchDef", sb2);
        L(sb2, "      matchPercent", f, 1.0f);
        sb2.append("    },\n");
    }

    public static void t(StringBuilder sb2, String str, d dVar) {
        if (dVar.f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f);
        sb2.append("'");
        if (dVar.f37352h != Integer.MIN_VALUE || dVar.f37351g != 0) {
            sb2.append(",");
            sb2.append(dVar.f37351g);
            if (dVar.f37352h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f37352h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A(int i6) {
        d dVar;
        d dVar2;
        int i10 = i6 * 2;
        d[] dVarArr = this.S;
        d dVar3 = dVarArr[i10];
        d dVar4 = dVar3.f;
        if (dVar4 != null && dVar4.f != dVar3 && (dVar2 = (dVar = dVarArr[i10 + 1]).f) != null && dVar2.f == dVar) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        d dVar = this.K;
        d dVar2 = dVar.f;
        if (dVar2 == null || dVar2.f != dVar) {
            d dVar3 = this.M;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean C() {
        d dVar = this.L;
        d dVar2 = dVar.f;
        if (dVar2 == null || dVar2.f != dVar) {
            d dVar3 = this.N;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean D() {
        if (this.f37369g && this.f37376j0 != 8) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if (!this.f37379l && (!this.K.f37348c || !this.M.f37348c)) {
            return false;
        }
        return true;
    }

    public boolean F() {
        if (!this.f37381m && (!this.L.f37348c || !this.N.f37348c)) {
            return false;
        }
        return true;
    }

    public void G() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f37361a0 = -1;
        this.f37363b0 = 0;
        this.c0 = 0;
        this.f37366d0 = 0;
        this.e0 = 0;
        this.f37368f0 = 0;
        this.f37370g0 = 0.5f;
        this.f37372h0 = 0.5f;
        a[] aVarArr = this.V;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f37374i0 = null;
        this.f37376j0 = 0;
        this.f37382m0 = null;
        this.f37384n0 = 0;
        this.f37386o0 = 0;
        float[] fArr = this.f37388p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f37387p = -1;
        this.f37389q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f37392s = 0;
        this.f37394t = 0;
        this.f37401x = 1.0f;
        this.A = 1.0f;
        this.f37400w = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f37403z = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f37398v = 0;
        this.f37402y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f37369g = true;
        int[] iArr2 = this.f37396u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f37373i = -1;
        this.f37375j = -1;
    }

    public final void H() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList<d> arrayList = this.T;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).j();
        }
    }

    public final void I() {
        this.f37379l = false;
        this.f37381m = false;
        this.f37383n = false;
        this.f37385o = false;
        ArrayList<d> arrayList = this.T;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = arrayList.get(i6);
            dVar.f37348c = false;
            dVar.f37347b = 0;
        }
    }

    public void J(v.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void M(int i6, int i10) {
        if (this.f37379l) {
            return;
        }
        this.K.l(i6);
        this.M.l(i10);
        this.f37363b0 = i6;
        this.X = i10 - i6;
        this.f37379l = true;
    }

    public final void N(int i6, int i10) {
        if (this.f37381m) {
            return;
        }
        this.L.l(i6);
        this.N.l(i10);
        this.c0 = i6;
        this.Y = i10 - i6;
        if (this.F) {
            this.O.l(i6 + this.f37366d0);
        }
        this.f37381m = true;
    }

    public final void O(int i6) {
        this.Y = i6;
        int i10 = this.f37368f0;
        if (i6 < i10) {
            this.Y = i10;
        }
    }

    public final void P(a aVar) {
        this.V[0] = aVar;
    }

    public final void Q(a aVar) {
        this.V[1] = aVar;
    }

    public final void R(int i6) {
        this.X = i6;
        int i10 = this.e0;
        if (i6 < i10) {
            this.X = i10;
        }
    }

    public void S(boolean z10, boolean z11) {
        int i6;
        int i10;
        y.l lVar = this.f37365d;
        boolean z12 = z10 & lVar.f38181g;
        y.n nVar = this.f37367e;
        boolean z13 = z11 & nVar.f38181g;
        int i11 = lVar.f38182h.f38158g;
        int i12 = nVar.f38182h.f38158g;
        int i13 = lVar.f38183i.f38158g;
        int i14 = nVar.f38183i.f38158g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z12) {
            this.f37363b0 = i11;
        }
        if (z13) {
            this.c0 = i12;
        }
        if (this.f37376j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        a aVar = a.FIXED;
        if (z12) {
            if (this.V[0] == aVar && i16 < (i10 = this.X)) {
                i16 = i10;
            }
            this.X = i16;
            int i18 = this.e0;
            if (i16 < i18) {
                this.X = i18;
            }
        }
        if (z13) {
            if (this.V[1] == aVar && i17 < (i6 = this.Y)) {
                i17 = i6;
            }
            this.Y = i17;
            int i19 = this.f37368f0;
            if (i17 < i19) {
                this.Y = i19;
            }
        }
    }

    public void T(v.d dVar, boolean z10) {
        int i6;
        int i10;
        y.n nVar;
        y.l lVar;
        dVar.getClass();
        int n10 = v.d.n(this.K);
        int n11 = v.d.n(this.L);
        int n12 = v.d.n(this.M);
        int n13 = v.d.n(this.N);
        if (z10 && (lVar = this.f37365d) != null) {
            y.f fVar = lVar.f38182h;
            if (fVar.f38161j) {
                y.f fVar2 = lVar.f38183i;
                if (fVar2.f38161j) {
                    n10 = fVar.f38158g;
                    n12 = fVar2.f38158g;
                }
            }
        }
        if (z10 && (nVar = this.f37367e) != null) {
            y.f fVar3 = nVar.f38182h;
            if (fVar3.f38161j) {
                y.f fVar4 = nVar.f38183i;
                if (fVar4.f38161j) {
                    n11 = fVar3.f38158g;
                    n13 = fVar4.f38158g;
                }
            }
        }
        int i11 = n13 - n11;
        if (n12 - n10 < 0 || i11 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i12 = n12 - n10;
        int i13 = n13 - n11;
        this.f37363b0 = n10;
        this.c0 = n11;
        if (this.f37376j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        a[] aVarArr = this.V;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i12 < (i10 = this.X)) {
            i12 = i10;
        }
        if (aVarArr[1] == aVar2 && i13 < (i6 = this.Y)) {
            i13 = i6;
        }
        this.X = i12;
        this.Y = i13;
        int i14 = this.f37368f0;
        if (i13 < i14) {
            this.Y = i14;
        }
        int i15 = this.e0;
        if (i12 < i15) {
            this.X = i15;
        }
        int i16 = this.f37400w;
        a aVar3 = a.MATCH_CONSTRAINT;
        if (i16 > 0 && aVar == aVar3) {
            this.X = Math.min(this.X, i16);
        }
        int i17 = this.f37403z;
        if (i17 > 0 && this.V[1] == aVar3) {
            this.Y = Math.min(this.Y, i17);
        }
        int i18 = this.X;
        if (i12 != i18) {
            this.f37373i = i18;
        }
        int i19 = this.Y;
        if (i13 != i19) {
            this.f37375j = i19;
        }
    }

    public final void d(f fVar, v.d dVar, HashSet<e> hashSet, int i6, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            e(dVar, fVar.Z(64));
        }
        if (i6 == 0) {
            HashSet<d> hashSet2 = this.K.f37346a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f37349d.d(fVar, dVar, hashSet, i6, true);
                }
            }
            HashSet<d> hashSet3 = this.M.f37346a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f37349d.d(fVar, dVar, hashSet, i6, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.L.f37346a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f37349d.d(fVar, dVar, hashSet, i6, true);
            }
        }
        HashSet<d> hashSet5 = this.N.f37346a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f37349d.d(fVar, dVar, hashSet, i6, true);
            }
        }
        HashSet<d> hashSet6 = this.O.f37346a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f37349d.d(fVar, dVar, hashSet, i6, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
        if (r0.d() > r3.N0.get().d()) goto L403;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(v.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        boolean[] zArr;
        a aVar;
        boolean z14;
        boolean[] zArr2;
        boolean z15;
        boolean z16;
        e eVar;
        e eVar2;
        d dVar2;
        boolean z17;
        boolean z18;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        a aVar2;
        a aVar3;
        boolean z19;
        a aVar4;
        int i15;
        boolean z20;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z21;
        int i22;
        boolean z22;
        boolean z23;
        a aVar5;
        boolean z24;
        int i23;
        d dVar3;
        boolean z25;
        boolean z26;
        a aVar6;
        d dVar4;
        a aVar7;
        d dVar5;
        v.i iVar;
        v.i iVar2;
        v.i iVar3;
        v.i iVar4;
        v.i iVar5;
        d dVar6;
        int i24;
        int i25;
        char c10;
        e eVar3;
        v.d dVar7;
        v.i iVar6;
        v.i iVar7;
        v.i iVar8;
        boolean z27;
        boolean z28;
        v.i iVar9;
        v.i iVar10;
        e eVar4;
        v.d dVar8;
        boolean z29;
        v.i iVar11;
        v.i iVar12;
        boolean z30;
        a[] aVarArr;
        boolean z31;
        e eVar5;
        v.i iVar13;
        e eVar6;
        v.i iVar14;
        a[] aVarArr2;
        boolean z32;
        y.l lVar;
        y.f fVar;
        int i26;
        int i27;
        boolean B;
        boolean C;
        boolean z33;
        y.l lVar2;
        y.n nVar;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        d dVar9 = this.K;
        v.i k10 = dVar.k(dVar9);
        d dVar10 = this.M;
        v.i k11 = dVar.k(dVar10);
        d dVar11 = this.L;
        v.i k12 = dVar.k(dVar11);
        d dVar12 = this.N;
        v.i k13 = dVar.k(dVar12);
        d dVar13 = this.O;
        v.i k14 = dVar.k(dVar13);
        e eVar7 = this.W;
        a aVar8 = a.WRAP_CONTENT;
        if (eVar7 != null) {
            a[] aVarArr3 = eVar7.V;
            if (aVarArr3[0] == aVar8) {
                z37 = true;
            } else {
                z37 = false;
            }
            if (aVarArr3[1] == aVar8) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = this.r;
            if (i28 != 1) {
                if (i28 != 2) {
                    if (i28 != 3) {
                        z13 = z37;
                        z12 = z11;
                    }
                }
                z12 = z11;
                z13 = false;
            } else {
                z13 = z37;
                z12 = false;
            }
            i6 = this.f37376j0;
            zArr = this.U;
            if (i6 != 8 && !this.f37378k0) {
                ArrayList<d> arrayList = this.T;
                int size = arrayList.size();
                aVar = aVar8;
                int i29 = 0;
                while (true) {
                    if (i29 < size) {
                        ArrayList<d> arrayList2 = arrayList;
                        HashSet<d> hashSet = arrayList.get(i29).f37346a;
                        if (hashSet != null && hashSet.size() > 0) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        if (z36) {
                            z35 = true;
                            break;
                        } else {
                            i29++;
                            arrayList = arrayList2;
                        }
                    } else {
                        z35 = false;
                        break;
                    }
                }
                if (!z35 && !zArr[0] && !zArr[1]) {
                    return;
                }
            } else {
                aVar = aVar8;
            }
            z14 = this.f37379l;
            if (z14 && !this.f37381m) {
                zArr2 = zArr;
            } else {
                boolean z38 = this.f37371h;
                if (z14) {
                    dVar.d(k10, this.f37363b0);
                    dVar.d(k11, this.f37363b0 + this.X);
                    if (z13 && (eVar2 = this.W) != null) {
                        if (z38) {
                            f fVar2 = (f) eVar2;
                            WeakReference<d> weakReference = fVar2.N0;
                            if (weakReference != null && weakReference.get() != null) {
                                zArr2 = zArr;
                            } else {
                                zArr2 = zArr;
                            }
                            fVar2.N0 = new WeakReference<>(dVar9);
                            WeakReference<d> weakReference2 = fVar2.P0;
                            if (weakReference2 == null || weakReference2.get() == null || dVar10.d() > fVar2.P0.get().d()) {
                                fVar2.P0 = new WeakReference<>(dVar10);
                            }
                        } else {
                            zArr2 = zArr;
                            dVar.f(dVar.k(eVar2.M), k11, 0, 5);
                        }
                        if (this.f37381m) {
                            dVar.d(k12, this.c0);
                            dVar.d(k13, this.c0 + this.Y);
                            HashSet<d> hashSet2 = dVar13.f37346a;
                            if (hashSet2 != null && hashSet2.size() > 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                dVar.d(k14, this.c0 + this.f37366d0);
                            }
                            if (z12 && (eVar = this.W) != null) {
                                if (z38) {
                                    f fVar3 = (f) eVar;
                                    WeakReference<d> weakReference3 = fVar3.M0;
                                    if (weakReference3 == null || weakReference3.get() == null || dVar11.d() > fVar3.M0.get().d()) {
                                        fVar3.M0 = new WeakReference<>(dVar11);
                                    }
                                    WeakReference<d> weakReference4 = fVar3.O0;
                                    if (weakReference4 == null || weakReference4.get() == null || dVar12.d() > fVar3.O0.get().d()) {
                                        fVar3.O0 = new WeakReference<>(dVar12);
                                    }
                                } else {
                                    z15 = false;
                                    dVar.f(dVar.k(eVar.N), k13, 0, 5);
                                    if (this.f37379l && this.f37381m) {
                                        this.f37379l = z15;
                                        this.f37381m = z15;
                                        return;
                                    }
                                }
                            }
                        }
                        z15 = false;
                        if (this.f37379l) {
                            this.f37379l = z15;
                            this.f37381m = z15;
                            return;
                        }
                    }
                }
                zArr2 = zArr;
                if (this.f37381m) {
                }
                z15 = false;
                if (this.f37379l) {
                }
            }
            boolean[] zArr3 = this.f;
            if (!z10 && (lVar2 = this.f37365d) != null && (nVar = this.f37367e) != null) {
                y.f fVar4 = lVar2.f38182h;
                dVar2 = dVar13;
                if (fVar4.f38161j && lVar2.f38183i.f38161j && nVar.f38182h.f38161j && nVar.f38183i.f38161j) {
                    dVar.d(k10, fVar4.f38158g);
                    dVar.d(k11, this.f37365d.f38183i.f38158g);
                    dVar.d(k12, this.f37367e.f38182h.f38158g);
                    dVar.d(k13, this.f37367e.f38183i.f38158g);
                    dVar.d(k14, this.f37367e.f38169k.f38158g);
                    if (this.W != null) {
                        if (z13 && zArr3[0] && !B()) {
                            dVar.f(dVar.k(this.W.M), k11, 0, 8);
                        }
                        if (z12 && zArr3[1] && !C()) {
                            z34 = false;
                            dVar.f(dVar.k(this.W.N), k13, 0, 8);
                            this.f37379l = z34;
                            this.f37381m = z34;
                            return;
                        }
                    }
                    z34 = false;
                    this.f37379l = z34;
                    this.f37381m = z34;
                    return;
                }
            } else {
                dVar2 = dVar13;
            }
            if (this.W == null) {
                if (A(0)) {
                    ((f) this.W).V(0, this);
                    B = true;
                } else {
                    B = B();
                }
                if (A(1)) {
                    ((f) this.W).V(1, this);
                    C = true;
                } else {
                    C = C();
                }
                if (!B && z13 && this.f37376j0 != 8 && dVar9.f == null && dVar10.f == null) {
                    z33 = B;
                    dVar.f(dVar.k(this.W.M), k11, 0, 1);
                } else {
                    z33 = B;
                }
                if (!C && z12 && this.f37376j0 != 8 && dVar11.f == null && dVar12.f == null && dVar2 == null) {
                    dVar.f(dVar.k(this.W.N), k13, 0, 1);
                }
                z17 = C;
                z18 = z33;
            } else {
                z17 = false;
                z18 = false;
            }
            i10 = this.X;
            i11 = this.e0;
            if (i10 >= i11) {
                i11 = i10;
            }
            i12 = this.Y;
            i13 = this.f37368f0;
            i14 = i11;
            if (i12 >= i13) {
                i13 = i12;
            }
            a[] aVarArr4 = this.V;
            aVar2 = aVarArr4[0];
            aVar3 = a.MATCH_CONSTRAINT;
            if (aVar2 == aVar3) {
                z19 = true;
            } else {
                z19 = false;
            }
            aVar4 = aVarArr4[1];
            i15 = i13;
            if (aVar4 == aVar3) {
                z20 = true;
            } else {
                z20 = false;
            }
            int i30 = this.f37361a0;
            this.B = i30;
            f = this.Z;
            this.C = f;
            i16 = this.f37392s;
            i17 = this.f37394t;
            if (f <= 0.0f && this.f37376j0 != 8) {
                if (aVar2 == aVar3 && i16 == 0) {
                    i16 = 3;
                }
                if (aVar4 == aVar3 && i17 == 0) {
                    i17 = 3;
                }
                if (aVar2 == aVar3 && aVar4 == aVar3 && i16 == 3 && i17 == 3) {
                    if (i30 == -1) {
                        if (z19 && !z20) {
                            this.B = 0;
                        } else if (!z19 && z20) {
                            this.B = 1;
                            if (i30 == -1) {
                                this.C = 1.0f / f;
                            }
                        }
                    }
                    if (this.B == 0 && (!dVar11.h() || !dVar12.h())) {
                        this.B = 1;
                    } else if (this.B == 1 && (!dVar9.h() || !dVar10.h())) {
                        this.B = 0;
                    }
                    if (this.B == -1 && (!dVar11.h() || !dVar12.h() || !dVar9.h() || !dVar10.h())) {
                        if (dVar11.h() && dVar12.h()) {
                            this.B = 0;
                        } else if (dVar9.h() && dVar10.h()) {
                            this.C = 1.0f / this.C;
                            this.B = 1;
                        }
                    }
                    if (this.B == -1) {
                        int i31 = this.f37398v;
                        if (i31 > 0 && this.f37402y == 0) {
                            this.B = 0;
                        } else if (i31 == 0 && this.f37402y > 0) {
                            this.C = 1.0f / this.C;
                            this.B = 1;
                        }
                    }
                } else if (aVar2 == aVar3 && i16 == 3) {
                    this.B = 0;
                    int i32 = (int) (f * i12);
                    if (aVar4 != aVar3) {
                        i20 = i32;
                        i19 = i17;
                        i21 = i15;
                        z21 = false;
                        i18 = 4;
                    } else {
                        i20 = i32;
                        i27 = i15;
                        i18 = i16;
                        i21 = i27;
                        i19 = i17;
                        z21 = true;
                    }
                } else if (aVar4 == aVar3 && i17 == 3) {
                    this.B = 1;
                    if (i30 == -1) {
                        this.C = 1.0f / f;
                    }
                    i27 = (int) (this.C * i10);
                    if (aVar2 != aVar3) {
                        i18 = i16;
                        i21 = i27;
                        i20 = i14;
                        z21 = false;
                        i19 = 4;
                    } else {
                        i20 = i14;
                        i18 = i16;
                        i21 = i27;
                        i19 = i17;
                        z21 = true;
                    }
                }
                i20 = i14;
                i27 = i15;
                i18 = i16;
                i21 = i27;
                i19 = i17;
                z21 = true;
            } else {
                i18 = i16;
                i19 = i17;
                i20 = i14;
                i21 = i15;
                z21 = false;
            }
            int[] iArr = this.f37396u;
            iArr[0] = i18;
            iArr[1] = i19;
            if (!z21) {
                int i33 = this.B;
                i22 = -1;
                if (i33 == 0 || i33 == -1) {
                    z22 = true;
                    if (!z21 && ((i26 = this.B) == 1 || i26 == i22)) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    aVar5 = aVar;
                    if (this.V[0] != aVar5 && (this instanceof f)) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z24) {
                        i23 = 0;
                    } else {
                        i23 = i20;
                    }
                    dVar3 = this.R;
                    z25 = !dVar3.h();
                    z26 = zArr2[0];
                    boolean z39 = zArr2[1];
                    if (this.f37387p != 2 && !this.f37379l) {
                        if (z10 && (lVar = this.f37365d) != null) {
                            fVar = lVar.f38182h;
                            if (fVar.f38161j && lVar.f38183i.f38161j) {
                                if (!z10) {
                                    dVar.d(k10, fVar.f38158g);
                                    dVar.d(k11, this.f37365d.f38183i.f38158g);
                                    if (this.W != null && z13 && zArr3[0] && !B()) {
                                        dVar.f(dVar.k(this.W.M), k11, 0, 8);
                                    }
                                    iVar4 = k11;
                                    aVar6 = aVar5;
                                    iVar5 = k10;
                                    dVar4 = dVar12;
                                    aVar7 = aVar3;
                                    dVar5 = dVar2;
                                    iVar = k14;
                                    iVar2 = k12;
                                    iVar3 = k13;
                                    dVar6 = dVar3;
                                    if (!z10) {
                                        eVar3 = this;
                                        y.n nVar2 = eVar3.f37367e;
                                        if (nVar2 != null) {
                                            y.f fVar5 = nVar2.f38182h;
                                            if (fVar5.f38161j && nVar2.f38183i.f38161j) {
                                                dVar7 = dVar;
                                                iVar8 = iVar2;
                                                dVar7.d(iVar8, fVar5.f38158g);
                                                iVar7 = iVar3;
                                                dVar7.d(iVar7, eVar3.f37367e.f38183i.f38158g);
                                                iVar6 = iVar;
                                                dVar7.d(iVar6, eVar3.f37367e.f38169k.f38158g);
                                                e eVar8 = eVar3.W;
                                                if (eVar8 != null && !z17 && z12) {
                                                    c10 = 1;
                                                    if (zArr3[1]) {
                                                        i24 = 8;
                                                        i25 = 0;
                                                        dVar7.f(dVar7.k(eVar8.N), iVar7, 0, 8);
                                                    } else {
                                                        i24 = 8;
                                                        i25 = 0;
                                                    }
                                                } else {
                                                    i24 = 8;
                                                    i25 = 0;
                                                    c10 = 1;
                                                }
                                                z27 = false;
                                                if (eVar3.f37389q == 2) {
                                                    z28 = false;
                                                } else {
                                                    z28 = z27;
                                                }
                                                if (!z28 && !eVar3.f37381m) {
                                                    if (eVar3.V[c10] == aVar6 && (eVar3 instanceof f)) {
                                                        z29 = true;
                                                    } else {
                                                        z29 = false;
                                                    }
                                                    if (z29) {
                                                        i21 = 0;
                                                    }
                                                    e eVar9 = eVar3.W;
                                                    if (eVar9 != null) {
                                                        iVar11 = dVar7.k(eVar9.N);
                                                    } else {
                                                        iVar11 = null;
                                                    }
                                                    e eVar10 = eVar3.W;
                                                    if (eVar10 != null) {
                                                        iVar12 = dVar7.k(eVar10.L);
                                                    } else {
                                                        iVar12 = null;
                                                    }
                                                    int i34 = eVar3.f37366d0;
                                                    if (i34 > 0 || eVar3.f37376j0 == i24) {
                                                        d dVar14 = dVar5;
                                                        if (dVar14.f != null) {
                                                            dVar7.e(iVar6, iVar8, i34, i24);
                                                            dVar7.e(iVar6, dVar7.k(dVar14.f), dVar14.e(), i24);
                                                            if (z12) {
                                                                dVar7.f(iVar11, dVar7.k(dVar4), i25, 5);
                                                            }
                                                            z30 = false;
                                                            boolean z40 = zArr3[c10];
                                                            aVarArr = eVar3.V;
                                                            a aVar9 = aVarArr[c10];
                                                            d dVar15 = eVar3.L;
                                                            d dVar16 = eVar3.N;
                                                            int i35 = eVar3.c0;
                                                            int i36 = eVar3.f37368f0;
                                                            int i37 = eVar3.D[c10];
                                                            float f2 = eVar3.f37372h0;
                                                            if (aVarArr[0] != aVar7) {
                                                                z31 = true;
                                                            } else {
                                                                z31 = false;
                                                            }
                                                            iVar9 = iVar7;
                                                            iVar10 = iVar8;
                                                            g(dVar, false, z12, z13, z40, iVar12, iVar11, aVar9, z29, dVar15, dVar16, i35, i21, i36, i37, f2, z23, z31, z17, z18, z39, i19, i18, eVar3.f37402y, eVar3.f37403z, eVar3.A, z30);
                                                        } else if (eVar3.f37376j0 == i24) {
                                                            dVar7.e(iVar6, iVar8, dVar14.e(), i24);
                                                        } else {
                                                            dVar7.e(iVar6, iVar8, i34, i24);
                                                        }
                                                    }
                                                    z30 = z25;
                                                    boolean z402 = zArr3[c10];
                                                    aVarArr = eVar3.V;
                                                    a aVar92 = aVarArr[c10];
                                                    d dVar152 = eVar3.L;
                                                    d dVar162 = eVar3.N;
                                                    int i352 = eVar3.c0;
                                                    int i362 = eVar3.f37368f0;
                                                    int i372 = eVar3.D[c10];
                                                    float f22 = eVar3.f37372h0;
                                                    if (aVarArr[0] != aVar7) {
                                                    }
                                                    iVar9 = iVar7;
                                                    iVar10 = iVar8;
                                                    g(dVar, false, z12, z13, z402, iVar12, iVar11, aVar92, z29, dVar152, dVar162, i352, i21, i362, i372, f22, z23, z31, z17, z18, z39, i19, i18, eVar3.f37402y, eVar3.f37403z, eVar3.A, z30);
                                                } else {
                                                    iVar9 = iVar7;
                                                    iVar10 = iVar8;
                                                }
                                                if (z21) {
                                                    eVar4 = this;
                                                    if (eVar4.B == 1) {
                                                        float f10 = eVar4.C;
                                                        v.b l2 = dVar.l();
                                                        l2.f34628d.b(iVar9, -1.0f);
                                                        l2.f34628d.b(iVar10, 1.0f);
                                                        l2.f34628d.b(iVar4, f10);
                                                        l2.f34628d.b(iVar5, -f10);
                                                        dVar8 = dVar;
                                                        dVar8.c(l2);
                                                    } else {
                                                        dVar8 = dVar;
                                                        float f11 = eVar4.C;
                                                        v.b l10 = dVar.l();
                                                        l10.f34628d.b(iVar4, -1.0f);
                                                        l10.f34628d.b(iVar5, 1.0f);
                                                        l10.f34628d.b(iVar9, f11);
                                                        l10.f34628d.b(iVar10, -f11);
                                                        dVar8.c(l10);
                                                    }
                                                } else {
                                                    eVar4 = this;
                                                    dVar8 = dVar;
                                                }
                                                if (dVar6.h()) {
                                                    d dVar17 = dVar6;
                                                    e eVar11 = dVar17.f.f37349d;
                                                    int e10 = dVar17.e();
                                                    d.a aVar10 = d.a.LEFT;
                                                    v.i k15 = dVar8.k(eVar4.m(aVar10));
                                                    d.a aVar11 = d.a.TOP;
                                                    v.i k16 = dVar8.k(eVar4.m(aVar11));
                                                    d.a aVar12 = d.a.RIGHT;
                                                    v.i k17 = dVar8.k(eVar4.m(aVar12));
                                                    d.a aVar13 = d.a.BOTTOM;
                                                    v.i k18 = dVar8.k(eVar4.m(aVar13));
                                                    v.i k19 = dVar8.k(eVar11.m(aVar10));
                                                    v.i k20 = dVar8.k(eVar11.m(aVar11));
                                                    v.i k21 = dVar8.k(eVar11.m(aVar12));
                                                    v.i k22 = dVar8.k(eVar11.m(aVar13));
                                                    v.b l11 = dVar.l();
                                                    double radians = (float) Math.toRadians(eVar4.E + 90.0f);
                                                    double d10 = e10;
                                                    l11.f34628d.b(k20, 0.5f);
                                                    l11.f34628d.b(k22, 0.5f);
                                                    l11.f34628d.b(k16, -0.5f);
                                                    l11.f34628d.b(k18, -0.5f);
                                                    l11.f34626b = -((float) (Math.sin(radians) * d10));
                                                    dVar8.c(l11);
                                                    v.b l12 = dVar.l();
                                                    float cos = (float) (Math.cos(radians) * d10);
                                                    l12.f34628d.b(k19, 0.5f);
                                                    l12.f34628d.b(k21, 0.5f);
                                                    l12.f34628d.b(k15, -0.5f);
                                                    l12.f34628d.b(k17, -0.5f);
                                                    l12.f34626b = -cos;
                                                    dVar8.c(l12);
                                                }
                                                eVar4.f37379l = false;
                                                eVar4.f37381m = false;
                                            }
                                        }
                                        dVar7 = dVar;
                                        iVar6 = iVar;
                                        iVar7 = iVar3;
                                        iVar8 = iVar2;
                                        i24 = 8;
                                        i25 = 0;
                                        c10 = 1;
                                    } else {
                                        i24 = 8;
                                        i25 = 0;
                                        c10 = 1;
                                        eVar3 = this;
                                        dVar7 = dVar;
                                        iVar6 = iVar;
                                        iVar7 = iVar3;
                                        iVar8 = iVar2;
                                    }
                                    z27 = true;
                                    if (eVar3.f37389q == 2) {
                                    }
                                    if (!z28) {
                                    }
                                    iVar9 = iVar7;
                                    iVar10 = iVar8;
                                    if (z21) {
                                    }
                                    if (dVar6.h()) {
                                    }
                                    eVar4.f37379l = false;
                                    eVar4.f37381m = false;
                                }
                            }
                        }
                        eVar5 = this.W;
                        if (eVar5 == null) {
                            iVar13 = dVar.k(eVar5.M);
                        } else {
                            iVar13 = null;
                        }
                        eVar6 = this.W;
                        if (eVar6 == null) {
                            iVar14 = dVar.k(eVar6.K);
                        } else {
                            iVar14 = null;
                        }
                        boolean z41 = zArr3[0];
                        aVarArr2 = this.V;
                        a aVar14 = aVarArr2[0];
                        d dVar18 = this.K;
                        d dVar19 = this.M;
                        int i38 = this.f37363b0;
                        int i39 = this.e0;
                        int i40 = this.D[0];
                        float f12 = this.f37370g0;
                        if (aVarArr2[1] != aVar3) {
                            z32 = true;
                        } else {
                            z32 = false;
                        }
                        aVar6 = aVar5;
                        iVar = k14;
                        dVar5 = dVar2;
                        iVar3 = k13;
                        dVar4 = dVar12;
                        aVar7 = aVar3;
                        iVar2 = k12;
                        dVar6 = dVar3;
                        iVar4 = k11;
                        iVar5 = k10;
                        g(dVar, true, z13, z12, z41, iVar14, iVar13, aVar14, z24, dVar18, dVar19, i38, i23, i39, i40, f12, z22, z32, z18, z17, z26, i18, i19, this.f37398v, this.f37400w, this.f37401x, z25);
                        if (!z10) {
                        }
                        z27 = true;
                        if (eVar3.f37389q == 2) {
                        }
                        if (!z28) {
                        }
                        iVar9 = iVar7;
                        iVar10 = iVar8;
                        if (z21) {
                        }
                        if (dVar6.h()) {
                        }
                        eVar4.f37379l = false;
                        eVar4.f37381m = false;
                    }
                    aVar6 = aVar5;
                    dVar4 = dVar12;
                    aVar7 = aVar3;
                    dVar5 = dVar2;
                    iVar = k14;
                    iVar2 = k12;
                    iVar3 = k13;
                    iVar4 = k11;
                    iVar5 = k10;
                    dVar6 = dVar3;
                    if (!z10) {
                    }
                    z27 = true;
                    if (eVar3.f37389q == 2) {
                    }
                    if (!z28) {
                    }
                    iVar9 = iVar7;
                    iVar10 = iVar8;
                    if (z21) {
                    }
                    if (dVar6.h()) {
                    }
                    eVar4.f37379l = false;
                    eVar4.f37381m = false;
                }
            } else {
                i22 = -1;
            }
            z22 = false;
            if (!z21) {
            }
            z23 = false;
            aVar5 = aVar;
            if (this.V[0] != aVar5) {
            }
            z24 = false;
            if (z24) {
            }
            dVar3 = this.R;
            z25 = !dVar3.h();
            z26 = zArr2[0];
            boolean z392 = zArr2[1];
            if (this.f37387p != 2) {
                if (z10) {
                    fVar = lVar.f38182h;
                    if (fVar.f38161j) {
                        if (!z10) {
                        }
                    }
                }
                eVar5 = this.W;
                if (eVar5 == null) {
                }
                eVar6 = this.W;
                if (eVar6 == null) {
                }
                boolean z412 = zArr3[0];
                aVarArr2 = this.V;
                a aVar142 = aVarArr2[0];
                d dVar182 = this.K;
                d dVar192 = this.M;
                int i382 = this.f37363b0;
                int i392 = this.e0;
                int i402 = this.D[0];
                float f122 = this.f37370g0;
                if (aVarArr2[1] != aVar3) {
                }
                aVar6 = aVar5;
                iVar = k14;
                dVar5 = dVar2;
                iVar3 = k13;
                dVar4 = dVar12;
                aVar7 = aVar3;
                iVar2 = k12;
                dVar6 = dVar3;
                iVar4 = k11;
                iVar5 = k10;
                g(dVar, true, z13, z12, z412, iVar14, iVar13, aVar142, z24, dVar182, dVar192, i382, i23, i392, i402, f122, z22, z32, z18, z17, z26, i18, i19, this.f37398v, this.f37400w, this.f37401x, z25);
                if (!z10) {
                }
                z27 = true;
                if (eVar3.f37389q == 2) {
                }
                if (!z28) {
                }
                iVar9 = iVar7;
                iVar10 = iVar8;
                if (z21) {
                }
                if (dVar6.h()) {
                }
                eVar4.f37379l = false;
                eVar4.f37381m = false;
            }
            aVar6 = aVar5;
            dVar4 = dVar12;
            aVar7 = aVar3;
            dVar5 = dVar2;
            iVar = k14;
            iVar2 = k12;
            iVar3 = k13;
            iVar4 = k11;
            iVar5 = k10;
            dVar6 = dVar3;
            if (!z10) {
            }
            z27 = true;
            if (eVar3.f37389q == 2) {
            }
            if (!z28) {
            }
            iVar9 = iVar7;
            iVar10 = iVar8;
            if (z21) {
            }
            if (dVar6.h()) {
            }
            eVar4.f37379l = false;
            eVar4.f37381m = false;
        }
        z11 = false;
        z12 = z11;
        z13 = false;
        i6 = this.f37376j0;
        zArr = this.U;
        if (i6 != 8) {
        }
        aVar = aVar8;
        z14 = this.f37379l;
        if (z14) {
        }
        boolean z382 = this.f37371h;
        if (z14) {
        }
        zArr2 = zArr;
        if (this.f37381m) {
        }
        z15 = false;
        if (this.f37379l) {
        }
        boolean[] zArr32 = this.f;
        if (!z10) {
        }
        dVar2 = dVar13;
        if (this.W == null) {
        }
        i10 = this.X;
        i11 = this.e0;
        if (i10 >= i11) {
        }
        i12 = this.Y;
        i13 = this.f37368f0;
        i14 = i11;
        if (i12 >= i13) {
        }
        a[] aVarArr42 = this.V;
        aVar2 = aVarArr42[0];
        aVar3 = a.MATCH_CONSTRAINT;
        if (aVar2 == aVar3) {
        }
        aVar4 = aVarArr42[1];
        i15 = i13;
        if (aVar4 == aVar3) {
        }
        int i302 = this.f37361a0;
        this.B = i302;
        f = this.Z;
        this.C = f;
        i16 = this.f37392s;
        i17 = this.f37394t;
        if (f <= 0.0f) {
        }
        i18 = i16;
        i19 = i17;
        i20 = i14;
        i21 = i15;
        z21 = false;
        int[] iArr2 = this.f37396u;
        iArr2[0] = i18;
        iArr2[1] = i19;
        if (!z21) {
        }
        z22 = false;
        if (!z21) {
        }
        z23 = false;
        aVar5 = aVar;
        if (this.V[0] != aVar5) {
        }
        z24 = false;
        if (z24) {
        }
        dVar3 = this.R;
        z25 = !dVar3.h();
        z26 = zArr2[0];
        boolean z3922 = zArr2[1];
        if (this.f37387p != 2) {
        }
        aVar6 = aVar5;
        dVar4 = dVar12;
        aVar7 = aVar3;
        dVar5 = dVar2;
        iVar = k14;
        iVar2 = k12;
        iVar3 = k13;
        iVar4 = k11;
        iVar5 = k10;
        dVar6 = dVar3;
        if (!z10) {
        }
        z27 = true;
        if (eVar3.f37389q == 2) {
        }
        if (!z28) {
        }
        iVar9 = iVar7;
        iVar10 = iVar8;
        if (z21) {
        }
        if (dVar6.h()) {
        }
        eVar4.f37379l = false;
        eVar4.f37381m = false;
    }

    public boolean f() {
        if (this.f37376j0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(v.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, v.i iVar, v.i iVar2, a aVar, boolean z14, d dVar2, d dVar3, int i6, int i10, int i11, int i12, float f, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i13, int i14, int i15, int i16, float f2, boolean z20) {
        boolean z21;
        int i17;
        int i18;
        boolean z22;
        boolean z23;
        int i19;
        int i20;
        boolean z24;
        boolean z25;
        v.i k10;
        v.i k11;
        v.i iVar3;
        v.i iVar4;
        v.i iVar5;
        v.i iVar6;
        boolean z26;
        int i21;
        char c10;
        int i22;
        d dVar4;
        v.i iVar7;
        int i23;
        v.i iVar8;
        int i24;
        v.i iVar9;
        int i25;
        boolean z27;
        boolean z28;
        int i26;
        int i27;
        boolean z29;
        int i28;
        boolean z30;
        boolean z31;
        e eVar;
        d dVar5;
        v.i iVar10;
        v.i iVar11;
        boolean z32;
        int i29;
        e eVar2;
        e eVar3;
        v.i iVar12;
        v.i iVar13;
        boolean z33;
        boolean z34;
        v.i iVar14;
        v.i iVar15;
        e eVar4;
        int i30;
        boolean z35;
        int i31;
        int i32;
        boolean z36;
        int i33;
        int i34;
        int i35;
        boolean z37;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z38;
        boolean z39;
        boolean z40;
        int i40;
        v.i iVar16;
        int i41;
        int i42 = i15;
        int i43 = i16;
        v.i k12 = dVar.k(dVar2);
        v.i k13 = dVar.k(dVar3);
        v.i k14 = dVar.k(dVar2.f);
        v.i k15 = dVar.k(dVar3.f);
        boolean h10 = dVar2.h();
        boolean h11 = dVar3.h();
        boolean h12 = this.R.h();
        int i44 = h11 ? (h10 ? 1 : 0) + 1 : h10 ? 1 : 0;
        if (h12) {
            i44++;
        }
        int i45 = i44;
        int i46 = z15 ? 3 : i13;
        int ordinal = aVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal == 2) {
            if (i46 != 4) {
                z21 = true;
                i17 = this.f37373i;
                if (i17 != -1 && z10) {
                    this.f37373i = -1;
                    i10 = i17;
                    z21 = false;
                }
                i18 = this.f37375j;
                if (i18 != -1 || z10) {
                    i18 = i10;
                } else {
                    this.f37375j = -1;
                    z21 = false;
                }
                boolean z41 = z21;
                if (this.f37376j0 != 8) {
                    z22 = false;
                    i18 = 0;
                } else {
                    z22 = z41;
                }
                if (z20) {
                    if (!h10 && !h11 && !h12) {
                        dVar.d(k12, i6);
                    } else if (h10 && !h11) {
                        z23 = h12;
                        dVar.e(k12, k14, dVar2.e(), 8);
                        if (z22) {
                            if (i45 == 2 || z15 || !(i46 == 1 || i46 == 0)) {
                                if (i42 == -2) {
                                    i42 = i18;
                                }
                                if (i43 == -2) {
                                    i43 = i18;
                                }
                                if (i18 > 0 && i46 != 1) {
                                    i18 = 0;
                                }
                                if (i42 > 0) {
                                    dVar.f(k13, k12, i42, 8);
                                    i18 = Math.max(i18, i42);
                                }
                                if (i43 > 0) {
                                    if ((z11 && i46 == 1) ? false : true) {
                                        i19 = 8;
                                        dVar.g(k13, k12, i43, 8);
                                    } else {
                                        i19 = 8;
                                    }
                                    i18 = Math.min(i18, i43);
                                } else {
                                    i19 = 8;
                                }
                                if (i46 != 1) {
                                    if (i46 == 2) {
                                        d.a aVar2 = d.a.TOP;
                                        d.a aVar3 = d.a.BOTTOM;
                                        d.a aVar4 = dVar2.f37350e;
                                        if (aVar4 != aVar2 && aVar4 != aVar3) {
                                            k10 = dVar.k(this.W.m(d.a.LEFT));
                                            k11 = dVar.k(this.W.m(d.a.RIGHT));
                                        } else {
                                            k10 = dVar.k(this.W.m(aVar2));
                                            k11 = dVar.k(this.W.m(aVar3));
                                        }
                                        v.b l2 = dVar.l();
                                        i20 = i45;
                                        l2.f34628d.b(k13, -1.0f);
                                        l2.f34628d.b(k12, 1.0f);
                                        l2.f34628d.b(k11, f2);
                                        l2.f34628d.b(k10, -f2);
                                        dVar.c(l2);
                                        if (z11) {
                                            z22 = false;
                                        }
                                        z24 = z13;
                                    } else {
                                        i20 = i45;
                                        z24 = true;
                                    }
                                    z25 = z24;
                                    int i47 = i42;
                                    boolean z42 = z22;
                                    if (z20) {
                                        iVar3 = iVar;
                                        iVar4 = iVar2;
                                        iVar5 = k13;
                                        iVar6 = k12;
                                        z26 = z25;
                                        i21 = i20;
                                        c10 = 1;
                                        i22 = 2;
                                    } else if (z17) {
                                        iVar3 = iVar;
                                        iVar4 = iVar2;
                                        iVar5 = k13;
                                        iVar6 = k12;
                                        z26 = z25;
                                        i21 = i20;
                                        i22 = 2;
                                        c10 = 1;
                                    } else {
                                        if (!h10 && !h11 && !z23) {
                                            dVar5 = dVar3;
                                            iVar15 = k13;
                                            z32 = z25;
                                            iVar14 = k15;
                                        } else if (!h10 || h11) {
                                            if (h10 || !h11) {
                                                iVar7 = k15;
                                                if (h10 && h11) {
                                                    e eVar5 = dVar2.f.f37349d;
                                                    e eVar6 = dVar3.f.f37349d;
                                                    e eVar7 = this.W;
                                                    int i48 = 6;
                                                    if (!z42) {
                                                        i23 = i46;
                                                        if (k14.f34665z && iVar7.f34665z) {
                                                            dVar.b(k12, k14, dVar2.e(), f, iVar7, k13, dVar3.e(), 8);
                                                            if (z11 && z25) {
                                                                if (dVar3.f != null) {
                                                                    i24 = dVar3.e();
                                                                    iVar8 = iVar2;
                                                                } else {
                                                                    iVar8 = iVar2;
                                                                    i24 = 0;
                                                                }
                                                                if (iVar7 != iVar8) {
                                                                    dVar.f(iVar8, k13, i24, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    } else {
                                                        if (i46 == 0) {
                                                            if (i43 != 0 || i47 != 0) {
                                                                i38 = 5;
                                                                i39 = 5;
                                                                z38 = true;
                                                                z39 = false;
                                                                z40 = true;
                                                            } else if (k14.f34665z && iVar7.f34665z) {
                                                                dVar.e(k12, k14, dVar2.e(), 8);
                                                                dVar.e(k13, iVar7, -dVar3.e(), 8);
                                                                return;
                                                            } else {
                                                                i38 = 8;
                                                                i39 = 8;
                                                                z38 = false;
                                                                z39 = true;
                                                                z40 = false;
                                                            }
                                                            z28 = z40;
                                                            i28 = 6;
                                                            z29 = z39;
                                                            z27 = z38;
                                                            i26 = ((eVar5 instanceof x.a) || (eVar6 instanceof x.a)) ? 4 : i38;
                                                            i27 = i39;
                                                            i23 = i46;
                                                        } else if (i46 == 2) {
                                                            if ((eVar5 instanceof x.a) || (eVar6 instanceof x.a)) {
                                                                i23 = i46;
                                                            } else {
                                                                i23 = i46;
                                                                i25 = 5;
                                                                iVar9 = iVar2;
                                                                i26 = i25;
                                                                i27 = 5;
                                                                z28 = true;
                                                                z27 = true;
                                                                z29 = false;
                                                                i28 = 6;
                                                                if (z28 || k14 != iVar7 || eVar5 == eVar7) {
                                                                    z30 = z28;
                                                                    z31 = true;
                                                                } else {
                                                                    z31 = false;
                                                                    z30 = false;
                                                                }
                                                                if (z27) {
                                                                    if (z42 || z16 || z18 || k14 != iVar || iVar7 != iVar9) {
                                                                        i31 = i27;
                                                                        i32 = i28;
                                                                        z36 = z31;
                                                                        z34 = z11;
                                                                    } else {
                                                                        z34 = false;
                                                                        i31 = 8;
                                                                        z36 = false;
                                                                        i32 = 8;
                                                                    }
                                                                    eVar = eVar6;
                                                                    dVar5 = dVar3;
                                                                    z32 = z25;
                                                                    eVar3 = eVar5;
                                                                    i29 = i47;
                                                                    iVar10 = iVar7;
                                                                    iVar12 = k14;
                                                                    eVar2 = eVar7;
                                                                    iVar11 = k13;
                                                                    iVar13 = k12;
                                                                    dVar.b(k12, k14, dVar2.e(), f, iVar7, k13, dVar3.e(), i32);
                                                                    i27 = i31;
                                                                    z33 = z36;
                                                                } else {
                                                                    eVar = eVar6;
                                                                    dVar5 = dVar3;
                                                                    iVar10 = iVar7;
                                                                    iVar11 = k13;
                                                                    z32 = z25;
                                                                    i29 = i47;
                                                                    eVar2 = eVar7;
                                                                    eVar3 = eVar5;
                                                                    iVar12 = k14;
                                                                    iVar13 = k12;
                                                                    z33 = z31;
                                                                    z34 = z11;
                                                                }
                                                                if (this.f37376j0 == 8) {
                                                                    HashSet<d> hashSet = dVar5.f37346a;
                                                                    if (hashSet == null) {
                                                                        z35 = false;
                                                                    } else {
                                                                        z35 = hashSet.size() > 0;
                                                                    }
                                                                    if (!z35) {
                                                                        return;
                                                                    }
                                                                }
                                                                if (z30) {
                                                                    iVar14 = iVar10;
                                                                    if (z34 && iVar12 != iVar14 && !z42 && ((eVar3 instanceof x.a) || (eVar instanceof x.a))) {
                                                                        i27 = 6;
                                                                    }
                                                                    dVar.f(iVar13, iVar12, dVar2.e(), i27);
                                                                    iVar15 = iVar11;
                                                                    dVar.g(iVar15, iVar14, -dVar3.e(), i27);
                                                                } else {
                                                                    iVar14 = iVar10;
                                                                    iVar15 = iVar11;
                                                                }
                                                                if (z34 || !z19 || (eVar3 instanceof x.a) || (eVar instanceof x.a)) {
                                                                    eVar4 = eVar2;
                                                                } else {
                                                                    eVar4 = eVar2;
                                                                    if (eVar != eVar4) {
                                                                        i27 = 6;
                                                                        i30 = 6;
                                                                        z33 = true;
                                                                        if (z33) {
                                                                            if (z29 && (!z18 || z12)) {
                                                                                if (eVar3 != eVar4 && eVar != eVar4) {
                                                                                    i48 = i30;
                                                                                }
                                                                                i48 = ((eVar3 instanceof h) || (eVar instanceof h)) ? 5 : 5;
                                                                                i30 = Math.max(z18 ? 5 : ((eVar3 instanceof x.a) || (eVar instanceof x.a)) ? 5 : 5, i30);
                                                                            }
                                                                            int i49 = i30;
                                                                            if (z34) {
                                                                                i49 = Math.min(i27, i49);
                                                                                if (z15 && !z18 && (eVar3 == eVar4 || eVar == eVar4)) {
                                                                                    i49 = 4;
                                                                                }
                                                                            }
                                                                            dVar.e(iVar13, iVar12, dVar2.e(), i49);
                                                                            dVar.e(iVar15, iVar14, -dVar3.e(), i49);
                                                                        }
                                                                        if (z34) {
                                                                            v.i iVar17 = iVar12;
                                                                            int e10 = iVar == iVar17 ? dVar2.e() : 0;
                                                                            if (iVar17 != iVar) {
                                                                                dVar.f(iVar13, iVar, e10, 5);
                                                                            }
                                                                        }
                                                                        if (z34 && z42 && i11 == 0 && i29 == 0) {
                                                                            if (!z42 && i23 == 3) {
                                                                                dVar.f(iVar15, iVar13, 0, 8);
                                                                            } else {
                                                                                dVar.f(iVar15, iVar13, 0, 5);
                                                                                i40 = 5;
                                                                                if (z34 || !z32) {
                                                                                    return;
                                                                                }
                                                                                if (dVar5.f != null) {
                                                                                    i41 = dVar3.e();
                                                                                    iVar16 = iVar2;
                                                                                } else {
                                                                                    iVar16 = iVar2;
                                                                                    i41 = 0;
                                                                                }
                                                                                if (iVar14 != iVar16) {
                                                                                    dVar.f(iVar16, iVar15, i41, i40);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                        }
                                                                        i40 = 5;
                                                                        if (z34) {
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                }
                                                                i30 = i26;
                                                                if (z33) {
                                                                }
                                                                if (z34) {
                                                                }
                                                                if (z34) {
                                                                    if (!z42) {
                                                                    }
                                                                    dVar.f(iVar15, iVar13, 0, 5);
                                                                    i40 = 5;
                                                                    if (z34) {
                                                                    }
                                                                }
                                                                i40 = 5;
                                                                if (z34) {
                                                                }
                                                            }
                                                        } else if (i46 == 1) {
                                                            i23 = i46;
                                                            i27 = 8;
                                                            i26 = 4;
                                                            iVar9 = iVar2;
                                                            z28 = true;
                                                            z27 = true;
                                                            z29 = false;
                                                            i28 = 6;
                                                            if (z28) {
                                                            }
                                                            z30 = z28;
                                                            z31 = true;
                                                            if (z27) {
                                                            }
                                                            if (this.f37376j0 == 8) {
                                                            }
                                                            if (z30) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            eVar4 = eVar2;
                                                            i30 = i26;
                                                            if (z33) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            i40 = 5;
                                                            if (z34) {
                                                            }
                                                        } else if (i46 == 3) {
                                                            i23 = i46;
                                                            if (this.B == -1) {
                                                                i35 = z18 ? z11 ? 5 : 4 : 8;
                                                                i33 = 5;
                                                                i34 = 8;
                                                            } else if (z15) {
                                                                if (i14 != 2 && i14 != 1) {
                                                                    z37 = false;
                                                                    if (z37) {
                                                                        i36 = 5;
                                                                        i37 = 8;
                                                                    } else {
                                                                        i36 = 4;
                                                                        i37 = 5;
                                                                    }
                                                                    i26 = i36;
                                                                    i27 = i37;
                                                                    z28 = true;
                                                                    z27 = true;
                                                                    z29 = true;
                                                                    i28 = 6;
                                                                }
                                                                z37 = true;
                                                                if (z37) {
                                                                }
                                                                i26 = i36;
                                                                i27 = i37;
                                                                z28 = true;
                                                                z27 = true;
                                                                z29 = true;
                                                                i28 = 6;
                                                            } else {
                                                                if (i43 > 0) {
                                                                    i33 = 5;
                                                                } else if (i43 != 0 || i47 != 0) {
                                                                    i33 = 4;
                                                                } else if (z18) {
                                                                    i34 = (eVar5 == eVar7 || eVar6 == eVar7) ? 5 : 4;
                                                                    i33 = 4;
                                                                    i35 = 6;
                                                                } else {
                                                                    i33 = 8;
                                                                }
                                                                i34 = 5;
                                                                i35 = 6;
                                                            }
                                                            i28 = i35;
                                                            z28 = true;
                                                            z27 = true;
                                                            z29 = true;
                                                            i26 = i33;
                                                            i27 = i34;
                                                        } else {
                                                            i23 = i46;
                                                            iVar9 = iVar2;
                                                            i27 = 5;
                                                            i26 = 4;
                                                            z28 = false;
                                                            z27 = false;
                                                            z29 = false;
                                                            i28 = 6;
                                                            if (z28) {
                                                            }
                                                            z30 = z28;
                                                            z31 = true;
                                                            if (z27) {
                                                            }
                                                            if (this.f37376j0 == 8) {
                                                            }
                                                            if (z30) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            eVar4 = eVar2;
                                                            i30 = i26;
                                                            if (z33) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            if (z34) {
                                                            }
                                                            i40 = 5;
                                                            if (z34) {
                                                            }
                                                        }
                                                        iVar9 = iVar2;
                                                        if (z28) {
                                                        }
                                                        z30 = z28;
                                                        z31 = true;
                                                        if (z27) {
                                                        }
                                                        if (this.f37376j0 == 8) {
                                                        }
                                                        if (z30) {
                                                        }
                                                        if (z34) {
                                                        }
                                                        eVar4 = eVar2;
                                                        i30 = i26;
                                                        if (z33) {
                                                        }
                                                        if (z34) {
                                                        }
                                                        if (z34) {
                                                        }
                                                        i40 = 5;
                                                        if (z34) {
                                                        }
                                                    }
                                                    iVar9 = iVar2;
                                                    i25 = 4;
                                                    i26 = i25;
                                                    i27 = 5;
                                                    z28 = true;
                                                    z27 = true;
                                                    z29 = false;
                                                    i28 = 6;
                                                    if (z28) {
                                                    }
                                                    z30 = z28;
                                                    z31 = true;
                                                    if (z27) {
                                                    }
                                                    if (this.f37376j0 == 8) {
                                                    }
                                                    if (z30) {
                                                    }
                                                    if (z34) {
                                                    }
                                                    eVar4 = eVar2;
                                                    i30 = i26;
                                                    if (z33) {
                                                    }
                                                    if (z34) {
                                                    }
                                                    if (z34) {
                                                    }
                                                    i40 = 5;
                                                    if (z34) {
                                                    }
                                                }
                                            } else {
                                                iVar7 = k15;
                                                dVar.e(k13, iVar7, -dVar3.e(), 8);
                                                if (z11) {
                                                    dVar.f(k12, iVar, 0, 5);
                                                }
                                            }
                                            dVar5 = dVar3;
                                            iVar14 = iVar7;
                                            iVar15 = k13;
                                            z32 = z25;
                                        } else {
                                            z34 = z11;
                                            dVar5 = dVar3;
                                            iVar15 = k13;
                                            z32 = z25;
                                            i40 = (z11 && (dVar2.f.f37349d instanceof x.a)) ? 8 : 5;
                                            iVar14 = k15;
                                            if (z34) {
                                            }
                                        }
                                        z34 = z11;
                                        i40 = 5;
                                        if (z34) {
                                        }
                                    }
                                    if (i21 >= i22 && z11 && z26) {
                                        dVar.f(iVar6, iVar3, 0, 8);
                                        d dVar6 = this.O;
                                        boolean z43 = z10 || dVar6.f == null;
                                        if (!z10 && (dVar4 = dVar6.f) != null) {
                                            e eVar8 = dVar4.f37349d;
                                            if (eVar8.Z != 0.0f) {
                                                a[] aVarArr = eVar8.V;
                                                a aVar5 = aVarArr[0];
                                                a aVar6 = a.MATCH_CONSTRAINT;
                                                if (aVar5 == aVar6 && aVarArr[c10] == aVar6) {
                                                    z43 = true;
                                                }
                                            }
                                            z43 = false;
                                        }
                                        if (z43) {
                                            dVar.f(iVar4, iVar5, 0, 8);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (z11) {
                                    dVar.e(k13, k12, i18, i19);
                                } else if (z17) {
                                    dVar.e(k13, k12, i18, 5);
                                    dVar.g(k13, k12, i18, i19);
                                } else {
                                    dVar.e(k13, k12, i18, 5);
                                    dVar.g(k13, k12, i18, i19);
                                }
                            } else {
                                int max = Math.max(i42, i18);
                                if (i43 > 0) {
                                    max = Math.min(i43, max);
                                }
                                dVar.e(k13, k12, max, 8);
                                z22 = false;
                            }
                        } else if (z14) {
                            dVar.e(k13, k12, 0, 3);
                            if (i11 > 0) {
                                dVar.f(k13, k12, i11, 8);
                            }
                            if (i12 < Integer.MAX_VALUE) {
                                dVar.g(k13, k12, i12, 8);
                            }
                        } else {
                            dVar.e(k13, k12, i18, 8);
                        }
                        z25 = z13;
                        i20 = i45;
                        int i472 = i42;
                        boolean z422 = z22;
                        if (z20) {
                        }
                        if (i21 >= i22) {
                            return;
                        }
                        return;
                    }
                }
                z23 = h12;
                if (z22) {
                }
                z25 = z13;
                i20 = i45;
                int i4722 = i42;
                boolean z4222 = z22;
                if (z20) {
                }
                if (i21 >= i22) {
                }
            }
        }
        z21 = false;
        i17 = this.f37373i;
        if (i17 != -1) {
            this.f37373i = -1;
            i10 = i17;
            z21 = false;
        }
        i18 = this.f37375j;
        if (i18 != -1) {
        }
        i18 = i10;
        boolean z412 = z21;
        if (this.f37376j0 != 8) {
        }
        if (z20) {
        }
        z23 = h12;
        if (z22) {
        }
        z25 = z13;
        i20 = i45;
        int i47222 = i42;
        boolean z42222 = z22;
        if (z20) {
        }
        if (i21 >= i22) {
        }
    }

    public final void h(d.a aVar, e eVar, d.a aVar2, int i6) {
        boolean z10;
        d.a aVar3 = d.a.CENTER;
        d.a aVar4 = d.a.CENTER_Y;
        d.a aVar5 = d.a.CENTER_X;
        d.a aVar6 = d.a.LEFT;
        d.a aVar7 = d.a.TOP;
        d.a aVar8 = d.a.RIGHT;
        d.a aVar9 = d.a.BOTTOM;
        if (aVar == aVar3) {
            if (aVar2 == aVar3) {
                d m10 = m(aVar6);
                d m11 = m(aVar8);
                d m12 = m(aVar7);
                d m13 = m(aVar9);
                boolean z11 = true;
                if ((m10 != null && m10.h()) || (m11 != null && m11.h())) {
                    z10 = false;
                } else {
                    h(aVar6, eVar, aVar6, 0);
                    h(aVar8, eVar, aVar8, 0);
                    z10 = true;
                }
                if ((m12 != null && m12.h()) || (m13 != null && m13.h())) {
                    z11 = false;
                } else {
                    h(aVar7, eVar, aVar7, 0);
                    h(aVar9, eVar, aVar9, 0);
                }
                if (z10 && z11) {
                    m(aVar3).a(eVar.m(aVar3), 0);
                } else if (z10) {
                    m(aVar5).a(eVar.m(aVar5), 0);
                } else if (z11) {
                    m(aVar4).a(eVar.m(aVar4), 0);
                }
            } else if (aVar2 != aVar6 && aVar2 != aVar8) {
                if (aVar2 == aVar7 || aVar2 == aVar9) {
                    h(aVar7, eVar, aVar2, 0);
                    h(aVar9, eVar, aVar2, 0);
                    m(aVar3).a(eVar.m(aVar2), 0);
                }
            } else {
                h(aVar6, eVar, aVar2, 0);
                h(aVar8, eVar, aVar2, 0);
                m(aVar3).a(eVar.m(aVar2), 0);
            }
        } else if (aVar == aVar5 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            d m14 = m(aVar6);
            d m15 = eVar.m(aVar2);
            d m16 = m(aVar8);
            m14.a(m15, 0);
            m16.a(m15, 0);
            m(aVar5).a(m15, 0);
        } else if (aVar == aVar4 && (aVar2 == aVar7 || aVar2 == aVar9)) {
            d m17 = eVar.m(aVar2);
            m(aVar7).a(m17, 0);
            m(aVar9).a(m17, 0);
            m(aVar4).a(m17, 0);
        } else if (aVar == aVar5 && aVar2 == aVar5) {
            m(aVar6).a(eVar.m(aVar6), 0);
            m(aVar8).a(eVar.m(aVar8), 0);
            m(aVar5).a(eVar.m(aVar2), 0);
        } else if (aVar == aVar4 && aVar2 == aVar4) {
            m(aVar7).a(eVar.m(aVar7), 0);
            m(aVar9).a(eVar.m(aVar9), 0);
            m(aVar4).a(eVar.m(aVar2), 0);
        } else {
            d m18 = m(aVar);
            d m19 = eVar.m(aVar2);
            if (m18.i(m19)) {
                d.a aVar10 = d.a.BASELINE;
                if (aVar == aVar10) {
                    d m20 = m(aVar7);
                    d m21 = m(aVar9);
                    if (m20 != null) {
                        m20.j();
                    }
                    if (m21 != null) {
                        m21.j();
                    }
                } else if (aVar != aVar7 && aVar != aVar9) {
                    if (aVar == aVar6 || aVar == aVar8) {
                        d m22 = m(aVar3);
                        if (m22.f != m19) {
                            m22.j();
                        }
                        d f = m(aVar).f();
                        d m23 = m(aVar5);
                        if (m23.h()) {
                            f.j();
                            m23.j();
                        }
                    }
                } else {
                    d m24 = m(aVar10);
                    if (m24 != null) {
                        m24.j();
                    }
                    d m25 = m(aVar3);
                    if (m25.f != m19) {
                        m25.j();
                    }
                    d f2 = m(aVar).f();
                    d m26 = m(aVar4);
                    if (m26.h()) {
                        f2.j();
                        m26.j();
                    }
                }
                m18.a(m19, i6);
            }
        }
    }

    public final void i(d dVar, d dVar2, int i6) {
        if (dVar.f37349d == this) {
            h(dVar.f37350e, dVar2.f37349d, dVar2.f37350e, i6);
        }
    }

    public void j(e eVar, HashMap<e, e> hashMap) {
        e eVar2;
        e eVar3;
        this.f37387p = eVar.f37387p;
        this.f37389q = eVar.f37389q;
        this.f37392s = eVar.f37392s;
        this.f37394t = eVar.f37394t;
        int[] iArr = eVar.f37396u;
        int i6 = iArr[0];
        int[] iArr2 = this.f37396u;
        iArr2[0] = i6;
        iArr2[1] = iArr[1];
        this.f37398v = eVar.f37398v;
        this.f37400w = eVar.f37400w;
        this.f37402y = eVar.f37402y;
        this.f37403z = eVar.f37403z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        int[] iArr3 = eVar.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (a[]) Arrays.copyOf(this.V, 2);
        e eVar4 = null;
        if (this.W == null) {
            eVar2 = null;
        } else {
            eVar2 = hashMap.get(eVar.W);
        }
        this.W = eVar2;
        this.X = eVar.X;
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.f37361a0 = eVar.f37361a0;
        this.f37363b0 = eVar.f37363b0;
        this.c0 = eVar.c0;
        this.f37366d0 = eVar.f37366d0;
        this.e0 = eVar.e0;
        this.f37368f0 = eVar.f37368f0;
        this.f37370g0 = eVar.f37370g0;
        this.f37372h0 = eVar.f37372h0;
        this.f37374i0 = eVar.f37374i0;
        this.f37376j0 = eVar.f37376j0;
        this.f37378k0 = eVar.f37378k0;
        this.f37380l0 = eVar.f37380l0;
        this.f37382m0 = eVar.f37382m0;
        this.f37384n0 = eVar.f37384n0;
        this.f37386o0 = eVar.f37386o0;
        float[] fArr = eVar.f37388p0;
        float f = fArr[0];
        float[] fArr2 = this.f37388p0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        e[] eVarArr = eVar.f37390q0;
        e eVar5 = eVarArr[0];
        e[] eVarArr2 = this.f37390q0;
        eVarArr2[0] = eVar5;
        eVarArr2[1] = eVarArr[1];
        e[] eVarArr3 = eVar.f37391r0;
        e eVar6 = eVarArr3[0];
        e[] eVarArr4 = this.f37391r0;
        eVarArr4[0] = eVar6;
        eVarArr4[1] = eVarArr3[1];
        e eVar7 = eVar.f37393s0;
        if (eVar7 == null) {
            eVar3 = null;
        } else {
            eVar3 = hashMap.get(eVar7);
        }
        this.f37393s0 = eVar3;
        e eVar8 = eVar.f37395t0;
        if (eVar8 != null) {
            eVar4 = hashMap.get(eVar8);
        }
        this.f37395t0 = eVar4;
    }

    public final void k(v.d dVar) {
        dVar.k(this.K);
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        if (this.f37366d0 > 0) {
            dVar.k(this.O);
        }
    }

    public final void l() {
        if (this.f37365d == null) {
            this.f37365d = new y.l(this);
        }
        if (this.f37367e == null) {
            this.f37367e = new y.n(this);
        }
    }

    public d m(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final a n(int i6) {
        if (i6 == 0) {
            return this.V[0];
        }
        if (i6 == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int o() {
        if (this.f37376j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final e p(int i6) {
        d dVar;
        d dVar2;
        if (i6 == 0) {
            d dVar3 = this.M;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return dVar4.f37349d;
            }
            return null;
        } else if (i6 == 1 && (dVar2 = (dVar = this.N).f) != null && dVar2.f == dVar) {
            return dVar2.f37349d;
        } else {
            return null;
        }
    }

    public final e q(int i6) {
        d dVar;
        d dVar2;
        if (i6 == 0) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return dVar4.f37349d;
            }
            return null;
        } else if (i6 == 1 && (dVar2 = (dVar = this.L).f) != null && dVar2.f == dVar) {
            return dVar2.f37349d;
        } else {
            return null;
        }
    }

    public void r(StringBuilder sb2) {
        sb2.append("  " + this.f37377k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f37363b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.c0);
        sb2.append("\n");
        t(sb2, "left", this.K);
        t(sb2, "top", this.L);
        t(sb2, "right", this.M);
        t(sb2, "bottom", this.N);
        t(sb2, "baseline", this.O);
        t(sb2, "centerX", this.P);
        t(sb2, "centerY", this.Q);
        int i6 = this.X;
        int i10 = this.e0;
        int i11 = this.D[0];
        int i12 = this.f37398v;
        int i13 = this.f37392s;
        float f = this.f37401x;
        float[] fArr = this.f37388p0;
        float f2 = fArr[0];
        s(sb2, "    width", i6, i10, i11, i12, i13, f);
        int i14 = this.Y;
        int i15 = this.f37368f0;
        int i16 = this.D[1];
        int i17 = this.f37402y;
        int i18 = this.f37394t;
        float f10 = this.A;
        float f11 = fArr[1];
        s(sb2, "    height", i14, i15, i16, i17, i18, f10);
        float f12 = this.Z;
        int i19 = this.f37361a0;
        if (f12 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f12);
            sb2.append(",");
            sb2.append(i19);
            sb2.append("");
            sb2.append("],\n");
        }
        L(sb2, "    horizontalBias", this.f37370g0, 0.5f);
        L(sb2, "    verticalBias", this.f37372h0, 0.5f);
        K(this.f37384n0, 0, "    horizontalChainStyle", sb2);
        K(this.f37386o0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f37382m0 == null) {
            str = "";
        } else {
            str = b0.b(new StringBuilder("type: "), this.f37382m0, " ");
        }
        sb2.append(str);
        if (this.f37380l0 != null) {
            str2 = b0.b(new StringBuilder("id: "), this.f37380l0, " ");
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f37363b0);
        sb2.append(", ");
        sb2.append(this.c0);
        sb2.append(") - (");
        sb2.append(this.X);
        sb2.append(" x ");
        return pl.a.g(sb2, this.Y, ")");
    }

    public final int u() {
        if (this.f37376j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int v() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).D0 + this.f37363b0;
        }
        return this.f37363b0;
    }

    public final int w() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).E0 + this.c0;
        }
        return this.c0;
    }

    public final boolean x(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i6 == 0) {
            if (this.K.f != null) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (this.M.f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (i13 + i14 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.f != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.N.f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = i10 + i11;
        if (this.O.f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i15 + i12 < 2) {
            return true;
        }
        return false;
    }

    public final boolean y(int i6, int i10) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i6 == 0) {
            d dVar5 = this.K;
            d dVar6 = dVar5.f;
            if (dVar6 != null && dVar6.f37348c && (dVar4 = (dVar3 = this.M).f) != null && dVar4.f37348c) {
                if ((dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f.d()) >= i10) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar7 = this.L;
            d dVar8 = dVar7.f;
            if (dVar8 != null && dVar8.f37348c && (dVar2 = (dVar = this.N).f) != null && dVar2.f37348c) {
                if ((dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f.d()) >= i10) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void z(d.a aVar, e eVar, d.a aVar2, int i6, int i10) {
        m(aVar).b(eVar.m(aVar2), i6, i10, true);
    }
}
