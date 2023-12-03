package eh;
/* compiled from: ApplicationLifecycleHandler.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f14010u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(0);
        this.f14010u = gVar;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onAppClose() : ", this.f14010u.f14005b);
    }
}
