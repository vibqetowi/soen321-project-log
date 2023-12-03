package pu;

import java.util.Collection;
import pu.i;
/* compiled from: ResolutionScope.kt */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: ResolutionScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static Collection a(k kVar, d dVar, int i6) {
            i.a.C0490a c0490a;
            if ((i6 & 1) != 0) {
                dVar = d.f28985m;
            }
            if ((i6 & 2) != 0) {
                i.f29004a.getClass();
                c0490a = i.a.f29006b;
            } else {
                c0490a = null;
            }
            return kVar.f(dVar, c0490a);
        }
    }

    Collection<gt.j> f(d dVar, ss.l<? super fu.e, Boolean> lVar);

    gt.g g(fu.e eVar, ot.c cVar);
}
