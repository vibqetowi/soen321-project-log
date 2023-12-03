package wo;

import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ExperimentProfileActivityRepository.kt */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f36882a = LogHelper.INSTANCE.makeLogTag(e0.class);

    /* renamed from: b  reason: collision with root package name */
    public final User f36883b = FirebasePersistence.getInstance().getUser();

    public static ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CourseDayModelV1 dayPlan = (CourseDayModelV1) it.next();
            kotlin.jvm.internal.i.f(dayPlan, "dayPlan");
            arrayList2.add(new CourseDayDomainModelV1(dayPlan, str, null, 4, null));
        }
        return arrayList2;
    }
}
