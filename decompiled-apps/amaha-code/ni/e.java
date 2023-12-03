package ni;
/* compiled from: HtmlViewEngine.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f26327u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar) {
        super(0);
        this.f26327u = nVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f26327u;
        sb2.append(nVar.f26342e);
        sb2.append(" createInApp() : Device Dimensions: ");
        sb2.append(nVar.f26344h);
        sb2.append(", status bar height: ");
        sb2.append(nVar.f26343g);
        return sb2.toString();
    }
}
