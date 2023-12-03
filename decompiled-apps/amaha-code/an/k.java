package an;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class k<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Integer.valueOf(((LibraryCollectionItem) t3).getPosition()), Integer.valueOf(((LibraryCollectionItem) t10).getPosition()));
    }
}
