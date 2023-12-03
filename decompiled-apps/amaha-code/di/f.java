package di;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f12888u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f12889v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f12890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, Object obj) {
        super(0);
        this.f12888u = str;
        this.f12889v = str2;
        this.f12890w = obj;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f12888u + " [ " + ((Object) this.f12889v) + " = " + this.f12890w + " ]";
    }
}
