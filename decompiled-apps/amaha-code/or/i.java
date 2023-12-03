package or;

import com.theinnerhour.b2b.network.model.CrossProviderRecommendationModel;
import com.theinnerhour.b2b.network.model.ProviderPrescriptionList;
import com.theinnerhour.b2b.network.model.SuggestedSessionsResponseModel;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkNotificationResponseModel;
import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.Constants;
import fw.p;
import fw.t;
import fw.y;
import kotlin.Metadata;
/* compiled from: ProviderDashboardService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\tH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001f"}, d2 = {"Lor/i;", "", "", Constants.NOTIFICATION_URL, "Ldw/b;", "Lcom/theinnerhour/b2b/network/model/ProviderPrescriptionList;", "c", "Lcom/theinnerhour/b2b/network/model/UpcomingSessionsModel;", "j", "", "therapistId", "psychiatristId", "Lcom/theinnerhour/b2b/network/model/SuggestedSessionsResponseModel;", "f", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ldw/b;", "Lsf/m;", "k", "l", "g", Constants.ONBOARDING_VARIANT, "Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationModel;", "h", "d", "m", "page", "fetchLimit", "providerId", "Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkNotificationResponseModel;", "e", "i", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface i {
    @fw.f
    dw.b<sf.m> a(@y String str);

    @fw.f
    dw.b<UpcomingSessionsModel> b(@y String str);

    @fw.f
    dw.b<ProviderPrescriptionList> c(@y String str);

    @fw.f
    dw.b<sf.m> d(@y String str);

    @fw.f
    dw.b<TelecommunicationsHomeworkNotificationResponseModel> e(@y String str, @t("page") int i6, @t("limit") int i10, @t("provider_id") int i11);

    @fw.f
    dw.b<SuggestedSessionsResponseModel> f(@y String str, @t("therapist_id") Integer num, @t("psychiatrist_id") Integer num2);

    @fw.f
    dw.b<sf.m> g(@y String str);

    @fw.f
    dw.b<CrossProviderRecommendationModel> h(@y String str);

    @p
    dw.b<sf.m> i(@y String str);

    @fw.f
    dw.b<UpcomingSessionsModel> j(@y String str);

    @fw.f
    dw.b<sf.m> k(@y String str);

    @fw.f
    dw.b<sf.m> l(@y String str);

    @fw.f
    dw.b<sf.m> m(@y String str);
}
