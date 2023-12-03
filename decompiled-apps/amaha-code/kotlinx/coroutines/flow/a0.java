package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Share.kt */
/* loaded from: classes2.dex */
public final class a0<T> implements e<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, jv.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k a(ls.d dVar) {
        z zVar;
        ?? r12;
        try {
            if (dVar instanceof z) {
                zVar = (z) dVar;
                int i6 = zVar.f23574y;
                if ((i6 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    zVar.f23574y = i6 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = zVar.f23572w;
                    r12 = zVar.f23574y;
                    if (r12 == 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                sp.b.d0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            jv.l lVar = zVar.f23571v;
                            a0 a0Var = zVar.f23570u;
                            sp.b.d0(obj);
                            lVar.releaseIntercepted();
                            a0Var.getClass();
                        }
                        return hs.k.f19476a;
                    }
                    sp.b.d0(obj);
                    jv.l lVar2 = new jv.l(null, zVar.getContext());
                    zVar.f23570u = this;
                    zVar.f23571v = lVar2;
                    zVar.f23574y = 1;
                    throw null;
                }
            }
            if (r12 == 0) {
            }
        } catch (Throwable th2) {
            r12.releaseIntercepted();
            throw th2;
        }
        zVar = new z(this, dVar);
        Object obj2 = zVar.f23572w;
        r12 = zVar.f23574y;
    }

    @Override // kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        throw null;
    }
}
