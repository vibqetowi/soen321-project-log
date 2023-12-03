package y;

import java.util.ArrayList;
import java.util.Iterator;
import x.e;
/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<p> f38144k;

    /* renamed from: l  reason: collision with root package name */
    public int f38145l;

    public c(int i6, x.e eVar) {
        super(eVar);
        p pVar;
        boolean z10;
        int i10;
        p pVar2;
        this.f38144k = new ArrayList<>();
        this.f = i6;
        x.e eVar2 = this.f38177b;
        x.e q10 = eVar2.q(i6);
        while (q10 != null) {
            eVar2 = q10;
            q10 = q10.q(this.f);
        }
        this.f38177b = eVar2;
        int i11 = this.f;
        if (i11 == 0) {
            pVar = eVar2.f37365d;
        } else if (i11 == 1) {
            pVar = eVar2.f37367e;
        } else {
            pVar = null;
        }
        ArrayList<p> arrayList = this.f38144k;
        arrayList.add(pVar);
        x.e p10 = eVar2.p(this.f);
        while (p10 != null) {
            int i12 = this.f;
            if (i12 == 0) {
                pVar2 = p10.f37365d;
            } else if (i12 == 1) {
                pVar2 = p10.f37367e;
            } else {
                pVar2 = null;
            }
            arrayList.add(pVar2);
            p10 = p10.p(this.f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i13 = this.f;
            if (i13 == 0) {
                next.f38177b.f37362b = this;
            } else if (i13 == 1) {
                next.f38177b.f37364c = this;
            }
        }
        if (this.f == 0 && ((x.f) this.f38177b.W).B0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && arrayList.size() > 1) {
            this.f38177b = arrayList.get(arrayList.size() - 1).f38177b;
        }
        if (this.f == 0) {
            i10 = this.f38177b.f37384n0;
        } else {
            i10 = this.f38177b.f37386o0;
        }
        this.f38145l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x03d3, code lost:
        r3 = r3 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // y.p, y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        boolean z10;
        int i6;
        e.a aVar;
        ArrayList<p> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f;
        boolean z11;
        e.a aVar2;
        ArrayList<p> arrayList2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        e.a aVar3;
        int i26;
        int i27;
        float f10;
        e.a aVar4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z12;
        boolean z13;
        int i34;
        int i35;
        f fVar = this.f38182h;
        if (fVar.f38161j) {
            f fVar2 = this.f38183i;
            if (fVar2.f38161j) {
                x.e eVar = this.f38177b.W;
                if (eVar instanceof x.f) {
                    z10 = ((x.f) eVar).B0;
                } else {
                    z10 = false;
                }
                int i36 = fVar2.f38158g - fVar.f38158g;
                ArrayList<p> arrayList3 = this.f38144k;
                int size = arrayList3.size();
                int i37 = 0;
                while (true) {
                    i6 = -1;
                    if (i37 < size) {
                        if (arrayList3.get(i37).f38177b.f37376j0 != 8) {
                            break;
                        }
                        i37++;
                    } else {
                        i37 = -1;
                        break;
                    }
                }
                int i38 = size - 1;
                int i39 = i38;
                while (true) {
                    if (i39 < 0) {
                        break;
                    } else if (arrayList3.get(i39).f38177b.f37376j0 != 8) {
                        i6 = i39;
                        break;
                    } else {
                        i39--;
                    }
                }
                int i40 = 0;
                while (true) {
                    aVar = e.a.MATCH_CONSTRAINT;
                    if (i40 < 2) {
                        i14 = 0;
                        int i41 = 0;
                        i32 = 0;
                        i33 = 0;
                        f = 0.0f;
                        while (i41 < size) {
                            p pVar = arrayList3.get(i41);
                            x.e eVar2 = pVar.f38177b;
                            ArrayList<p> arrayList4 = arrayList3;
                            int i42 = size;
                            if (eVar2.f37376j0 == 8) {
                                i34 = i37;
                            } else {
                                i33++;
                                if (i41 > 0 && i41 >= i37) {
                                    i14 += pVar.f38182h.f;
                                }
                                g gVar = pVar.f38180e;
                                int i43 = gVar.f38158g;
                                if (pVar.f38179d != aVar) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    int i44 = this.f;
                                    z13 = z12;
                                    if (i44 == 0 && !eVar2.f37365d.f38180e.f38161j) {
                                        return;
                                    }
                                    if (i44 == 1 && !eVar2.f37367e.f38180e.f38161j) {
                                        return;
                                    }
                                    i34 = i37;
                                } else {
                                    z13 = z12;
                                    i34 = i37;
                                    if (pVar.f38176a == 1 && i40 == 0) {
                                        i35 = gVar.f38164m;
                                        i32++;
                                    } else if (gVar.f38161j) {
                                        i35 = i43;
                                    }
                                    z13 = true;
                                    if (z13) {
                                        i32++;
                                        float f11 = eVar2.f37388p0[this.f];
                                        if (f11 >= 0.0f) {
                                            f += f11;
                                        }
                                    } else {
                                        i14 += i35;
                                    }
                                    if (i41 < i38 && i41 < i6) {
                                        i14 += -pVar.f38183i.f;
                                    }
                                }
                                i35 = i43;
                                if (z13) {
                                }
                                if (i41 < i38) {
                                    i14 += -pVar.f38183i.f;
                                }
                            }
                            i41++;
                            arrayList3 = arrayList4;
                            size = i42;
                            i37 = i34;
                        }
                        arrayList = arrayList3;
                        i10 = size;
                        i11 = i37;
                        if (i14 < i36 || i32 == 0) {
                            break;
                        }
                        i40++;
                        arrayList3 = arrayList;
                        size = i10;
                        i37 = i11;
                    } else {
                        arrayList = arrayList3;
                        i10 = size;
                        i11 = i37;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        f = 0.0f;
                        break;
                    }
                }
                i12 = i32;
                i13 = i33;
                int i45 = fVar.f38158g;
                if (z10) {
                    i45 = fVar2.f38158g;
                }
                if (i14 > i36) {
                    if (z10) {
                        i45 += (int) (((i14 - i36) / 2.0f) + 0.5f);
                    } else {
                        i45 -= (int) (((i14 - i36) / 2.0f) + 0.5f);
                    }
                }
                if (i12 > 0) {
                    float f12 = i36 - i14;
                    int i46 = (int) ((f12 / i12) + 0.5f);
                    i15 = i10;
                    int i47 = 0;
                    int i48 = 0;
                    while (i47 < i15) {
                        ArrayList<p> arrayList5 = arrayList;
                        int i49 = i46;
                        p pVar2 = arrayList5.get(i47);
                        int i50 = i14;
                        x.e eVar3 = pVar2.f38177b;
                        int i51 = i45;
                        boolean z14 = z10;
                        if (eVar3.f37376j0 != 8 && pVar2.f38179d == aVar) {
                            g gVar2 = pVar2.f38180e;
                            if (!gVar2.f38161j) {
                                if (f > 0.0f) {
                                    aVar4 = aVar;
                                    i28 = (int) (((eVar3.f37388p0[this.f] * f12) / f) + 0.5f);
                                } else {
                                    aVar4 = aVar;
                                    i28 = i49;
                                }
                                if (this.f == 0) {
                                    i29 = eVar3.f37400w;
                                    i30 = eVar3.f37398v;
                                } else {
                                    i29 = eVar3.f37403z;
                                    i30 = eVar3.f37402y;
                                }
                                f10 = f12;
                                if (pVar2.f38176a == 1) {
                                    i31 = Math.min(i28, gVar2.f38164m);
                                } else {
                                    i31 = i28;
                                }
                                int max = Math.max(i30, i31);
                                if (i29 > 0) {
                                    max = Math.min(i29, max);
                                }
                                if (max != i28) {
                                    i48++;
                                    i28 = max;
                                }
                                gVar2.d(i28);
                                i47++;
                                i14 = i50;
                                i46 = i49;
                                i45 = i51;
                                z10 = z14;
                                aVar = aVar4;
                                f12 = f10;
                                arrayList = arrayList5;
                            }
                        }
                        f10 = f12;
                        aVar4 = aVar;
                        i47++;
                        i14 = i50;
                        i46 = i49;
                        i45 = i51;
                        z10 = z14;
                        aVar = aVar4;
                        f12 = f10;
                        arrayList = arrayList5;
                    }
                    i18 = i45;
                    z11 = z10;
                    int i52 = i14;
                    aVar2 = aVar;
                    arrayList2 = arrayList;
                    if (i48 > 0) {
                        i12 -= i48;
                        int i53 = 0;
                        int i54 = 0;
                        while (i53 < i15) {
                            p pVar3 = arrayList2.get(i53);
                            if (pVar3.f38177b.f37376j0 == 8) {
                                i27 = i11;
                            } else {
                                i27 = i11;
                                if (i53 > 0 && i53 >= i27) {
                                    i54 += pVar3.f38182h.f;
                                }
                                i54 += pVar3.f38180e.f38158g;
                                if (i53 < i38 && i53 < i6) {
                                    i54 += -pVar3.f38183i.f;
                                }
                            }
                            i53++;
                            i11 = i27;
                        }
                        i16 = i11;
                        i14 = i54;
                    } else {
                        i16 = i11;
                        i14 = i52;
                    }
                    i17 = 2;
                    if (this.f38145l == 2 && i48 == 0) {
                        this.f38145l = 0;
                        if (i14 > i36) {
                            this.f38145l = i17;
                        }
                        if (i13 > 0 && i12 == 0 && i16 == i6) {
                            this.f38145l = i17;
                        }
                        i19 = this.f38145l;
                        if (i19 != 1) {
                            if (i13 > 1) {
                                i24 = (i36 - i14) / (i13 - 1);
                            } else if (i13 == 1) {
                                i24 = (i36 - i14) / 2;
                            } else {
                                i24 = 0;
                            }
                            if (i12 > 0) {
                                i24 = 0;
                            }
                            int i55 = i18;
                            int i56 = 0;
                            while (i56 < i15) {
                                if (z11) {
                                    i25 = i15 - (i56 + 1);
                                } else {
                                    i25 = i56;
                                }
                                p pVar4 = arrayList2.get(i25);
                                int i57 = pVar4.f38177b.f37376j0;
                                f fVar3 = pVar4.f38183i;
                                f fVar4 = pVar4.f38182h;
                                if (i57 == 8) {
                                    fVar4.d(i55);
                                    fVar3.d(i55);
                                    i26 = i24;
                                    aVar3 = aVar2;
                                } else {
                                    if (i56 > 0) {
                                        if (z11) {
                                            i55 -= i24;
                                        } else {
                                            i55 += i24;
                                        }
                                    }
                                    if (i56 > 0 && i56 >= i16) {
                                        if (z11) {
                                            i55 -= fVar4.f;
                                        } else {
                                            i55 += fVar4.f;
                                        }
                                    }
                                    if (z11) {
                                        fVar3.d(i55);
                                    } else {
                                        fVar4.d(i55);
                                    }
                                    g gVar3 = pVar4.f38180e;
                                    int i58 = gVar3.f38158g;
                                    aVar3 = aVar2;
                                    if (pVar4.f38179d == aVar3) {
                                        i26 = i24;
                                        if (pVar4.f38176a == 1) {
                                            i58 = gVar3.f38164m;
                                        }
                                    } else {
                                        i26 = i24;
                                    }
                                    if (z11) {
                                        i55 -= i58;
                                    } else {
                                        i55 += i58;
                                    }
                                    if (z11) {
                                        fVar4.d(i55);
                                    } else {
                                        fVar3.d(i55);
                                    }
                                    pVar4.f38181g = true;
                                    if (i56 < i38 && i56 < i6) {
                                        if (z11) {
                                            i55 -= -fVar3.f;
                                        } else {
                                            i55 += -fVar3.f;
                                        }
                                    }
                                }
                                i56++;
                                i24 = i26;
                                aVar2 = aVar3;
                            }
                            return;
                        }
                        e.a aVar5 = aVar2;
                        if (i19 == 0) {
                            int i59 = (i36 - i14) / (i13 + 1);
                            if (i12 > 0) {
                                i59 = 0;
                            }
                            int i60 = i18;
                            for (int i61 = 0; i61 < i15; i61++) {
                                if (z11) {
                                    i22 = i15 - (i61 + 1);
                                } else {
                                    i22 = i61;
                                }
                                p pVar5 = arrayList2.get(i22);
                                int i62 = pVar5.f38177b.f37376j0;
                                f fVar5 = pVar5.f38183i;
                                f fVar6 = pVar5.f38182h;
                                if (i62 == 8) {
                                    fVar6.d(i60);
                                    fVar5.d(i60);
                                } else {
                                    if (z11) {
                                        i23 = i60 - i59;
                                    } else {
                                        i23 = i60 + i59;
                                    }
                                    if (i61 > 0 && i61 >= i16) {
                                        if (z11) {
                                            i23 -= fVar6.f;
                                        } else {
                                            i23 += fVar6.f;
                                        }
                                    }
                                    if (z11) {
                                        fVar5.d(i23);
                                    } else {
                                        fVar6.d(i23);
                                    }
                                    g gVar4 = pVar5.f38180e;
                                    int i63 = gVar4.f38158g;
                                    if (pVar5.f38179d == aVar5 && pVar5.f38176a == 1) {
                                        i63 = Math.min(i63, gVar4.f38164m);
                                    }
                                    if (z11) {
                                        i60 = i23 - i63;
                                    } else {
                                        i60 = i23 + i63;
                                    }
                                    if (z11) {
                                        fVar6.d(i60);
                                    } else {
                                        fVar5.d(i60);
                                    }
                                    if (i61 < i38 && i61 < i6) {
                                        if (z11) {
                                            i60 -= -fVar5.f;
                                        } else {
                                            i60 += -fVar5.f;
                                        }
                                    }
                                }
                            }
                            return;
                        } else if (i19 == 2) {
                            if (this.f == 0) {
                                f2 = this.f38177b.f37370g0;
                            } else {
                                f2 = this.f38177b.f37372h0;
                            }
                            if (z11) {
                                f2 = 1.0f - f2;
                            }
                            int i64 = (((int) ((((float) (i36 - i14)) * f2) + 0.5f)) < 0 || i12 > 0) ? 0 : 0;
                            if (z11) {
                                i20 = i18 - i64;
                            } else {
                                i20 = i18 + i64;
                            }
                            for (int i65 = 0; i65 < i15; i65++) {
                                if (z11) {
                                    i21 = i15 - (i65 + 1);
                                } else {
                                    i21 = i65;
                                }
                                p pVar6 = arrayList2.get(i21);
                                int i66 = pVar6.f38177b.f37376j0;
                                f fVar7 = pVar6.f38183i;
                                f fVar8 = pVar6.f38182h;
                                if (i66 == 8) {
                                    fVar8.d(i20);
                                    fVar7.d(i20);
                                } else {
                                    if (i65 > 0 && i65 >= i16) {
                                        if (z11) {
                                            i20 -= fVar8.f;
                                        } else {
                                            i20 += fVar8.f;
                                        }
                                    }
                                    if (z11) {
                                        fVar7.d(i20);
                                    } else {
                                        fVar8.d(i20);
                                    }
                                    g gVar5 = pVar6.f38180e;
                                    int i67 = gVar5.f38158g;
                                    if (pVar6.f38179d == aVar5 && pVar6.f38176a == 1) {
                                        i67 = gVar5.f38164m;
                                    }
                                    i20 += i67;
                                    if (z11) {
                                        fVar8.d(i20);
                                    } else {
                                        fVar7.d(i20);
                                    }
                                    if (i65 < i38 && i65 < i6) {
                                        if (z11) {
                                            i20 -= -fVar7.f;
                                        } else {
                                            i20 += -fVar7.f;
                                        }
                                    }
                                }
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    z11 = z10;
                    aVar2 = aVar;
                    arrayList2 = arrayList;
                    i15 = i10;
                    i16 = i11;
                    i17 = 2;
                    i18 = i45;
                }
                if (i14 > i36) {
                }
                if (i13 > 0) {
                    this.f38145l = i17;
                }
                i19 = this.f38145l;
                if (i19 != 1) {
                }
            }
        }
    }

    @Override // y.p
    public final void d() {
        ArrayList<p> arrayList = this.f38144k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        x.e eVar = arrayList.get(0).f38177b;
        x.e eVar2 = arrayList.get(size - 1).f38177b;
        int i6 = this.f;
        f fVar = this.f38183i;
        f fVar2 = this.f38182h;
        if (i6 == 0) {
            x.d dVar = eVar.K;
            x.d dVar2 = eVar2.M;
            f i10 = p.i(dVar, 0);
            int e10 = dVar.e();
            x.e m10 = m();
            if (m10 != null) {
                e10 = m10.K.e();
            }
            if (i10 != null) {
                p.b(fVar2, i10, e10);
            }
            f i11 = p.i(dVar2, 0);
            int e11 = dVar2.e();
            x.e n10 = n();
            if (n10 != null) {
                e11 = n10.M.e();
            }
            if (i11 != null) {
                p.b(fVar, i11, -e11);
            }
        } else {
            x.d dVar3 = eVar.L;
            x.d dVar4 = eVar2.N;
            f i12 = p.i(dVar3, 1);
            int e12 = dVar3.e();
            x.e m11 = m();
            if (m11 != null) {
                e12 = m11.L.e();
            }
            if (i12 != null) {
                p.b(fVar2, i12, e12);
            }
            f i13 = p.i(dVar4, 1);
            int e13 = dVar4.e();
            x.e n11 = n();
            if (n11 != null) {
                e13 = n11.N.e();
            }
            if (i13 != null) {
                p.b(fVar, i13, -e13);
            }
        }
        fVar2.f38153a = this;
        fVar.f38153a = this;
    }

    @Override // y.p
    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f38144k;
            if (i6 < arrayList.size()) {
                arrayList.get(i6).e();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // y.p
    public final void f() {
        this.f38178c = null;
        Iterator<p> it = this.f38144k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // y.p
    public final long j() {
        ArrayList<p> arrayList = this.f38144k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = arrayList.get(i6);
            j10 = pVar.f38183i.f + pVar.j() + j10 + pVar.f38182h.f;
        }
        return j10;
    }

    @Override // y.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f38144k;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!arrayList.get(i6).k()) {
                return false;
            }
        }
        return true;
    }

    public final x.e m() {
        int i6 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f38144k;
            if (i6 < arrayList.size()) {
                x.e eVar = arrayList.get(i6).f38177b;
                if (eVar.f37376j0 != 8) {
                    return eVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final x.e n() {
        ArrayList<p> arrayList = this.f38144k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x.e eVar = arrayList.get(size).f38177b;
            if (eVar.f37376j0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator<p> it = this.f38144k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
