package sj;
/* compiled from: IntentActionHandler.kt */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f31608u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f31609v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f31610w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i6, String str) {
        super(0);
        this.f31608u = mVar;
        this.f31609v = i6;
        this.f31610w = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f31608u.f31620d + " dismissNotification() : notificationId: " + this.f31609v + ", templateName: " + this.f31610w;
    }
}
