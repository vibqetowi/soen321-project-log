package fm;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
/* compiled from: GoalParentViewModel.kt */
/* loaded from: classes2.dex */
public final class m1 extends androidx.lifecycle.l0 {

    /* renamed from: x  reason: collision with root package name */
    public final dm.f f15451x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<RecommendedActivityModel> f15452y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<RecommendedActivityModel>> f15453z;

    public m1(dm.f repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f15451x = repository;
        this.f15452y = new ArrayList<>();
        this.f15453z = new androidx.lifecycle.w<>();
    }
}
