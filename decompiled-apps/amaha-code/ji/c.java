package ji;
/* compiled from: FcmController.kt */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f22038u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f22039v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22040w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f22041x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, String str2, boolean z10) {
        super(0);
        this.f22038u = eVar;
        this.f22039v = str;
        this.f22040w = str2;
        this.f22041x = z10;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f22038u.f22044b + " processToken() oldId: = " + this.f22039v + " token = " + this.f22040w + "--updating[true/false]: " + this.f22041x;
    }
}
