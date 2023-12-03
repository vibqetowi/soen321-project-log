package sj;
/* compiled from: IntentActionHandler.kt */
/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f31614u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f31615v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i6) {
        super(0);
        this.f31614u = mVar;
        this.f31615v = i6;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31614u.f31620d);
        sb2.append(" handleProgressUpdateAction() : Notification: ");
        return pl.a.g(sb2, this.f31615v, " is in dismissed state, cancelling the progress update.");
    }
}
