package ke;

import java.util.ArrayList;
import java.util.List;
import ke.e;
/* compiled from: BasePath.java */
/* loaded from: classes.dex */
public abstract class e<B extends e<B>> implements Comparable<B> {

    /* renamed from: u  reason: collision with root package name */
    public final List<String> f23268u;

    public e(List<String> list) {
        this.f23268u = list;
    }

    public final B d(String str) {
        ArrayList arrayList = new ArrayList(this.f23268u);
        arrayList.add(str);
        return j(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && compareTo((e) obj) == 0) {
            return true;
        }
        return false;
    }

    public final B f(B b10) {
        ArrayList arrayList = new ArrayList(this.f23268u);
        arrayList.addAll(b10.f23268u);
        return j(arrayList);
    }

    public abstract String h();

    public final int hashCode() {
        return this.f23268u.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public final int compareTo(B b10) {
        int p10 = p();
        int p11 = b10.p();
        for (int i6 = 0; i6 < p10 && i6 < p11; i6++) {
            int compareTo = l(i6).compareTo(b10.l(i6));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return oe.n.d(p10, p11);
    }

    public final boolean isEmpty() {
        if (p() == 0) {
            return true;
        }
        return false;
    }

    public abstract B j(List<String> list);

    public final String k() {
        return this.f23268u.get(p() - 1);
    }

    public final String l(int i6) {
        return this.f23268u.get(i6);
    }

    public final boolean n(B b10) {
        if (p() > b10.p()) {
            return false;
        }
        for (int i6 = 0; i6 < p(); i6++) {
            if (!l(i6).equals(b10.l(i6))) {
                return false;
            }
        }
        return true;
    }

    public final int p() {
        return this.f23268u.size();
    }

    public final e r() {
        boolean z10;
        int p10 = p();
        if (p10 >= 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Can't call popFirst with count > length() (%d > %d)", 5, Integer.valueOf(p10));
        return new p(this.f23268u.subList(5, p10));
    }

    public final B t() {
        return j(this.f23268u.subList(0, p() - 1));
    }

    public final String toString() {
        return h();
    }
}
