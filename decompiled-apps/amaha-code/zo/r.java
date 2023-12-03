package zo;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.x;
/* compiled from: RecommendedActivityPhysicalFragment.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f39778u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x<Goal> f39779v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, x<Goal> xVar, x<com.google.android.material.bottomsheet.f> xVar2) {
        super(1);
        this.f39778u = pVar;
        this.f39779v = xVar;
        this.f39780w = xVar2;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Goal goal = this.f39779v.f23469u;
            kotlin.jvm.internal.i.d(goal);
            int i6 = p.R;
            this.f39778u.Z(null, goal);
        }
        com.google.android.material.bottomsheet.f fVar = this.f39780w.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
