package dv;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ss.l;
/* compiled from: DFS.java */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: DFS.java */
    /* renamed from: dv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0206b<N> {
        Iterable<? extends N> m(N n10);
    }

    /* compiled from: DFS.java */
    /* loaded from: classes2.dex */
    public interface c<N, R> {
        R a();

        void b(N n10);

        boolean c(N n10);
    }

    /* compiled from: DFS.java */
    /* loaded from: classes2.dex */
    public static class d<N> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<N> f13505a = new HashSet();
    }

    public static /* synthetic */ void a(int i6) {
        Object[] objArr = new Object[3];
        switch (i6) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i6) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(List list, InterfaceC0206b interfaceC0206b, a aVar) {
        d dVar = new d();
        for (Object obj : list) {
            c(obj, interfaceC0206b, dVar, aVar);
        }
        return aVar.a();
    }

    public static void c(Object obj, InterfaceC0206b interfaceC0206b, d dVar, a aVar) {
        if (obj != null) {
            if (!dVar.f13505a.add(obj) || !aVar.c(obj)) {
                return;
            }
            for (Object obj2 : interfaceC0206b.m(obj)) {
                c(obj2, interfaceC0206b, dVar, aVar);
            }
            aVar.b(obj);
            return;
        }
        a(22);
        throw null;
    }

    public static Boolean d(List list, InterfaceC0206b interfaceC0206b, l lVar) {
        if (lVar != null) {
            return (Boolean) b(list, interfaceC0206b, new dv.a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }

    /* compiled from: DFS.java */
    /* loaded from: classes2.dex */
    public static abstract class a<N, R> implements c<N, R> {
        @Override // dv.b.c
        public void b(N n10) {
        }
    }
}
