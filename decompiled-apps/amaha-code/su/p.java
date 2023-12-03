package su;

import java.util.Iterator;
/* compiled from: DeserializedClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    public final gt.e0 f32065a;

    public p(gt.e0 packageFragmentProvider) {
        kotlin.jvm.internal.i.g(packageFragmentProvider, "packageFragmentProvider");
        this.f32065a = packageFragmentProvider;
    }

    @Override // su.i
    public final h a(fu.b classId) {
        h a10;
        kotlin.jvm.internal.i.g(classId, "classId");
        fu.c h10 = classId.h();
        kotlin.jvm.internal.i.f(h10, "classId.packageFqName");
        Iterator it = kotlin.jvm.internal.h.U(this.f32065a, h10).iterator();
        while (it.hasNext()) {
            gt.d0 d0Var = (gt.d0) it.next();
            if ((d0Var instanceof q) && (a10 = ((q) d0Var).I0().a(classId)) != null) {
                return a10;
            }
        }
        return null;
    }
}
