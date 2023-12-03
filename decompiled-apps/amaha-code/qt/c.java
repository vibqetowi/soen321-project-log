package qt;

import dt.n;
import is.e0;
import java.util.Map;
import pt.d0;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final fu.e f30116a = fu.e.j("message");

    /* renamed from: b  reason: collision with root package name */
    public static final fu.e f30117b = fu.e.j("allowedTargets");

    /* renamed from: c  reason: collision with root package name */
    public static final fu.e f30118c = fu.e.j("value");

    /* renamed from: d  reason: collision with root package name */
    public static final Map<fu.c, fu.c> f30119d = e0.u0(new hs.f(n.a.f13414t, d0.f28872c), new hs.f(n.a.f13417w, d0.f28873d), new hs.f(n.a.f13418x, d0.f));

    public static rt.g a(fu.c kotlinName, wt.d annotationOwner, q.f c10) {
        wt.a l2;
        kotlin.jvm.internal.i.g(kotlinName, "kotlinName");
        kotlin.jvm.internal.i.g(annotationOwner, "annotationOwner");
        kotlin.jvm.internal.i.g(c10, "c");
        if (kotlin.jvm.internal.i.b(kotlinName, n.a.f13408m)) {
            fu.c DEPRECATED_ANNOTATION = d0.f28874e;
            kotlin.jvm.internal.i.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            wt.a l10 = annotationOwner.l(DEPRECATED_ANNOTATION);
            if (l10 == null) {
                annotationOwner.o();
            } else {
                return new f(l10, c10);
            }
        }
        fu.c cVar = f30119d.get(kotlinName);
        if (cVar != null && (l2 = annotationOwner.l(cVar)) != null) {
            return b(c10, l2, false);
        }
        return null;
    }

    public static rt.g b(q.f c10, wt.a annotation, boolean z10) {
        kotlin.jvm.internal.i.g(annotation, "annotation");
        kotlin.jvm.internal.i.g(c10, "c");
        fu.b g5 = annotation.g();
        if (kotlin.jvm.internal.i.b(g5, fu.b.l(d0.f28872c))) {
            return new j(annotation, c10);
        }
        if (kotlin.jvm.internal.i.b(g5, fu.b.l(d0.f28873d))) {
            return new i(annotation, c10);
        }
        if (kotlin.jvm.internal.i.b(g5, fu.b.l(d0.f))) {
            return new b(c10, annotation, n.a.f13418x);
        }
        if (kotlin.jvm.internal.i.b(g5, fu.b.l(d0.f28874e))) {
            return null;
        }
        return new tt.d(c10, annotation, z10);
    }
}
