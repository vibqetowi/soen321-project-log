package dh;

import ih.p;
import kotlin.jvm.internal.k;
/* compiled from: InitialisationHandler.kt */
/* loaded from: classes.dex */
public final class d extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f12867u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f12868v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, p pVar) {
        super(0);
        this.f12867u = iVar;
        this.f12868v = pVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_InitialisationHandler initialiseSdk() : Config: ");
        this.f12867u.getClass();
        sb2.append(this.f12868v.f20103b);
        return sb2.toString();
    }
}
