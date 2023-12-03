package sj;
/* compiled from: IntentActionHandler.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f31611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar) {
        super(0);
        this.f31611u = mVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f31611u;
        sb2.append(mVar.f31620d);
        sb2.append(" handleAction(): will process ");
        sb2.append(mVar.f31618b);
        return sb2.toString();
    }
}
