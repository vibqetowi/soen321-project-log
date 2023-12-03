package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.HashMap;
/* compiled from: AllTopPicksViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<SingleUseEvent<RecommendedActivityModel>> A;
    public final androidx.lifecycle.w<SingleUseEvent<LearningHubModel>> B;
    public final androidx.lifecycle.w<HashMap<String, hs.f<Boolean, Boolean>>> C;
    public final String D;

    /* renamed from: x  reason: collision with root package name */
    public final e1 f5566x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5567y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<LibraryCollection> f5568z;

    public i(e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f5566x = repository;
        this.f5567y = "AllTopPicksViewModel";
        this.f5568z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        String d10 = ri.e.d(Constants.LIBRARY_EXPERIMENT_V3);
        d10 = kotlin.jvm.internal.i.b(d10, "default") ? null : d10;
        this.D = (String) (d10 == null ? "variant_a" : d10);
    }

    public final void e(String id2, String itemType, String label, String parentId, boolean z10) {
        boolean z11;
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(itemType, "itemType");
        kotlin.jvm.internal.i.g(label, "label");
        kotlin.jvm.internal.i.g(parentId, "parentId");
        try {
            if (id2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
            ta.v.H(kc.f.H(this), null, 0, new d(this, id2, itemType, label, true, parentId, "top_picks", z10, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5567y, e10);
        }
    }
}
