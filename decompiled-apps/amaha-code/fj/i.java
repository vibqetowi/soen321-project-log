package fj;
/* compiled from: PushHelper.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f15083u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar) {
        super(0);
        this.f15083u = eVar;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" requestPushPermission() : Cannot request permission on devices below Android 13", this.f15083u.f15076a);
    }
}
