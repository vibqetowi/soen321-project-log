package tr;

import tr.c;
/* compiled from: ClientInterceptors.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f33462a = 0;

    /* compiled from: ClientInterceptors.java */
    /* loaded from: classes2.dex */
    public static class b extends androidx.work.k {

        /* renamed from: b  reason: collision with root package name */
        public final androidx.work.k f33463b;

        /* renamed from: c  reason: collision with root package name */
        public final d f33464c;

        public b(androidx.work.k kVar, d dVar) {
            this.f33463b = kVar;
            sc.b.w(dVar, "interceptor");
            this.f33464c = dVar;
        }

        @Override // androidx.work.k
        public final String i() {
            return this.f33463b.i();
        }

        @Override // androidx.work.k
        public final <ReqT, RespT> c<ReqT, RespT> w(d0<ReqT, RespT> d0Var, io.grpc.b bVar) {
            return this.f33464c.a();
        }
    }

    static {
        new a();
    }

    /* compiled from: ClientInterceptors.java */
    /* loaded from: classes2.dex */
    public class a extends c<Object, Object> {
        @Override // tr.c
        public final void b() {
        }

        @Override // tr.c
        public final void c(int i6) {
        }

        @Override // tr.c
        public final void d(Object obj) {
        }

        @Override // tr.c
        public final void a(String str, Throwable th2) {
        }

        @Override // tr.c
        public final void e(c.a<Object> aVar, c0 c0Var) {
        }
    }
}
