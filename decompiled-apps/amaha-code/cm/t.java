package cm;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5380u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f5381v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f5382w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, FirestoreGoal firestoreGoal, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
        super(1);
        this.f5380u = pVar;
        this.f5381v = firestoreGoal;
        this.f5382w = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i6 = p.G;
            this.f5380u.F(this.f5381v);
        }
        com.google.android.material.bottomsheet.f fVar = this.f5382w.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
