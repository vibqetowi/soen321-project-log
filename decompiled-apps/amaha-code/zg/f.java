package zg;
/* compiled from: UserAttributeHandler.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f39378u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ mh.a f39379v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, mh.a aVar) {
        super(0);
        this.f39378u = jVar;
        this.f39379v = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f39378u.f39384b + " setAlias() : Not a valid unique id. Tracked Value: " + this.f39379v.f25054b;
    }
}
