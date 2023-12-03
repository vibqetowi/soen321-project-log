package oa;

import java.util.Set;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public abstract class t extends n implements Set {

    /* renamed from: v  reason: collision with root package name */
    public transient q f27347v;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i6;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i6 = obj.hashCode();
            } else {
                i6 = 0;
            }
            i10 += i6;
        }
        return i10;
    }

    @Override // oa.n
    public q o() {
        q qVar = this.f27347v;
        if (qVar == null) {
            q t3 = t();
            this.f27347v = t3;
            return t3;
        }
        return qVar;
    }

    public q t() {
        Object[] array = toArray();
        o oVar = q.f27340v;
        int length = array.length;
        if (length == 0) {
            return b.f27315y;
        }
        return new b(length, array);
    }
}
