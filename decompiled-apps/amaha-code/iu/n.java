package iu;
/* compiled from: OverridingUtil.java */
/* loaded from: classes2.dex */
public final class n implements ss.l<gt.b, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ gt.e f20706u;

    public n(gt.e eVar) {
        this.f20706u = eVar;
    }

    @Override // ss.l
    public final Boolean invoke(gt.b bVar) {
        boolean z10;
        gt.b bVar2 = bVar;
        boolean z11 = false;
        if (!gt.p.e(bVar2.getVisibility())) {
            gt.e eVar = this.f20706u;
            if (eVar != null) {
                if (gt.p.c(gt.p.f16811m, bVar2, eVar) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            } else {
                gt.p.a(3);
                throw null;
            }
        }
        return Boolean.valueOf(z11);
    }
}
