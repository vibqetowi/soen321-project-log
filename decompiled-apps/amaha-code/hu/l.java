package hu;
/* compiled from: Delegates.kt */
/* loaded from: classes2.dex */
public final class l extends us.a<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f19583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, k kVar) {
        super(obj);
        this.f19583b = kVar;
    }

    @Override // us.a
    public final void a(ys.m property) {
        kotlin.jvm.internal.i.g(property, "property");
        if (!this.f19583b.f19557a) {
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
