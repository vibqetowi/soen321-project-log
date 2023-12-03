package kotlinx.coroutines.internal;

import kotlinx.coroutines.s1;
import ls.f;
/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final r f23617a = new r("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final a f23618b = a.f23621u;

    /* renamed from: c  reason: collision with root package name */
    public static final b f23619c = b.f23622u;

    /* renamed from: d  reason: collision with root package name */
    public static final c f23620d = c.f23623u;

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Object, f.b, Object> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f23621u = new a();

        public a() {
            super(2);
        }

        @Override // ss.p
        public final Object invoke(Object obj, f.b bVar) {
            Integer num;
            int i6;
            f.b bVar2 = bVar;
            if (bVar2 instanceof s1) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 1;
                }
                if (i6 == 0) {
                    return bVar2;
                }
                return Integer.valueOf(i6 + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.p<s1<?>, f.b, s1<?>> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f23622u = new b();

        public b() {
            super(2);
        }

        @Override // ss.p
        public final s1<?> invoke(s1<?> s1Var, f.b bVar) {
            s1<?> s1Var2 = s1Var;
            f.b bVar2 = bVar;
            if (s1Var2 == null) {
                if (bVar2 instanceof s1) {
                    return (s1) bVar2;
                }
                return null;
            }
            return s1Var2;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.p<w, f.b, w> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f23623u = new c();

        public c() {
            super(2);
        }

        @Override // ss.p
        public final w invoke(w wVar, f.b bVar) {
            w wVar2 = wVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof s1) {
                s1<Object> s1Var = (s1) bVar2;
                String B0 = s1Var.B0(wVar2.f23625a);
                int i6 = wVar2.f23628d;
                wVar2.f23626b[i6] = B0;
                wVar2.f23628d = i6 + 1;
                wVar2.f23627c[i6] = s1Var;
            }
            return wVar2;
        }
    }

    public static final void a(ls.f fVar, Object obj) {
        if (obj == f23617a) {
            return;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            s1<Object>[] s1VarArr = wVar.f23627c;
            int length = s1VarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i6 = length - 1;
                s1<Object> s1Var = s1VarArr[length];
                kotlin.jvm.internal.i.d(s1Var);
                s1Var.p0(wVar.f23626b[length]);
                if (i6 >= 0) {
                    length = i6;
                } else {
                    return;
                }
            }
        } else {
            Object s10 = fVar.s(null, f23619c);
            if (s10 != null) {
                ((s1) s10).p0(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(ls.f fVar) {
        Object s10 = fVar.s(0, f23618b);
        kotlin.jvm.internal.i.d(s10);
        return s10;
    }

    public static final Object c(ls.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f23617a;
        }
        if (obj instanceof Integer) {
            return fVar.s(new w(fVar, ((Number) obj).intValue()), f23620d);
        }
        return ((s1) obj).B0(fVar);
    }
}
