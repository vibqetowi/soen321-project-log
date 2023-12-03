package cm;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class s extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f5379a;

    public s(p pVar) {
        this.f5379a = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i10;
        p pVar = this.f5379a;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            try {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                RecommendedActivityModel recommendedActivityModel = null;
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
                fm.a aVar = pVar.f5373y;
                if (aVar != null) {
                    ArrayList<RecommendedActivityModel> d10 = aVar.X.d();
                    if (d10 != null) {
                        recommendedActivityModel = d10.get(i10);
                    }
                    aVar.Z = recommendedActivityModel;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar.f5369u, e10);
            }
        }
    }
}
