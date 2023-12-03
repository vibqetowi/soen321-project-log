package kn;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class b<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        Long l2;
        CustomDate lastAdded;
        CustomDate lastAdded2;
        FirestoreGoal firestoreGoal = (FirestoreGoal) t10;
        Long l10 = null;
        if (firestoreGoal != null && (lastAdded2 = firestoreGoal.getLastAdded()) != null) {
            l2 = Long.valueOf(lastAdded2.getTime());
        } else {
            l2 = null;
        }
        FirestoreGoal firestoreGoal2 = (FirestoreGoal) t3;
        if (firestoreGoal2 != null && (lastAdded = firestoreGoal2.getLastAdded()) != null) {
            l10 = Long.valueOf(lastAdded.getTime());
        }
        return sp.b.g(l2, l10);
    }
}
