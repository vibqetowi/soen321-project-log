package jv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import is.u;
import java.util.ArrayList;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes2.dex */
public abstract class e<T> implements kotlinx.coroutines.flow.d {

    /* renamed from: u  reason: collision with root package name */
    public final ls.f f22646u;

    /* renamed from: v  reason: collision with root package name */
    public final int f22647v;

    /* renamed from: w  reason: collision with root package name */
    public final iv.e f22648w;

    public e(ls.f fVar, int i6, iv.e eVar) {
        this.f22646u = fVar;
        this.f22647v = i6;
        this.f22648w = eVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, ls.d<? super hs.k> dVar) {
        c cVar = new c(null, eVar, this);
        kotlinx.coroutines.internal.p pVar = new kotlinx.coroutines.internal.p(dVar, dVar.getContext());
        Object Z = sp.b.Z(pVar, pVar, cVar);
        if (Z != ms.a.COROUTINE_SUSPENDED) {
            return hs.k.f19476a;
        }
        return Z;
    }

    public abstract Object c(iv.q<? super T> qVar, ls.d<? super hs.k> dVar);

    public abstract e<T> d(ls.f fVar, int i6, iv.e eVar);

    public final kotlinx.coroutines.flow.d<T> e(ls.f fVar, int i6, iv.e eVar) {
        ls.f fVar2 = this.f22646u;
        ls.f h10 = fVar.h(fVar2);
        iv.e eVar2 = iv.e.SUSPEND;
        iv.e eVar3 = this.f22648w;
        int i10 = this.f22647v;
        if (eVar == eVar2) {
            if (i10 != -3) {
                if (i6 != -3) {
                    if (i10 != -2) {
                        if (i6 != -2) {
                            i6 += i10;
                            if (i6 < 0) {
                                i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                            }
                        }
                    }
                }
                i6 = i10;
            }
            eVar = eVar3;
        }
        if (kotlin.jvm.internal.i.b(h10, fVar2) && i6 == i10 && eVar == eVar3) {
            return this;
        }
        return d(h10, i6, eVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        ls.g gVar = ls.g.f24521u;
        ls.f fVar = this.f22646u;
        if (fVar != gVar) {
            arrayList.add("context=" + fVar);
        }
        int i6 = this.f22647v;
        if (i6 != -3) {
            arrayList.add("capacity=" + i6);
        }
        iv.e eVar = iv.e.SUSPEND;
        iv.e eVar2 = this.f22648w;
        if (eVar2 != eVar) {
            arrayList.add("onBufferOverflow=" + eVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return v.g.c(sb2, u.m2(arrayList, ", ", null, null, null, 62), ']');
    }
}
