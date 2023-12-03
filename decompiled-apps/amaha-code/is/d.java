package is;

import java.util.AbstractList;
import java.util.List;
/* compiled from: AbstractMutableList.kt */
/* loaded from: classes2.dex */
public abstract class d<E> extends AbstractList<E> implements List<E>, ts.c {
    public abstract int g();

    public abstract E m(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i6) {
        return m(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return g();
    }
}
