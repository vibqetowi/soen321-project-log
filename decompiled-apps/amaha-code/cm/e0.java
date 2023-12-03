package cm;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V3GoalsRegularFragment.kt */
/* loaded from: classes2.dex */
public final class e0 extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f5333a;

    public e0(c0 c0Var) {
        this.f5333a = c0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i10;
        c0 c0Var = this.f5333a;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            try {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    i10 = linearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    i10 = 0;
                }
                c0Var.B = (RecommendedActivityModel) is.u.j2(i10, c0Var.A);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.f5316u, e10);
            }
        }
    }
}
