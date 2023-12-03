package dw;

import lv.e;
/* compiled from: HttpServiceMethod.java */
/* loaded from: classes2.dex */
public abstract class i<ResponseT, ReturnT> extends b0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final y f13568a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a f13569b;

    /* renamed from: c  reason: collision with root package name */
    public final f<lv.e0, ResponseT> f13570c;

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes2.dex */
    public static final class a<ResponseT, ReturnT> extends i<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final dw.c<ResponseT, ReturnT> f13571d;

        public a(y yVar, e.a aVar, f<lv.e0, ResponseT> fVar, dw.c<ResponseT, ReturnT> cVar) {
            super(yVar, aVar, fVar);
            this.f13571d = cVar;
        }

        @Override // dw.i
        public final Object c(r rVar, Object[] objArr) {
            return this.f13571d.a(rVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes2.dex */
    public static final class b<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final dw.c<ResponseT, dw.b<ResponseT>> f13572d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13573e;

        public b(y yVar, e.a aVar, f fVar, dw.c cVar) {
            super(yVar, aVar, fVar);
            this.f13572d = cVar;
            this.f13573e = false;
        }

        @Override // dw.i
        public final Object c(r rVar, Object[] objArr) {
            dw.b bVar = (dw.b) this.f13572d.a(rVar);
            ls.d dVar = (ls.d) objArr[objArr.length - 1];
            try {
                if (this.f13573e) {
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
                    kVar.p(new l(bVar));
                    bVar.I(new n(kVar));
                    return kVar.s();
                }
                kotlinx.coroutines.k kVar2 = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
                kVar2.p(new k(bVar));
                bVar.I(new m(kVar2));
                return kVar2.s();
            } catch (Exception e10) {
                return q.a(e10, dVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes2.dex */
    public static final class c<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final dw.c<ResponseT, dw.b<ResponseT>> f13574d;

        public c(y yVar, e.a aVar, f<lv.e0, ResponseT> fVar, dw.c<ResponseT, dw.b<ResponseT>> cVar) {
            super(yVar, aVar, fVar);
            this.f13574d = cVar;
        }

        @Override // dw.i
        public final Object c(r rVar, Object[] objArr) {
            dw.b bVar = (dw.b) this.f13574d.a(rVar);
            ls.d dVar = (ls.d) objArr[objArr.length - 1];
            try {
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
                kVar.p(new o(bVar));
                bVar.I(new p(kVar));
                return kVar.s();
            } catch (Exception e10) {
                return q.a(e10, dVar);
            }
        }
    }

    public i(y yVar, e.a aVar, f<lv.e0, ResponseT> fVar) {
        this.f13568a = yVar;
        this.f13569b = aVar;
        this.f13570c = fVar;
    }

    @Override // dw.b0
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new r(this.f13568a, objArr, this.f13569b, this.f13570c), objArr);
    }

    public abstract Object c(r rVar, Object[] objArr);
}
