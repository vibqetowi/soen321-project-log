package xg;

import kotlin.jvm.internal.k;
/* compiled from: EventHandler.kt */
/* loaded from: classes.dex */
public final class d extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f37765u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(0);
        this.f37765u = gVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        g gVar = this.f37765u;
        sb2.append(gVar.f37770c);
        sb2.append(" trackEvent() : Cache counter ");
        sb2.append(gVar.f37769b);
        return sb2.toString();
    }
}
