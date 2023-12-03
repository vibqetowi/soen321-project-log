package pl;

import java.util.Comparator;
import java.util.HashMap;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class k0<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        Long l2;
        Object obj = ((HashMap) t3).get("date");
        Long l10 = null;
        if (obj instanceof Long) {
            l2 = (Long) obj;
        } else {
            l2 = null;
        }
        Object obj2 = ((HashMap) t10).get("date");
        if (obj2 instanceof Long) {
            l10 = (Long) obj2;
        }
        return sp.b.g(l2, l10);
    }
}
