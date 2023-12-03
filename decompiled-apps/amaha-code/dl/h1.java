package dl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import java.util.TimerTask;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class h1 extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13032u;

    public h1(V3DashboardActivity v3DashboardActivity) {
        this.f13032u = v3DashboardActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LinearLayout linearLayout;
        View childAt;
        RecyclerView recyclerView;
        V3DashboardActivity v3DashboardActivity = this.f13032u;
        if (v3DashboardActivity.f10733l0 && (linearLayout = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)) != null && (childAt = linearLayout.getChildAt(0)) != null && (recyclerView = (RecyclerView) childAt.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
            recyclerView.j0(700, 0);
        }
    }
}
