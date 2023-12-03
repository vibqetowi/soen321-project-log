package yg;
/* compiled from: ReportsManager.kt */
/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f38618u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j10) {
        super(0);
        this.f38618u = j10;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(Long.valueOf(this.f38618u), "Core_ReportsManager schedulePeriodicFlushIfRequired() : Scheduling sync, time: ");
    }
}
