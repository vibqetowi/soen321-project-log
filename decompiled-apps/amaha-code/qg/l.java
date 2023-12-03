package qg;
/* compiled from: CoreController.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f29567u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(0);
        this.f29567u = gVar;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" registerProcessLifecycleObserver() : SDK not initialised on main thread. Moving to main thread to register.", this.f29567u.f29547b);
    }
}
