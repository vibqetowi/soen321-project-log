package xg;

import kotlin.jvm.internal.k;
/* compiled from: EventHandler.kt */
/* loaded from: classes.dex */
public final class a extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f37760u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ih.i f37761v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, ih.i iVar) {
        super(0);
        this.f37760u = gVar;
        this.f37761v = iVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f37760u.f37770c + " trackEvent() : " + this.f37761v;
    }
}
