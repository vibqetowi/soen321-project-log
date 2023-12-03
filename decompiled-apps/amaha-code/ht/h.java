package ht;

import is.v;
import java.util.Iterator;
/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public interface h extends Iterable<c>, ts.a {

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0293a f19495a = new C0293a();

        /* compiled from: Annotations.kt */
        /* renamed from: ht.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0293a implements h {
            @Override // ht.h
            public final boolean H(fu.c cVar) {
                return b.b(this, cVar);
            }

            @Override // ht.h
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<c> iterator() {
                return v.f20675u;
            }

            @Override // ht.h
            public final c l(fu.c fqName) {
                kotlin.jvm.internal.i.g(fqName, "fqName");
                return null;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static c a(h hVar, fu.c fqName) {
            c cVar;
            kotlin.jvm.internal.i.g(fqName, "fqName");
            Iterator<c> it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    cVar = it.next();
                    if (kotlin.jvm.internal.i.b(cVar.e(), fqName)) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            return cVar;
        }

        public static boolean b(h hVar, fu.c fqName) {
            kotlin.jvm.internal.i.g(fqName, "fqName");
            if (hVar.l(fqName) != null) {
                return true;
            }
            return false;
        }
    }

    boolean H(fu.c cVar);

    boolean isEmpty();

    c l(fu.c cVar);
}
