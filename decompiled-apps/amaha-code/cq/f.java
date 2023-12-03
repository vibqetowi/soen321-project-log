package cq;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ss.l;
/* compiled from: GoalActivityListFragment.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f11905u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f11906v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f11907w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f11908x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, FirestoreGoal firestoreGoal, ConstraintLayout constraintLayout, x<com.google.android.material.bottomsheet.f> xVar) {
        super(1);
        this.f11905u = gVar;
        this.f11906v = firestoreGoal;
        this.f11907w = constraintLayout;
        this.f11908x = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i6 = g.E;
            this.f11905u.K(null, this.f11906v, this.f11907w);
        }
        com.google.android.material.bottomsheet.f fVar = this.f11908x.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
