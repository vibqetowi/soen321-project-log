package fj;
/* compiled from: NotificationBuilder.kt */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f15062u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f15062u = cVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f15062u;
        sb2.append(cVar.f);
        sb2.append(" addAutoDismissIfAny() : Dismiss time: ");
        sb2.append(cVar.f15066c.f28532h.f28522g);
        return sb2.toString();
    }
}
