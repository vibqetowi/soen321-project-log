package is;

import java.util.AbstractSet;
import java.util.Set;
/* compiled from: AbstractMutableSet.kt */
/* loaded from: classes2.dex */
public abstract class e<E> extends AbstractSet<E> implements Set<E>, ts.e {
    public abstract int g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }
}
