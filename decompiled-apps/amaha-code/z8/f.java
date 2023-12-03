package z8;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import c9.w;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.n;
import com.google.common.collect.g;
import com.google.common.collect.g0;
import com.google.common.collect.h0;
import com.google.common.collect.j0;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import com.google.common.collect.x;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o7.u;
import o7.v;
import o8.o;
import o8.p;
import z8.a;
import z8.c;
import z8.d;
import z8.i;
/* compiled from: MappingTrackSelector.java */
/* loaded from: classes.dex */
public abstract class f extends k {

    /* compiled from: MappingTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f39313a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f39314b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f39315c;

        /* renamed from: d  reason: collision with root package name */
        public final int[][][] f39316d;

        /* renamed from: e  reason: collision with root package name */
        public final p f39317e;

        public a(int[] iArr, p[] pVarArr, int[] iArr2, int[][][] iArr3, p pVar) {
            this.f39314b = iArr;
            this.f39315c = pVarArr;
            this.f39316d = iArr3;
            this.f39317e = pVar;
            this.f39313a = iArr.length;
        }
    }

    @Override // z8.k
    public final void a(Object obj) {
        a aVar = (a) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0575, code lost:
        if (com.google.common.collect.m.f9415a.c(r15.f39284v, r7.f39284v).c(r15.f39283u, r7.f39283u).e() > 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x091a, code lost:
        if (r5 != 2) goto L550;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0292 A[LOOP:8: B:65:0x016f->B:106:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x09e6 A[LOOP:42: B:513:0x09e0->B:515:0x09e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a0b A[SYNTHETIC] */
    @Override // z8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l b(u[] uVarArr, p pVar) {
        int[] iArr;
        p[] pVarArr;
        s.a aVar;
        int i6;
        a aVar2;
        int i10;
        p pVar2;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        v vVar;
        d aVar3;
        l0 c10;
        int[] iArr2;
        double d10;
        long j10;
        boolean z16;
        c.e eVar;
        String str;
        Pair create;
        int[][] iArr3;
        o oVar;
        String str2;
        d.a aVar4;
        int[][] iArr4;
        o oVar2;
        String str3;
        c.C0672c c0672c;
        boolean z17;
        o[] oVarArr;
        int i12;
        d.a aVar5;
        Pair create2;
        String str4;
        int[] iArr5;
        int i13;
        boolean z18;
        int i14;
        int i15;
        String str5;
        int i16;
        o oVar3;
        a aVar6;
        c cVar;
        c.C0672c c0672c2;
        int i17;
        d.a[] aVarArr;
        int i18;
        int[][][] iArr6;
        boolean z19;
        p[] pVarArr2;
        boolean z20;
        int i19;
        c.C0672c c0672c3;
        p pVar3;
        int i20;
        boolean z21;
        int[][] iArr7;
        d.a aVar7;
        boolean z22;
        d.a aVar8;
        c.C0672c c0672c4;
        o oVar4;
        int i21;
        boolean z23;
        boolean z24;
        o oVar5;
        String str6;
        int i22;
        o oVar6;
        HashSet hashSet;
        int[] iArr8;
        boolean z25;
        n[] nVarArr;
        int i23;
        int[] iArr9;
        boolean z26;
        p pVar4 = pVar;
        int[] iArr10 = new int[uVarArr.length + 1];
        int length = uVarArr.length + 1;
        o[][] oVarArr2 = new o[length];
        int[][][] iArr11 = new int[uVarArr.length + 1][];
        char c11 = 0;
        for (int i24 = 0; i24 < length; i24++) {
            int i25 = pVar4.f27306u;
            oVarArr2[i24] = new o[i25];
            iArr11[i24] = new int[i25];
        }
        int length2 = uVarArr.length;
        int[] iArr12 = new int[length2];
        for (int i26 = 0; i26 < length2; i26++) {
            iArr12[i26] = uVarArr[i26].m();
        }
        int i27 = 0;
        while (i27 < pVar4.f27306u) {
            o oVar7 = pVar4.f27307v[i27];
            if (c9.l.g(oVar7.f27303v[c11].F) == 5) {
                z25 = true;
            } else {
                z25 = false;
            }
            int length3 = uVarArr.length;
            int i28 = 0;
            int i29 = 0;
            boolean z27 = true;
            while (true) {
                int length4 = uVarArr.length;
                nVarArr = oVar7.f27303v;
                i23 = oVar7.f27302u;
                if (i28 >= length4) {
                    break;
                }
                u uVar = uVarArr[i28];
                int[] iArr13 = iArr12;
                int i30 = 0;
                int i31 = 0;
                while (i30 < i23) {
                    i31 = Math.max(i31, uVar.a(nVarArr[i30]) & 7);
                    i30++;
                    i27 = i27;
                }
                int i32 = i27;
                if (iArr10[i28] == 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (i31 > i29 || (i31 == i29 && z25 && !z27 && z26)) {
                    z27 = z26;
                    length3 = i28;
                    i29 = i31;
                }
                i28++;
                iArr12 = iArr13;
                i27 = i32;
            }
            int i33 = i27;
            int[] iArr14 = iArr12;
            if (length3 == uVarArr.length) {
                iArr9 = new int[i23];
            } else {
                u uVar2 = uVarArr[length3];
                int[] iArr15 = new int[i23];
                for (int i34 = 0; i34 < i23; i34++) {
                    iArr15[i34] = uVar2.a(nVarArr[i34]);
                }
                iArr9 = iArr15;
            }
            int i35 = iArr10[length3];
            oVarArr2[length3][i35] = oVar7;
            iArr11[length3][i35] = iArr9;
            iArr10[length3] = i35 + 1;
            i27 = i33 + 1;
            pVar4 = pVar;
            iArr12 = iArr14;
            c11 = 0;
        }
        int[] iArr16 = iArr12;
        p[] pVarArr3 = new p[uVarArr.length];
        String[] strArr = new String[uVarArr.length];
        int[] iArr17 = new int[uVarArr.length];
        for (int i36 = 0; i36 < uVarArr.length; i36++) {
            int i37 = iArr10[i36];
            pVarArr3[i36] = new p((o[]) w.A(i37, oVarArr2[i36]));
            iArr11[i36] = (int[][]) w.A(i37, iArr11[i36]);
            strArr[i36] = uVarArr[i36].getName();
            iArr17[i36] = ((com.google.android.exoplayer2.e) uVarArr[i36]).f6458u;
        }
        a aVar9 = new a(iArr17, pVarArr3, iArr16, iArr11, new p((o[]) w.A(iArr10[uVarArr.length], oVarArr2[uVarArr.length])));
        c cVar2 = (c) this;
        c.C0672c c0672c5 = cVar2.f39276c.get();
        int i38 = aVar9.f39313a;
        d.a[] aVarArr2 = new d.a[i38];
        c.C0672c c0672c6 = c0672c5;
        int i39 = 0;
        boolean z28 = false;
        boolean z29 = false;
        while (true) {
            iArr = aVar9.f39314b;
            pVarArr = aVar9.f39315c;
            if (i39 >= i38) {
                break;
            }
            if (2 == iArr[i39]) {
                if (!z29) {
                    p pVar5 = pVarArr[i39];
                    int[][] iArr18 = iArr11[i39];
                    int i40 = iArr16[i39];
                    boolean z30 = c0672c6.P;
                    boolean z31 = c0672c6.E;
                    int i41 = c0672c6.D;
                    aVar6 = aVar9;
                    int i42 = c0672c6.C;
                    if (!z30 && !c0672c6.O) {
                        if (c0672c6.V) {
                            i21 = 24;
                        } else {
                            i21 = 16;
                        }
                        cVar = cVar2;
                        if (c0672c6.U && (i40 & i21) != 0) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        iArr6 = iArr11;
                        int i43 = 0;
                        while (i43 < pVar5.f27306u) {
                            o oVar8 = pVar5.f27307v[i43];
                            int[] iArr19 = iArr18[i43];
                            i17 = i38;
                            int i44 = c0672c6.f39325u;
                            z19 = z28;
                            int i45 = c0672c6.f39326v;
                            pVarArr2 = pVarArr;
                            int i46 = c0672c6.f39327w;
                            aVarArr = aVarArr2;
                            int i47 = c0672c6.f39328x;
                            i18 = i39;
                            int i48 = c0672c6.f39329y;
                            c0672c3 = c0672c5;
                            int i49 = c0672c6.f39330z;
                            iArr7 = iArr18;
                            int i50 = c0672c6.A;
                            int i51 = c0672c6.B;
                            pVar3 = pVar5;
                            int i52 = oVar8.f27302u;
                            int[] iArr20 = c.f39273d;
                            int i53 = i43;
                            if (i52 < 2) {
                                i19 = i42;
                            } else {
                                ArrayList d11 = c.d(oVar8, i42, i41, z31);
                                i19 = i42;
                                if (d11.size() >= 2) {
                                    n[] nVarArr2 = oVar8.f27303v;
                                    if (!z23) {
                                        HashSet hashSet2 = new HashSet();
                                        z24 = z23;
                                        i20 = i41;
                                        z21 = z31;
                                        int i54 = 0;
                                        int i55 = 0;
                                        str6 = null;
                                        while (i54 < d11.size()) {
                                            String str7 = nVarArr2[((Integer) d11.get(i54)).intValue()].F;
                                            if (hashSet2.add(str7)) {
                                                i22 = i54;
                                                oVar6 = oVar8;
                                                hashSet = hashSet2;
                                                int i56 = 0;
                                                for (int i57 = 0; i57 < d11.size(); i57++) {
                                                    int intValue = ((Integer) d11.get(i57)).intValue();
                                                    if (c.f(nVarArr2[intValue], str7, iArr19[intValue], i21, i44, i45, i46, i47, i48, i49, i50, i51)) {
                                                        i56++;
                                                    }
                                                }
                                                if (i56 > i55) {
                                                    i55 = i56;
                                                    str6 = str7;
                                                }
                                            } else {
                                                i22 = i54;
                                                oVar6 = oVar8;
                                                hashSet = hashSet2;
                                            }
                                            i54 = i22 + 1;
                                            hashSet2 = hashSet;
                                            oVar8 = oVar6;
                                        }
                                        oVar5 = oVar8;
                                    } else {
                                        z24 = z23;
                                        oVar5 = oVar8;
                                        i20 = i41;
                                        z21 = z31;
                                        str6 = null;
                                    }
                                    int size = d11.size();
                                    while (true) {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                        int intValue2 = ((Integer) d11.get(size)).intValue();
                                        if (!c.f(nVarArr2[intValue2], str6, iArr19[intValue2], i21, i44, i45, i46, i47, i48, i49, i50, i51)) {
                                            d11.remove(size);
                                        }
                                    }
                                    if (d11.size() >= 2) {
                                        iArr20 = qc.a.G(d11);
                                    }
                                    iArr8 = iArr20;
                                    if (iArr8.length <= 0) {
                                        aVar7 = new d.a(oVar5, iArr8, 0);
                                        break;
                                    }
                                    i43 = i53 + 1;
                                    i38 = i17;
                                    z28 = z19;
                                    pVarArr = pVarArr2;
                                    aVarArr2 = aVarArr;
                                    i39 = i18;
                                    c0672c5 = c0672c3;
                                    c0672c6 = c0672c5;
                                    iArr18 = iArr7;
                                    pVar5 = pVar3;
                                    i42 = i19;
                                    z23 = z24;
                                    i41 = i20;
                                    z31 = z21;
                                }
                            }
                            z24 = z23;
                            oVar5 = oVar8;
                            i20 = i41;
                            z21 = z31;
                            iArr8 = iArr20;
                            if (iArr8.length <= 0) {
                            }
                        }
                        i19 = i42;
                        c0672c3 = c0672c5;
                        i17 = i38;
                        aVarArr = aVarArr2;
                        i18 = i39;
                    } else {
                        i19 = i42;
                        cVar = cVar2;
                        c0672c3 = c0672c5;
                        i17 = i38;
                        aVarArr = aVarArr2;
                        i18 = i39;
                        iArr6 = iArr11;
                    }
                    z19 = z28;
                    pVar3 = pVar5;
                    i20 = i41;
                    z21 = z31;
                    iArr7 = iArr18;
                    pVarArr2 = pVarArr;
                    aVar7 = null;
                    if (aVar7 == null) {
                        p pVar6 = pVar3;
                        o oVar9 = null;
                        c.g gVar = null;
                        int i58 = 0;
                        int i59 = -1;
                        while (i58 < pVar6.f27306u) {
                            o oVar10 = pVar6.f27307v[i58];
                            int i60 = i19;
                            int i61 = i20;
                            boolean z32 = z21;
                            ArrayList d12 = c.d(oVar10, i60, i61, z32);
                            int[] iArr21 = iArr7[i58];
                            int i62 = 0;
                            while (i62 < oVar10.f27302u) {
                                n nVar = oVar10.f27303v[i62];
                                if ((nVar.f6654y & 16384) != 0) {
                                    oVar4 = oVar9;
                                    c0672c4 = c0672c3;
                                } else {
                                    c0672c4 = c0672c3;
                                    if (c.e(iArr21[i62], c0672c4.f39286a0)) {
                                        oVar4 = oVar9;
                                        c.g gVar2 = new c.g(nVar, c0672c4, iArr21[i62], d12.contains(Integer.valueOf(i62)));
                                        if ((gVar2.f39304u || c0672c4.T) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                                            oVar9 = oVar10;
                                            i59 = i62;
                                            gVar = gVar2;
                                            i62++;
                                            c0672c3 = c0672c4;
                                        }
                                    } else {
                                        oVar4 = oVar9;
                                    }
                                }
                                oVar9 = oVar4;
                                i62++;
                                c0672c3 = c0672c4;
                            }
                            i58++;
                            z21 = z32;
                            i20 = i61;
                            i19 = i60;
                        }
                        c0672c2 = c0672c3;
                        if (oVar9 == null) {
                            aVar8 = null;
                        } else {
                            aVar8 = new d.a(oVar9, new int[]{i59}, 0);
                        }
                        aVar7 = aVar8;
                    } else {
                        c0672c2 = c0672c3;
                    }
                    aVarArr[i18] = aVar7;
                    if (aVar7 != null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z29 = z22;
                    c0672c6 = c0672c2;
                } else {
                    aVar6 = aVar9;
                    cVar = cVar2;
                    i17 = i38;
                    aVarArr = aVarArr2;
                    i18 = i39;
                    iArr6 = iArr11;
                    z19 = z28;
                    pVarArr2 = pVarArr;
                    c0672c2 = c0672c5;
                }
                if (pVarArr2[i18].f27306u > 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z28 = z19 | z20;
            } else {
                aVar6 = aVar9;
                cVar = cVar2;
                c0672c2 = c0672c5;
                i17 = i38;
                aVarArr = aVarArr2;
                i18 = i39;
                iArr6 = iArr11;
            }
            i39 = i18 + 1;
            c0672c5 = c0672c2;
            aVar9 = aVar6;
            cVar2 = cVar;
            iArr11 = iArr6;
            i38 = i17;
            aVarArr2 = aVarArr;
        }
        a aVar10 = aVar9;
        c cVar3 = cVar2;
        d.a[] aVarArr3 = aVarArr2;
        int[][][] iArr22 = iArr11;
        boolean z33 = z28;
        c.C0672c c0672c7 = c0672c5;
        int i63 = i38;
        c.a aVar11 = null;
        int i64 = -1;
        int i65 = 0;
        String str8 = null;
        while (i65 < i63) {
            if (1 == iArr[i65]) {
                if (!c0672c6.c0 && z33) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                p pVar7 = pVarArr[i65];
                int[][] iArr23 = iArr22[i65];
                int i66 = iArr16[i65];
                c.a aVar12 = null;
                int i67 = -1;
                int i68 = -1;
                int i69 = 0;
                while (true) {
                    int i70 = pVar7.f27306u;
                    c0672c = c0672c7;
                    oVarArr = pVar7.f27307v;
                    if (i69 >= i70) {
                        break;
                    }
                    o oVar11 = oVarArr[i69];
                    int[] iArr24 = iArr23[i69];
                    p pVar8 = pVar7;
                    int i71 = i67;
                    int i72 = 0;
                    while (i72 < oVar11.f27302u) {
                        int i73 = i68;
                        if (c.e(iArr24[i72], c0672c6.f39286a0)) {
                            oVar3 = oVar11;
                            c.a aVar13 = new c.a(oVar11.f27303v[i72], c0672c6, iArr24[i72]);
                            if ((aVar13.f39277u || c0672c6.W) && (aVar12 == null || aVar13.compareTo(aVar12) > 0)) {
                                aVar12 = aVar13;
                                i71 = i69;
                                i68 = i72;
                                i72++;
                                oVar11 = oVar3;
                            }
                        } else {
                            oVar3 = oVar11;
                        }
                        i68 = i73;
                        i72++;
                        oVar11 = oVar3;
                    }
                    i69++;
                    pVar7 = pVar8;
                    i67 = i71;
                    c0672c7 = c0672c;
                }
                if (i67 == -1) {
                    str3 = str8;
                    create2 = null;
                } else {
                    o oVar12 = oVarArr[i67];
                    if (!c0672c6.P && !c0672c6.O && z17) {
                        int[] iArr25 = iArr23[i67];
                        n nVar2 = oVar12.f27303v[i68];
                        int i74 = oVar12.f27302u;
                        int[] iArr26 = new int[i74];
                        int i75 = 0;
                        int i76 = 0;
                        while (i75 < i74) {
                            if (i75 != i68) {
                                i13 = i74;
                                n nVar3 = oVar12.f27303v[i75];
                                str4 = str8;
                                iArr5 = iArr25;
                                if (c.e(iArr25[i75], false) && (i14 = nVar3.B) != -1 && i14 <= c0672c6.J && ((c0672c6.Z || ((i16 = nVar3.S) != -1 && i16 == nVar2.S)) && ((c0672c6.X || ((str5 = nVar3.F) != null && TextUtils.equals(str5, nVar2.F))) && (c0672c6.Y || ((i15 = nVar3.T) != -1 && i15 == nVar2.T))))) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (!z18) {
                                    i75++;
                                    i74 = i13;
                                    str8 = str4;
                                    iArr25 = iArr5;
                                }
                            } else {
                                str4 = str8;
                                iArr5 = iArr25;
                                i13 = i74;
                            }
                            iArr26[i76] = i75;
                            i76++;
                            i75++;
                            i74 = i13;
                            str8 = str4;
                            iArr25 = iArr5;
                        }
                        str3 = str8;
                        int[] copyOf = Arrays.copyOf(iArr26, i76);
                        if (copyOf.length > 1) {
                            i12 = 0;
                            aVar5 = new d.a(oVar12, copyOf, 0);
                            if (aVar5 == null) {
                                int[] iArr27 = new int[1];
                                iArr27[i12] = i68;
                                aVar5 = new d.a(oVar12, iArr27, i12);
                            }
                            aVar12.getClass();
                            create2 = Pair.create(aVar5, aVar12);
                        }
                    } else {
                        str3 = str8;
                    }
                    i12 = 0;
                    aVar5 = null;
                    if (aVar5 == null) {
                    }
                    aVar12.getClass();
                    create2 = Pair.create(aVar5, aVar12);
                }
                if (create2 != null && (aVar11 == null || ((c.a) create2.second).compareTo(aVar11) > 0)) {
                    if (i64 != -1) {
                        aVarArr3[i64] = null;
                    }
                    d.a aVar14 = (d.a) create2.first;
                    aVarArr3[i65] = aVar14;
                    str8 = aVar14.f39310a.f27303v[aVar14.f39311b[0]].f6652w;
                    aVar11 = (c.a) create2.second;
                    i64 = i65;
                    i65++;
                    c0672c7 = c0672c;
                }
            } else {
                str3 = str8;
                c0672c = c0672c7;
            }
            str8 = str3;
            i65++;
            c0672c7 = c0672c;
        }
        String str9 = str8;
        c.C0672c c0672c8 = c0672c7;
        int i77 = -1;
        c.f fVar = null;
        int i78 = 0;
        while (i78 < i63) {
            int i79 = iArr[i78];
            if (i79 != 1 && i79 != 2) {
                if (i79 != 3) {
                    p pVar9 = pVarArr[i78];
                    int[][] iArr28 = iArr22[i78];
                    o oVar13 = null;
                    c.b bVar = null;
                    int i80 = 0;
                    for (int i81 = 0; i81 < pVar9.f27306u; i81++) {
                        o oVar14 = pVar9.f27307v[i81];
                        int[] iArr29 = iArr28[i81];
                        int i82 = 0;
                        while (i82 < oVar14.f27302u) {
                            p pVar10 = pVar9;
                            if (c.e(iArr29[i82], c0672c6.f39286a0)) {
                                iArr4 = iArr28;
                                c.b bVar2 = new c.b(oVar14.f27303v[i82], iArr29[i82]);
                                if (bVar != null) {
                                    oVar2 = oVar13;
                                }
                                oVar13 = oVar14;
                                i80 = i82;
                                bVar = bVar2;
                                i82++;
                                pVar9 = pVar10;
                                iArr28 = iArr4;
                            } else {
                                iArr4 = iArr28;
                                oVar2 = oVar13;
                            }
                            oVar13 = oVar2;
                            i82++;
                            pVar9 = pVar10;
                            iArr28 = iArr4;
                        }
                    }
                    if (oVar13 == null) {
                        aVar4 = null;
                    } else {
                        aVar4 = new d.a(oVar13, new int[]{i80}, 0);
                    }
                    aVarArr3[i78] = aVar4;
                } else {
                    p pVar11 = pVarArr[i78];
                    int[][] iArr30 = iArr22[i78];
                    o oVar15 = null;
                    c.f fVar2 = null;
                    int i83 = -1;
                    for (int i84 = 0; i84 < pVar11.f27306u; i84++) {
                        o oVar16 = pVar11.f27307v[i84];
                        int[] iArr31 = iArr30[i84];
                        int i85 = 0;
                        while (i85 < oVar16.f27302u) {
                            p pVar12 = pVar11;
                            if (c.e(iArr31[i85], c0672c6.f39286a0)) {
                                iArr3 = iArr30;
                                oVar = oVar16;
                                str2 = str9;
                                c.f fVar3 = new c.f(oVar16.f27303v[i85], c0672c6, iArr31[i85], str2);
                                if (fVar3.f39298u && (fVar2 == null || fVar3.compareTo(fVar2) > 0)) {
                                    i83 = i85;
                                    fVar2 = fVar3;
                                    oVar15 = oVar;
                                }
                            } else {
                                iArr3 = iArr30;
                                oVar = oVar16;
                                str2 = str9;
                            }
                            i85++;
                            str9 = str2;
                            pVar11 = pVar12;
                            iArr30 = iArr3;
                            oVar16 = oVar;
                        }
                    }
                    str = str9;
                    if (oVar15 == null) {
                        create = null;
                    } else {
                        d.a aVar15 = new d.a(oVar15, new int[]{i83}, 0);
                        fVar2.getClass();
                        create = Pair.create(aVar15, fVar2);
                    }
                    if (create != null && (fVar == null || ((c.f) create.second).compareTo(fVar) > 0)) {
                        if (i77 != -1) {
                            aVarArr3[i77] = null;
                        }
                        aVarArr3[i78] = (d.a) create.first;
                        fVar = (c.f) create.second;
                        i77 = i78;
                    }
                    i78++;
                    str9 = str;
                }
            }
            str = str9;
            i78++;
            str9 = str;
        }
        int i86 = 0;
        while (i86 < i63) {
            d.a aVar16 = aVarArr3[i86];
            int i87 = iArr[i86];
            c.C0672c c0672c9 = c0672c8;
            if (!c0672c9.e0.get(i86) && !c0672c9.R.contains(Integer.valueOf(i87))) {
                p pVar13 = pVarArr[i86];
                SparseArray<Map<p, c.e>> sparseArray = c0672c9.f39288d0;
                Map<p, c.e> map = sparseArray.get(i86);
                if (map != null && map.containsKey(pVar13)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    Map<p, c.e> map2 = sparseArray.get(i86);
                    if (map2 != null) {
                        eVar = map2.get(pVar13);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        aVar16 = new d.a(pVar13.f27307v[eVar.f39295u], eVar.f39296v, eVar.f39297w);
                    }
                } else {
                    int i88 = 0;
                    while (true) {
                        if (i88 >= pVar13.f27306u) {
                            break;
                        }
                        o oVar17 = pVar13.f27307v[i88];
                        i.a aVar17 = c0672c9.Q.f39321u.get(oVar17);
                        if (aVar17 != null) {
                            aVar16 = new d.a(oVar17, qc.a.G(aVar17.f39324v), 0);
                            break;
                        }
                        i88++;
                    }
                }
                aVarArr3[i86] = aVar16;
                i86++;
                c0672c8 = c0672c9;
            }
            aVar16 = null;
            aVarArr3[i86] = aVar16;
            i86++;
            c0672c8 = c0672c9;
        }
        c.C0672c c0672c10 = c0672c8;
        b9.b bVar3 = cVar3.f39349a;
        bVar3.getClass();
        ((a.b) cVar3.f39275b).getClass();
        ArrayList arrayList = new ArrayList();
        for (int i89 = 0; i89 < i63; i89++) {
            d.a aVar18 = aVarArr3[i89];
            if (aVar18 != null && aVar18.f39311b.length > 1) {
                s.b bVar4 = s.f9446v;
                s.a aVar19 = new s.a();
                aVar19.b(new a.C0671a(0L, 0L));
                arrayList.add(aVar19);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArr = new long[i63];
        for (int i90 = 0; i90 < i63; i90++) {
            d.a aVar20 = aVarArr3[i90];
            if (aVar20 == null) {
                jArr[i90] = new long[0];
            } else {
                int[] iArr32 = aVar20.f39311b;
                jArr[i90] = new long[iArr32.length];
                for (int i91 = 0; i91 < iArr32.length; i91++) {
                    jArr[i90][i91] = aVar20.f39310a.f27303v[iArr32[i91]].B;
                }
                Arrays.sort(jArr[i90]);
            }
        }
        int[] iArr33 = new int[i63];
        long[] jArr2 = new long[i63];
        for (int i92 = 0; i92 < i63; i92++) {
            long[] jArr3 = jArr[i92];
            if (jArr3.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr3[0];
            }
            jArr2[i92] = j10;
        }
        z8.a.m(arrayList, jArr2);
        j0 j0Var = j0.f9394u;
        j0Var.getClass();
        x.a(2, "expectedValuesPerKey");
        h0 h0Var = new h0(new TreeMap(j0Var), new g0(2));
        int i93 = 0;
        while (i93 < i63) {
            long[] jArr4 = jArr[i93];
            if (jArr4.length <= 1) {
                iArr2 = iArr33;
            } else {
                int length5 = jArr4.length;
                double[] dArr = new double[length5];
                int i94 = 0;
                while (true) {
                    long[] jArr5 = jArr[i93];
                    double d13 = 0.0d;
                    if (i94 >= jArr5.length) {
                        break;
                    }
                    int[] iArr34 = iArr33;
                    long j11 = jArr5[i94];
                    if (j11 != -1) {
                        d13 = Math.log(j11);
                    }
                    dArr[i94] = d13;
                    i94++;
                    iArr33 = iArr34;
                }
                iArr2 = iArr33;
                int i95 = length5 - 1;
                double d14 = dArr[i95] - dArr[0];
                int i96 = 0;
                while (i96 < i95) {
                    double d15 = dArr[i96];
                    i96++;
                    double d16 = (d15 + dArr[i96]) * 0.5d;
                    if (d14 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d16 - dArr[0]) / d14;
                    }
                    Double valueOf = Double.valueOf(d10);
                    int i97 = i95;
                    Integer valueOf2 = Integer.valueOf(i93);
                    double d17 = d14;
                    Collection collection = (Collection) h0Var.f9352x.get(valueOf);
                    if (collection == null) {
                        List list = (List) h0Var.f9391z.get();
                        if (list.add(valueOf2)) {
                            h0Var.f9353y++;
                            h0Var.f9352x.put(valueOf, list);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        h0Var.f9353y++;
                    }
                    i95 = i97;
                    d14 = d17;
                }
                continue;
            }
            i93++;
            iArr33 = iArr2;
        }
        int[] iArr35 = iArr33;
        g.a aVar21 = h0Var.f9386v;
        if (aVar21 == null) {
            aVar21 = new g.a(h0Var);
            h0Var.f9386v = aVar21;
        }
        s z34 = s.z(aVar21);
        for (int i98 = 0; i98 < z34.size(); i98++) {
            int intValue3 = ((Integer) z34.get(i98)).intValue();
            int i99 = iArr35[intValue3] + 1;
            iArr35[intValue3] = i99;
            jArr2[intValue3] = jArr[intValue3][i99];
            z8.a.m(arrayList, jArr2);
        }
        for (int i100 = 0; i100 < i63; i100++) {
            if (arrayList.get(i100) != null) {
                jArr2[i100] = jArr2[i100] * 2;
            }
        }
        z8.a.m(arrayList, jArr2);
        s.a aVar22 = new s.a();
        for (int i101 = 0; i101 < arrayList.size(); i101++) {
            s.a aVar23 = (s.a) arrayList.get(i101);
            if (aVar23 == null) {
                c10 = l0.f9412y;
            } else {
                c10 = aVar23.c();
            }
            aVar22.b(c10);
        }
        l0 c12 = aVar22.c();
        d[] dVarArr = new d[i63];
        for (int i102 = 0; i102 < i63; i102++) {
            d.a aVar24 = aVarArr3[i102];
            if (aVar24 != null) {
                int[] iArr36 = aVar24.f39311b;
                if (iArr36.length != 0) {
                    if (iArr36.length == 1) {
                        aVar3 = new e(aVar24.f39310a, iArr36[0], aVar24.f39312c);
                    } else {
                        aVar3 = new z8.a(aVar24.f39310a, iArr36, aVar24.f39312c, bVar3, (long) Constants.TIMEOUT_MS, 25000, (s) c12.get(i102), c9.b.f5126a);
                    }
                    dVarArr[i102] = aVar3;
                }
            }
        }
        v[] vVarArr = new v[i63];
        for (int i103 = 0; i103 < i63; i103++) {
            int i104 = iArr[i103];
            if (!c0672c10.e0.get(i103) && !c0672c10.R.contains(Integer.valueOf(i104))) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z14 && (iArr[i103] == -2 || dVarArr[i103] != null)) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                vVar = v.f27253b;
            } else {
                vVar = null;
            }
            vVarArr[i103] = vVar;
        }
        if (c0672c10.f39287b0) {
            int i105 = -1;
            int i106 = -1;
            for (int i107 = 0; i107 < i63; i107++) {
                int i108 = iArr[i107];
                d dVar = dVarArr[i107];
                if (i108 == 1) {
                }
                if (dVar != null) {
                    int[][] iArr37 = iArr22[i107];
                    int b10 = pVarArr[i107].b(dVar.b());
                    int i109 = 0;
                    while (true) {
                        if (i109 < dVar.length()) {
                            if ((iArr37[b10][dVar.h(i109)] & 32) != 32) {
                                z13 = false;
                                break;
                            }
                            i109++;
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                    if (z13) {
                        if (i108 == 1) {
                            i11 = -1;
                            if (i105 == -1) {
                                i105 = i107;
                            } else {
                                z11 = false;
                                break;
                            }
                        } else {
                            i11 = -1;
                            if (i106 != -1) {
                                z11 = false;
                                break;
                            }
                            i106 = i107;
                        }
                    }
                }
            }
            i11 = -1;
            z11 = true;
            if (i105 != i11 && i106 != i11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 & z12) {
                v vVar2 = new v(true);
                vVarArr[i105] = vVar2;
                vVarArr[i106] = vVar2;
                Pair create3 = Pair.create(vVarArr, dVarArr);
                g[] gVarArr = (g[]) create3.second;
                aVar = new s.a();
                for (i6 = 0; i6 < i63; i6++) {
                    p pVar14 = pVarArr[i6];
                    g gVar3 = gVarArr[i6];
                    for (int i110 = 0; i110 < pVar14.f27306u; i110++) {
                        o oVar18 = pVar14.f27307v[i110];
                        int i111 = oVar18.f27302u;
                        int[] iArr38 = new int[i111];
                        boolean[] zArr = new boolean[i111];
                        int i112 = 0;
                        while (i112 < oVar18.f27302u) {
                            a aVar25 = aVar10;
                            iArr38[i112] = aVar25.f39316d[i6][i110][i112] & 7;
                            if (gVar3 != null && gVar3.b() == oVar18) {
                                if (gVar3.l(i112) != -1) {
                                    z10 = true;
                                    zArr[i112] = z10;
                                    i112++;
                                    aVar10 = aVar25;
                                }
                            }
                            z10 = false;
                            zArr[i112] = z10;
                            i112++;
                            aVar10 = aVar25;
                        }
                        aVar.b(new f0.a(oVar18, iArr38, iArr[i6], zArr));
                    }
                }
                aVar2 = aVar10;
                i10 = 0;
                while (true) {
                    pVar2 = aVar2.f39317e;
                    if (i10 >= pVar2.f27306u) {
                        o oVar19 = pVar2.f27307v[i10];
                        int[] iArr39 = new int[oVar19.f27302u];
                        Arrays.fill(iArr39, 0);
                        aVar.b(new f0.a(oVar19, iArr39, c9.l.g(oVar19.f27303v[0].F), new boolean[oVar19.f27302u]));
                        i10++;
                    } else {
                        return new l((v[]) create3.first, (d[]) create3.second, new f0(aVar.c()), aVar2);
                    }
                }
            }
        }
        Pair create32 = Pair.create(vVarArr, dVarArr);
        g[] gVarArr2 = (g[]) create32.second;
        aVar = new s.a();
        while (i6 < i63) {
        }
        aVar2 = aVar10;
        i10 = 0;
        while (true) {
            pVar2 = aVar2.f39317e;
            if (i10 >= pVar2.f27306u) {
            }
            o oVar192 = pVar2.f27307v[i10];
            int[] iArr392 = new int[oVar192.f27302u];
            Arrays.fill(iArr392, 0);
            aVar.b(new f0.a(oVar192, iArr392, c9.l.g(oVar192.f27303v[0].F), new boolean[oVar192.f27302u]));
            i10++;
        }
    }
}
