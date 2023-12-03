package m4;

import k4.m;
import k4.v;
import m4.h;
/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public final class g extends d5.g<h4.e, v<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f24818d;

    public g(long j10) {
        super(j10);
    }

    @Override // d5.g
    public final int b(v<?> vVar) {
        v<?> vVar2 = vVar;
        if (vVar2 == null) {
            return 1;
        }
        return vVar2.a();
    }

    @Override // d5.g
    public final void c(h4.e eVar, v<?> vVar) {
        v<?> vVar2 = vVar;
        h.a aVar = this.f24818d;
        if (aVar != null && vVar2 != null) {
            ((m) aVar).f22886e.a(vVar2, true);
        }
    }
}
