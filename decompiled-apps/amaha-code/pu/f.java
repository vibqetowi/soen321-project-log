package pu;

import java.util.ArrayList;
/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes2.dex */
public final class f extends iu.k {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList<gt.j> f28999v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f29000w;

    public f(ArrayList<gt.j> arrayList, e eVar) {
        this.f28999v = arrayList;
        this.f29000w = eVar;
    }

    @Override // iu.k
    public final void J(gt.b fromSuper, gt.b fromCurrent) {
        kotlin.jvm.internal.i.g(fromSuper, "fromSuper");
        kotlin.jvm.internal.i.g(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f29000w.f28996b + ": " + fromSuper + " vs " + fromCurrent).toString());
    }

    @Override // com.android.volley.toolbox.a
    public final void a(gt.b fakeOverride) {
        kotlin.jvm.internal.i.g(fakeOverride, "fakeOverride");
        iu.l.r(fakeOverride, null);
        this.f28999v.add(fakeOverride);
    }
}
