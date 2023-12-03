package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    l[] f21160a;

    /* renamed from: b  reason: collision with root package name */
    l f21161b = null;

    /* renamed from: c  reason: collision with root package name */
    p f21162c;

    /* renamed from: d  reason: collision with root package name */
    p f21163d;

    /* renamed from: e  reason: collision with root package name */
    int f21164e;
    int f;

    /* renamed from: g  reason: collision with root package name */
    int f21165g;

    /* renamed from: h  reason: collision with root package name */
    final int f21166h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l[] lVarArr, int i6, int i10, int i11) {
        this.f21160a = lVarArr;
        this.f21166h = i6;
        this.f21164e = i10;
        this.f = i10;
        this.f21165g = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l a() {
        l[] lVarArr;
        int length;
        int i6;
        p pVar;
        l lVar = this.f21161b;
        if (lVar != null) {
            lVar = lVar.f21155d;
        }
        while (lVar == null) {
            if (this.f >= this.f21165g || (lVarArr = this.f21160a) == null || (length = lVarArr.length) <= (i6 = this.f21164e) || i6 < 0) {
                this.f21161b = null;
                return null;
            }
            l l2 = ConcurrentHashMap.l(lVarArr, i6);
            if (l2 == null || l2.f21152a >= 0) {
                lVar = l2;
            } else if (l2 instanceof g) {
                this.f21160a = ((g) l2).f21145e;
                p pVar2 = this.f21163d;
                if (pVar2 != null) {
                    this.f21163d = pVar2.f21159d;
                } else {
                    pVar2 = new p();
                }
                pVar2.f21158c = lVarArr;
                pVar2.f21156a = length;
                pVar2.f21157b = i6;
                pVar2.f21159d = this.f21162c;
                this.f21162c = pVar2;
                lVar = null;
            } else {
                lVar = l2 instanceof r ? ((r) l2).f : null;
            }
            if (this.f21162c != null) {
                while (true) {
                    pVar = this.f21162c;
                    if (pVar == null) {
                        break;
                    }
                    int i10 = this.f21164e;
                    int i11 = pVar.f21156a;
                    int i12 = i10 + i11;
                    this.f21164e = i12;
                    if (i12 < length) {
                        break;
                    }
                    this.f21164e = pVar.f21157b;
                    this.f21160a = pVar.f21158c;
                    pVar.f21158c = null;
                    p pVar3 = pVar.f21159d;
                    pVar.f21159d = this.f21163d;
                    this.f21162c = pVar3;
                    this.f21163d = pVar;
                    length = i11;
                }
                if (pVar == null) {
                    int i13 = this.f21164e + this.f21166h;
                    this.f21164e = i13;
                    if (i13 >= length) {
                        int i14 = this.f + 1;
                        this.f = i14;
                        this.f21164e = i14;
                    }
                }
            } else {
                int i15 = i6 + this.f21166h;
                this.f21164e = i15;
                if (i15 >= length) {
                    int i16 = this.f + 1;
                    this.f = i16;
                    this.f21164e = i16;
                }
            }
        }
        this.f21161b = lVar;
        return lVar;
    }
}
