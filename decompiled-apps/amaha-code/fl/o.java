package fl;

import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class o<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(((UserLibraryItemAccessModel) t10).getBookmarkedDate(), ((UserLibraryItemAccessModel) t3).getBookmarkedDate());
    }
}
