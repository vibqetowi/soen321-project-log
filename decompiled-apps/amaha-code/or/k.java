package or;

import com.theinnerhour.b2b.model.OrganizationExperimentOverrideData;
import com.theinnerhour.b2b.utils.Constants;
import fw.o;
import fw.t;
import fw.y;
import kotlin.Metadata;
import lv.c0;
/* compiled from: RetrofitService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¨\u0006\u000f"}, d2 = {"Lor/k;", "", "", Constants.NOTIFICATION_URL, "Ldw/b;", "Lsf/m;", "d", "a", "Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideData;", Constants.ONBOARDING_VARIANT, "orgId", "c", "Llv/c0;", "body", "e", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface k {
    @fw.f
    dw.b<sf.m> a(@y String str);

    @fw.f
    dw.b<OrganizationExperimentOverrideData> b(@y String str);

    @fw.f
    dw.b<sf.m> c(@y String str, @t("org_id") String str2);

    @fw.f
    dw.b<sf.m> d(@y String str);

    @o
    dw.b<sf.m> e(@y String str, @fw.a c0 c0Var);
}
