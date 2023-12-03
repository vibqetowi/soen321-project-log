package dh;

import kotlin.jvm.internal.k;
/* compiled from: InitialisationHandler.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f12866u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar) {
        super(0);
        this.f12866u = iVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_InitialisationHandler initialiseSdk() : SDK version : ");
        this.f12866u.getClass();
        sb2.append(di.b.n());
        return sb2.toString();
    }
}
