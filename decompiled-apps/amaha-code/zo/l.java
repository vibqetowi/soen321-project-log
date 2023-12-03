package zo;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.x;
/* compiled from: RecommendedActivityGifFragment.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f39747u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x<Goal> f39748v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39749w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, x<Goal> xVar, x<com.google.android.material.bottomsheet.f> xVar2) {
        super(1);
        this.f39747u = iVar;
        this.f39748v = xVar;
        this.f39749w = xVar2;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Goal goal = this.f39748v.f23469u;
            kotlin.jvm.internal.i.d(goal);
            int i6 = i.f39715j0;
            this.f39747u.h0(null, goal);
        }
        com.google.android.material.bottomsheet.f fVar = this.f39749w.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
