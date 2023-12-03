package xg;

import kotlin.jvm.internal.k;
/* compiled from: EventHandler.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f37763u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ih.i f37764v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ih.i iVar) {
        super(0);
        this.f37763u = gVar;
        this.f37764v = iVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f37763u.f37770c + " trackEvent() : Cannot track event " + this.f37764v.f20088a;
    }
}
