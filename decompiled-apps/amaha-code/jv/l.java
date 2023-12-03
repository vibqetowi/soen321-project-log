package jv;

import ls.f;
/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class l<T> extends ns.c implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: u  reason: collision with root package name */
    public final kotlinx.coroutines.flow.e<T> f22676u;

    /* renamed from: v  reason: collision with root package name */
    public final ls.f f22677v;

    /* renamed from: w  reason: collision with root package name */
    public final int f22678w;

    /* renamed from: x  reason: collision with root package name */
    public ls.f f22679x;

    /* renamed from: y  reason: collision with root package name */
    public ls.d<? super hs.k> f22680y;

    /* compiled from: SafeCollector.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Integer, f.b, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22681u = new a();

        public a() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(Integer num, f.b bVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(kotlinx.coroutines.flow.e<? super T> eVar, ls.f fVar) {
        super(j.f22674u, ls.g.f24521u);
        this.f22676u = eVar;
        this.f22677v = fVar;
        this.f22678w = ((Number) fVar.s(0, a.f22681u)).intValue();
    }

    @Override // kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        try {
            Object f = f(dVar, t3);
            if (f == ms.a.COROUTINE_SUSPENDED) {
                return f;
            }
            return hs.k.f19476a;
        } catch (Throwable th2) {
            this.f22679x = new i(dVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object f(ls.d<? super hs.k> dVar, T t3) {
        ls.f context = dVar.getContext();
        sp.b.p(context);
        ls.f fVar = this.f22679x;
        if (fVar != context) {
            if (!(fVar instanceof i)) {
                if (((Number) context.s(0, new n(this))).intValue() == this.f22678w) {
                    this.f22679x = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f22677v + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(gv.j.u0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) fVar).f22672u + ", but then emission attempt of value '" + t3 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f22680y = dVar;
        Object invoke = m.f22682a.invoke(this.f22676u, t3, this);
        if (!kotlin.jvm.internal.i.b(invoke, ms.a.COROUTINE_SUSPENDED)) {
            this.f22680y = null;
        }
        return invoke;
    }

    @Override // ns.a, ns.d
    public final ns.d getCallerFrame() {
        ls.d<? super hs.k> dVar = this.f22680y;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // ns.c, ls.d
    public final ls.f getContext() {
        ls.f fVar = this.f22679x;
        if (fVar == null) {
            return ls.g.f24521u;
        }
        return fVar;
    }

    @Override // ns.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = hs.g.a(obj);
        if (a10 != null) {
            this.f22679x = new i(getContext(), a10);
        }
        ls.d<? super hs.k> dVar = this.f22680y;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return ms.a.COROUTINE_SUSPENDED;
    }

    @Override // ns.c, ns.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
