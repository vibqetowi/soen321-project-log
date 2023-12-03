package yg;
/* compiled from: SyncHandler.kt */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d0 f38570u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f38571v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var, String str) {
        super(0);
        this.f38570u = d0Var;
        this.f38571v = str;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_SyncHandler scheduleBackgroundSync() : Scheduling background sync, type: ");
        this.f38570u.getClass();
        sb2.append(this.f38571v);
        return sb2.toString();
    }
}
