package n7;

import a7.d;
import android.util.SparseArray;
import java.util.HashMap;
/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<d> f25916a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<d, Integer> f25917b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f25917b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        hashMap.put(d.VERY_LOW, 1);
        hashMap.put(d.HIGHEST, 2);
        for (d dVar : hashMap.keySet()) {
            f25916a.append(f25917b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f25917b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i6) {
        d dVar = f25916a.get(i6);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.p("Unknown Priority for value ", i6));
    }
}
