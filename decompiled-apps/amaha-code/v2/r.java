package v2;
/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34730a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34731b;

    /* renamed from: c  reason: collision with root package name */
    public final b f34732c;

    /* renamed from: d  reason: collision with root package name */
    public final c f34733d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.e<p> {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, p pVar) {
            p pVar2 = pVar;
            String str = pVar2.f34728a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            byte[] b10 = androidx.work.d.b(pVar2.f34729b);
            if (b10 == null) {
                fVar.i0(2);
            } else {
                fVar.W(b10, 2);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends x1.u {
        public b(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends x1.u {
        public c(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public r(x1.n nVar) {
        this.f34730a = nVar;
        this.f34731b = new a(nVar);
        this.f34732c = new b(nVar);
        this.f34733d = new c(nVar);
    }

    @Override // v2.q
    public final void a(String str) {
        x1.n nVar = this.f34730a;
        nVar.b();
        b bVar = this.f34732c;
        b2.f a10 = bVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            bVar.d(a10);
        }
    }

    @Override // v2.q
    public final void b(p pVar) {
        x1.n nVar = this.f34730a;
        nVar.b();
        nVar.c();
        try {
            this.f34731b.f(pVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    @Override // v2.q
    public final void c() {
        x1.n nVar = this.f34730a;
        nVar.b();
        c cVar = this.f34733d;
        b2.f a10 = cVar.a();
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            cVar.d(a10);
        }
    }
}
