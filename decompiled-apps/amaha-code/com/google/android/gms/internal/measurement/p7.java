package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class p7 extends AbstractMap {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f8551u;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8554x;

    /* renamed from: y  reason: collision with root package name */
    public volatile o7 f8555y;

    /* renamed from: v  reason: collision with root package name */
    public List f8552v = Collections.emptyList();

    /* renamed from: w  reason: collision with root package name */
    public Map f8553w = Collections.emptyMap();

    /* renamed from: z  reason: collision with root package name */
    public Map f8556z = Collections.emptyMap();

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f8554x) {
            if (this.f8553w.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f8553w);
            }
            this.f8553w = unmodifiableMap;
            if (this.f8556z.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f8556z);
            }
            this.f8556z = unmodifiableMap2;
            this.f8554x = true;
        }
    }

    public final int b() {
        return this.f8552v.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((m7) this.f8552v.get(d10)).setValue(obj);
        }
        h();
        boolean isEmpty = this.f8552v.isEmpty();
        int i6 = this.f8551u;
        if (isEmpty && !(this.f8552v instanceof ArrayList)) {
            this.f8552v = new ArrayList(i6);
        }
        int i10 = -(d10 + 1);
        if (i10 >= i6) {
            return g().put(comparable, obj);
        }
        if (this.f8552v.size() == i6) {
            m7 m7Var = (m7) this.f8552v.remove(i6 - 1);
            g().put(m7Var.f8474u, m7Var.f8475v);
        }
        this.f8552v.add(i10, new m7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f8552v.isEmpty()) {
            this.f8552v.clear();
        }
        if (!this.f8553w.isEmpty()) {
            this.f8553w.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (d(comparable) < 0 && !this.f8553w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d(Comparable comparable) {
        int size = this.f8552v.size() - 1;
        int i6 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((m7) this.f8552v.get(size)).f8474u);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i6 <= size) {
            int i10 = (i6 + size) / 2;
            int compareTo2 = comparable.compareTo(((m7) this.f8552v.get(i10)).f8474u);
            if (compareTo2 < 0) {
                size = i10 - 1;
            } else if (compareTo2 > 0) {
                i6 = i10 + 1;
            } else {
                return i10;
            }
        }
        return -(i6 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f8555y == null) {
            this.f8555y = new o7(this);
        }
        return this.f8555y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return super.equals(obj);
        }
        p7 p7Var = (p7) obj;
        int size = size();
        if (size != p7Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 == p7Var.b()) {
            for (int i6 = 0; i6 < b10; i6++) {
                if (!((Map.Entry) this.f8552v.get(i6)).equals((Map.Entry) p7Var.f8552v.get(i6))) {
                    return false;
                }
            }
            if (b10 == size) {
                return true;
            }
            return this.f8553w.equals(p7Var.f8553w);
        }
        return entrySet().equals(p7Var.entrySet());
    }

    public final Object f(int i6) {
        h();
        Object obj = ((m7) this.f8552v.remove(i6)).f8475v;
        if (!this.f8553w.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f8552v;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new m7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f8553w.isEmpty() && !(this.f8553w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8553w = treeMap;
            this.f8556z = treeMap.descendingMap();
        }
        return (SortedMap) this.f8553w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((m7) this.f8552v.get(d10)).f8475v;
        }
        return this.f8553w.get(comparable);
    }

    public final void h() {
        if (!this.f8554x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i6 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            i6 += ((m7) this.f8552v.get(i10)).hashCode();
        }
        if (this.f8553w.size() > 0) {
            return this.f8553w.hashCode() + i6;
        }
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return f(d10);
        }
        if (this.f8553w.isEmpty()) {
            return null;
        }
        return this.f8553w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8553w.size() + this.f8552v.size();
    }
}
