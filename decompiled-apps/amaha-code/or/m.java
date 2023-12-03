package or;

import com.theinnerhour.b2b.components.telecommunications.model.ProviderSearchResponseModel;
import com.theinnerhour.b2b.components.telecommunications.model.RegionalOfflineCenterLocationsListModel;
import com.theinnerhour.b2b.network.model.ProviderAboutResponseModel;
import com.theinnerhour.b2b.network.model.PsychiatristDetailHolderModel;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.network.model.TherapistDetailHolderModel;
import com.theinnerhour.b2b.utils.Constants;
import fw.o;
import fw.t;
import fw.y;
import kotlin.Metadata;
import lv.c0;
/* compiled from: TelecommunicationsBookingService.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J_\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001e"}, d2 = {"Lor/m;", "", "", Constants.NOTIFICATION_URL, "Llv/c0;", "body", "Ldw/b;", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseModel;", "a", "c", "Lcom/theinnerhour/b2b/network/model/TherapistDetailHolderModel;", "g", "Lcom/theinnerhour/b2b/network/model/PsychiatristDetailHolderModel;", "e", "nonAssessmentToolId", "", "page", "fetchLimit", "providerType", "completionStatus", "", "fetchAssessmentsOnly", "Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel;", "f", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ldw/b;", "state", "Lcom/theinnerhour/b2b/components/telecommunications/model/RegionalOfflineCenterLocationsListModel;", "d", "Lcom/theinnerhour/b2b/network/model/ProviderAboutResponseModel;", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface m {
    @o
    dw.b<ProviderSearchResponseModel> a(@y String str, @fw.a c0 c0Var);

    @fw.f
    dw.b<ProviderAboutResponseModel> b(@y String str);

    @o
    dw.b<ProviderSearchResponseModel> c(@y String str);

    @fw.f
    dw.b<RegionalOfflineCenterLocationsListModel> d(@y String str, @t("state_name") String str2);

    @fw.f
    dw.b<PsychiatristDetailHolderModel> e(@y String str);

    @fw.f
    dw.b<TelecommunicationsHomeworkResponseModel> f(@y String str, @t("tool_type_ids") String str2, @t("page") int i6, @t("limit") int i10, @t("provider_type") String str3, @t("status_id") String str4, @t("is_assessment") Boolean bool);

    @fw.f
    dw.b<TherapistDetailHolderModel> g(@y String str);
}
