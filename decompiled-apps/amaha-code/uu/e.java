package uu;

import gt.r;
import java.util.ArrayList;
import java.util.List;
import kt.x;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class e extends iu.k {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<Object> f34558v;

    public e(ArrayList arrayList) {
        this.f34558v = arrayList;
    }

    @Override // iu.k
    public final void J(gt.b fromSuper, gt.b fromCurrent) {
        kotlin.jvm.internal.i.g(fromSuper, "fromSuper");
        kotlin.jvm.internal.i.g(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof x) {
            ((x) fromCurrent).R0(r.f16816a, fromSuper);
        }
    }

    @Override // com.android.volley.toolbox.a
    public final void a(gt.b fakeOverride) {
        kotlin.jvm.internal.i.g(fakeOverride, "fakeOverride");
        iu.l.r(fakeOverride, null);
        this.f34558v.add(fakeOverride);
    }
}
