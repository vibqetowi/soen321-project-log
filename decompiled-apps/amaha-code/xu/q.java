package xu;

import is.u;
import java.util.LinkedHashSet;
import java.util.Set;
import wu.i0;
/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Set<i0> f38128u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LinkedHashSet linkedHashSet) {
        super(0);
        this.f38128u = linkedHashSet;
    }

    @Override // ss.a
    public final String invoke() {
        return "This collections cannot be empty! input types: ".concat(u.m2(this.f38128u, null, null, null, null, 63));
    }
}
