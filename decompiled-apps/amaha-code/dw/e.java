package dw;

import dw.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;
/* compiled from: CompletableFutureCallAdapterFactory.java */
/* loaded from: classes2.dex */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13548a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class a<R> implements dw.c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f13549a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* renamed from: dw.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0209a implements d<R> {

            /* renamed from: u  reason: collision with root package name */
            public final CompletableFuture<R> f13550u;

            public C0209a(b bVar) {
                this.f13550u = bVar;
            }

            @Override // dw.d
            public final void onFailure(dw.b<R> bVar, Throwable th2) {
                this.f13550u.completeExceptionally(th2);
            }

            @Override // dw.d
            public final void onResponse(dw.b<R> bVar, z<R> zVar) {
                boolean a10 = zVar.a();
                CompletableFuture<R> completableFuture = this.f13550u;
                if (a10) {
                    completableFuture.complete(zVar.f13696b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(zVar));
                }
            }
        }

        public a(Type type) {
            this.f13549a = type;
        }

        @Override // dw.c
        public final Object a(r rVar) {
            b bVar = new b(rVar);
            rVar.I(new C0209a(bVar));
            return bVar;
        }

        @Override // dw.c
        public final Type b() {
            return this.f13549a;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: u  reason: collision with root package name */
        public final dw.b<?> f13551u;

        public b(r rVar) {
            this.f13551u = rVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f13551u.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class c<R> implements dw.c<R, CompletableFuture<z<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f13552a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* loaded from: classes2.dex */
        public class a implements d<R> {

            /* renamed from: u  reason: collision with root package name */
            public final CompletableFuture<z<R>> f13553u;

            public a(b bVar) {
                this.f13553u = bVar;
            }

            @Override // dw.d
            public final void onFailure(dw.b<R> bVar, Throwable th2) {
                this.f13553u.completeExceptionally(th2);
            }

            @Override // dw.d
            public final void onResponse(dw.b<R> bVar, z<R> zVar) {
                this.f13553u.complete(zVar);
            }
        }

        public c(Type type) {
            this.f13552a = type;
        }

        @Override // dw.c
        public final Object a(r rVar) {
            b bVar = new b(rVar);
            rVar.I(new a(bVar));
            return bVar;
        }

        @Override // dw.c
        public final Type b() {
            return this.f13552a;
        }
    }

    @Override // dw.c.a
    public final dw.c a(Type type, Annotation[] annotationArr) {
        if (e0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = e0.d(0, (ParameterizedType) type);
            if (e0.e(d10) != z.class) {
                return new a(d10);
            }
            if (d10 instanceof ParameterizedType) {
                return new c(e0.d(0, (ParameterizedType) d10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
