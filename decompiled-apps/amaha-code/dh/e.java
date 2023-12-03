package dh;

import kotlin.jvm.internal.k;
/* compiled from: InitialisationHandler.kt */
/* loaded from: classes.dex */
public final class e extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f12869u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(0);
        this.f12869u = iVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_InitialisationHandler initialiseSdk(): Is SDK initialised on main thread: ");
        this.f12869u.getClass();
        sb2.append(di.b.s());
        return sb2.toString();
    }
}
