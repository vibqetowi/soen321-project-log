package hr;

import com.theinnerhour.b2b.model.Screen136Model;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class j5<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Integer.valueOf(((Screen136Model) t10).getRank()), Integer.valueOf(((Screen136Model) t3).getRank()));
    }
}
