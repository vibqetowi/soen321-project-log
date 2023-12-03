package pt;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final i f28914u = new i();

    public i() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(gt.b bVar) {
        boolean z10;
        gt.b it = bVar;
        kotlin.jvm.internal.i.g(it, "it");
        if (it instanceof gt.u) {
            int i6 = h.f28907m;
            if (is.u.Z1(j0.f28927g, ta.v.o(it))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
