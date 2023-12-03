package ni;
/* compiled from: HtmlViewEngine.kt */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f26326u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar) {
        super(0);
        this.f26326u = nVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f26326u;
        sb2.append(nVar.f26342e);
        sb2.append(" createInApp() : Will try to create in-app view for campaign-id: ");
        sb2.append(nVar.f26341d.f28470h);
        return sb2.toString();
    }
}
