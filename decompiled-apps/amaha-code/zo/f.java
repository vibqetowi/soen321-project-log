package zo;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.x;
/* compiled from: RecommendedActivityAudioFragment.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f39709u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x<Goal> f39710v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39711w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, x<Goal> xVar, x<com.google.android.material.bottomsheet.f> xVar2) {
        super(1);
        this.f39709u = eVar;
        this.f39710v = xVar;
        this.f39711w = xVar2;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Goal goal = this.f39710v.f23469u;
            kotlin.jvm.internal.i.d(goal);
            int i6 = e.e0;
            this.f39709u.c0(null, goal);
        }
        com.google.android.material.bottomsheet.f fVar = this.f39711w.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
