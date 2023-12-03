package fm;

import com.theinnerhour.b2b.model.GoalDateObj;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class b1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Long.valueOf(((GoalDateObj) t3).getDate().getTime()), Long.valueOf(((GoalDateObj) t10).getDate().getTime()));
    }
}
