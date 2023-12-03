package pt;

import gt.p0;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p0 f28899u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p0 p0Var) {
        super(1);
        this.f28899u = p0Var;
    }

    @Override // ss.l
    public final Boolean invoke(gt.b bVar) {
        gt.b it = bVar;
        kotlin.jvm.internal.i.g(it, "it");
        return Boolean.valueOf(j0.f28930j.containsKey(ta.v.o(this.f28899u)));
    }
}
