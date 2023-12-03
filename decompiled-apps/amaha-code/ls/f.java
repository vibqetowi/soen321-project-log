package ls;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ls.e;
import ss.p;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: ls.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0393a extends k implements p<f, b, f> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0393a f24520u = new C0393a();

            public C0393a() {
                super(2);
            }

            @Override // ss.p
            public final f invoke(f fVar, b bVar) {
                ls.c cVar;
                f acc = fVar;
                b element = bVar;
                i.g(acc, "acc");
                i.g(element, "element");
                f o10 = acc.o(element.getKey());
                g gVar = g.f24521u;
                if (o10 != gVar) {
                    int i6 = e.f24518n;
                    e.a aVar = e.a.f24519u;
                    e eVar = (e) o10.e(aVar);
                    if (eVar == null) {
                        cVar = new ls.c(element, o10);
                    } else {
                        f o11 = o10.o(aVar);
                        if (o11 == gVar) {
                            return new ls.c(eVar, element);
                        }
                        cVar = new ls.c(eVar, new ls.c(element, o11));
                    }
                    return cVar;
                }
                return element;
            }
        }

        public static f a(f fVar, f context) {
            i.g(context, "context");
            if (context != g.f24521u) {
                return (f) context.s(fVar, C0393a.f24520u);
            }
            return fVar;
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public interface b extends f {

        /* compiled from: CoroutineContext.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> key) {
                i.g(key, "key");
                if (!i.b(bVar.getKey(), key)) {
                    return null;
                }
                return bVar;
            }

            public static f b(b bVar, c<?> key) {
                i.g(key, "key");
                if (i.b(bVar.getKey(), key)) {
                    return g.f24521u;
                }
                return bVar;
            }
        }

        @Override // ls.f
        <E extends b> E e(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    <E extends b> E e(c<E> cVar);

    f h(f fVar);

    f o(c<?> cVar);

    <R> R s(R r, p<? super R, ? super b, ? extends R> pVar);
}
