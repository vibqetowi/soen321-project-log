package wu;

import java.util.Map;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public final class y0 extends z0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map<x0, d1> f37318c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f37319d;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(Map<x0, ? extends d1> map, boolean z10) {
        this.f37318c = map;
        this.f37319d = z10;
    }

    @Override // wu.g1
    public final boolean a() {
        return this.f37319d;
    }

    @Override // wu.g1
    public final boolean e() {
        return this.f37318c.isEmpty();
    }

    @Override // wu.z0
    public final d1 g(x0 key) {
        kotlin.jvm.internal.i.g(key, "key");
        return this.f37318c.get(key);
    }
}
