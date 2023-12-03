package ke;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Collections;
import java.util.List;
/* compiled from: DocumentKey.java */
/* loaded from: classes.dex */
public final class i implements Comparable<i> {

    /* renamed from: v  reason: collision with root package name */
    public static final p0.d f23273v;

    /* renamed from: w  reason: collision with root package name */
    public static final ImmutableSortedSet<i> f23274w;

    /* renamed from: u  reason: collision with root package name */
    public final p f23275u;

    static {
        p0.d dVar = new p0.d(25);
        f23273v = dVar;
        f23274w = new ImmutableSortedSet<>(Collections.emptyList(), dVar);
    }

    public i(p pVar) {
        ca.a.u0(j(pVar), "Not a document key path: %s", pVar);
        this.f23275u = pVar;
    }

    public static i f() {
        p pVar;
        List emptyList = Collections.emptyList();
        p pVar2 = p.f23292v;
        if (emptyList.isEmpty()) {
            pVar = p.f23292v;
        } else {
            pVar = new p(emptyList);
        }
        return new i(pVar);
    }

    public static i h(String str) {
        boolean z10;
        p u10 = p.u(str);
        if (u10.p() > 4 && u10.l(0).equals("projects") && u10.l(2).equals("databases") && u10.l(4).equals("documents")) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Tried to parse an invalid key: %s", u10);
        return new i((p) u10.r());
    }

    public static boolean j(p pVar) {
        if (pVar.p() % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(i iVar) {
        return this.f23275u.compareTo(iVar.f23275u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return this.f23275u.equals(((i) obj).f23275u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23275u.hashCode();
    }

    public final p i() {
        return this.f23275u.t();
    }

    public final String toString() {
        return this.f23275u.h();
    }
}
