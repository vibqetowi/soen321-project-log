package ym;

import com.theinnerhour.b2b.model.LearningHubModel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: LearningHubViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends k implements p<LearningHubModel, LearningHubModel, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public static final b f38685u = new b();

    public b() {
        super(2);
    }

    @Override // ss.p
    public final Integer invoke(LearningHubModel learningHubModel, LearningHubModel learningHubModel2) {
        return Integer.valueOf(i.i(learningHubModel2.getDay(), learningHubModel.getDay()));
    }
}
