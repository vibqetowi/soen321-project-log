package y4;

import h4.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f38248a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f38249b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f38250a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f38251b;

        /* renamed from: c  reason: collision with root package name */
        public final i<T, R> f38252c;

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.f38250a = cls;
            this.f38251b = cls2;
            this.f38252c = iVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f38248a.contains(str)) {
            this.f38248a.add(str);
        }
        list = (List) this.f38249b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f38249b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = this.f38248a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f38249b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f38250a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f38251b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !arrayList.contains(aVar.f38251b)) {
                        arrayList.add(aVar.f38251b);
                    }
                }
            }
        }
        return arrayList;
    }
}
