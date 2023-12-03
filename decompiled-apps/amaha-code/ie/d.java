package ie;

import com.google.auto.value.AutoValue;
import ke.i;
import oe.n;
/* compiled from: IndexEntry.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class d implements Comparable<d> {
    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        int compare = Integer.compare(i(), dVar2.i());
        if (compare == 0) {
            int compareTo = h().compareTo(dVar2.h());
            if (compareTo == 0) {
                int b10 = n.b(d(), dVar2.d());
                if (b10 == 0) {
                    return n.b(f(), dVar2.f());
                }
                return b10;
            }
            return compareTo;
        }
        return compare;
    }

    public abstract byte[] d();

    public abstract byte[] f();

    public abstract i h();

    public abstract int i();
}
