package iv;

import iv.b;
import java.util.ArrayList;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: LinkedListChannel.kt */
/* loaded from: classes2.dex */
public final class m extends a {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f20755x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i6, ss.l lVar) {
        super(lVar);
        this.f20755x = i6;
    }

    @Override // iv.b
    public final boolean i() {
        switch (this.f20755x) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // iv.b
    public final boolean j() {
        switch (this.f20755x) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // iv.b
    public final Object k(Object obj) {
        t tVar;
        switch (this.f20755x) {
            case 0:
                break;
            default:
                return super.k(obj);
        }
        do {
            Object k10 = super.k(obj);
            kotlinx.coroutines.internal.r rVar = tr.r.e0;
            if (k10 != rVar) {
                if (k10 == tr.r.f33547f0) {
                    kotlinx.coroutines.internal.f fVar = this.f20732v;
                    b.a aVar = new b.a(obj);
                    while (true) {
                        kotlinx.coroutines.internal.g s10 = fVar.s();
                        if (s10 instanceof t) {
                            tVar = (t) s10;
                        } else if (s10.k(aVar, fVar)) {
                            tVar = null;
                        }
                    }
                    if (tVar == null) {
                    }
                } else if (k10 instanceof k) {
                    return k10;
                } else {
                    throw new IllegalStateException(("Invalid offerInternal result " + k10).toString());
                }
            }
            return rVar;
        } while (!(tVar instanceof k));
        return tVar;
    }

    @Override // iv.a
    public final boolean s() {
        return true;
    }

    @Override // iv.a
    public final boolean t() {
        return true;
    }

    @Override // iv.a
    public final void w(Object obj, k kVar) {
        switch (this.f20755x) {
            case 0:
                UndeliveredElementException undeliveredElementException = null;
                if (obj != null) {
                    boolean z10 = obj instanceof ArrayList;
                    ss.l<E, hs.k> lVar = this.f20731u;
                    if (!z10) {
                        u uVar = (u) obj;
                        if (uVar instanceof b.a) {
                            if (lVar != 0) {
                                undeliveredElementException = kc.f.l(lVar, ((b.a) uVar).f20733x, null);
                            }
                        } else {
                            uVar.D(kVar);
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) obj;
                        UndeliveredElementException undeliveredElementException2 = null;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            u uVar2 = (u) arrayList.get(size);
                            if (uVar2 instanceof b.a) {
                                if (lVar != 0) {
                                    undeliveredElementException2 = kc.f.l(lVar, ((b.a) uVar2).f20733x, undeliveredElementException2);
                                } else {
                                    undeliveredElementException2 = null;
                                }
                            } else {
                                uVar2.D(kVar);
                            }
                        }
                        undeliveredElementException = undeliveredElementException2;
                    }
                }
                if (undeliveredElementException == null) {
                    return;
                }
                throw undeliveredElementException;
            default:
                super.w(obj, kVar);
                return;
        }
    }
}
