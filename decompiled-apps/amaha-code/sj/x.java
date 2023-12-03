package sj;
/* compiled from: RichPushTimerUtils.kt */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ jj.b f31636u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ uj.k f31637v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jj.b bVar, uj.k kVar) {
        super(0);
        this.f31636u = bVar;
        this.f31637v = kVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("RichPush_4.3.2_RichPushTimerUtils: setUpTimerComponentsIfRequired(): notificationId: ");
        sb2.append(this.f31636u.f22068c);
        sb2.append(", alarmId: ");
        uj.k kVar = this.f31637v;
        sb2.append(kVar.f34207h);
        sb2.append(", triggerInMillis: ");
        sb2.append(kVar.f34201a);
        return sb2.toString();
    }
}
