package cq;

import android.view.View;
import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ss.l;
/* compiled from: GoalActivityListFragment.kt */
/* loaded from: classes2.dex */
public final class h extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f11917u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x<Goal> f11918v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f11919w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f11920x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, x<Goal> xVar, View view, x<com.google.android.material.bottomsheet.f> xVar2) {
        super(1);
        this.f11917u = gVar;
        this.f11918v = xVar;
        this.f11919w = view;
        this.f11920x = xVar2;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i6 = g.E;
            View view = this.f11919w;
            this.f11917u.K(this.f11918v.f23469u, null, view);
        }
        com.google.android.material.bottomsheet.f fVar = this.f11920x.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
