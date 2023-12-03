package l4;

import java.util.ArrayList;
import java.util.HashMap;
import l4.k;
/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
public final class g<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f24014a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f24015b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f24016a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f24017b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f24018c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f24019d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f24019d = this;
            this.f24018c = this;
            this.f24016a = k10;
        }
    }

    public final V a(K k10) {
        a aVar;
        int i6;
        HashMap hashMap = this.f24015b;
        a aVar2 = (a) hashMap.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            hashMap.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f24019d;
        aVar4.f24018c = aVar.f24018c;
        aVar.f24018c.f24019d = aVar4;
        a<K, V> aVar5 = this.f24014a;
        aVar.f24019d = aVar5;
        a<K, V> aVar6 = aVar5.f24018c;
        aVar.f24018c = aVar6;
        aVar6.f24019d = aVar;
        aVar.f24019d.f24018c = aVar;
        ArrayList arrayList = aVar.f24017b;
        if (arrayList != null) {
            i6 = arrayList.size();
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            return (V) aVar.f24017b.remove(i6 - 1);
        }
        return null;
    }

    public final void b(K k10, V v10) {
        HashMap hashMap = this.f24015b;
        a aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            a<K, V> aVar2 = aVar.f24019d;
            aVar2.f24018c = aVar.f24018c;
            aVar.f24018c.f24019d = aVar2;
            a<K, V> aVar3 = this.f24014a;
            aVar.f24019d = aVar3.f24019d;
            aVar.f24018c = aVar3;
            aVar3.f24019d = aVar;
            aVar.f24019d.f24018c = aVar;
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f24017b == null) {
            aVar.f24017b = new ArrayList();
        }
        aVar.f24017b.add(v10);
    }

    public final V c() {
        int i6;
        a<K, V> aVar = this.f24014a;
        a aVar2 = aVar.f24019d;
        while (true) {
            V v10 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f24017b;
            if (arrayList != null) {
                i6 = arrayList.size();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                v10 = (V) aVar2.f24017b.remove(i6 - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar3 = aVar2.f24019d;
            aVar3.f24018c = aVar2.f24018c;
            aVar2.f24018c.f24019d = aVar3;
            HashMap hashMap = this.f24015b;
            Object obj = aVar2.f24016a;
            hashMap.remove(obj);
            ((k) obj).a();
            aVar2 = aVar2.f24019d;
        }
    }

    public final String toString() {
        int i6;
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f24014a;
        a aVar2 = aVar.f24018c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f24016a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f24017b;
            if (arrayList != null) {
                i6 = arrayList.size();
            } else {
                i6 = 0;
            }
            sb2.append(i6);
            sb2.append("}, ");
            aVar2 = aVar2.f24018c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
