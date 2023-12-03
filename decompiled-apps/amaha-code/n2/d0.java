package n2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.p;
import androidx.work.u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class d0 implements Runnable {
    public static final String M = androidx.work.q.f("WorkerWrapper");
    public final y2.a A;
    public final androidx.work.b C;
    public final u2.a D;
    public final WorkDatabase E;
    public final v2.t F;
    public final v2.b G;
    public final List<String> H;
    public String I;
    public volatile boolean L;

    /* renamed from: u  reason: collision with root package name */
    public final Context f25807u;

    /* renamed from: v  reason: collision with root package name */
    public final String f25808v;

    /* renamed from: w  reason: collision with root package name */
    public final List<r> f25809w;

    /* renamed from: x  reason: collision with root package name */
    public final WorkerParameters.a f25810x;

    /* renamed from: y  reason: collision with root package name */
    public final v2.s f25811y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.work.p f25812z;
    public p.a B = new p.a.C0043a();
    public final x2.c<Boolean> J = new x2.c<>();
    public final x2.c<p.a> K = new x2.c<>();

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f25813a;

        /* renamed from: b  reason: collision with root package name */
        public final u2.a f25814b;

        /* renamed from: c  reason: collision with root package name */
        public final y2.a f25815c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.work.b f25816d;

        /* renamed from: e  reason: collision with root package name */
        public final WorkDatabase f25817e;
        public final v2.s f;

        /* renamed from: g  reason: collision with root package name */
        public List<r> f25818g;

        /* renamed from: h  reason: collision with root package name */
        public final List<String> f25819h;

        /* renamed from: i  reason: collision with root package name */
        public WorkerParameters.a f25820i = new WorkerParameters.a();

        public a(Context context, androidx.work.b bVar, y2.a aVar, u2.a aVar2, WorkDatabase workDatabase, v2.s sVar, ArrayList arrayList) {
            this.f25813a = context.getApplicationContext();
            this.f25815c = aVar;
            this.f25814b = aVar2;
            this.f25816d = bVar;
            this.f25817e = workDatabase;
            this.f = sVar;
            this.f25819h = arrayList;
        }
    }

    public d0(a aVar) {
        this.f25807u = aVar.f25813a;
        this.A = aVar.f25815c;
        this.D = aVar.f25814b;
        v2.s sVar = aVar.f;
        this.f25811y = sVar;
        this.f25808v = sVar.f34734a;
        this.f25809w = aVar.f25818g;
        this.f25810x = aVar.f25820i;
        this.f25812z = null;
        this.C = aVar.f25816d;
        WorkDatabase workDatabase = aVar.f25817e;
        this.E = workDatabase;
        this.F = workDatabase.u();
        this.G = workDatabase.p();
        this.H = aVar.f25819h;
    }

    public final void a(p.a aVar) {
        boolean z10 = aVar instanceof p.a.c;
        v2.s sVar = this.f25811y;
        String str = M;
        if (z10) {
            androidx.work.q d10 = androidx.work.q.d();
            d10.e(str, "Worker result SUCCESS for " + this.I);
            if (sVar.c()) {
                d();
                return;
            }
            v2.b bVar = this.G;
            String str2 = this.f25808v;
            v2.t tVar = this.F;
            WorkDatabase workDatabase = this.E;
            workDatabase.c();
            try {
                tVar.h(u.a.SUCCEEDED, str2);
                tVar.j(str2, ((p.a.c) this.B).f3332a);
                long currentTimeMillis = System.currentTimeMillis();
                for (String str3 : bVar.b(str2)) {
                    if (tVar.o(str3) == u.a.BLOCKED && bVar.c(str3)) {
                        androidx.work.q d11 = androidx.work.q.d();
                        d11.e(str, "Setting status to enqueued for " + str3);
                        tVar.h(u.a.ENQUEUED, str3);
                        tVar.k(currentTimeMillis, str3);
                    }
                }
                workDatabase.n();
            } finally {
                workDatabase.j();
                e(false);
            }
        } else if (aVar instanceof p.a.b) {
            androidx.work.q d12 = androidx.work.q.d();
            d12.e(str, "Worker result RETRY for " + this.I);
            c();
        } else {
            androidx.work.q d13 = androidx.work.q.d();
            d13.e(str, "Worker result FAILURE for " + this.I);
            if (sVar.c()) {
                d();
            } else {
                g();
            }
        }
    }

    public final void b() {
        boolean h10 = h();
        String str = this.f25808v;
        WorkDatabase workDatabase = this.E;
        if (!h10) {
            workDatabase.c();
            try {
                u.a o10 = this.F.o(str);
                workDatabase.t().a(str);
                if (o10 == null) {
                    e(false);
                } else if (o10 == u.a.RUNNING) {
                    a(this.B);
                } else if (!o10.d()) {
                    c();
                }
                workDatabase.n();
            } finally {
                workDatabase.j();
            }
        }
        List<r> list = this.f25809w;
        if (list != null) {
            for (r rVar : list) {
                rVar.d(str);
            }
            s.a(this.C, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f25808v;
        v2.t tVar = this.F;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            tVar.h(u.a.ENQUEUED, str);
            tVar.k(System.currentTimeMillis(), str);
            tVar.d(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f25808v;
        v2.t tVar = this.F;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            tVar.k(System.currentTimeMillis(), str);
            tVar.h(u.a.ENQUEUED, str);
            tVar.q(str);
            tVar.c(str);
            tVar.d(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void e(boolean z10) {
        boolean containsKey;
        this.E.c();
        try {
            if (!this.E.u().m()) {
                w2.l.a(this.f25807u, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.F.h(u.a.ENQUEUED, this.f25808v);
                this.F.d(-1L, this.f25808v);
            }
            if (this.f25811y != null && this.f25812z != null) {
                u2.a aVar = this.D;
                String str = this.f25808v;
                p pVar = (p) aVar;
                synchronized (pVar.F) {
                    containsKey = pVar.f25844z.containsKey(str);
                }
                if (containsKey) {
                    ((p) this.D).k(this.f25808v);
                }
            }
            this.E.n();
            this.E.j();
            this.J.i(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.E.j();
            throw th2;
        }
    }

    public final void f() {
        v2.t tVar = this.F;
        String str = this.f25808v;
        u.a o10 = tVar.o(str);
        u.a aVar = u.a.RUNNING;
        String str2 = M;
        if (o10 == aVar) {
            androidx.work.q d10 = androidx.work.q.d();
            d10.a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        androidx.work.q d11 = androidx.work.q.d();
        d11.a(str2, "Status for " + str + " is " + o10 + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f25808v;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                v2.t tVar = this.F;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (tVar.o(str2) != u.a.CANCELLED) {
                        tVar.h(u.a.FAILED, str2);
                    }
                    linkedList.addAll(this.G.b(str2));
                } else {
                    tVar.j(str, ((p.a.C0043a) this.B).f3331a);
                    workDatabase.n();
                    return;
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.L) {
            return false;
        }
        androidx.work.q d10 = androidx.work.q.d();
        String str = M;
        d10.a(str, "Work interrupted for " + this.I);
        u.a o10 = this.F.o(this.f25808v);
        if (o10 == null) {
            e(false);
        } else {
            e(!o10.d());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r0 != false) goto L78;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.work.i iVar;
        androidx.work.d a10;
        boolean z10;
        boolean z11;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f25808v;
        sb2.append(str);
        sb2.append(", tags={ ");
        boolean z12 = true;
        for (String str2 : this.H) {
            if (z12) {
                z12 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.I = sb2.toString();
        v2.s sVar = this.f25811y;
        if (!h()) {
            WorkDatabase workDatabase = this.E;
            workDatabase.c();
            try {
                u.a aVar = sVar.f34735b;
                u.a aVar2 = u.a.ENQUEUED;
                String str3 = sVar.f34736c;
                String str4 = M;
                if (aVar != aVar2) {
                    f();
                    workDatabase.n();
                    androidx.work.q d10 = androidx.work.q.d();
                    d10.a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                } else {
                    if (!sVar.c()) {
                        if (sVar.f34735b == aVar2 && sVar.f34743k > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (System.currentTimeMillis() < sVar.a()) {
                        androidx.work.q.d().a(str4, String.format("Delaying execution for %s because it is being executed before schedule.", str3));
                        e(true);
                        workDatabase.n();
                    }
                    workDatabase.n();
                    workDatabase.j();
                    boolean c10 = sVar.c();
                    v2.t tVar = this.F;
                    androidx.work.b bVar = this.C;
                    if (c10) {
                        a10 = sVar.f34738e;
                    } else {
                        androidx.work.j jVar = bVar.f3217d;
                        String str5 = sVar.f34737d;
                        jVar.getClass();
                        String str6 = androidx.work.i.f3248a;
                        try {
                            iVar = (androidx.work.i) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        } catch (Exception e10) {
                            androidx.work.q.d().c(androidx.work.i.f3248a, defpackage.c.r("Trouble instantiating + ", str5), e10);
                            iVar = null;
                        }
                        if (iVar == null) {
                            androidx.work.q d11 = androidx.work.q.d();
                            d11.b(str4, "Could not create Input Merger " + sVar.f34737d);
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sVar.f34738e);
                        arrayList.addAll(tVar.s(str));
                        a10 = iVar.a(arrayList);
                    }
                    androidx.work.d dVar = a10;
                    UUID fromString = UUID.fromString(str);
                    List<String> list = this.H;
                    WorkerParameters.a aVar3 = this.f25810x;
                    int i6 = sVar.f34743k;
                    ExecutorService executorService = bVar.f3214a;
                    y2.a aVar4 = this.A;
                    androidx.work.x xVar = bVar.f3216c;
                    y2.a aVar5 = this.A;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, dVar, list, aVar3, i6, executorService, aVar4, xVar, new w2.y(workDatabase, aVar5), new w2.w(workDatabase, this.D, aVar5));
                    if (this.f25812z == null) {
                        this.f25812z = xVar.a(this.f25807u, str3, workerParameters);
                    }
                    androidx.work.p pVar = this.f25812z;
                    if (pVar == null) {
                        androidx.work.q d12 = androidx.work.q.d();
                        d12.b(str4, "Could not create Worker " + str3);
                        g();
                    } else if (pVar.isUsed()) {
                        androidx.work.q d13 = androidx.work.q.d();
                        d13.b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                        g();
                    } else {
                        this.f25812z.setUsed();
                        workDatabase.c();
                        try {
                            if (tVar.o(str) == aVar2) {
                                tVar.h(u.a.RUNNING, str);
                                tVar.t(str);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            workDatabase.n();
                            if (z10) {
                                if (!h()) {
                                    w2.u uVar = new w2.u(this.f25807u, this.f25811y, this.f25812z, workerParameters.f3208j, this.A);
                                    y2.b bVar2 = (y2.b) aVar5;
                                    bVar2.f38190c.execute(uVar);
                                    x2.c<Void> cVar = uVar.f36325u;
                                    g.v vVar = new g.v(this, 7, cVar);
                                    w2.r rVar = new w2.r(0);
                                    x2.c<p.a> cVar2 = this.K;
                                    cVar2.d(vVar, rVar);
                                    cVar.d(new b0(this, cVar), bVar2.f38190c);
                                    cVar2.d(new c0(this, this.I), bVar2.f38188a);
                                    return;
                                }
                                return;
                            }
                            f();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
