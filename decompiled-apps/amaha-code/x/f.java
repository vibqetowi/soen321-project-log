package x;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.utils.Constants;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.d;
import x.e;
import y.b;
import y.o;
import y.p;
/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class f extends n {
    public int D0;
    public int E0;

    /* renamed from: z0  reason: collision with root package name */
    public int f37411z0;

    /* renamed from: x0  reason: collision with root package name */
    public final y.b f37409x0 = new y.b(this);

    /* renamed from: y0  reason: collision with root package name */
    public final y.e f37410y0 = new y.e(this);
    public b.InterfaceC0647b A0 = null;
    public boolean B0 = false;
    public final v.d C0 = new v.d();
    public int F0 = 0;
    public int G0 = 0;
    public c[] H0 = new c[4];
    public c[] I0 = new c[4];
    public int J0 = 257;
    public boolean K0 = false;
    public boolean L0 = false;
    public WeakReference<d> M0 = null;
    public WeakReference<d> N0 = null;
    public WeakReference<d> O0 = null;
    public WeakReference<d> P0 = null;
    public final HashSet<e> Q0 = new HashSet<>();
    public final b.a R0 = new b.a();

    public static void Y(e eVar, b.InterfaceC0647b interfaceC0647b, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        int i10;
        if (interfaceC0647b == null) {
            return;
        }
        if (eVar.f37376j0 != 8 && !(eVar instanceof h) && !(eVar instanceof a)) {
            e.a[] aVarArr = eVar.V;
            aVar.f38135a = aVarArr[0];
            boolean z14 = true;
            aVar.f38136b = aVarArr[1];
            aVar.f38137c = eVar.u();
            aVar.f38138d = eVar.o();
            aVar.f38142i = false;
            aVar.f38143j = 0;
            e.a aVar2 = aVar.f38135a;
            e.a aVar3 = e.a.MATCH_CONSTRAINT;
            if (aVar2 == aVar3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f38136b == aVar3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && eVar.Z > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && eVar.Z > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            e.a aVar4 = e.a.WRAP_CONTENT;
            e.a aVar5 = e.a.FIXED;
            if (z10 && eVar.x(0) && eVar.f37392s == 0 && !z12) {
                aVar.f38135a = aVar4;
                if (z11 && eVar.f37394t == 0) {
                    aVar.f38135a = aVar5;
                }
                z10 = false;
            }
            if (z11 && eVar.x(1) && eVar.f37394t == 0 && !z13) {
                aVar.f38136b = aVar4;
                if (z10 && eVar.f37392s == 0) {
                    aVar.f38136b = aVar5;
                }
                z11 = false;
            }
            if (eVar.E()) {
                aVar.f38135a = aVar5;
                z10 = false;
            }
            if (eVar.F()) {
                aVar.f38136b = aVar5;
                z11 = false;
            }
            int[] iArr = eVar.f37396u;
            if (z12) {
                if (iArr[0] == 4) {
                    aVar.f38135a = aVar5;
                } else if (!z11) {
                    if (aVar.f38136b == aVar5) {
                        i10 = aVar.f38138d;
                    } else {
                        aVar.f38135a = aVar4;
                        ((ConstraintLayout.b) interfaceC0647b).b(eVar, aVar);
                        i10 = aVar.f;
                    }
                    aVar.f38135a = aVar5;
                    aVar.f38137c = (int) (eVar.Z * i10);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    aVar.f38136b = aVar5;
                } else if (!z10) {
                    if (aVar.f38135a == aVar5) {
                        i6 = aVar.f38137c;
                    } else {
                        aVar.f38136b = aVar4;
                        ((ConstraintLayout.b) interfaceC0647b).b(eVar, aVar);
                        i6 = aVar.f38139e;
                    }
                    aVar.f38136b = aVar5;
                    if (eVar.f37361a0 == -1) {
                        aVar.f38138d = (int) (i6 / eVar.Z);
                    } else {
                        aVar.f38138d = (int) (eVar.Z * i6);
                    }
                }
            }
            ((ConstraintLayout.b) interfaceC0647b).b(eVar, aVar);
            eVar.R(aVar.f38139e);
            eVar.O(aVar.f);
            eVar.F = aVar.f38141h;
            int i11 = aVar.f38140g;
            eVar.f37366d0 = i11;
            if (i11 <= 0) {
                z14 = false;
            }
            eVar.F = z14;
            aVar.f38143j = 0;
            return;
        }
        aVar.f38139e = 0;
        aVar.f = 0;
    }

    @Override // x.n, x.e
    public final void G() {
        this.C0.t();
        this.D0 = 0;
        this.E0 = 0;
        super.G();
    }

    @Override // x.e
    public final void S(boolean z10, boolean z11) {
        super.S(z10, z11);
        int size = this.f37443w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f37443w0.get(i6).S(z10, z11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:220|(9:221|222|223|224|225|(1:227)|228|229|(2:230|231))|(3:342|343|(29:345|346|347|348|349|350|351|234|235|(1:239)|240|(9:244|245|246|247|248|249|250|251|252)|329|(1:338)(3:333|334|335)|336|337|257|(4:259|(4:261|(1:271)(1:265)|(2:267|268)(1:270)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)|295|(1:297)(1:319)|(4:299|(1:304)|305|(5:308|(3:310|(2:312|313)(2:315|316)|314)|317|(0)(0)|314))|318|317|(0)(0)|314))|233|234|235|(2:237|239)|240|(10:242|244|245|246|247|248|249|250|251|252)|329|(1:331)|338|336|337|257|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)|295|(0)(0)|(0)|318|317|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x07d9, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0632 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x087c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0888 A[LOOP:13: B:513:0x0886->B:514:0x0888, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0976  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    @Override // x.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i6;
        int i10;
        e.a aVar;
        d dVar;
        e.a aVar2;
        int i11;
        e.a aVar3;
        v.d dVar2;
        e.a aVar4;
        int i12;
        int i13;
        e.a aVar5;
        d dVar3;
        boolean z10;
        boolean z11;
        char c10;
        e.a[] aVarArr;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        ArrayList<e> arrayList;
        boolean z15;
        d dVar4;
        boolean z16;
        int i16;
        boolean z17;
        int max;
        int max2;
        ?? r72;
        int i17;
        int i18;
        int i19;
        int max3;
        int max4;
        boolean z18;
        WeakReference<d> weakReference;
        WeakReference<d> weakReference2;
        WeakReference<d> weakReference3;
        WeakReference<d> weakReference4;
        d dVar5;
        e.a aVar6;
        e.a aVar7;
        o oVar;
        o oVar2;
        boolean z19;
        int b10;
        v.d dVar6;
        boolean z20;
        o oVar3;
        o oVar4;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z21;
        e.a aVar8;
        this.f37363b0 = 0;
        this.c0 = 0;
        this.K0 = false;
        this.L0 = false;
        int size = this.f37443w0.size();
        int max5 = Math.max(0, u());
        int max6 = Math.max(0, o());
        e.a[] aVarArr2 = this.V;
        e.a aVar9 = aVarArr2[1];
        e.a aVar10 = aVarArr2[0];
        int i24 = this.f37411z0;
        e.a aVar11 = e.a.MATCH_CONSTRAINT;
        e.a aVar12 = e.a.FIXED;
        d dVar7 = this.L;
        d dVar8 = this.K;
        if (i24 == 0 && k.b(this.J0, 1)) {
            b.InterfaceC0647b interfaceC0647b = this.A0;
            e.a[] aVarArr3 = this.V;
            e.a aVar13 = aVarArr3[0];
            e.a aVar14 = aVarArr3[1];
            I();
            ArrayList<e> arrayList2 = this.f37443w0;
            int size2 = arrayList2.size();
            for (int i25 = 0; i25 < size2; i25++) {
                arrayList2.get(i25).I();
            }
            boolean z22 = this.B0;
            if (aVar13 == aVar12) {
                i10 = max6;
                M(0, u());
            } else {
                i10 = max6;
                dVar8.l(0);
                this.f37363b0 = 0;
            }
            boolean z23 = false;
            int i26 = 0;
            boolean z24 = false;
            while (i26 < size2) {
                d dVar9 = dVar8;
                e eVar = arrayList2.get(i26);
                int i27 = max5;
                if (eVar instanceof h) {
                    h hVar = (h) eVar;
                    aVar8 = aVar9;
                    if (hVar.A0 == 1) {
                        int i28 = hVar.f37435x0;
                        if (i28 != -1) {
                            hVar.U(i28);
                        } else if (hVar.f37436y0 != -1 && E()) {
                            hVar.U(u() - hVar.f37436y0);
                        } else if (E()) {
                            hVar.U((int) ((hVar.f37434w0 * u()) + 0.5f));
                        }
                        z23 = true;
                    }
                } else {
                    aVar8 = aVar9;
                    if ((eVar instanceof a) && ((a) eVar).W() == 0) {
                        z24 = true;
                    }
                }
                i26++;
                max5 = i27;
                dVar8 = dVar9;
                aVar9 = aVar8;
            }
            i6 = max5;
            aVar = aVar9;
            dVar = dVar8;
            if (z23) {
                for (int i29 = 0; i29 < size2; i29++) {
                    e eVar2 = arrayList2.get(i29);
                    if (eVar2 instanceof h) {
                        h hVar2 = (h) eVar2;
                        if (hVar2.A0 == 1) {
                            y.h.b(0, hVar2, interfaceC0647b, z22);
                        }
                    }
                }
            }
            y.h.b(0, this, interfaceC0647b, z22);
            if (z24) {
                for (int i30 = 0; i30 < size2; i30++) {
                    e eVar3 = arrayList2.get(i30);
                    if (eVar3 instanceof a) {
                        a aVar15 = (a) eVar3;
                        if (aVar15.W() == 0 && aVar15.V()) {
                            y.h.b(1, aVar15, interfaceC0647b, z22);
                        }
                    }
                }
            }
            if (aVar14 == aVar12) {
                N(0, o());
            } else {
                dVar7.l(0);
                this.c0 = 0;
            }
            boolean z25 = false;
            boolean z26 = false;
            for (int i31 = 0; i31 < size2; i31++) {
                e eVar4 = arrayList2.get(i31);
                if (eVar4 instanceof h) {
                    h hVar3 = (h) eVar4;
                    if (hVar3.A0 == 0) {
                        int i32 = hVar3.f37435x0;
                        if (i32 != -1) {
                            hVar3.U(i32);
                        } else if (hVar3.f37436y0 != -1 && F()) {
                            hVar3.U(o() - hVar3.f37436y0);
                        } else if (F()) {
                            hVar3.U((int) ((hVar3.f37434w0 * o()) + 0.5f));
                        }
                        z25 = true;
                    }
                } else if ((eVar4 instanceof a) && ((a) eVar4).W() == 1) {
                    z26 = true;
                }
            }
            if (z25) {
                for (int i33 = 0; i33 < size2; i33++) {
                    e eVar5 = arrayList2.get(i33);
                    if (eVar5 instanceof h) {
                        h hVar4 = (h) eVar5;
                        if (hVar4.A0 == 0) {
                            y.h.g(1, hVar4, interfaceC0647b);
                        }
                    }
                }
            }
            y.h.g(0, this, interfaceC0647b);
            if (z26) {
                for (int i34 = 0; i34 < size2; i34++) {
                    e eVar6 = arrayList2.get(i34);
                    if (eVar6 instanceof a) {
                        a aVar16 = (a) eVar6;
                        if (aVar16.W() == 1 && aVar16.V()) {
                            y.h.g(1, aVar16, interfaceC0647b);
                        }
                    }
                }
            }
            for (int i35 = 0; i35 < size2; i35++) {
                e eVar7 = arrayList2.get(i35);
                if (eVar7.D() && y.h.a(eVar7)) {
                    Y(eVar7, interfaceC0647b, y.h.f38165a);
                    if (eVar7 instanceof h) {
                        if (((h) eVar7).A0 == 0) {
                            y.h.g(0, eVar7, interfaceC0647b);
                        } else {
                            y.h.b(0, eVar7, interfaceC0647b, z22);
                        }
                    } else {
                        y.h.b(0, eVar7, interfaceC0647b, z22);
                        y.h.g(0, eVar7, interfaceC0647b);
                    }
                }
            }
            for (int i36 = 0; i36 < size; i36++) {
                e eVar8 = this.f37443w0.get(i36);
                if (eVar8.D() && !(eVar8 instanceof h) && !(eVar8 instanceof a) && !(eVar8 instanceof m) && !eVar8.H) {
                    e.a n10 = eVar8.n(0);
                    e.a n11 = eVar8.n(1);
                    if (n10 == aVar11 && eVar8.f37392s != 1 && n11 == aVar11 && eVar8.f37394t != 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (!z21) {
                        Y(eVar8, this.A0, new b.a());
                    }
                }
            }
        } else {
            i6 = max5;
            i10 = max6;
            aVar = aVar9;
            dVar = dVar8;
        }
        e.a aVar17 = e.a.WRAP_CONTENT;
        v.d dVar10 = this.C0;
        if (size > 2) {
            e.a aVar18 = aVar;
            if ((aVar10 == aVar17 || aVar18 == aVar17) && k.b(this.J0, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID)) {
                b.InterfaceC0647b interfaceC0647b2 = this.A0;
                ArrayList<e> arrayList3 = this.f37443w0;
                int size3 = arrayList3.size();
                int i37 = 0;
                while (i37 < size3) {
                    e eVar9 = arrayList3.get(i37);
                    e.a[] aVarArr4 = this.V;
                    e.a aVar19 = aVarArr4[0];
                    e.a aVar20 = aVarArr4[1];
                    dVar3 = dVar7;
                    e.a[] aVarArr5 = eVar9.V;
                    i11 = size;
                    if (!y.i.b(aVar19, aVar20, aVarArr5[0], aVarArr5[1]) || (eVar9 instanceof g)) {
                        aVar2 = aVar17;
                        aVar6 = aVar10;
                        aVar7 = aVar18;
                        aVar4 = aVar12;
                        z19 = false;
                        dVar2 = dVar10;
                        break;
                    }
                    i37++;
                    dVar7 = dVar3;
                    size = i11;
                }
                i11 = size;
                dVar3 = dVar7;
                int i38 = 0;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                while (i38 < size3) {
                    e.a aVar21 = aVar18;
                    e eVar10 = arrayList3.get(i38);
                    e.a aVar22 = aVar10;
                    e.a[] aVarArr6 = this.V;
                    e.a aVar23 = aVar12;
                    e.a aVar24 = aVarArr6[0];
                    e.a aVar25 = aVarArr6[1];
                    v.d dVar11 = dVar10;
                    e.a[] aVarArr7 = eVar10.V;
                    e.a aVar26 = aVar17;
                    if (!y.i.b(aVar24, aVar25, aVarArr7[0], aVarArr7[1])) {
                        Y(eVar10, interfaceC0647b2, this.R0);
                    }
                    boolean z27 = eVar10 instanceof h;
                    if (z27) {
                        h hVar5 = (h) eVar10;
                        if (hVar5.A0 == 0) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(hVar5);
                        }
                        if (hVar5.A0 == 1) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(hVar5);
                        }
                    }
                    if (eVar10 instanceof j) {
                        if (eVar10 instanceof a) {
                            a aVar27 = (a) eVar10;
                            if (aVar27.W() == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(aVar27);
                            }
                            if (aVar27.W() == 1) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(aVar27);
                            }
                        } else {
                            j jVar = (j) eVar10;
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(jVar);
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(jVar);
                        }
                    }
                    if (eVar10.K.f == null && eVar10.M.f == null && !z27 && !(eVar10 instanceof a)) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(eVar10);
                    }
                    if (eVar10.L.f == null && eVar10.N.f == null && eVar10.O.f == null && !z27 && !(eVar10 instanceof a)) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        ArrayList arrayList10 = arrayList9;
                        arrayList10.add(eVar10);
                        arrayList9 = arrayList10;
                    }
                    i38++;
                    aVar10 = aVar22;
                    aVar18 = aVar21;
                    aVar12 = aVar23;
                    dVar10 = dVar11;
                    aVar17 = aVar26;
                }
                e.a aVar28 = aVar17;
                aVar6 = aVar10;
                v.d dVar12 = dVar10;
                aVar7 = aVar18;
                e.a aVar29 = aVar12;
                ArrayList<o> arrayList11 = new ArrayList<>();
                if (arrayList4 != null) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        y.i.a((h) it.next(), 0, arrayList11, null);
                    }
                }
                o oVar5 = null;
                int i39 = 0;
                if (arrayList5 != null) {
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        j jVar2 = (j) it2.next();
                        o a10 = y.i.a(jVar2, i39, arrayList11, oVar5);
                        jVar2.U(i39, a10, arrayList11);
                        a10.a(arrayList11);
                        oVar5 = null;
                        i39 = 0;
                    }
                }
                HashSet<d> hashSet = m(d.a.LEFT).f37346a;
                if (hashSet != null) {
                    Iterator<d> it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        y.i.a(it3.next().f37349d, 0, arrayList11, null);
                    }
                }
                HashSet<d> hashSet2 = m(d.a.RIGHT).f37346a;
                if (hashSet2 != null) {
                    Iterator<d> it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        y.i.a(it4.next().f37349d, 0, arrayList11, null);
                    }
                }
                d.a aVar30 = d.a.CENTER;
                HashSet<d> hashSet3 = m(aVar30).f37346a;
                if (hashSet3 != null) {
                    Iterator<d> it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        y.i.a(it5.next().f37349d, 0, arrayList11, null);
                    }
                }
                o oVar6 = null;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        y.i.a((e) it6.next(), 0, arrayList11, null);
                    }
                }
                if (arrayList6 != null) {
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        y.i.a((h) it7.next(), 1, arrayList11, null);
                    }
                }
                int i40 = 1;
                if (arrayList7 != null) {
                    Iterator it8 = arrayList7.iterator();
                    while (it8.hasNext()) {
                        j jVar3 = (j) it8.next();
                        o a11 = y.i.a(jVar3, i40, arrayList11, oVar6);
                        jVar3.U(i40, a11, arrayList11);
                        a11.a(arrayList11);
                        oVar6 = null;
                        i40 = 1;
                    }
                }
                HashSet<d> hashSet4 = m(d.a.TOP).f37346a;
                if (hashSet4 != null) {
                    Iterator<d> it9 = hashSet4.iterator();
                    while (it9.hasNext()) {
                        y.i.a(it9.next().f37349d, 1, arrayList11, null);
                    }
                }
                HashSet<d> hashSet5 = m(d.a.BASELINE).f37346a;
                if (hashSet5 != null) {
                    Iterator<d> it10 = hashSet5.iterator();
                    while (it10.hasNext()) {
                        y.i.a(it10.next().f37349d, 1, arrayList11, null);
                    }
                }
                HashSet<d> hashSet6 = m(d.a.BOTTOM).f37346a;
                if (hashSet6 != null) {
                    Iterator<d> it11 = hashSet6.iterator();
                    while (it11.hasNext()) {
                        y.i.a(it11.next().f37349d, 1, arrayList11, null);
                    }
                }
                HashSet<d> hashSet7 = m(aVar30).f37346a;
                if (hashSet7 != null) {
                    Iterator<d> it12 = hashSet7.iterator();
                    while (it12.hasNext()) {
                        y.i.a(it12.next().f37349d, 1, arrayList11, null);
                    }
                }
                char c11 = 1;
                if (arrayList9 != null) {
                    Iterator it13 = arrayList9.iterator();
                    while (it13.hasNext()) {
                        y.i.a((e) it13.next(), 1, arrayList11, null);
                    }
                }
                int i41 = 0;
                while (i41 < size3) {
                    e eVar11 = arrayList3.get(i41);
                    e.a[] aVarArr8 = eVar11.V;
                    if (aVarArr8[0] == aVar11 && aVarArr8[c11] == aVar11) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        int i42 = eVar11.f37397u0;
                        int size4 = arrayList11.size();
                        int i43 = 0;
                        while (true) {
                            if (i43 < size4) {
                                oVar3 = arrayList11.get(i43);
                                if (i42 == oVar3.f38172b) {
                                    break;
                                }
                                i43++;
                            } else {
                                oVar3 = null;
                                break;
                            }
                        }
                        int i44 = eVar11.f37399v0;
                        int size5 = arrayList11.size();
                        int i45 = 0;
                        while (true) {
                            if (i45 < size5) {
                                oVar4 = arrayList11.get(i45);
                                if (i44 == oVar4.f38172b) {
                                    break;
                                }
                                i45++;
                            } else {
                                oVar4 = null;
                                break;
                            }
                        }
                        if (oVar3 != null && oVar4 != null) {
                            oVar3.c(0, oVar4);
                            oVar4.f38173c = 2;
                            arrayList11.remove(oVar3);
                        }
                    }
                    i41++;
                    c11 = 1;
                }
                if (arrayList11.size() <= 1) {
                    aVar4 = aVar29;
                    dVar2 = dVar12;
                    aVar2 = aVar28;
                } else {
                    int i46 = 0;
                    aVar2 = aVar28;
                    if (this.V[0] == aVar2) {
                        Iterator<o> it14 = arrayList11.iterator();
                        int i47 = 0;
                        oVar = null;
                        while (it14.hasNext()) {
                            o next = it14.next();
                            if (next.f38173c == 1) {
                                dVar6 = dVar12;
                            } else {
                                dVar6 = dVar12;
                                int b11 = next.b(dVar6, i46);
                                if (b11 > i47) {
                                    oVar = next;
                                    i47 = b11;
                                }
                            }
                            dVar12 = dVar6;
                            i46 = 0;
                        }
                        dVar2 = dVar12;
                        aVar4 = aVar29;
                        if (oVar != null) {
                            P(aVar4);
                            R(i47);
                            int i48 = 1;
                            if (this.V[1] == aVar2) {
                                Iterator<o> it15 = arrayList11.iterator();
                                int i49 = 0;
                                oVar2 = null;
                                while (it15.hasNext()) {
                                    o next2 = it15.next();
                                    if (next2.f38173c != 0 && (b10 = next2.b(dVar2, i48)) > i49) {
                                        oVar2 = next2;
                                        i49 = b10;
                                    }
                                    i48 = 1;
                                }
                                if (oVar2 != null) {
                                    Q(aVar4);
                                    O(i49);
                                    if (oVar == null || oVar2 != null) {
                                        z19 = true;
                                        if (!z19) {
                                            aVar3 = aVar6;
                                            if (aVar3 == aVar2) {
                                                i20 = i6;
                                                if (i20 < u() && i20 > 0) {
                                                    R(i20);
                                                    this.K0 = true;
                                                } else {
                                                    i21 = u();
                                                    aVar5 = aVar7;
                                                    if (aVar5 != aVar2) {
                                                        i22 = i10;
                                                        if (i22 < o() && i22 > 0) {
                                                            O(i22);
                                                            this.L0 = true;
                                                        } else {
                                                            i23 = o();
                                                            i12 = i23;
                                                            i13 = i21;
                                                            z10 = true;
                                                            if (Z(64) && !Z(128)) {
                                                                z11 = false;
                                                            } else {
                                                                z11 = true;
                                                            }
                                                            dVar2.getClass();
                                                            dVar2.f34642g = false;
                                                            if (this.J0 == 0 && z11) {
                                                                c10 = 1;
                                                                dVar2.f34642g = true;
                                                            } else {
                                                                c10 = 1;
                                                            }
                                                            ArrayList<e> arrayList12 = this.f37443w0;
                                                            aVarArr = this.V;
                                                            if (aVarArr[0] == aVar2 && aVarArr[c10] != aVar2) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = true;
                                                            }
                                                            this.F0 = 0;
                                                            this.G0 = 0;
                                                            i14 = i11;
                                                            for (i15 = 0; i15 < i14; i15++) {
                                                                e eVar12 = this.f37443w0.get(i15);
                                                                if (eVar12 instanceof n) {
                                                                    ((n) eVar12).U();
                                                                }
                                                            }
                                                            boolean Z = Z(64);
                                                            boolean z28 = z10;
                                                            int i50 = 0;
                                                            z13 = true;
                                                            while (z13) {
                                                                int i51 = i50 + 1;
                                                                try {
                                                                    dVar2.t();
                                                                    z15 = z13;
                                                                    try {
                                                                        this.F0 = 0;
                                                                        this.G0 = 0;
                                                                        k(dVar2);
                                                                        for (int i52 = 0; i52 < i14; i52++) {
                                                                            this.f37443w0.get(i52).k(dVar2);
                                                                        }
                                                                        W(dVar2);
                                                                        try {
                                                                            weakReference = this.M0;
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            arrayList = arrayList12;
                                                                            dVar4 = dVar3;
                                                                            z16 = z28;
                                                                        }
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        arrayList = arrayList12;
                                                                        dVar4 = dVar3;
                                                                        z16 = z28;
                                                                        e.printStackTrace();
                                                                        PrintStream printStream = System.out;
                                                                        printStream.println("EXCEPTION : " + e);
                                                                        boolean[] zArr = k.f37440a;
                                                                        if (!z15) {
                                                                        }
                                                                        if (z12) {
                                                                        }
                                                                        max = Math.max(this.e0, u());
                                                                        if (max > u()) {
                                                                        }
                                                                        max2 = Math.max(this.f37368f0, o());
                                                                        if (max2 <= o()) {
                                                                        }
                                                                        if (!z16) {
                                                                        }
                                                                        i17 = i16;
                                                                        z28 = z16;
                                                                        i18 = 8;
                                                                        if (i51 <= i18) {
                                                                        }
                                                                        i50 = i51;
                                                                        i12 = i17;
                                                                        dVar3 = dVar4;
                                                                        arrayList12 = arrayList;
                                                                    }
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    arrayList = arrayList12;
                                                                    z15 = z13;
                                                                }
                                                                if (weakReference != null) {
                                                                    try {
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        arrayList = arrayList12;
                                                                        dVar4 = dVar3;
                                                                        z16 = z28;
                                                                    }
                                                                    if (weakReference.get() != null) {
                                                                        d dVar13 = dVar3;
                                                                        z16 = z28;
                                                                        try {
                                                                            arrayList = arrayList12;
                                                                            dVar4 = dVar13;
                                                                        } catch (Exception e14) {
                                                                            e = e14;
                                                                            arrayList = arrayList12;
                                                                            dVar4 = dVar13;
                                                                        }
                                                                        try {
                                                                            dVar2.f(dVar2.k(this.M0.get()), dVar2.k(dVar13), 0, 5);
                                                                            this.M0 = null;
                                                                            weakReference2 = this.O0;
                                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                                dVar2.f(dVar2.k(this.N), dVar2.k(this.O0.get()), 0, 5);
                                                                                this.O0 = null;
                                                                            }
                                                                            weakReference3 = this.N0;
                                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                                dVar5 = dVar;
                                                                                try {
                                                                                    dVar = dVar5;
                                                                                    dVar2.f(dVar2.k(this.N0.get()), dVar2.k(dVar5), 0, 5);
                                                                                } catch (Exception e15) {
                                                                                    e = e15;
                                                                                    dVar = dVar5;
                                                                                    z15 = true;
                                                                                    e.printStackTrace();
                                                                                    PrintStream printStream2 = System.out;
                                                                                    printStream2.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr2 = k.f37440a;
                                                                                    if (!z15) {
                                                                                    }
                                                                                    if (z12) {
                                                                                    }
                                                                                    max = Math.max(this.e0, u());
                                                                                    if (max > u()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f37368f0, o());
                                                                                    if (max2 <= o()) {
                                                                                    }
                                                                                    if (!z16) {
                                                                                    }
                                                                                    i17 = i16;
                                                                                    z28 = z16;
                                                                                    i18 = 8;
                                                                                    if (i51 <= i18) {
                                                                                    }
                                                                                    i50 = i51;
                                                                                    i12 = i17;
                                                                                    dVar3 = dVar4;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                                try {
                                                                                    this.N0 = null;
                                                                                } catch (Exception e16) {
                                                                                    e = e16;
                                                                                    z15 = true;
                                                                                    e.printStackTrace();
                                                                                    PrintStream printStream22 = System.out;
                                                                                    printStream22.println("EXCEPTION : " + e);
                                                                                    boolean[] zArr22 = k.f37440a;
                                                                                    if (!z15) {
                                                                                    }
                                                                                    if (z12) {
                                                                                    }
                                                                                    max = Math.max(this.e0, u());
                                                                                    if (max > u()) {
                                                                                    }
                                                                                    max2 = Math.max(this.f37368f0, o());
                                                                                    if (max2 <= o()) {
                                                                                    }
                                                                                    if (!z16) {
                                                                                    }
                                                                                    i17 = i16;
                                                                                    z28 = z16;
                                                                                    i18 = 8;
                                                                                    if (i51 <= i18) {
                                                                                    }
                                                                                    i50 = i51;
                                                                                    i12 = i17;
                                                                                    dVar3 = dVar4;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                            }
                                                                            weakReference4 = this.P0;
                                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                                dVar2.f(dVar2.k(this.M), dVar2.k(this.P0.get()), 0, 5);
                                                                                this.P0 = null;
                                                                            }
                                                                            dVar2.p();
                                                                            z15 = true;
                                                                        } catch (Exception e17) {
                                                                            e = e17;
                                                                            z15 = true;
                                                                            e.printStackTrace();
                                                                            PrintStream printStream222 = System.out;
                                                                            printStream222.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = k.f37440a;
                                                                            if (!z15) {
                                                                            }
                                                                            if (z12) {
                                                                            }
                                                                            max = Math.max(this.e0, u());
                                                                            if (max > u()) {
                                                                            }
                                                                            max2 = Math.max(this.f37368f0, o());
                                                                            if (max2 <= o()) {
                                                                            }
                                                                            if (!z16) {
                                                                            }
                                                                            i17 = i16;
                                                                            z28 = z16;
                                                                            i18 = 8;
                                                                            if (i51 <= i18) {
                                                                            }
                                                                            i50 = i51;
                                                                            i12 = i17;
                                                                            dVar3 = dVar4;
                                                                            arrayList12 = arrayList;
                                                                        }
                                                                        boolean[] zArr2222 = k.f37440a;
                                                                        if (!z15) {
                                                                            zArr2222[2] = false;
                                                                            boolean Z2 = Z(64);
                                                                            T(dVar2, Z2);
                                                                            int size6 = this.f37443w0.size();
                                                                            int i53 = 0;
                                                                            z17 = false;
                                                                            while (i53 < size6) {
                                                                                int i54 = size6;
                                                                                e eVar13 = this.f37443w0.get(i53);
                                                                                eVar13.T(dVar2, Z2);
                                                                                boolean z29 = Z2;
                                                                                int i55 = i12;
                                                                                if (eVar13.f37373i == -1 && eVar13.f37375j == -1) {
                                                                                    z18 = false;
                                                                                } else {
                                                                                    z18 = true;
                                                                                }
                                                                                if (z18) {
                                                                                    z17 = true;
                                                                                }
                                                                                i53++;
                                                                                size6 = i54;
                                                                                Z2 = z29;
                                                                                i12 = i55;
                                                                            }
                                                                            i16 = i12;
                                                                        } else {
                                                                            i16 = i12;
                                                                            T(dVar2, Z);
                                                                            for (int i56 = 0; i56 < i14; i56++) {
                                                                                this.f37443w0.get(i56).T(dVar2, Z);
                                                                            }
                                                                            z17 = false;
                                                                        }
                                                                        if (z12 && i51 < 8 && zArr2222[2]) {
                                                                            int i57 = 0;
                                                                            int i58 = 0;
                                                                            for (i19 = 0; i19 < i14; i19++) {
                                                                                e eVar14 = this.f37443w0.get(i19);
                                                                                i58 = Math.max(i58, eVar14.u() + eVar14.f37363b0);
                                                                                i57 = Math.max(i57, eVar14.o() + eVar14.c0);
                                                                            }
                                                                            max3 = Math.max(this.e0, i58);
                                                                            max4 = Math.max(this.f37368f0, i57);
                                                                            if (aVar3 == aVar2 && u() < max3) {
                                                                                R(max3);
                                                                                this.V[0] = aVar2;
                                                                                z17 = true;
                                                                                z16 = true;
                                                                            }
                                                                            if (aVar5 == aVar2 && o() < max4) {
                                                                                O(max4);
                                                                                this.V[1] = aVar2;
                                                                                z17 = true;
                                                                                z16 = true;
                                                                            }
                                                                        }
                                                                        max = Math.max(this.e0, u());
                                                                        if (max > u()) {
                                                                            R(max);
                                                                            this.V[0] = aVar4;
                                                                            z17 = true;
                                                                            z16 = true;
                                                                        }
                                                                        max2 = Math.max(this.f37368f0, o());
                                                                        if (max2 <= o()) {
                                                                            O(max2);
                                                                            r72 = 1;
                                                                            this.V[1] = aVar4;
                                                                            z17 = true;
                                                                            z16 = true;
                                                                        } else {
                                                                            r72 = 1;
                                                                        }
                                                                        if (!z16) {
                                                                            if (this.V[0] == aVar2 && i13 > 0 && u() > i13) {
                                                                                this.K0 = r72;
                                                                                this.V[0] = aVar4;
                                                                                R(i13);
                                                                                z17 = true;
                                                                                z16 = true;
                                                                            }
                                                                            if (this.V[r72] == aVar2 && i16 > 0) {
                                                                                i17 = i16;
                                                                                if (o() > i17) {
                                                                                    this.L0 = r72;
                                                                                    this.V[r72] = aVar4;
                                                                                    O(i17);
                                                                                    i18 = 8;
                                                                                    z28 = true;
                                                                                    z17 = true;
                                                                                    if (i51 <= i18) {
                                                                                        z13 = false;
                                                                                    } else {
                                                                                        z13 = z17;
                                                                                    }
                                                                                    i50 = i51;
                                                                                    i12 = i17;
                                                                                    dVar3 = dVar4;
                                                                                    arrayList12 = arrayList;
                                                                                }
                                                                                z28 = z16;
                                                                                i18 = 8;
                                                                                if (i51 <= i18) {
                                                                                }
                                                                                i50 = i51;
                                                                                i12 = i17;
                                                                                dVar3 = dVar4;
                                                                                arrayList12 = arrayList;
                                                                            }
                                                                        }
                                                                        i17 = i16;
                                                                        z28 = z16;
                                                                        i18 = 8;
                                                                        if (i51 <= i18) {
                                                                        }
                                                                        i50 = i51;
                                                                        i12 = i17;
                                                                        dVar3 = dVar4;
                                                                        arrayList12 = arrayList;
                                                                    }
                                                                }
                                                                arrayList = arrayList12;
                                                                dVar4 = dVar3;
                                                                z16 = z28;
                                                                weakReference2 = this.O0;
                                                                if (weakReference2 != null) {
                                                                    dVar2.f(dVar2.k(this.N), dVar2.k(this.O0.get()), 0, 5);
                                                                    this.O0 = null;
                                                                }
                                                                weakReference3 = this.N0;
                                                                if (weakReference3 != null) {
                                                                    dVar5 = dVar;
                                                                    dVar = dVar5;
                                                                    dVar2.f(dVar2.k(this.N0.get()), dVar2.k(dVar5), 0, 5);
                                                                    this.N0 = null;
                                                                }
                                                                weakReference4 = this.P0;
                                                                if (weakReference4 == null) {
                                                                }
                                                                dVar2.p();
                                                                z15 = true;
                                                                boolean[] zArr22222 = k.f37440a;
                                                                if (!z15) {
                                                                }
                                                                if (z12) {
                                                                    int i572 = 0;
                                                                    int i582 = 0;
                                                                    while (i19 < i14) {
                                                                    }
                                                                    max3 = Math.max(this.e0, i582);
                                                                    max4 = Math.max(this.f37368f0, i572);
                                                                    if (aVar3 == aVar2) {
                                                                        R(max3);
                                                                        this.V[0] = aVar2;
                                                                        z17 = true;
                                                                        z16 = true;
                                                                    }
                                                                    if (aVar5 == aVar2) {
                                                                        O(max4);
                                                                        this.V[1] = aVar2;
                                                                        z17 = true;
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.e0, u());
                                                                if (max > u()) {
                                                                }
                                                                max2 = Math.max(this.f37368f0, o());
                                                                if (max2 <= o()) {
                                                                }
                                                                if (!z16) {
                                                                }
                                                                i17 = i16;
                                                                z28 = z16;
                                                                i18 = 8;
                                                                if (i51 <= i18) {
                                                                }
                                                                i50 = i51;
                                                                i12 = i17;
                                                                dVar3 = dVar4;
                                                                arrayList12 = arrayList;
                                                            }
                                                            z14 = z28;
                                                            this.f37443w0 = arrayList12;
                                                            if (z14) {
                                                                e.a[] aVarArr9 = this.V;
                                                                aVarArr9[0] = aVar3;
                                                                aVarArr9[1] = aVar5;
                                                            }
                                                            J(dVar2.f34647l);
                                                        }
                                                    } else {
                                                        i22 = i10;
                                                    }
                                                    i23 = i22;
                                                    i12 = i23;
                                                    i13 = i21;
                                                    z10 = true;
                                                    if (Z(64)) {
                                                    }
                                                    z11 = true;
                                                    dVar2.getClass();
                                                    dVar2.f34642g = false;
                                                    if (this.J0 == 0) {
                                                    }
                                                    c10 = 1;
                                                    ArrayList<e> arrayList122 = this.f37443w0;
                                                    aVarArr = this.V;
                                                    if (aVarArr[0] == aVar2) {
                                                    }
                                                    z12 = true;
                                                    this.F0 = 0;
                                                    this.G0 = 0;
                                                    i14 = i11;
                                                    while (i15 < i14) {
                                                    }
                                                    boolean Z3 = Z(64);
                                                    boolean z282 = z10;
                                                    int i502 = 0;
                                                    z13 = true;
                                                    while (z13) {
                                                    }
                                                    z14 = z282;
                                                    this.f37443w0 = arrayList122;
                                                    if (z14) {
                                                    }
                                                    J(dVar2.f34647l);
                                                }
                                            } else {
                                                i20 = i6;
                                            }
                                            i21 = i20;
                                            aVar5 = aVar7;
                                            if (aVar5 != aVar2) {
                                            }
                                            i23 = i22;
                                            i12 = i23;
                                            i13 = i21;
                                            z10 = true;
                                            if (Z(64)) {
                                            }
                                            z11 = true;
                                            dVar2.getClass();
                                            dVar2.f34642g = false;
                                            if (this.J0 == 0) {
                                            }
                                            c10 = 1;
                                            ArrayList<e> arrayList1222 = this.f37443w0;
                                            aVarArr = this.V;
                                            if (aVarArr[0] == aVar2) {
                                            }
                                            z12 = true;
                                            this.F0 = 0;
                                            this.G0 = 0;
                                            i14 = i11;
                                            while (i15 < i14) {
                                            }
                                            boolean Z32 = Z(64);
                                            boolean z2822 = z10;
                                            int i5022 = 0;
                                            z13 = true;
                                            while (z13) {
                                            }
                                            z14 = z2822;
                                            this.f37443w0 = arrayList1222;
                                            if (z14) {
                                            }
                                            J(dVar2.f34647l);
                                        }
                                        i12 = i10;
                                        i13 = i6;
                                        aVar3 = aVar6;
                                        aVar5 = aVar7;
                                    }
                                }
                            }
                            oVar2 = null;
                            if (oVar == null) {
                            }
                            z19 = true;
                            if (!z19) {
                            }
                        }
                    } else {
                        aVar4 = aVar29;
                        dVar2 = dVar12;
                    }
                    oVar = null;
                    int i482 = 1;
                    if (this.V[1] == aVar2) {
                    }
                    oVar2 = null;
                    if (oVar == null) {
                    }
                    z19 = true;
                    if (!z19) {
                    }
                }
                z19 = false;
                if (!z19) {
                }
            } else {
                aVar2 = aVar17;
                i11 = size;
                aVar3 = aVar10;
                aVar4 = aVar12;
                dVar3 = dVar7;
                i12 = i10;
                i13 = i6;
                dVar2 = dVar10;
                aVar5 = aVar18;
            }
        } else {
            aVar2 = aVar17;
            i11 = size;
            aVar3 = aVar10;
            dVar2 = dVar10;
            aVar4 = aVar12;
            i12 = i10;
            i13 = i6;
            aVar5 = aVar;
            dVar3 = dVar7;
        }
        z10 = false;
        if (Z(64)) {
        }
        z11 = true;
        dVar2.getClass();
        dVar2.f34642g = false;
        if (this.J0 == 0) {
        }
        c10 = 1;
        ArrayList<e> arrayList12222 = this.f37443w0;
        aVarArr = this.V;
        if (aVarArr[0] == aVar2) {
        }
        z12 = true;
        this.F0 = 0;
        this.G0 = 0;
        i14 = i11;
        while (i15 < i14) {
        }
        boolean Z322 = Z(64);
        boolean z28222 = z10;
        int i50222 = 0;
        z13 = true;
        while (z13) {
        }
        z14 = z28222;
        this.f37443w0 = arrayList12222;
        if (z14) {
        }
        J(dVar2.f34647l);
    }

    public final void V(int i6, e eVar) {
        if (i6 == 0) {
            int i10 = this.F0 + 1;
            c[] cVarArr = this.I0;
            if (i10 >= cVarArr.length) {
                this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.I0;
            int i11 = this.F0;
            cVarArr2[i11] = new c(eVar, 0, this.B0);
            this.F0 = i11 + 1;
        } else if (i6 == 1) {
            int i12 = this.G0 + 1;
            c[] cVarArr3 = this.H0;
            if (i12 >= cVarArr3.length) {
                this.H0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.H0;
            int i13 = this.G0;
            cVarArr4[i13] = new c(eVar, 1, this.B0);
            this.G0 = i13 + 1;
        }
    }

    public final void W(v.d dVar) {
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean Z = Z(64);
        e(dVar, Z);
        int size = this.f37443w0.size();
        boolean z14 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f37443w0.get(i10);
            boolean[] zArr = eVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f37443w0.get(i11);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i12 = 0; i12 < aVar.f37439x0; i12++) {
                        e eVar3 = aVar.f37438w0[i12];
                        if (aVar.f37329z0 || eVar3.f()) {
                            int i13 = aVar.f37328y0;
                            if (i13 != 0 && i13 != 1) {
                                if (i13 == 2 || i13 == 3) {
                                    eVar3.U[1] = true;
                                }
                            } else {
                                eVar3.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<e> hashSet = this.Q0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = this.f37443w0.get(i14);
            eVar4.getClass();
            if (!(eVar4 instanceof m) && !(eVar4 instanceof h)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                if (eVar4 instanceof m) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.e(dVar, Z);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                int i15 = 0;
                while (true) {
                    if (i15 < mVar.f37439x0) {
                        if (hashSet.contains(mVar.f37438w0[i15])) {
                            z12 = true;
                            continue;
                            break;
                        }
                        i15++;
                    } else {
                        z12 = false;
                        continue;
                        break;
                    }
                }
                if (z12) {
                    mVar.e(dVar, Z);
                    hashSet.remove(mVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().e(dVar, Z);
                }
                hashSet.clear();
            }
        }
        boolean z15 = v.d.f34635p;
        e.a aVar2 = e.a.WRAP_CONTENT;
        if (z15) {
            HashSet<e> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                e eVar5 = this.f37443w0.get(i16);
                eVar5.getClass();
                if (!(eVar5 instanceof m) && !(eVar5 instanceof h)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    hashSet2.add(eVar5);
                }
            }
            if (this.V[0] == aVar2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            d(this, dVar, hashSet2, i6, false);
            Iterator<e> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, dVar, next);
                next.e(dVar, Z);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                e eVar6 = this.f37443w0.get(i17);
                if (eVar6 instanceof f) {
                    e.a[] aVarArr = eVar6.V;
                    e.a aVar3 = aVarArr[0];
                    e.a aVar4 = aVarArr[1];
                    e.a aVar5 = e.a.FIXED;
                    if (aVar3 == aVar2) {
                        eVar6.P(aVar5);
                    }
                    if (aVar4 == aVar2) {
                        eVar6.Q(aVar5);
                    }
                    eVar6.e(dVar, Z);
                    if (aVar3 == aVar2) {
                        eVar6.P(aVar3);
                    }
                    if (aVar4 == aVar2) {
                        eVar6.Q(aVar4);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!(eVar6 instanceof m) && !(eVar6 instanceof h)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        eVar6.e(dVar, Z);
                    }
                }
            }
        }
        if (this.F0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.G0 > 0) {
            b.a(this, dVar, null, 1);
        }
    }

    public final boolean X(int i6, boolean z10) {
        boolean z11;
        boolean z12;
        e.a aVar;
        boolean z13 = z10 & true;
        y.e eVar = this.f37410y0;
        f fVar = eVar.f38146a;
        e.a n10 = fVar.n(0);
        e.a n11 = fVar.n(1);
        int v10 = fVar.v();
        int w10 = fVar.w();
        ArrayList<p> arrayList = eVar.f38150e;
        e.a aVar2 = e.a.FIXED;
        if (z13 && (n10 == (aVar = e.a.WRAP_CONTENT) || n11 == aVar)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f == i6 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z13 && n10 == aVar) {
                    fVar.P(aVar2);
                    fVar.R(eVar.d(fVar, 0));
                    fVar.f37365d.f38180e.d(fVar.u());
                }
            } else if (z13 && n11 == aVar) {
                fVar.Q(aVar2);
                fVar.O(eVar.d(fVar, 1));
                fVar.f37367e.f38180e.d(fVar.o());
            }
        }
        e.a aVar3 = e.a.MATCH_PARENT;
        if (i6 == 0) {
            e.a aVar4 = fVar.V[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int u10 = fVar.u() + v10;
                fVar.f37365d.f38183i.d(u10);
                fVar.f37365d.f38180e.d(u10 - v10);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            e.a aVar5 = fVar.V[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int o10 = fVar.o() + w10;
                fVar.f37367e.f38183i.d(o10);
                fVar.f37367e.f38180e.d(o10 - w10);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f == i6 && (next2.f38177b != fVar || next2.f38181g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f == i6 && (z11 || next3.f38177b != fVar)) {
                if (!next3.f38182h.f38161j || !next3.f38183i.f38161j || (!(next3 instanceof y.c) && !next3.f38180e.f38161j)) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        fVar.P(n10);
        fVar.Q(n11);
        return z12;
    }

    public final boolean Z(int i6) {
        if ((this.J0 & i6) == i6) {
            return true;
        }
        return false;
    }

    @Override // x.e
    public final void r(StringBuilder sb2) {
        sb2.append(this.f37377k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<e> it = this.f37443w0.iterator();
        while (it.hasNext()) {
            it.next().r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
