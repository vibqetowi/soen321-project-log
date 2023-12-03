package or;

import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.utils.Constants;
import fw.o;
import fw.y;
import kotlin.Metadata;
/* compiled from: CourseAPIService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Lor/a;", "", "", Constants.NOTIFICATION_URL, "Lcom/theinnerhour/b2b/network/model/CourseResetModel;", "body", "Ldw/b;", "Lcom/theinnerhour/b2b/network/model/CourseResetResult;", Constants.ONBOARDING_VARIANT, "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface a {
    @o
    dw.b<CourseResetResult> a(@y String str, @fw.a CourseResetModel courseResetModel);

    @o
    dw.b<CourseResetResult> b(@y String str, @fw.a CourseResetModel courseResetModel);
}
