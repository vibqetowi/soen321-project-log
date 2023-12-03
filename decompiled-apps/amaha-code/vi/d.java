package vi;
/* compiled from: InAppFileManager.kt */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f35190u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f35191v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str) {
        super(0);
        this.f35190u = cVar;
        this.f35191v = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f35190u.f35184b + "  downloadAndSaveFiles() : file already exists. file:" + this.f35191v;
    }
}
