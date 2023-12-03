package ji;
/* compiled from: FcmController.kt */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f22035u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f22036v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, String str2) {
        super(0);
        this.f22035u = eVar;
        this.f22036v = str;
        this.f22037w = str2;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f22035u.f22044b + " processToken() : Will try to process push token. Token:" + this.f22036v + " registered by: " + this.f22037w;
    }
}
