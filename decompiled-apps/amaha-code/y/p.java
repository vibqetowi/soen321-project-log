package y;

import x.e;
/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f38176a;

    /* renamed from: b  reason: collision with root package name */
    public x.e f38177b;

    /* renamed from: c  reason: collision with root package name */
    public m f38178c;

    /* renamed from: d  reason: collision with root package name */
    public e.a f38179d;

    /* renamed from: e  reason: collision with root package name */
    public final g f38180e = new g(this);
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f38181g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f38182h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f38183i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f38184j = 1;

    public p(x.e eVar) {
        this.f38177b = eVar;
    }

    public static void b(f fVar, f fVar2, int i6) {
        fVar.f38163l.add(fVar2);
        fVar.f = i6;
        fVar2.f38162k.add(fVar);
    }

    public static f h(x.d dVar) {
        x.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        int ordinal = dVar2.f37350e.ordinal();
        x.e eVar = dVar2.f37349d;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return eVar.f37367e.f38169k;
                    }
                    return eVar.f37367e.f38183i;
                }
                return eVar.f37365d.f38183i;
            }
            return eVar.f37367e.f38182h;
        }
        return eVar.f37365d.f38182h;
    }

    public static f i(x.d dVar, int i6) {
        p pVar;
        x.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        x.e eVar = dVar2.f37349d;
        if (i6 == 0) {
            pVar = eVar.f37365d;
        } else {
            pVar = eVar.f37367e;
        }
        int ordinal = dVar2.f37350e.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                return null;
            }
            return pVar.f38183i;
        }
        return pVar.f38182h;
    }

    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f38163l.add(fVar2);
        fVar.f38163l.add(this.f38180e);
        fVar.f38159h = i6;
        fVar.f38160i = gVar;
        fVar2.f38162k.add(fVar);
        gVar.f38162k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i6, int i10) {
        int max;
        if (i10 == 0) {
            x.e eVar = this.f38177b;
            int i11 = eVar.f37400w;
            max = Math.max(eVar.f37398v, i6);
            if (i11 > 0) {
                max = Math.min(i11, i6);
            }
            if (max == i6) {
                return i6;
            }
        } else {
            x.e eVar2 = this.f38177b;
            int i12 = eVar2.f37403z;
            max = Math.max(eVar2.f37402y, i6);
            if (i12 > 0) {
                max = Math.min(i12, i6);
            }
            if (max == i6) {
                return i6;
            }
        }
        return max;
    }

    public long j() {
        g gVar = this.f38180e;
        if (gVar.f38161j) {
            return gVar.f38158g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.f38176a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(x.d dVar, x.d dVar2, int i6) {
        float f;
        p pVar;
        float f2;
        int i10;
        f h10 = h(dVar);
        f h11 = h(dVar2);
        if (h10.f38161j && h11.f38161j) {
            int e10 = dVar.e() + h10.f38158g;
            int e11 = h11.f38158g - dVar2.e();
            int i11 = e11 - e10;
            g gVar = this.f38180e;
            if (!gVar.f38161j) {
                e.a aVar = this.f38179d;
                e.a aVar2 = e.a.MATCH_CONSTRAINT;
                if (aVar == aVar2) {
                    int i12 = this.f38176a;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    x.e eVar = this.f38177b;
                                    p pVar2 = eVar.f37365d;
                                    if (pVar2.f38179d == aVar2 && pVar2.f38176a == 3) {
                                        n nVar = eVar.f37367e;
                                        if (nVar.f38179d == aVar2) {
                                        }
                                    }
                                    if (i6 == 0) {
                                        pVar2 = eVar.f37367e;
                                    }
                                    g gVar2 = pVar2.f38180e;
                                    if (gVar2.f38161j) {
                                        float f10 = eVar.Z;
                                        if (i6 == 1) {
                                            i10 = (int) ((gVar2.f38158g / f10) + 0.5f);
                                        } else {
                                            i10 = (int) ((f10 * gVar2.f38158g) + 0.5f);
                                        }
                                        gVar.d(i10);
                                    }
                                }
                            } else {
                                x.e eVar2 = this.f38177b;
                                x.e eVar3 = eVar2.W;
                                if (eVar3 != null) {
                                    if (i6 == 0) {
                                        pVar = eVar3.f37365d;
                                    } else {
                                        pVar = eVar3.f37367e;
                                    }
                                    g gVar3 = pVar.f38180e;
                                    if (gVar3.f38161j) {
                                        if (i6 == 0) {
                                            f2 = eVar2.f37401x;
                                        } else {
                                            f2 = eVar2.A;
                                        }
                                        gVar.d(g((int) ((gVar3.f38158g * f2) + 0.5f), i6));
                                    }
                                }
                            }
                        } else {
                            gVar.d(Math.min(g(gVar.f38164m, i6), i11));
                        }
                    } else {
                        gVar.d(g(i11, i6));
                    }
                }
            }
            if (!gVar.f38161j) {
                return;
            }
            int i13 = gVar.f38158g;
            f fVar = this.f38183i;
            f fVar2 = this.f38182h;
            if (i13 == i11) {
                fVar2.d(e10);
                fVar.d(e11);
                return;
            }
            x.e eVar4 = this.f38177b;
            if (i6 == 0) {
                f = eVar4.f37370g0;
            } else {
                f = eVar4.f37372h0;
            }
            if (h10 == h11) {
                e10 = h10.f38158g;
                e11 = h11.f38158g;
                f = 0.5f;
            }
            fVar2.d((int) ((((e11 - e10) - i13) * f) + e10 + 0.5f));
            fVar.d(fVar2.f38158g + gVar.f38158g);
        }
    }

    @Override // y.d
    public void a(d dVar) {
    }
}
