package fl;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15137u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CustomDashboardActivity customDashboardActivity) {
        super(1);
        this.f15137u = customDashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        hl.g gVar;
        View view;
        if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
            Fragment F = this.f15137u.getSupportFragmentManager().F("dashboard_fragment");
            if (F instanceof hl.g) {
                gVar = (hl.g) F;
            } else {
                gVar = null;
            }
            if (gVar != null && gVar.A && (view = gVar.G.get(hl.f.DYNAMIC_CARD)) != null) {
                hl.l lVar = new hl.l();
                androidx.fragment.app.y childFragmentManager = gVar.getChildFragmentManager();
                androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
                l2.f(view.getId(), lVar, "dynamic_card");
                l2.j();
                gVar.getChildFragmentManager().B();
                gVar.A = false;
            }
        }
        return hs.k.f19476a;
    }
}
