package hd;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: CycleDetector.java */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: CycleDetector.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final hd.b<?> f17418a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f17419b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f17420c = new HashSet();

        public a(hd.b<?> bVar) {
            this.f17418a = bVar;
        }
    }

    /* compiled from: CycleDetector.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final o<?> f17421a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17422b;

        public b() {
            throw null;
        }

        public b(o oVar, boolean z10) {
            this.f17421a = oVar;
            this.f17422b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f17421a.equals(this.f17421a) || bVar.f17422b != this.f17422b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f17421a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f17422b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i6 = 0;
            if (it.hasNext()) {
                hd.b bVar = (hd.b) it.next();
                a aVar = new a(bVar);
                Iterator it2 = bVar.f17398b.iterator();
                while (it2.hasNext()) {
                    o oVar = (o) it2.next();
                    if (bVar.f17401e == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z13 = !z12;
                    b bVar2 = new b(oVar, z13);
                    if (!hashMap.containsKey(bVar2)) {
                        hashMap.put(bVar2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(bVar2);
                    if (!set.isEmpty() && !z13) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", oVar));
                    }
                    set.add(aVar);
                }
            } else {
                for (Set<a> set2 : hashMap.values()) {
                    for (a aVar2 : set2) {
                        for (j jVar : aVar2.f17418a.f17399c) {
                            if (jVar.f17425c == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (jVar.f17424b == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Set<a> set3 = (Set) hashMap.get(new b(jVar.f17423a, z11));
                                if (set3 != null) {
                                    for (a aVar3 : set3) {
                                        aVar2.f17419b.add(aVar3);
                                        aVar3.f17420c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    a aVar4 = (a) it3.next();
                    if (aVar4.f17420c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i6++;
                    Iterator it4 = aVar5.f17419b.iterator();
                    while (it4.hasNext()) {
                        a aVar6 = (a) it4.next();
                        aVar6.f17420c.remove(aVar5);
                        if (aVar6.f17420c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i6 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    a aVar7 = (a) it5.next();
                    if (!aVar7.f17420c.isEmpty() && !aVar7.f17419b.isEmpty()) {
                        arrayList2.add(aVar7.f17418a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
        }
    }
}
