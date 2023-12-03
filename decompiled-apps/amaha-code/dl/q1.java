package dl;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import java.util.Timer;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class q1 implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13096a;

    public q1(V3DashboardActivity v3DashboardActivity) {
        this.f13096a = v3DashboardActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
        V3DashboardActivity v3DashboardActivity = this.f13096a;
        Timer timer = v3DashboardActivity.N0;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            v3DashboardActivity.N0 = null;
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
