package fp;

import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponse;
import com.theinnerhour.b2b.components.resources.model.ResourcesResponse;
import com.theinnerhour.b2b.utils.Constants;
import dw.b;
import fw.f;
import fw.t;
import fw.y;
import kotlin.Metadata;
/* compiled from: ResourceService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\r"}, d2 = {"Lfp/a;", "", "", Constants.NOTIFICATION_URL, "", "page", "limit", "domainAreaSlugs", "Ldw/b;", "Lcom/theinnerhour/b2b/components/resources/model/ResourcesResponse;", Constants.ONBOARDING_VARIANT, "Lcom/theinnerhour/b2b/components/resources/model/ResourceDetailResponse;", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface a {
    @f
    b<ResourceDetailResponse> a(@y String str);

    @f
    b<ResourcesResponse> b(@y String str, @t("page") int i6, @t("limit") int i10, @t("domainarea_slugs") String str2);
}
