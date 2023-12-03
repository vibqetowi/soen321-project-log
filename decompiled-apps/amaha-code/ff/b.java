package ff;

import lf.g;
/* compiled from: FirebasePerfGaugeMetricValidator.java */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final g f15025a;

    public b(g gVar) {
        this.f15025a = gVar;
    }

    @Override // ff.e
    public final boolean a() {
        g gVar = this.f15025a;
        if (gVar.V() && (gVar.R() > 0 || gVar.Q() > 0 || (gVar.U() && gVar.T().Q()))) {
            return true;
        }
        return false;
    }
}
