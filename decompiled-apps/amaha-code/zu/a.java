package zu;

import java.util.ArrayList;
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class a extends ArrayList<k> implements j {
    public a(int i6) {
        super(i6);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return super.contains((k) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof k)) {
            return -1;
        }
        return super.indexOf((k) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof k)) {
            return -1;
        }
        return super.lastIndexOf((k) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return super.remove((k) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return super.size();
    }
}
