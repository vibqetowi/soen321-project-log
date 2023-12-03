package cn;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: CollectionsPageViewModel.kt */
/* loaded from: classes2.dex */
public final class o extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<SingleUseEvent<LearningHubModel>> A;

    /* renamed from: x  reason: collision with root package name */
    public final e1 f5659x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5660y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<RecommendedActivityModel>> f5661z;

    public o(e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f5659x = repository;
        this.f5660y = LogHelper.INSTANCE.makeLogTag("CollectionsPageViewModel");
        this.f5661z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        new androidx.lifecycle.w();
    }

    public final void e(String str, String str2, String str3, String str4, boolean z10) {
        boolean z11;
        defpackage.e.u(str, "id", str2, "itemType", str3, "label");
        try {
            if (str.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
            ta.v.H(kc.f.H(this), null, 0, new l(this, str, str2, str3, true, str4, "collections", z10, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5660y, e10);
        }
    }
}
