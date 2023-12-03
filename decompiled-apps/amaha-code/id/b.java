package id;

import id.f;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements f.c {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19961u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f19962v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Runnable f19963w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f19964x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f19965y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f19966z;

    public /* synthetic */ b(e eVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i6) {
        this.f19961u = i6;
        this.f19962v = eVar;
        this.f19963w = runnable;
        this.f19964x = j10;
        this.f19965y = j11;
        this.f19966z = timeUnit;
    }

    @Override // id.f.c
    public final ScheduledFuture a(f.a aVar) {
        int i6 = this.f19961u;
        Runnable runnable = this.f19963w;
        e eVar = this.f19962v;
        switch (i6) {
            case 0:
                return eVar.f19975v.scheduleWithFixedDelay(new c(eVar, runnable, aVar, 1), this.f19964x, this.f19965y, this.f19966z);
            default:
                return eVar.f19975v.scheduleAtFixedRate(new c(eVar, runnable, aVar, 0), this.f19964x, this.f19965y, this.f19966z);
        }
    }
}
