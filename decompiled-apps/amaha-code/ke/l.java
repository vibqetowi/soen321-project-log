package ke;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FieldIndex.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ke.c f23280a = new ke.c(0, a.f23281u);

    /* compiled from: FieldIndex.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a implements Comparable<a> {

        /* renamed from: u  reason: collision with root package name */
        public static final ke.b f23281u = new ke.b(r.f23293v, i.f(), -1);

        /* renamed from: v  reason: collision with root package name */
        public static final p0.d f23282v = new p0.d(27);

        public static ke.b f(g gVar) {
            return new ke.b(gVar.g(), gVar.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public final int compareTo(a aVar) {
            int compareTo = j().compareTo(aVar.j());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = h().compareTo(aVar.h());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.compare(i(), aVar.i());
        }

        public abstract i h();

        public abstract int i();

        public abstract r j();
    }

    /* compiled from: FieldIndex.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract a a();

        public abstract long b();
    }

    /* compiled from: FieldIndex.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class c implements Comparable<c> {
        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int compareTo = d().compareTo(cVar2.d());
            if (compareTo == 0) {
                return v.h.a(f(), cVar2.f());
            }
            return compareTo;
        }

        public abstract m d();

        public abstract int f();
    }

    public final c a() {
        for (c cVar : f()) {
            if (v.h.b(cVar.f(), 3)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String b();

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : f()) {
            if (!v.h.b(cVar.f(), 3)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int d();

    public abstract b e();

    public abstract List<c> f();
}
