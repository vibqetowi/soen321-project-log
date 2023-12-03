package j$.util.concurrent;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f21152a;

    /* renamed from: b  reason: collision with root package name */
    final Object f21153b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f21154c;

    /* renamed from: d  reason: collision with root package name */
    volatile l f21155d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i6, Object obj, Object obj2) {
        this.f21152a = i6;
        this.f21153b = obj;
        this.f21154c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i6, Object obj, Object obj2, l lVar) {
        this(i6, obj, obj2);
        this.f21155d = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(Object obj, int i6) {
        Object obj2;
        if (obj != null) {
            l lVar = this;
            do {
                if (lVar.f21152a == i6 && ((obj2 = lVar.f21153b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f21155d;
            } while (lVar != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f21153b) || key.equals(obj2)) && (value == (obj3 = this.f21154c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21153b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21154c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21153b.hashCode() ^ this.f21154c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return n.a(this.f21153b, this.f21154c);
    }
}
