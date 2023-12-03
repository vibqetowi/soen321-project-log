package je;

import java.util.concurrent.TimeUnit;
import oe.a;
/* compiled from: IndexBackfiller.java */
/* loaded from: classes.dex */
public final class e {
    public static final long f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g  reason: collision with root package name */
    public static final long f21808g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a  reason: collision with root package name */
    public final a f21809a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.work.k f21810b;

    /* renamed from: c  reason: collision with root package name */
    public final nc.m<f> f21811c;

    /* renamed from: d  reason: collision with root package name */
    public final nc.m<h> f21812d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21813e;

    /* compiled from: IndexBackfiller.java */
    /* loaded from: classes.dex */
    public class a implements z0 {

        /* renamed from: a  reason: collision with root package name */
        public final oe.a f21814a;

        public a(oe.a aVar) {
            this.f21814a = aVar;
        }

        @Override // je.z0
        public final void start() {
            long j10 = e.f;
            this.f21814a.a(a.c.INDEX_BACKFILL, j10, new androidx.activity.b(29, this));
        }
    }

    public e(androidx.work.k kVar, oe.a aVar, final k kVar2) {
        nc.m<f> mVar = new nc.m() { // from class: je.d
            @Override // nc.m
            public final Object get() {
                int i6 = r2;
                k kVar3 = kVar2;
                switch (i6) {
                    case 0:
                        return kVar3.f21847b;
                    default:
                        return kVar3.f;
                }
            }
        };
        nc.m<h> mVar2 = new nc.m() { // from class: je.d
            @Override // nc.m
            public final Object get() {
                int i6 = r2;
                k kVar3 = kVar2;
                switch (i6) {
                    case 0:
                        return kVar3.f21847b;
                    default:
                        return kVar3.f;
                }
            }
        };
        this.f21813e = 50;
        this.f21810b = kVar;
        this.f21809a = new a(aVar);
        this.f21811c = mVar;
        this.f21812d = mVar2;
    }
}
