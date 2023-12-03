package mi;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25228u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f25229v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, String str) {
        super(0);
        this.f25228u = aVar;
        this.f25229v = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f25228u.D + " trackUserAttribute() : Attribute name is blank, cannot track, " + this.f25229v;
    }
}
