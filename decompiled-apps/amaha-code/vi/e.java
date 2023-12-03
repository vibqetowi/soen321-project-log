package vi;
/* compiled from: InAppFileManager.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f35192u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f35193v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f35194w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f35195x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, boolean z10, String str, String str2) {
        super(0);
        this.f35192u = cVar;
        this.f35193v = z10;
        this.f35194w = str;
        this.f35195x = str2;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f35192u.f35184b + " downloadAndSaveFiles() : isDownloadSuccess: ," + this.f35193v + "  file: " + this.f35194w + ", fileUrl: " + this.f35195x;
    }
}
