package yg;
/* compiled from: ReportsManager.kt */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f38613u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z10) {
        super(0);
        this.f38613u = z10;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(Boolean.valueOf(this.f38613u), "Core_ReportsManager backgroundSync() : Did report add succeed for all instances? ");
    }
}
