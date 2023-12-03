package co;

import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingResponse;
import com.theinnerhour.b2b.components.telecommunications.model.MatchedCompletedProviderListModel;
import com.theinnerhour.b2b.utils.Constants;
import fw.o;
import fw.y;
import kotlin.Metadata;
import lv.c0;
/* compiled from: MatchingFlowService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH'¨\u0006\f"}, d2 = {"Lco/b;", "", "", Constants.NOTIFICATION_URL, "Lcom/theinnerhour/b2b/components/onboarding/model/MatchingFlowModel;", "body", "Ldw/b;", "Lcom/theinnerhour/b2b/components/onboarding/model/MatchingResponse;", "a", "Llv/c0;", "Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderListModel;", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface b {
    @o
    dw.b<MatchingResponse> a(@y String str, @fw.a MatchingFlowModel matchingFlowModel);

    @o
    dw.b<MatchedCompletedProviderListModel> b(@y String str, @fw.a c0 c0Var);
}
