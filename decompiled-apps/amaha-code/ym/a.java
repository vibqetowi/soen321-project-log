package ym;

import com.theinnerhour.b2b.model.LearningHubModel;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: LearningHubViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends k implements p<LearningHubModel, LearningHubModel, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ HashMap<String, Integer> f38684u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HashMap<String, Integer> hashMap) {
        super(2);
        this.f38684u = hashMap;
    }

    @Override // ss.p
    public final Integer invoke(LearningHubModel learningHubModel, LearningHubModel learningHubModel2) {
        int i6;
        LearningHubModel a10 = learningHubModel;
        LearningHubModel b10 = learningHubModel2;
        i.g(a10, "a");
        i.g(b10, "b");
        String post_type = a10.getPost_type();
        HashMap<String, Integer> hashMap = this.f38684u;
        Integer num = hashMap.get(post_type);
        Integer num2 = hashMap.get(b10.getPost_type());
        int i10 = -1;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = -1;
        }
        if (num2 != null) {
            i10 = num2.intValue();
        }
        return Integer.valueOf(i.i(i6, i10));
    }
}
