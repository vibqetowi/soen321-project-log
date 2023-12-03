package tr;

import java.util.concurrent.Executor;
import tr.a;
/* compiled from: CompositeCallCredentials.java */
/* loaded from: classes2.dex */
public final class g extends tr.a {

    /* renamed from: a  reason: collision with root package name */
    public final tr.a f33466a;

    /* renamed from: b  reason: collision with root package name */
    public final tr.a f33467b;

    /* compiled from: CompositeCallCredentials.java */
    /* loaded from: classes2.dex */
    public static final class a extends a.AbstractC0558a {

        /* renamed from: a  reason: collision with root package name */
        public final a.AbstractC0558a f33468a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f33469b;

        public a(a.AbstractC0558a abstractC0558a, c0 c0Var) {
            this.f33468a = abstractC0558a;
            this.f33469b = c0Var;
        }

        @Override // tr.a.AbstractC0558a
        public final void a(c0 c0Var) {
            c0 c0Var2 = new c0();
            c0Var2.d(this.f33469b);
            c0Var2.d(c0Var);
            this.f33468a.a(c0Var2);
        }

        @Override // tr.a.AbstractC0558a
        public final void b(i0 i0Var) {
            this.f33468a.b(i0Var);
        }
    }

    /* compiled from: CompositeCallCredentials.java */
    /* loaded from: classes2.dex */
    public final class b extends a.AbstractC0558a {

        /* renamed from: a  reason: collision with root package name */
        public final a.b f33470a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f33471b;

        /* renamed from: c  reason: collision with root package name */
        public final a.AbstractC0558a f33472c;

        /* renamed from: d  reason: collision with root package name */
        public final l f33473d;

        public b(a.b bVar, Executor executor, a.AbstractC0558a abstractC0558a, l lVar) {
            this.f33470a = bVar;
            this.f33471b = executor;
            this.f33472c = abstractC0558a;
            sc.b.w(lVar, "context");
            this.f33473d = lVar;
        }

        @Override // tr.a.AbstractC0558a
        public final void a(c0 c0Var) {
            l lVar = this.f33473d;
            l a10 = lVar.a();
            try {
                g.this.f33467b.a(this.f33470a, this.f33471b, new a(this.f33472c, c0Var));
            } finally {
                lVar.c(a10);
            }
        }

        @Override // tr.a.AbstractC0558a
        public final void b(i0 i0Var) {
            this.f33472c.b(i0Var);
        }
    }

    public g(tr.a aVar, tr.a aVar2) {
        sc.b.w(aVar, "creds1");
        this.f33466a = aVar;
        this.f33467b = aVar2;
    }

    @Override // tr.a
    public final void a(a.b bVar, Executor executor, a.AbstractC0558a abstractC0558a) {
        this.f33466a.a(bVar, executor, new b(bVar, executor, abstractC0558a, l.b()));
    }
}
