package ok;

import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class a<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Long.valueOf(((CourseDayDomainModelV1) t10).getDayModelV1().getLast_accessed_date()), Long.valueOf(((CourseDayDomainModelV1) t3).getDayModelV1().getLast_accessed_date()));
    }
}
