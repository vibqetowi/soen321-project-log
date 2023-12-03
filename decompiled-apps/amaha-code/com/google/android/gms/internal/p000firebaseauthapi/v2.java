package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v2  reason: invalid package */
/* loaded from: classes.dex */
public class v2 extends AbstractMap {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f8188u;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8191x;

    /* renamed from: y  reason: collision with root package name */
    public volatile u2 f8192y;

    /* renamed from: v  reason: collision with root package name */
    public List f8189v = Collections.emptyList();

    /* renamed from: w  reason: collision with root package name */
    public Map f8190w = Collections.emptyMap();

    /* renamed from: z  reason: collision with root package name */
    public Map f8193z = Collections.emptyMap();

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f8191x) {
            if (this.f8190w.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f8190w);
            }
            this.f8190w = unmodifiableMap;
            if (this.f8193z.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f8193z);
            }
            this.f8193z = unmodifiableMap2;
            this.f8191x = true;
        }
    }

    public final int b() {
        return this.f8189v.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((s2) this.f8189v.get(d10)).setValue(obj);
        }
        h();
        boolean isEmpty = this.f8189v.isEmpty();
        int i6 = this.f8188u;
        if (isEmpty && !(this.f8189v instanceof ArrayList)) {
            this.f8189v = new ArrayList(i6);
        }
        int i10 = -(d10 + 1);
        if (i10 >= i6) {
            return g().put(comparable, obj);
        }
        if (this.f8189v.size() == i6) {
            s2 s2Var = (s2) this.f8189v.remove(i6 - 1);
            g().put(s2Var.f8120u, s2Var.f8121v);
        }
        this.f8189v.add(i10, new s2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f8189v.isEmpty()) {
            this.f8189v.clear();
        }
        if (!this.f8190w.isEmpty()) {
            this.f8190w.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (d(comparable) < 0 && !this.f8190w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d(Comparable comparable) {
        int size = this.f8189v.size() - 1;
        int i6 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((s2) this.f8189v.get(size)).f8120u);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i6 <= size) {
            int i10 = (i6 + size) / 2;
            int compareTo2 = comparable.compareTo(((s2) this.f8189v.get(i10)).f8120u);
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
        if (this.f8192y == null) {
            this.f8192y = new u2(this);
        }
        return this.f8192y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return super.equals(obj);
        }
        v2 v2Var = (v2) obj;
        int size = size();
        if (size != v2Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 == v2Var.b()) {
            for (int i6 = 0; i6 < b10; i6++) {
                if (!((Map.Entry) this.f8189v.get(i6)).equals((Map.Entry) v2Var.f8189v.get(i6))) {
                    return false;
                }
            }
            if (b10 == size) {
                return true;
            }
            return this.f8190w.equals(v2Var.f8190w);
        }
        return entrySet().equals(v2Var.entrySet());
    }

    public final Object f(int i6) {
        h();
        Object obj = ((s2) this.f8189v.remove(i6)).f8121v;
        if (!this.f8190w.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f8189v;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new s2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f8190w.isEmpty() && !(this.f8190w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8190w = treeMap;
            this.f8193z = treeMap.descendingMap();
        }
        return (SortedMap) this.f8190w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((s2) this.f8189v.get(d10)).f8121v;
        }
        return this.f8190w.get(comparable);
    }

    public final void h() {
        if (!this.f8191x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i6 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            i6 += ((s2) this.f8189v.get(i10)).hashCode();
        }
        if (this.f8190w.size() > 0) {
            return this.f8190w.hashCode() + i6;
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
        if (this.f8190w.isEmpty()) {
            return null;
        }
        return this.f8190w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8190w.size() + this.f8189v.size();
    }
}
