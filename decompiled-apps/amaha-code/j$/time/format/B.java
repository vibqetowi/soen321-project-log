package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final Map f20860a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f20861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f20860a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i6 = C.f20865d;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C.f20863b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((H) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C.f20863b;
        Collections.sort(arrayList, comparator);
        this.f20861b = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j10, H h10) {
        Map map = (Map) this.f20860a.get(h10);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator b(H h10) {
        List list = (List) this.f20861b.get(h10);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
