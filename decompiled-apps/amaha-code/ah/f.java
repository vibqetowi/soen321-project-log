package ah;

import java.util.HashSet;
import kotlin.jvm.internal.k;
import r1.b0;
import ss.l;
/* compiled from: TaskHandler.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final hh.g f555a;

    /* renamed from: b  reason: collision with root package name */
    public final String f556b = "Core_TaskManager";

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f557c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final ah.d f558d = new ah.d();

    /* renamed from: e  reason: collision with root package name */
    public final e f559e = new e();

    /* compiled from: TaskHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ah.e f561v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ah.e eVar) {
            super(0);
            this.f561v = eVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f.this.f556b);
            sb2.append(" execute() : Job with tag ");
            return b0.b(sb2, this.f561v.f552a, " added to queue");
        }
    }

    /* compiled from: TaskHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ah.e f563v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ah.e eVar) {
            super(0);
            this.f563v = eVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f.this.f556b);
            sb2.append(" execute() : Job with tag ");
            return b0.b(sb2, this.f563v.f552a, " cannot be added to queue");
        }
    }

    /* compiled from: TaskHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" execute() : ", f.this.f556b);
        }
    }

    /* compiled from: TaskHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" executeRunnable() : ", f.this.f556b);
        }
    }

    /* compiled from: TaskHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements l<ah.e, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ah.e eVar) {
            ah.e job = eVar;
            kotlin.jvm.internal.i.g(job, "job");
            f.this.f557c.remove(job.f552a);
            return hs.k.f19476a;
        }
    }

    public f(hh.g gVar) {
        this.f555a = gVar;
    }

    public final boolean a(ah.e eVar) {
        boolean z10;
        hh.g gVar = this.f555a;
        try {
            boolean z11 = eVar.f553b;
            HashSet<String> hashSet = this.f557c;
            String str = eVar.f552a;
            if (!z11 || !hashSet.contains(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                hh.g.b(gVar, 0, new a(eVar), 3);
                hashSet.add(str);
                ah.d dVar = this.f558d;
                e onComplete = this.f559e;
                dVar.getClass();
                kotlin.jvm.internal.i.g(onComplete, "onComplete");
                dVar.f550a.execute(new ah.a(eVar, onComplete, 1));
                return true;
            }
            hh.g.b(gVar, 0, new b(eVar), 3);
            return false;
        } catch (Throwable th2) {
            gVar.a(1, th2, new c());
            return false;
        }
    }

    public final void b(Runnable runnable) {
        try {
            ah.d dVar = this.f558d;
            dVar.getClass();
            dVar.f550a.execute(runnable);
        } catch (Exception e10) {
            this.f555a.a(1, e10, new d());
        }
    }

    public final void c(ah.e eVar) {
        boolean z10;
        hh.g gVar = this.f555a;
        try {
            boolean z11 = eVar.f553b;
            HashSet<String> hashSet = this.f557c;
            String str = eVar.f552a;
            if (!z11 || !hashSet.contains(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                hh.g.b(gVar, 0, new g(this, eVar), 3);
                hashSet.add(str);
                ah.d dVar = this.f558d;
                e onComplete = this.f559e;
                dVar.getClass();
                kotlin.jvm.internal.i.g(onComplete, "onComplete");
                dVar.f551b.submit(new ah.a(eVar, onComplete, 0));
                return;
            }
            hh.g.b(gVar, 0, new h(this, eVar), 3);
        } catch (Throwable th2) {
            gVar.a(1, th2, new i(this));
        }
    }
}
