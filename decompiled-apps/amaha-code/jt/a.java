package jt;

import is.w;
import java.util.Collection;
import kotlin.jvm.internal.i;
/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: jt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0345a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0345a f22623a = new C0345a();

        @Override // jt.a
        public final Collection a(uu.d dVar) {
            return w.f20676u;
        }

        @Override // jt.a
        public final Collection b(uu.d classDescriptor) {
            i.g(classDescriptor, "classDescriptor");
            return w.f20676u;
        }

        @Override // jt.a
        public final Collection c(fu.e name, uu.d classDescriptor) {
            i.g(name, "name");
            i.g(classDescriptor, "classDescriptor");
            return w.f20676u;
        }

        @Override // jt.a
        public final Collection e(uu.d classDescriptor) {
            i.g(classDescriptor, "classDescriptor");
            return w.f20676u;
        }
    }

    Collection a(uu.d dVar);

    Collection b(uu.d dVar);

    Collection c(fu.e eVar, uu.d dVar);

    Collection e(uu.d dVar);
}
