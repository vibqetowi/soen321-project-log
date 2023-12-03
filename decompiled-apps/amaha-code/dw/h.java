package dw;

import dw.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes2.dex */
public final class h extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f13563a;

    /* compiled from: DefaultCallAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: u  reason: collision with root package name */
        public final Executor f13564u;

        /* renamed from: v  reason: collision with root package name */
        public final b<T> f13565v;

        /* compiled from: DefaultCallAdapterFactory.java */
        /* renamed from: dw.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0210a implements d<T> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ d f13566u;

            public C0210a(d dVar) {
                this.f13566u = dVar;
            }

            @Override // dw.d
            public final void onFailure(b<T> bVar, Throwable th2) {
                a.this.f13564u.execute(new ni.c(16, this, this.f13566u, th2));
            }

            @Override // dw.d
            public final void onResponse(b<T> bVar, z<T> zVar) {
                a.this.f13564u.execute(new ni.c(15, this, this.f13566u, zVar));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f13564u = executor;
            this.f13565v = bVar;
        }

        @Override // dw.b
        public final void I(d<T> dVar) {
            this.f13565v.I(new C0210a(dVar));
        }

        @Override // dw.b
        public final void cancel() {
            this.f13565v.cancel();
        }

        @Override // dw.b
        public final z<T> g() {
            return this.f13565v.g();
        }

        @Override // dw.b
        public final boolean o() {
            return this.f13565v.o();
        }

        @Override // dw.b
        public final lv.z s() {
            return this.f13565v.s();
        }

        @Override // dw.b
        public final b<T> clone() {
            return new a(this.f13564u, this.f13565v.clone());
        }
    }

    public h(Executor executor) {
        this.f13563a = executor;
    }

    @Override // dw.c.a
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (e0.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = e0.d(0, (ParameterizedType) type);
            if (!e0.h(annotationArr, c0.class)) {
                executor = this.f13563a;
            }
            return new g(d10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
