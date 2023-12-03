package dh;

import ih.p;
import kotlin.jvm.internal.k;
/* compiled from: InitialisationHandler.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f12864u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f12865v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, p pVar) {
        super(0);
        this.f12864u = iVar;
        this.f12865v = pVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_InitialisationHandler initialiseSdk() : Max instance count reached, rejecting instance. App-id: ");
        this.f12864u.getClass();
        sb2.append((String) this.f12865v.f20102a.f5133c);
        return sb2.toString();
    }
}
