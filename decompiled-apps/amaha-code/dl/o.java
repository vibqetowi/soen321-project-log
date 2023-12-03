package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationInterface;
/* compiled from: V2DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class o implements LocationInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13082a;

    public o(V2DashboardActivity v2DashboardActivity) {
        this.f13082a = v2DashboardActivity;
    }

    @Override // com.theinnerhour.b2b.persistence.LocationInterface
    public final void locationFetchFailure() {
        boolean contains = ca.a.k("v1", "v2", "v2.1").contains(FirebasePersistence.getInstance().getUser().getVersion());
        V2DashboardActivity v2DashboardActivity = this.f13082a;
        if (!contains) {
            int i6 = V2DashboardActivity.F0;
            v2DashboardActivity.r1(true);
        }
        int i10 = V2DashboardActivity.F0;
        v2DashboardActivity.o1();
    }

    @Override // com.theinnerhour.b2b.persistence.LocationInterface
    public final void locationFetchSuccess() {
        boolean contains = ca.a.k("v1", "v2", "v2.1").contains(FirebasePersistence.getInstance().getUser().getVersion());
        V2DashboardActivity v2DashboardActivity = this.f13082a;
        if (!contains) {
            int i6 = V2DashboardActivity.F0;
            v2DashboardActivity.r1(true);
        }
        int i10 = V2DashboardActivity.F0;
        v2DashboardActivity.o1();
    }
}
