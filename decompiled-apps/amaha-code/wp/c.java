package wp;

import com.theinnerhour.b2b.model.GratitudeLetterModel;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class c<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Long.valueOf(((GratitudeLetterModel) t10).getDate()), Long.valueOf(((GratitudeLetterModel) t3).getDate()));
    }
}
