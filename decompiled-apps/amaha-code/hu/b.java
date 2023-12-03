package hu;

import gt.d0;
import gt.v0;
import java.util.ArrayList;
/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19525a = new a();

        @Override // hu.b
        public final String a(gt.g gVar, hu.c renderer) {
            kotlin.jvm.internal.i.g(renderer, "renderer");
            if (gVar instanceof v0) {
                fu.e name = ((v0) gVar).getName();
                kotlin.jvm.internal.i.f(name, "classifier.name");
                return renderer.t(name, false);
            }
            fu.d g5 = iu.g.g(gVar);
            kotlin.jvm.internal.i.f(g5, "getFqName(classifier)");
            return renderer.s(g5);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: hu.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0294b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0294b f19526a = new C0294b();

        @Override // hu.b
        public final String a(gt.g gVar, hu.c renderer) {
            boolean z10;
            kotlin.jvm.internal.i.g(renderer, "renderer");
            if (gVar instanceof v0) {
                fu.e name = ((v0) gVar).getName();
                kotlin.jvm.internal.i.f(name, "classifier.name");
                return renderer.t(name, false);
            }
            ArrayList arrayList = new ArrayList();
            gt.g gVar2 = gVar;
            do {
                arrayList.add(gVar2.getName());
                gt.j c10 = gVar2.c();
                z10 = c10 instanceof gt.e;
                gVar2 = c10;
            } while (z10);
            return kotlin.jvm.internal.h.a0(is.q.S1(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19527a = new c();

        public static String b(gt.g gVar) {
            String str;
            fu.e name = gVar.getName();
            kotlin.jvm.internal.i.f(name, "descriptor.name");
            String Z = kotlin.jvm.internal.h.Z(name);
            if (gVar instanceof v0) {
                return Z;
            }
            gt.j c10 = gVar.c();
            kotlin.jvm.internal.i.f(c10, "descriptor.containingDeclaration");
            if (c10 instanceof gt.e) {
                str = b((gt.g) c10);
            } else if (c10 instanceof d0) {
                fu.d i6 = ((d0) c10).e().i();
                kotlin.jvm.internal.i.f(i6, "descriptor.fqName.toUnsafe()");
                str = kotlin.jvm.internal.h.a0(i6.f());
            } else {
                str = null;
            }
            if (str != null && !kotlin.jvm.internal.i.b(str, "")) {
                return str + '.' + Z;
            }
            return Z;
        }

        @Override // hu.b
        public final String a(gt.g gVar, hu.c renderer) {
            kotlin.jvm.internal.i.g(renderer, "renderer");
            return b(gVar);
        }
    }

    String a(gt.g gVar, hu.c cVar);
}
